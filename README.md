# Anagram Checker Based on Wikipedia Page Rules

## What is Anagram Check?
This is an Anagram Checker built with Java 17 and Junit 5.

Anagram Checker was built to check if a sentence is a anagram or not.

This project tests if two Alphanumeric sentences are anagrams and the rules
followed by this software in order to verify the Anagrams can be
found on [Wikipedia](https://en.wikipedia.org/wiki/Anagram)

## How to Run?
Since anagram check uses Maven to build the project and manage dependencies,
you shall run ```mvn clean install ``` in order to install the project.

## Static Code Analysis
This project uses the following static code analysis tools:
- [SpotBugs](https://spotbugs.readthedocs.io/en/stable/index.html)
- [PMD](https://pmd.github.io/latest/)
  - The [PMD Custom Rules file](./pmd-ruleset.xml) is located in the project root folder.
- [Jacoco](https://www.eclemma.org/jacoco/trunk/index.html)
  - The Jacoco ratios/parameters can be found in the **properties** of the root project [pom](./pom.xml) file.
  - The Jacoco analisys can be found running ```mvn test``` and then acessing the [HTML](./target/site/jacoco/index.html) file.
- [Maven Surfire](https://maven.apache.org/surefire/maven-surefire-report-plugin/)
