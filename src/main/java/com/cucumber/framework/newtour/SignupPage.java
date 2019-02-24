package com.cucumber.framework.newtour;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class SignupPage 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	@FindBy(linkText="REGISTER")
	WebElement signin;
	
	@FindBy(xpath=".//input[@name='firstName']")
	WebElement successMsgObject;
	
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void clickOnSignInLink() throws InterruptedException
	{
		
			Thread.sleep(9000);
			log.info("clicked on sign in link...");
			signin.click();
		
	}
	public boolean verifySuccessLoginMsg(){
		return new GenericHelper().isDisplayed(successMsgObject);
	}

}
