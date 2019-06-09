package com.cucumber.framework.stepdefinition.InfoTech_cloud;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.InfoTech_Page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.newtour.aktreeasignupppage;
import com.cucumber.framework.stepdefinition.newtour.aktreasi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Login_infotech 
{
	
	private final Logger log = LoggerHelper.getLogger(Login_infotech.class);

	InfoTech_Page login;
	
	
	
	@Given("^open the valid url in InfoTech_cloud application$")
	public void open_the_valid_url_in_InfoTech_cloud_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@Then("^Enter the  usernamesdsdsds in username field \"([^\"]*)\"$")
	public void enter_the_usernamesdsdsds_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login= new InfoTech_Page(TestBase.driver);
		login.enternamefield(arg1);

	}

	@Then("^Enter the valid passwordsdsd in password field \"([^\"]*)\"$")
	public void enter_the_valid_passwordsdsd_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.enterpasswordfield(arg1);
	}
	
	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.loginButton();
	}

	@Then("^verify the applicatisdfsfdsondgdgdd not  successfully\\.$")
	public void verify_the_applicatisdfsfdsondgdgdd_not_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 
		if(login.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}

	@Then("^verify the applicationsssaadsasds successfully\\.$")
	public void verify_the_applicationsssaadsasds_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		if(login.verifySuccesswelcomeMsg())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
		
		
	}


	


}
