package com.cucumber.framework.runner.Infotech_HR;

import cucumber.api.CucumberOptions;



@CucumberOptions(features = { "classpath:featurefile/Infofeature/Login.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"}
,tags = {"@tag1,@tag2"}
)



public class Login_runner 
{

}
