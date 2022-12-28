package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class HomePage {
	
     WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="btnUserID")
	WebElement loginButton;
	
	@FindBy(name="ctl00$PlaceHolderMain$UserName")
	WebElement userId;
	
	@FindBy(how = How.NAME, using = "ctl00$PlaceHolderMain$password")
	WebElement userPassword;
	
	// Use of xpath as locator 
	//Tag with multiple attribute with 'and' logic 
	@FindBy(how = How.XPATH, using = "//a[@class='tertiary-button' and @cssclass='button']")
	WebElement newUserReg;
	
	// Use of xpath as locator 
	//Tag with inner text [means complete text]
	@FindBy(xpath = "//a[text()='Forgot UserID?']")
	WebElement forgotUserId;
	
	// Use of link Text as locator 
	//Tag with a single attribute
	@FindBy(linkText ="Forgot Password?" )
	WebElement forgotUserPassword;
	
	// Use of xpath as locator 
	// Tag with multiple attribute with 'or' logic
	@FindBy(xpath = "//input[@name='ctl00$PlaceHolderMain$txtForgptPwdUserName' or @class='standard-text']")
	WebElement forgotPasswordUserName;
	
	
	
	//Use of partialLinkText as locator 
	// Tag with partial inner text
	@FindBy(partialLinkText = "resideo")
	WebElement resideoMainPage;
	
	//Use of css as locator 
	@FindBy(css = "input.placeheld.ui-autocomplete-input")
	WebElement searchKeyword;
	
	public void clickLoginButton() throws InterruptedException {
		clickElement(loginButton);
		Thread.sleep(3000);
	}
	
	public void clickUserId() throws InterruptedException {
		clickElement(userId);
		Thread.sleep(3000);
	}
	
	public void clickUserPassword() throws InterruptedException {
		clickElement(userPassword);
		Thread.sleep(3000);
	}
	
	public void clicknewUserReg() throws InterruptedException {
		clickElement(newUserReg);
		Thread.sleep(3000);
	}
	
	public void clickForgotUserId() throws InterruptedException {
		clickElement(forgotUserId);
		Thread.sleep(3000);
	}
	
	public void clickForgotUserPassword() throws InterruptedException {
		clickElement(forgotUserPassword);
		Thread.sleep(3000);
	}
	
	public void inputTextInUserIdFieldAndPasswordFieldThenClickLoginButton() throws InterruptedException {
		inputText(userId, "Nafis247");
		inputText(userPassword, "1234567890");
		clickElement(loginButton);
		Thread.sleep(6000);
		
	}
	
	public void clickForgotPasswordUserName() throws InterruptedException {
		clickElement(forgotUserPassword);
		Thread.sleep(3000);
		clickElement(forgotPasswordUserName);
		Thread.sleep(3000);
		
	}
	
	public void clickResideoMainPage() throws InterruptedException {
		clickElement(resideoMainPage);
		Thread.sleep(3000);
		
	}
	
	public void clickSearchKeyword() throws InterruptedException {
		clickElement(searchKeyword);
		Thread.sleep(3000);
	}

}
