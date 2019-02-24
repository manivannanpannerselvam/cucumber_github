package com.cucumber.framework.runner.login;


import java.io.File;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/login/login.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:D:\\Cucumber-20180707T130409Z-001\\Cucumber\\cucumberSeleniumFramework-master\\Reports\\cucumber-pretty",
			    "json:D:\\Cucumber-20180707T130409Z-001\\Cucumber\\cucumberSeleniumFramework-master\\Reports\\cucumber.json",
			    "com.cucumber.listener.ExtentCucumberFormatter:D:\\Cucumber-20180707T130409Z-001\\Cucumber\\cucumberSeleniumFramework-master\\Reports\\report.html"
			   })
public class LoginRunner extends AbstractTestNGCucumberTests {

	@AfterClass
    public static void reportSetup() 
 	{
        Reporter.loadXMLConfig(new File("src/test/resource/extent-config.xml"));
        /*Properties p = System.getProperties();
        p.list(System.out);*/
        /*
        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", 	"Windows 10");
        Reporter.setSystemInfo("2.53.0", "Selenium");
        Reporter.setSystemInfo("3.3.9", "Maven");
        Reporter.setSystemInfo("1.8.0_66", "Java Version");
        Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
        plugin = {"html:target/cucumber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:D:\\Cucumber-20180707T130409Z-001\\Cucumber\\cucumberSeleniumFramework-master\\Reports\\cucumber-extent\\report.html"})
        */
 	}
}
