package com.cucumber.framework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class exampleppp 
{
	
	WebDriver driver;
	
	@FindBy(xpath=".//a[@class='login']")
	WebElement signin;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='create-account_form']/h3")
	WebElement successMsgObject;
	
	
	public exampleppp(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnSignInLinks() throws InterruptedException
	{
		
			Thread.sleep(9000);
			//log.info("clicked on sign in link...");
			signin.click();
		
	}
	public void enterEmailAddress(String emailAddress)
	{
		//log.info("entering email address...."+emailAddress);
		this.emailAddress.sendKeys(emailAddress);
	}
	public void enterPassword(String password){
		//log.info("entering password...."+password);
		this.password.sendKeys(password);
	}
	
	public boolean verifySuccessLoginMsg()
	{
		return new GenericHelper().isDisplayed(successMsgObject);
	}
}
