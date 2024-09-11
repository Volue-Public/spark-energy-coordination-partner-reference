#!/usr/bin/env bash

language="$1"
[ -z "$language" ] && echo "The first argument should be the programming language" && exit 1

SIGNING_KEY=$(cat ../../_tests/webhook-test-data/signing-key.txt)
export SIGNING_KEY

case "$language" in
  csharp)
    run_command="dotnet run --project src/Partner.Api"
    ;;
  java)
    run_command="mvn --ntp package -Dmaven.test.skip && java -jar target/partnerapi-1.0.0.jar"
    ;;
  *)
    echo "Unsupported language: $language"
    exit 1
    ;;
esac

script_dir=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
server_dir="$script_dir"/../"$language"/server
if ! cd "$server_dir"; then
    echo "Invalid server dir: $server_dir"
    exit 1
fi

server_log=$(mktemp)
bash -c "$run_command" > "$server_log" 2>&1 &
pid=$!

echo "Started server on port 8080 with PID: $pid and log file: $server_log"

for i in {1..60}; do
    if nc -z localhost 8080; then
        break
    fi
    echo "Attempt $i: Port 8080 is not open, retrying..."
    sleep 1
done

failed=false
for file in ../../_tests/webhook-test-data/*.json; do
    curl --fail-with-body localhost:8080/notify \
        -H "Content-Type: application/json" \
        -H "x-payload-signature: $(cat "$file".hmacsha256b64)" \
        --data-binary @"$file"
    if [ $? -ne 0 ]; then
        failed=true
    fi
done

kill $pid
if [ $failed = 'true' ]; then
    echo "Failed to verify webhook notifications. Server log:"
    cat "$server_log"
    exit 1
fi
