# Playwright Template
The ```playwright-template``` project provides a baseline for the [Playwright](https://github.com/microsoft/playwright) Web Testing and Automation framework. In addition to Playwright, the [JUnit](https://junit.org/) testing framework has been included and configured to run tests in parallel.

## Dependencies
- Docker or Podman

## Running Tests
To run all tests in the project, execute the following commands.

1. Swtich the to project directory in the terminal.

2. Download and run the Playwright image.
    ```
    docker run -it --rm --ipc=host -v "$PWD:/playwright-template:Z" -w /playwright-template mcr.microsoft.com/playwright/java:v1.63.0-noble /bin/bash
    ```
    ```
    podman run -it --rm --ipc=host -v "$PWD:/playwright-template:Z" -w /playwright-template mcr.microsoft.com/playwright/java:v1.63.0-noble /bin/bash
    ```

3. Clean the target directory and execute all tests.
    ```
    mvn clean test
    ```