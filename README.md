# multiple-tests

This project demonstrates how to setup a multi-stage tests environment

1. The combination of a custom naming scheme along with surefire exclusions,
1. The adoption of the failsafe plugin for integration tests, and
1. The usage of Categories which were added in newer JUnit versions.

For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):

- **validate** - validate the project is correct and all necessary information is available
- **compile** - compile the source code of the project
- **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- **package** - take the compiled code and package it in its distributable format, such as a JAR.
- **verify** - run any checks on results of integration tests to ensure quality criteria are met
- **install** - install the package into the local repository, for use as a dependency in other projects locally
- **deploy** - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

## Commands
Command | Description
---|---
`mvn test` | Run only tests that match `<include>` value in `pom.xml`
