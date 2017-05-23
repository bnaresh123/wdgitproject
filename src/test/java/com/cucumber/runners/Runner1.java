package com.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/com/cucumber/testcases/", glue="com.cucumber.testcases")
public class Runner1 extends AbstractTestNGCucumberTests {

}
