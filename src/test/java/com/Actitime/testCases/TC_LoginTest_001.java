package com.Actitime.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Actitime.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() {
		LoginPage lp= new LoginPage(driver);
		logger.info("URL opened");
		
		lp.setUserName(username);
		logger.info("Username successfully passed");
		lp.setPassword(password);
		logger.info("password successfully passed");
		lp.clickLogin();
		
		if(driver.getTitle().equals("actiTIME - Login")) {
			Assert.assertTrue(true);
			logger.info("title varified");
		}
		else
		{
			try {
				captureScreen(driver, "loginTest");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
			logger.info("Title is not varified");
			logger.info("title varified");
		}
	}

}
