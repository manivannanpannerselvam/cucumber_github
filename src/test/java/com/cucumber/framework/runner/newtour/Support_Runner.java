package com.cucumber.framework.runner.newtour;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/newtours/Support.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})


public class Support_Runner extends AbstractTestNGCucumberTests
{
	
	
	
	
	

}
