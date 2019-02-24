package com.cucumber.framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;
//import com.cucumber.framework.helper.genericHelper.GenericHelper;


public class LoginPage{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//*[contains(text(),'SIGN-ON')]")
	WebElement signin;
	
	@FindBy(xpath=".//input[@name='userName']")
	WebElement emailAddress;
	
	@FindBy(xpath=".//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath=".//input[@name='login']")
	WebElement submitLogin;
	
	@FindBy(xpath=".//input[@name='tripType' and @value='roundtrip']")
	WebElement successMsgObject;
	
	@FindBy(xpath="//*[@id='email_create']")
	WebElement registration;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement createAnAccount;
	

	public LoginPage(WebDriver driver) {
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
	
	public void enterEmailAddress(String emailAddress)
	{
		log.info("entering email address...."+emailAddress);
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		this.password.sendKeys(password);
	}
	
	public HomePage clickOnSubmitButton(){
		log.info("clicking on submit button...");
		submitLogin.click();
		return new HomePage(driver);
	}
	
	public boolean verifySuccessLoginMsg(){
		return new GenericHelper().isDisplayed(successMsgObject);
	}
	
	public void enterRegistrationEmail(){
		String email = System.currentTimeMillis()+"@gmail.com";
		log.info("entering registration email.."+email);
		registration.sendKeys(email);	
	}
	
	public RegistrationPage clickOnCreateAnAccount(){
		createAnAccount.click();
		return new RegistrationPage(driver);
	}

}
