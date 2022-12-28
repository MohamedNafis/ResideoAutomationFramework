package testPage;


import common.CommonAction.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;


public class HomePageTest  extends BaseClass{
	
	

	@Test(enabled = true, priority = 1)
	public void clickLoginButtonTest() throws InterruptedException {
	homePage.clickLoginButton();
	}
	
	@Test(enabled = true, priority = 2)
	public void clickUserIdTest() throws InterruptedException {
		homePage.clickUserId();
	}
	
	@Test(enabled = true, priority = 3)
	public void clickUserPassedTest() throws InterruptedException {
		homePage.clickUserPassword();
	}
	
	@Test(enabled = true, priority = 4)
	public void clickNewUserReg() throws InterruptedException {
		homePage.clicknewUserReg();
	}
	
	@Test(enabled = true, priority = 5)
	public void clickForgotUserIdTest() throws InterruptedException {
		homePage.clickForgotUserId();
	}
	
	@Test(enabled = true, priority = 6)
	public void clickUserPasswordTest() throws InterruptedException {
		homePage.clickForgotUserPassword();
	}
	
	@Test(enabled = true, priority = 7)
	public void inputTextInUserIdFieldAndPasswordFieldThenClickLoginButtonTest() throws InterruptedException {
		homePage.inputTextInUserIdFieldAndPasswordFieldThenClickLoginButton();
	}
	
	@Test(enabled = true, priority = 8)
	public void clickForgotPasswordUserNameTest() throws InterruptedException {
		homePage.clickForgotPasswordUserName();
	}
	
	@Test(enabled = true, priority = 9)
	public void clickResideoMainPageTest() throws InterruptedException {
		homePage.clickResideoMainPage();
	}
	
	@Test(enabled = true, priority = 10)
	public void clickSearchkeywordTest() throws InterruptedException {
		homePage.clickSearchKeyword();
	}
	

	
	@Test(enabled = false)
	public void resideoPage () {
		driver.findElement(By.linkText("resideo.com")).click();
	}
	
	
}
