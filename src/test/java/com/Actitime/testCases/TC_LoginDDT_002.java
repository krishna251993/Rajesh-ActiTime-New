package com.Actitime.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Actitime.pageObjects.LoginPage;
import com.Actitime.utilities.DemoExcelLibrary3;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider="LoginData")
	public void loginDDT(String uname,String pwd) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("username has been provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickLogin();
		boolean errorMsgStatus=lp.isErrorMsgPresent();
		if(errorMsgStatus==true) {
			logger.warn("wrong credential");
			driver.switchTo().defaultContent();
			
		}
		else {
			logger.info("right credential");
			lp.clickLogout();
			Thread.sleep(3000);
		}
		
		
	}
	@DataProvider(name="LoginData")
	String[][] getData(){
		String path= System.getProperty("user.dir")+"/src/test/java/com/Actitime/testData/TestData.xlsx";
		int row= DemoExcelLibrary3.getlastrow("login",path);
		String loginData[][]= new String[row][2];
		for (int i = 1; i <row; i++) {
			for (int j = 0; j <= 1; j++) {
				loginData[i-1][j]=DemoExcelLibrary3.getexcelData("login", i, j,path);
				System.out.println(loginData[i-1][j]);
			}
			
		}
		return loginData;
		
	}

}
