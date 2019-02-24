package com.cucumber.framework.newtour;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;

public class Support 
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Support.class);
	WaitHelper waitHelper;
	
	@FindBy(linkText="SUPPORT")
	WebElement supporticon;
	
	@FindBy(xpath=".//img[@src='/images/forms/home.gif']")
	WebElement BacktoHome;
	
	//.//img[@src='/images/forms/home.gif']
	
	public Support(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicksupportbutton() throws InterruptedException
	{
			Thread.sleep(9000);
			log.info("clicked on sign in link...");
			supporticon.click();	
	}
	public void Backtohome() throws InterruptedException
	{
		Thread.sleep(3000);
		log.info("clicked on BacktoHome button");
		BacktoHome.click();
		
	}
	
	

}
