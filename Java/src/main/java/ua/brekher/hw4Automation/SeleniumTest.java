package ua.brekher.hw4Automation;

public class SeleniumTest {
    name: Java CI

    on:
    push:
    branches:
            - main

    jobs:
    build:
    runs-on: ubuntu-latest

    steps:
            - name: Checkout repository
    uses: actions/checkout@v2

    - name: Set up JDK
    uses: actions/setup-java@v2
    with:
    distribution: 'adopt'
    java-version: '11'

            - name: Build with Maven
    run: mvn clean install


}
