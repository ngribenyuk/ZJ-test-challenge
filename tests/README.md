Framework based on Selenide (Webdriver wrapper) + Java + Cucumber
========================

### How to run

Need to have installed:
- java 1.8
- maven
- chromedriver


To run all test suites, just type from command line:

```
mvn test
```

To run by tags from command line:

```
mvn test -Dcucumber.options="--tags @smoke"
```
To run from IDE need to run any runner class from directory:
```
src/test/java/runners
```

Chrome browser is set by default. You need to have chromedriver being added to PATH environment variable.
Tested on chromedriver version 73.
To run in Firefox from command line:
 ```
 mvn test -Dbrowser=firefox
 ```


Testing data and application properties are stored in
```
src/test/resources/project.properties
```