package com.cucumber.framework.newtour;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.PageObject.LoginPage;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;

public class Registration_page
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Registration_page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = ".//input[@name='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = ".//input[@name='lastName']")
	WebElement lastName;

	public Registration_page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String firstName) {
		log.info("entering firstName.." + firstName);
		this.firstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		log.info("entering lastname	.." + lastName);
		this.lastName.sendKeys(lastName);
	}
	
	
}
