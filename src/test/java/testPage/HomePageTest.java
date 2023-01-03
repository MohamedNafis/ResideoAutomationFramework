package testPage;


import common.CommonAction.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;


public class HomePageTest  extends BaseClass{
	

	

	@Test(enabled = false, priority = 1)
	public void clickLoginButtonTest() throws InterruptedException {
	homePage.clickLoginButton();
	}
	
	@Test(enabled = false, priority = 2)
	public void clickUserIdTest() throws InterruptedException {
		homePage.clickUserId();
	}
	
	@Test(enabled = false, priority = 3)
	public void clickUserPassedTest() throws InterruptedException {
		homePage.clickUserPassword();
	}
	
	@Test(enabled = false, priority = 4)
	public void clickNewUserReg() throws InterruptedException {
		homePage.clicknewUserReg();
	}
	
	@Test(enabled = false, priority = 5)
	public void clickForgotUserIdTest() throws InterruptedException {
		homePage.clickForgotUserId();
	}
	
	@Test(enabled = false, priority = 6)
	public void clickUserPasswordTest() throws InterruptedException {
		homePage.clickForgotUserPassword();
	}
	
	@Test(enabled = false, priority = 7)
	public void inputTextInUserIdFieldAndPasswordFieldThenClickLoginButtonTest() throws InterruptedException {
		homePage.inputTextInUserIdFieldAndPasswordFieldThenClickLoginButton();
	}
	
	@Test(enabled = false, priority = 8)
	public void clickForgotPasswordUserNameTest() throws InterruptedException {
		homePage.clickForgotPasswordUserName();
	}
	
	@Test(enabled = false, priority = 9)
	public void clickResideoMainPageTest() throws InterruptedException {
		homePage.clickResideoMainPage();
	}
	
	@Test(enabled = false, priority = 10)
	public void clickSearchkeywordTest() throws InterruptedException {
		homePage.clickSearchKeyword();
	}
	

	
	@Test(enabled = false)
	public void resideoPage () {
		driver.findElement(By.linkText("resideo.com")).click();
	}
	
	@Test(enabled = false, priority = 11)
	public void logoDisplayedTest() {
		homePage.logoDisplayed();
	}
	
	@Test(enabled = false, priority = 12)
	public void forgotIdSubmitButtonTest() {
		homePage.forgotIdSubmitButtonEnabled();
	}
	
	@Test(enabled = false, priority = 13)
	public void forgotIdDropDownTest() {
		homePage.forgotIdDropDown();
	}
	
	@Test(enabled = false, priority = 14)
	public void clickHomeOwnerTitelTest() {
		homePage.clickHomeOwner();
	}
	@Test(enabled = false, priority = 14)
	public void clickUserAccountUrlTest() {
		homePage.clickUserAccount();
	}
	
	@Test(enabled = false, priority = 15)
	public void clickNewUserReg2TextTest() throws InterruptedException {
		homePage.clicknewUserReg2();
	}
	
	@Test(enabled = true, priority = 16)
	public void clickSearchKeyWordTextTest() throws InterruptedException {
		homePage.clickSearchkeyWordText();
	}
	
}
