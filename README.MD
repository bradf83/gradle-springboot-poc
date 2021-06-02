# Figuring Out Gradle

A small Spring Boot project that I am using to figure out Gradle. I have come from many years of using Maven and a few things recently have made me consider
trying our Gradle, so here I am.

## Getting Started

- Install Java 15+
- Install Gradle 6.9+ or use the Gradle Wrapper
- Set `JAVA_HOME`
- Run the application `gradle bootRun`
  - You should see the Spring Boot application startup and see the following console logs
    - `Count: 1`
    - `Customer Created At: <some date>`

## Gradle Notes

- Can utilize gradle wrapper scripts that come with Spring Boot instead of installing Gradle on your machine
- `gradle -v` to get environment information
- `gradle build` to build
- `gradle tasks` to see a list of tasks available to this project.

## Spring Boot Specific

- `gradlew cleanTest test --info` to clean the directory and run tests with info
  - You can find the test report in `/build/reports/index.html`
- `gradlew bootRun` to run your Spring Boot application

## Addons For VSCode

- Debugger For Java
- Java Extension Pack
- Java Test Runner
- Language Support For Java
- Gradle Language Support

# DONE

- Added VS Code Addon Gradle Language Support
- Added Lombok
  - compile only and the annotation processor for building and for testing. Check the `build.gradle`
- Added Spring Data and H2
  - Added a MappedSuperClass for CommonProperties that handles @CreatedAt and @ModifiedAt and the Id.

# TODO

- Add Spring Data Rest
- Add QueryDSL
- Add Spring Security
- Add Spring Cloud
- Upgrade to Gradle 7+ and Java 16
- Upgrade to Spring Boot 2.5.0
