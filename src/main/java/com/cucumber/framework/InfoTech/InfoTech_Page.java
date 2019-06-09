package com.cucumber.framework.InfoTech;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;
import com.cucumber.framework.newtour.aktreeasignupppage;

public class InfoTech_Page 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(InfoTech_Page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//input[@name='txtLogin' or @id='txtLogin']")
	WebElement username;
	
	@FindBy(xpath=".//input[@name='txtPassword' or @id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath=".//input[@name='txtLogin' or @id='txtLogin']")
	WebElement successMsgObject;
	
	@FindBy(xpath=".//a[@class='dropdown-toggle' and @title='Change Apps']")
	WebElement successwelcomeobject;
	
	@FindBy(xpath=".//input[@name='btnLogin' or @value='LOGIN']")
	WebElement loginbutton;
	
	
	
	
	public InfoTech_Page(WebDriver driver) {
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
	
	public void loginButton() throws InterruptedException
	{
		loginbutton.click();
	}
	
	public boolean verifySuccessLoginMsg()
	{
		return new GenericHelper().isDisplayed(successMsgObject);
	}
	public boolean verifySuccesswelcomeMsg()
	{
		return new GenericHelper().isDisplayed(successwelcomeobject);
	}

}
