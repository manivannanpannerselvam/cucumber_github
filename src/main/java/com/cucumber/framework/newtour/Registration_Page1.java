package com.cucumber.framework.newtour;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;

public class Registration_Page1 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Registration_Page1.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath =".//input[@name='address1']")
	WebElement Address;
	
	@FindBy(xpath = ".//input[@name='city']")
	WebElement city;
	
	public Registration_Page1(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setAddress(String Address) 
	{
		log.info("entering Address.." + Address);
		this.Address.sendKeys(Address);
	}
	
	public void setCity(String city) {
		log.info("entering lastname	.." + city);
		this.city.sendKeys(city);
	}

}
