package com.Actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	WebDriver driver;
	public DeleteCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	WebElement startTyping;

	@FindBy(xpath="//span[text()='raj']/../../..//div[@class='editButton']")
	WebElement editButton;
	
	@FindBy(xpath="(//div[text()='ACTIONS'])[1]")
	WebElement actionsButton;
	
	//Actions act= new Actions(driver);
	
	@FindBy(xpath="(//div[text()='Delete'])[2]")
	WebElement deleteButton;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	WebElement deletePermanently;
	
	public void sendTyping(String custName) {
		startTyping.sendKeys(custName);
	}
	public WebElement returnEditButtonElement() {
		//act.moveToElement(editButton).perform();
		//act.click();
		return editButton;
	}
	
	public void clickActionButton() {
		actionsButton.click();
	}
	public void clickDeleteButton() {
		deleteButton.click();
	}
	

	public void clickPermanently() {
		deletePermanently.click();
	}
}
