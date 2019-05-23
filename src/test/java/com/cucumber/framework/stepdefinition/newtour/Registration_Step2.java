package com.cucumber.framework.stepdefinition.newtour;

import org.apache.log4j.Logger;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.Registration_Page1;
import com.cucumber.framework.newtour.Registration_page;
import com.cucumber.framework.newtour.SignupPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Registration_Step2 
{
	private final Logger log = LoggerHelper.getLogger(Registration_Step2.class);

	SignupPage signup;
	
	Registration_Page1 Registrationnewtours;
	
	@Then("^Enter the Address in address field \"([^\"]*)\"$")
	public void enter_the_Address_in_address_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	
		
	    // Write code here that turns the phrase above into concrete actions

	    
	    Registrationnewtours = new Registration_Page1(TestBase.driver);
		Registrationnewtours.setAddress(arg1);
	}

	@Then("^Enter the city in city field \"([^\"]*)\"$")
	public void enter_the_city_in_city_field(String arg1) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
		Registrationnewtours.setCity(arg1);
	    
	}

}
