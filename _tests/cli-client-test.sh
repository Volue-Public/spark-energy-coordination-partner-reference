#! /usr/bin/env bash
set -o pipefail

language=$1
[ -z "$language" ] && echo "The first argument should be the programming language" && exit 1

base_path=${BASE_PATH:-"https://api.sandbox.voluespark.com/energy-coordination/v1"}

case "$language" in
  csharp)
    build_command="dotnet build src/EnergyCoordinationClient.Cli"
    run_command="dotnet run --project src/EnergyCoordinationClient.Cli"
    ;;
  java)
    build_command="mvn install && mvn package -f cli-client/pom.xml"
    run_command="java -jar cli-client/target/cli-client-*-jar-with-dependencies.jar"
    ;;
  typescript)
    build_command="
    # There seems to be an issue with the TS openapi generation, these sed commands fix it.
    sed -i '/suppressImplicitAnyIndexErrors/d' tsconfig.json
    sed -i -e 's/extends any//g' -e 's/return super.*(\(.*\)).*/return \1;/g' model/httpValidationProblemDetails.ts
    sed -i 's/\"license\": \"Unlicense\"/\"license\": \"MIT\"/' package.json
    npm install
    npm run build
    "
    run_command="node cli-client/index.mjs"
    ;;
  *)
    echo "Unsupported language: $language"
    exit 1
    ;;
esac

script_dir=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
client_dir="$script_dir"/../"$language"/client
if ! cd "$client_dir"; then
    echo "Invalid client dir: $client_dir"
    exit 1
fi

if [ -z "$JWT_TOKEN" ]; then
    if [ -z "$CLIENT_ID" ] || [ -z "$CLIENT_SECRET" ]; then
        echo "JWT_TOKEN, or CLIENT_ID and CLIENT_SECRET must be set."
        exit 1
    fi
    response=$(curl -s --location 'https://auth.identity.volue.com/connect/token' \
        --header 'Content-Type: application/x-www-form-urlencoded' \
        --data-urlencode 'grant_type=client_credentials' \
        --data-urlencode "client_id=$CLIENT_ID" \
        --data-urlencode "client_secret=$CLIENT_SECRET")
    if echo "$response" | jq -e '.error' > /dev/null; then
        echo "Unable to fetch token: $(echo "$response" | jq -r '.error')"
        exit 1;
    fi
    JWT_TOKEN=$(echo "$response" | jq -r '.access_token')
fi
export JWT_TOKEN

user_id=$(cat /proc/sys/kernel/random/uuid)
location_id=$(cat /proc/sys/kernel/random/uuid)

bash -c "$build_command"

$run_command "$base_path" UserApi getUsers 1 5
$run_command "$base_path" UserApi postUser '{"userId": "'"$user_id"'"}'
$run_command "$base_path" UserLocationsApi postLocation "$user_id" '{"locationId": "'"$location_id"'", "locationType": "Residential", "meterPointIds": ["707057500000000000"]}'
$run_command "$base_path" UserLocationsApi updateLocation "$user_id" "$location_id" '{"locationId": "'"$location_id"'", "locationType": "Residential", "meterPointIds": ["707057500000000001"]}'
$run_command "$base_path" UserLocationsApi patchLocation "$user_id" "$location_id" '{"locationType": "Commercial"}'
$run_command "$base_path" UserLocationsApi deleteLocation "$user_id" "$location_id"
$run_command "$base_path" UserApi deleteUserById "$user_id"
