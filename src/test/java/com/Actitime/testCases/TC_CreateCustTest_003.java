package com.Actitime.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.Actitime.pageObjects.CreateCustomerPage;
import com.Actitime.pageObjects.LoginPage;

public class TC_CreateCustTest_003 extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		logger.info("Login done successfully");
		Thread.sleep(3000);
		
		CreateCustomerPage ccp= new CreateCustomerPage(driver);
		
		ccp.clickTasks();
		logger.info("clicked on Task Button");
		ccp.addNewButton();
		logger.info("Clicked on add new Buton");
		ccp.clickNewCust();
		logger.info("clicked in new customer");
		String custName=setRandomstring();
		ccp.sendCustName(custName);
		logger.info("customer name sent successfully");
		String custdisc =setRandomstring();
		ccp.sendcustDisc(custdisc);
		logger.info("customer disc sent successfully");
		ccp.clickCreateCustButton();
		logger.info("clicked on new customer button");
		logger.info("new customer has been created succesfully");
		
	}
	
	

}
