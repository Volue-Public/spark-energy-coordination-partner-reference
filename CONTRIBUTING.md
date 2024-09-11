# Contributing to Volue Spark Reference DER Partner Implementation

Thank you for your interest in contributing to this Volue Spark repository! Here are some guidelines to follow when contributing to this project.

## **How to Contribute**:

1. **Report Issues**:
   - If you find a bug or have a feature request, please create a [GitHub issue](../../issues).
   - When reporting issues, include:
     - A clear, descriptive title.
     - Steps to reproduce the issue.
     - Expected behavior vs. actual behavior.
     - Any relevant logs or screenshots.

2. **Fork the Repository**:
   - Fork the repository and create your own branch.
   - When naming your branch, use descriptive names, such as `feature-add-logging` or `bugfix-null-pointer-exception`.

3. **Make Changes**:
   - Ensure that your changes are well-tested using the tests from the [_tests](./_tests/) directory.

4. **Submit a Pull Request (PR)**:
   - Push your branch and submit a pull request to the `main` branch.
   - In the PR description, explain:
     - The problem you're solving.
     - A summary of the changes made.
     - Links to related issues (if applicable).

## **Coding Guidelines**:

1. **Style**:
   - Follow the conventions used in the language-specific directories (e.g., for Java, use `google-java-format`).
   - Ensure your code is properly formatted. Each language-specific directory includes instructions on formatting the code.

2. **Commit Messages**:
   - Use clear and descriptive commit messages.
   - Prefix commit messages with the type of change (`fix:`, `feat:`, `docs:`, `chore:`).
   - Example: `fix: resolve issue with webhook signature validation`.

## **Running Tests**:

Before submitting a pull request, ensure that all tests pass. Run the appropriate test scripts in the `tests` directory:
```bash
language="" # set to the language(s) which have changes added.
# For API client validation
./_tests/cli-client-test.sh $language

# For webhook server validation
./_tests/webhook-server-test.sh $language
```
