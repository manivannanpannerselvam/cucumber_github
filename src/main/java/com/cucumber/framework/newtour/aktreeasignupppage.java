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

public class aktreeasignupppage 
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(aktreeasignupppage.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//*[@id='LoginPage_Email']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='LoginPage_Password']")
	WebElement password;
	
	@FindBy(xpath=".//input[@name='firstName']")
	WebElement successMsgObject;
	
	public aktreeasignupppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void enternamefield(String username)
	{
		log.info("entering firstName.." + username);
		this.username.sendKeys(username);
		
	}
	public void enterpasswordfield(String password)
	{
		log.info("entering password.." + password);
		this.password.sendKeys(password);
	}
	public boolean verifySuccessLoginMsg()
	{
		return new GenericHelper().isDisplayed(successMsgObject);
	}

}
