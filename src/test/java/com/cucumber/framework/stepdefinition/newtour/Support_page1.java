package com.cucumber.framework.stepdefinition.newtour;

import org.apache.log4j.Logger;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.Registration_page;
import com.cucumber.framework.newtour.Support;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Support_page1 
{
	private final Logger log = LoggerHelper.getLogger(Support_page1.class);
	
	Support supportpage;
	
	@Then("^click the support button in newtour application$")
	public void click_the_support_button_in_newtour_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		supportpage = new Support(TestBase.driver);
		supportpage.clicksupportbutton();
		
	}

	@Then("^click the Back to Home button$")
	public void click_the_Back_to_Home_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		supportpage.Backtohome();
	}

}
