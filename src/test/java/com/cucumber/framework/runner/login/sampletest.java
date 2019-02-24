package com.cucumber.framework.runner.login;

import java.io.File;

import org.junit.AfterClass;
//import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

//import org.testng.Reporter;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.cucumber.listener.Reporter;


@CucumberOptions(features = { "classpath:featurefile/NewRegistrataion/sample.feature" }
		)


/*
@RunWith(Cucumber.class)
@CucumberOptions( strict = true
				 ,features = {"src/test/resource/makemyTrip.feature"}
				 ,plugin = {"pretty:STDOUT","html:C:\\Users\\MANIVANNAN\\Downloads\\CucumberTutorial-master\\CucumberTutorial-master\\Cucumber_Maven_Project\\Reports\\cucumber-pretty",
						    "json:C:\\Users\\MANIVANNAN\\Downloads\\CucumberTutorial-master\\CucumberTutorial-master\\Cucumber_Maven_Project\\Reports\\cucumber.json",
						    "com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\MANIVANNAN\\Downloads\\CucumberTutorial-master\\CucumberTutorial-master\\Cucumber_Maven_Project\\Reports\\cucumber-extent\\report.html"
						   }
				 ,tags = {"@makemytrip-signin,@makemytrip-footerValidationAUTH,@makemytrip-footerValidation"}
				 ,monochrome = true
			     ,glue = {"com.cucumber.test"}
                 ,dryRun = false
				)

*/


public class sampletest extends AbstractTestNGCucumberTests {

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
        
        */
 	}
}
