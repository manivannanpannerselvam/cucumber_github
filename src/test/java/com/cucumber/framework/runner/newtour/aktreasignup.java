package com.cucumber.framework.runner.newtour;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/newtours/aktreasign.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"}
,tags = {"@tag1,@tag2"}
)








public class aktreasignup  extends AbstractTestNGCucumberTests
{
	

}
