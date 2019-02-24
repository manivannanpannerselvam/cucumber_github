package com.cucumber.framework.stepdefinition.newtour;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.SignupPage;
import com.cucumber.framework.newtour.aktreeasignupppage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class aktreasi 
{
	
	private final Logger log = LoggerHelper.getLogger(aktreasi.class);

	aktreeasignupppage aktrea;
	
	
	
	@Given("^open the valid url in Aktrea application$")
	public void open_the_valid_url_in_Aktrea_application() throws Throwable {
	    
		TestBase.driver.get(ObjectRepo.reader.getWebsite()); 
	}

	@Then("^Enter the valid username in username field \"([^\"]*)\"$")
	public void enter_the_valid_username_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		aktrea= new aktreeasignupppage(TestBase.driver);
		aktrea.enternamefield(arg1);
	}
	
	
	

	@Then("^Enter the valid password in password field in \"([^\"]*)\"$")
	public void enter_the_valid_password_in_password_field_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		aktrea.enterpasswordfield(arg1);
	}

	@Then("^verify the application succesffully\\.$")
	public void verify_the_application_succesffully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		if(aktrea.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^verify the application not  succesffully\\.$")
	public void verify_the_application_not_succesffully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(aktrea.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			log.info("login is not successfully");
		}
	}
}
