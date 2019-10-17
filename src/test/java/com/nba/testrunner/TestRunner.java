package com.nba.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Project.feature",glue= "com.nba.stepdefinition",monochrome=true,plugin= {"pretty","json:target\\cucumber7.json"})
public class TestRunner {

}
