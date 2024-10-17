###Tools and frameworks description

E2E web UI test is created using Selemiun WebDriver and Serenity Framework. Programming language is Java.
Test Scenario is described in Gherkin language, follows BDD pattern. Cucumber framework is used.
Feature file is located /eneco-tests/src/test/resources/features/registration.feature

### Run configurations

_**Preparation:**_ To run the test you need JRE or JDK Java 11 and Maven are to be installed and configured on your PC.
Set up JAVA_HOME and MVN_HOME directories into your Environment vatiables
1. To build the project do: mvn clean test
2. Find report here: target/site/serenity/
