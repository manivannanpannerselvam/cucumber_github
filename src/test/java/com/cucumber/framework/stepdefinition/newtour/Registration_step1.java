package com.cucumber.framework.stepdefinition.newtour;

import org.apache.log4j.Logger;

import com.cucumber.framework.PageObject.HomePage;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.Registration_page;
import com.cucumber.framework.newtour.SignupPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Registration_step1 
{
	
	private final Logger log = LoggerHelper.getLogger(Registration_step1.class);

	SignupPage signup;
	
	Registration_page Registrationnewtour;
	
	
	@Then("^Enter the Firstname in firstname field \"([^\"]*)\"$")
	public void enter_the_Firstname_in_firstname_field(String arg1) throws Throwable
	{
		Registrationnewtour = new Registration_page(TestBase.driver);
		Registrationnewtour.setFirstName(arg1);
	  
	}
	@Then("^Enter the lastname in lastname field \"([^\"]*)\"$")
	public void enter_the_lastname_in_lastname_field(String arg1) throws Throwable 
	{
		Registrationnewtour.setLastName(arg1);
		
	}
	
}
