package com.Actitime.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Actitime.pageObjects.CreateCustomerPage;
import com.Actitime.pageObjects.DeleteCustomerPage;
import com.Actitime.pageObjects.LoginPage;


public class TC_DeleteCustomer_004 extends BaseClass{
	
	@Test
	public void deleteCustomer() {
		LoginPage lp = new LoginPage(driver);
		CreateCustomerPage ccp1= new CreateCustomerPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		DeleteCustomerPage dcp=new DeleteCustomerPage(driver);
		
		
		ccp1.clickTasks();
		dcp.sendTyping("raj");
		
		boolean sendTextStatus=driver.getPageSource().contains("raj");
		Actions act= new  Actions(driver);
		if(sendTextStatus==true) {
			WebElement editButton=dcp.returnEditButtonElement();
			act.moveToElement(editButton).perform();
			editButton.click();
			
			dcp.clickActionButton();
			dcp.clickDeleteButton();
			dcp.clickPermanently();
		}
		else {
			try {
				captureScreen(driver, "DeleteCustomer");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Delete customer"+e.getMessage());
			}
		}
		
	}
	
	
	
	
	

}
