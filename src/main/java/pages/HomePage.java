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
	
	@FindBy (css="img#imgComapnyLogo")
	WebElement logo;
	
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
	
	@FindBy(css="input.button")
	WebElement forgotIdSubmit;
	
	@FindBy (css = "select[id= 'CategoryDropDownId']")
	WebElement forgotIdDropDown;
	
	@FindBy (linkText = "homeowners link")
	WebElement homeOwner;
	
	@FindBy (id = "ctl00_lnkHeaderLink1")
	WebElement userAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement newUserReg2;
	
	@FindBy(css = "input[type='text']")
	WebElement searchOptionInHomePage;
	
	@FindBy(id = "quantity")
	WebElement searchButtonInHomePage;
	
	
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is Displayed? Ans: " + flag);
		return flag;
		
	}
	
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
	
	public boolean forgotIdSubmitButtonEnabled() {
		clickElement(forgotUserId);
		boolean sb = forgotIdSubmit.isEnabled();
		System.out.println("The Submit Button Is Enabled? Ans: " + sb);
		return sb;
	}
	
	public boolean forgotIdDropDown() {
		clickElement(forgotUserId);
		boolean db = forgotIdDropDown.isSelected();
		clickElement(forgotIdDropDown);
		System.out.println("The DropDown Is Selected? Ans: " + db);
		return db;
		
	}
	
	public void clickHomeOwner() {
		clickElement(homeOwner);
		System.out.println("The Titel Of The Page is: " + driver.getTitle());
	}
	
	public void clickUserAccount() {
		clickElement(userAccount);
		System.out.println("The URL Of The Page is: " + driver.getCurrentUrl());
		
	}
	
	public void clicknewUserReg2() throws InterruptedException {
		clickElement(newUserReg2);
		Thread.sleep(3000);
		System.out.println("The text For The Web Element Is: " +newUserReg2.getText());
		System.out.println("The Attribute For (ID) The Web Element Is: " +newUserReg2.getAttribute("id"));
		System.out.println("The Attribute For (Href) The Web Element Is: " +newUserReg2.getAttribute("href"));
		System.out.println("The Attribute For (Class) The Web Element Is: " +newUserReg2.getAttribute("class"));
		System.out.println("The Attribute For (Title) The Web Element Is: " +newUserReg2.getAttribute("title"));
		
	}
	
	
	
	public void clickSearchkeyWordText() throws InterruptedException {
		inputText(searchKeyword, "doorbell");
		Thread.sleep(5000);
		enter_or_return(searchKeyword);
		clearText(searchKeyword);
		Thread.sleep(5000);
		inputText(searchKeyword, "water");
		Thread.sleep(5000);
		enter_or_return(searchKeyword);
		Thread.sleep(5000);
		
	}
	
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazong.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	
	

	

}