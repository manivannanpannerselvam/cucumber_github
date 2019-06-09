package com.cucumber.framework.runner.Infotech_HR;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features = { "classpath:featurefile/Infofeature/Leave.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:D:\\Cucumber-20180707T130409Z-001\\Cucumber\\cucumberSeleniumFramework-master\\Reports\\report.html"}
,tags = {"@SmokeTest,@RegressionTest"}
)


public class Leave_Software_runner extends AbstractTestNGCucumberTests
{
	

}
