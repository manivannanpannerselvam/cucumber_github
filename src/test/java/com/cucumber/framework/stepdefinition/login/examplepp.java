package com.cucumber.framework.stepdefinition.login;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.PageObject.exampleppp;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class examplepp 
{
	
	private final Logger log = LoggerHelper.getLogger(LoginToAutomationPractices.class);

	exampleppp exampleppps;
	
	@Given("^navigate to the new  logins  application$")
	public void navigate_to_the_new_logins_application() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	   
	}

	@When("^click the new sign in link in regstrtation page$")
	public void click_the_new_sign_in_link_in_regstrtation_page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		exampleppps= new exampleppp(TestBase.driver);
		exampleppps.clickOnSignInLinks();
	   
	}

	@When("^Enter the valid Username in username field \"([^\"]*)\"$")
	public void enter_the_valid_Username_in_username_field(String arg1) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		exampleppps.enterEmailAddress(arg1);
	}

	@When("^Enter the valid password in password field \"([^\"]*)\"$")
	public void enter_the_valid_password_in_password_field(String arg1) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		exampleppps.enterPassword(arg1);
	}

	@Then("^login the successfully success message$")
	public void login_the_successfully_success_message() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		if(exampleppps.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
}
