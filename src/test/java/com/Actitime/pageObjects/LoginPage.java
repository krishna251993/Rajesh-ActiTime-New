package com.Actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username_ID;
	
	@FindBy(name="pwd")
	WebElement password_name;
	
	@FindBy(id="loginButton")
	WebElement LoginBtn_ID;
	
	@FindBy(xpath="//span[@class='errormsg']")
	WebElement errorMsg;
	
	@FindBy(id="logoutLink")
	WebElement logOut;
	
	public void setUserName(String uname) {
		username_ID.sendKeys(uname);
	}
	
	public void setPassword(String password) {
		password_name.sendKeys(password);
	}
	public void clickLogin() {
		LoginBtn_ID.click();
	}
	//user defined message to check weather error msg is present or not
	public boolean isErrorMsgPresent() {
		if(errorMsg.getText().equals("Username or Password is invalid. Please try again.")) {
			return true;
		}
		else 
			return false;
	}
	
	public void clickLogout() {
		logOut.click();
	}
	

}
