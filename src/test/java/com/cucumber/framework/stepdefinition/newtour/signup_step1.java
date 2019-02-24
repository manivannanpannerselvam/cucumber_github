package com.cucumber.framework.stepdefinition.newtour;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.SignupPage;
import com.cucumber.framework.newtour.aktreeasignupppage;
import com.cucumber.framework.stepdefinition.login.LoginToAutomationPractices;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signup_step1 
{
	private final Logger log = LoggerHelper.getLogger(signup_step1.class);

	SignupPage signup;
	
	@Given("^open the browser and enter the url page$")
	public void open_the_browser_and_enter_the_url_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@When("^click the signup page in newtour application$")
	public void click_the_signup_page_in_newtour_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup= new SignupPage(TestBase.driver);
		signup.clickOnSignInLink();
	}

	@Then("^page is redirect to the registration page successfuly$")
	public void page_is_redirect_to_the_registration_page_successfuly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		if(signup.verifySuccessLoginMsg())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
		
		
	}


}
