package com.Actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {
	WebDriver driver;
	public CreateCustomerPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[@href='/tasks/tasklist.do']")
	WebElement tasks;
	@FindBy(xpath="//div[text()='Add New']")
	WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	WebElement NewCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	WebElement enterCustName;
	
	@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description'])")
	WebElement custDisc;
	
	@FindBy(xpath="//div[text()='  Create Customer']")
	WebElement  createCustButton;
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickTasks() {
		tasks.click();
	}
	public void addNewButton() {
		addNewButton.click();
	}
	public void clickNewCust() {
		NewCustomer.click();
	}
	
	public void sendCustName(String custName) {
		enterCustName.sendKeys(custName);
	}
	
	public void sendcustDisc(String custdisc) {
		custDisc.sendKeys(custdisc);
	}
	
	public void clickCreateCustButton() {
		createCustButton.click();
	}
	
	
}
