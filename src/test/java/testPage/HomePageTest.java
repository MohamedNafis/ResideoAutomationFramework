package testPage;


import common.CommonAction.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	
	@Test(enabled = false, priority = 16)
	public void clickSearchKeyWordTextTest() throws InterruptedException {
		homePage.clickSearchkeyWordText();
	}
	
	@Test(enabled = false, priority = 17)
	public void use_of_navigate_method_test() throws InterruptedException {
		homePage.use_of_navigate_method();
	}
	
	
	
	// Very important interview question
	// How can you reset a window size? or they can ask how you can change the screen size by selenium
	
	@Test(enabled = false)
	public void use_of_set_specific_size_in_a_window() throws InterruptedException {
		Thread.sleep(3000);
		dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("http://www.cvs.com");
		Thread.sleep(3000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The size of the maximize screen is: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println("The size of the fullscreen screen is: " + driver.manage().window().getSize());
		Thread.sleep(3000);
	}
	
	// not important at all
		@SuppressWarnings("deprecation")
		@Test(enabled = false)
		public void use_of_set_script_timeout_for_window() {
	        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
	        // setScriptTimeout () method deprecated, so giving you warning, this method is going to be out from selenium
	        // you use @SuppressWarnings("deprecation")
			driver.get("https://www.ebay.com");
		}
	
	@Test(enabled = false)
	public void logoDisplayedTest2() {
		homePage.logoDisplayed();
		Assert.assertTrue(true, "Application Logo is not Displayed ..... ..... ");
	}
	
	
	@Test(enabled = false)
	public void role1_use_of_hard_assert_method() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("http://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 

	}
	
	
	@Test(enabled = false)
	public void role2_use_of_hard_assert_method() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("http://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		//System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertFalse(false, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 

	}
	
	@Test(enabled = false)
	public void role3_use_of_hard_assert_method() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("http://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		//System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertFalse(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 

	}
	
	// A regular title test
	@Test(enabled = false)
	public void use_of_getTitle_method01() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("The title of the page is: " + driver.getTitle());
	}
	
	//will pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion01() {
		String expected = "Sign In";
		String actual = driver.getTitle();
		System.out.println("The title of the page is: " + actual);
		Assert.assertEquals(actual, expected, "The page title doesn't match........");
		// Hard Assertion will not go to next line of failed, but move to next line when passed
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is: " + currentUrl);
	}
	
	//will fail
		@Test(enabled = false)
		public void use_of_getTitle_method_with_assertion02() {
			String expected = "Sign In      ";
			String actual = driver.getTitle();
			System.out.println("The title of the page is: " + actual);
			Assert.assertEquals(actual, expected, "The page title doesn't match........");
			// Hard Assertion will not go to next line of failed, but move to next line when passed
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The URL of the page is: " + currentUrl);
		}
		
		// Will Pass
		@Test(enabled = false)
		public void use_of_getTitle_method_with_soft_assertion() {
			// Your expected Title
			String expected = "Sign In      ";
			String actual = driver.getTitle();
			System.out.println("The Title of the home Page is: " + actual);
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actual, expected, "The page title doesn't match........");
			
			// Soft Assertion, execution will not stopped here if Assertion is failed
			String currentURL = driver.getCurrentUrl();
			System.out.println("The current url is: " + currentURL);
			
		}
		
		// Hover Action or Mouse Hover Over action
		@Test(enabled = false)
		public void use_of_mouse_hoverAction_on_aboutUs() throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.mountsinai.org/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			// To do the mouse hove action, we use Actions class
			//actions = new Actions(driver);
			WebElement aboutUs = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class= 'hidden-xs dropdown']"));
			Thread.sleep(5000);
			actions.moveToElement(aboutUs).build().perform();
			Thread.sleep(5000);
		}
		
		// similar like above, nothing different, extra example
		@Test(enabled = false)
		public void use_of_mouse_hoverAction_on_ourLocations () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.mountsinai.org/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			//Actions actions = new Actions(driver); // very important interview question
			WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
			Thread.sleep(2000);
			actions.moveToElement(ourLocations).build().perform();
			Thread.sleep(6000);	
			System.out.println("\nThe text of this web element is: "+ ourLocations.getText());
		}
		
		
		// drop down, all categories
		// drop down is a commonly asked interview question
		// here - using selectByIndex() method
		// This method is not suggested, or not used much
		// Because, adding a new web element or deleting a new one change the index number
		@Test(enabled=false)
		public void use_of_dropdown_selectByIndex_method () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			WebElement dropElement1 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
			select = new Select(dropElement1);
			select.selectByIndex(11);
			Thread.sleep(4000);
		}	
		

		// drop down, all categories
		// drop down is a commonly asked interview question
		// Most commonly use method in drop down --> selectByVisibleText()
		@Test(enabled=false)
		public void use_of_dropdown_selectByVisisbleText_method () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement droElement2 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
			select = new Select(droElement2);
			select.selectByVisibleText("Art");
			Thread.sleep(4000);
		}
		
		// drop down, all categories
		// drop down is a commonly asked interview question
		// use method --> selectByValue()
		@Test(enabled=false)
		public void use_of_dropdown_selectByValue_method () throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement dropElement3 = driver.findElement(By.name("_sacat"));
			select = new Select(dropElement3);
			select.selectByValue("15032");
			Thread.sleep(5000);		
		}
		
		// Regular click method
		@Test(enabled = false)
		public void use_of_click_method_in_loginButtonTest () throws InterruptedException {
			driver.findElement(By.id("cms-login-submit")).click();
			Thread.sleep(3000);
		}
		
		// alternate of click()
		@Test(enabled = false)
		public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
			driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
		
		// alternate of click()
		@Test(enabled = false)
		public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
			driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
		}
		

		// alternate of click()
		// When you see your webelement is 1 of 1 . but still now working, then you know need to use JAVAscripet Executor.
		@Test(enabled = false)
		public void alternate_of_click_method_in_loginButtonTest03() throws InterruptedException {
			WebElement loginBtn = driver.findElement(By.id("btnUserID"));
			// JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", loginBtn);
			Thread.sleep(4000);
		}
		
		// alternate of click()
		// "arguments[0].click()" --- easy to memorize, memorize it, if you want
		// follow the above one, because you can use any kind of locator 
		// (specially xpath is difficult to create by below one)
		// Que: what is the alternative of click() method or click an web element 
		// or how to find a hidden web element-- very important interview question 
		// don't follow this one, but if you ever see it, i hope you can recognize it
		@Test(enabled = false)
		public void alternate_of_click_method_in_loginButtonTest04() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('cms-login-submit').click();");
		}
		
		// From here till end, this is high level, so just see, don't take them seriously
		// alternative to click an web element in many ways (never memorize, a collection of code)
		// Not important
		// alternate of click()
		@Test(enabled = false)
		public void homepageLoginButtonTest06() {
			WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
			actions.click(homepageLoginButton).perform();
		}
		
		// Not important
		// alternate of click()
		@Test(enabled = false)
		public void homepageLoginButtonTest07() {
			WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
			actions.moveToElement(homepageLoginButton).click().perform();
		}

		// Not important
		// alternate of click()
		@Test(enabled = false)
		public void homepageLoginButtonTest08() {
			WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
			actions.clickAndHold(homepageLoginButton).release().perform();
		}

		// Not important
		// alternate of click()
		@Test(enabled = false)
		public void homepageLoginButtonTest09() {
			WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
			actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
		}
		
		@Test(enabled = false)
		public void refresh_page_2nd_way() throws InterruptedException {
			//driver.navigate().to("http://www.ebay.com");
			Thread.sleep(3000);
			driver.findElement(By.name("ctl00$PlaceHolderMain$UserName")).sendKeys(Keys.F5);
			//driver.navigate().refresh();
			Thread.sleep(3000);
		}
		
		@Test(enabled = false)
		public void loggerPositiveTest() throws InterruptedException {
			homePage.clickSearchkeyWordText();
		}
		
		//logger test
		@Test(enabled = false)
		public void loggerNegativeMethodTest() throws InterruptedException {
			homePage.loggerNegativeMethod();
		}
		
		//  doesn't have search field, so we will direct to Amazon page
		@Test(enabled = false)
		public void use_of_sendKeys_method_then_click_submit() throws InterruptedException {
			Thread.sleep(5000);
			// directing to Amazon.com but this you will never see in industry
			// I did it just for emergency
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			// Writing text in search field by JavaScripet executor
			js.executeScript("arguments[0].value = 'laptop' ", searchField);
			Thread.sleep(5000);
			//click on the search by button JavaScripet executor
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(5000);
		}
		
		// it will fail
		@Test(enabled = false)
		public void how_to_handle_hidden_element_by_regular_selenium_method() throws InterruptedException {
			Thread.sleep(5000);	
			//driver.get("https://courses.letskodeit.com/practice");
			driver.get("https://enthrallit.com/selenium/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// identify the 'Hide' element and click on it
			// The search field will be disappeared, but we can pass value on it
			//driver.findElement(By.id("hide-textbox")).click();
			driver.findElement(By.cssSelector("button#formButton3")).click();
			// identify element and set value (line 707)
			// it will fail by below error message
			// org.openqa.selenium.ElementNotInteractableException: element not interactable
			// whenever you find element not interactable in console, that is for sure a hidden element
			//driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Enthrall IT");
			driver.findElement(By.xpath("//body/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]")).sendKeys("For Test");
		}
		
		@Test(enabled = false)
		public void how_to_handle_hidden_element_by_javascriptExecutor() throws InterruptedException {
			Thread.sleep(5000);	
			driver.get("https://enthrallit.com/selenium/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// identify the 'Hide' element and click on it
			// The search field will be disappeared, but we can pass value on it
			driver.findElement(By.cssSelector("button#formButton3")).click();
			// identify element and set value by JavascriptExecutor
			WebElement field = driver.findElement(By.xpath("//input[@class='form-control']//parent::form[@id='form3']"));
			js.executeScript("arguments[0].value='For Test Use'", field);
			Thread.sleep(5000);
			
			// not important
			// Extra code
			// Extra not related to hidden elements and not important
			// To find out what you send as text, not necessary for this scenario
			// Just save the below code for future reference
			String s = (String) js.executeScript("return document.getElementById('form3').value");
 			System.out.print("Value entered in hidden field: " + s + "\n");
			
			// not important
			// How to get title of the page by JavaScript
			// How to read a JavaScript variable in Selenium WebDriver?
			String title = (String) js.executeScript("return document.title");
			System.out.println("Title of the webpage : " + title);
		}
			// very very important
			// "request An Appointment" web element
			// using visibilityOfElementLocated() method
			// This is a very common scenario in industry to use explicitly wait
			@Test(enabled = false)
			public void use_of_explicitly_wait_in_MountSinai01() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Request an Appointment
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
				// the below line is not part of testing
				driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
			
			
		}
			
			// very very important
			// "request An Appointment" web element
			// using elementToBeClickable() method
			// This is a very common scenario in industry
			@Test(enabled = false)
			public void use_of_explicitly_wait_in_MountSinai02() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
				// the below line is not part of testing
				driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
			}
			
			// important
			// "request An Appointment" web element
			// using visibilityOf() method
			@Test(enabled = false)
			public void use_of_explicitly_wait_in_MountSinai03() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement requestAnAppointment = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
				wait.until(ExpectedConditions.visibilityOf(requestAnAppointment)).click();
				// the below line is not part of testing
				driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
			}
			
			// not important
			// "request An Appointment" web element
			// using presenceOfElementLocated() method
			@Test(enabled = false)
			public void use_of_explicitly_wait_in_MountSinai04() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
				// the below line is not part of testing
				driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
			}
			
			
			// not important
			// "request An Appointment" web element
			// using textToBePresentInElement() method, this is not a clickable method, just to recognize the web element
			@Test(enabled = false)
			public void use_of_explicitly_wait_in_MountSinai05() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement raa = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
				wait.until(ExpectedConditions.textToBePresentInElement(raa, "Request an Appointment"));
				
			}
			
			// important interview question
			// 1st way: Scroll by Actions class
			// scroll bottom and then top
			@Test (enabled = false)
			public void use_of_scroll_down_and_scroll_up_by_actions_class_01 () throws InterruptedException {
				
				driver.navigate().to("https://www.amazon.com/ref=nav_logo");
				//driver.get("https://www.amazon.com/ref=nav_logo");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// for Scroll Down using Actions class, to go at the bottom of the page
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
				Thread.sleep(5000);
				// for Scroll Up using Actions class at the top of the page
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
				Thread.sleep(5000);
				//Keys.UP or Keys.Down doesn't change much but the test case passes, we will not use them
			}
			
			
			// important interview question
			// 2nd way: Scroll by javascriptExecutor
			// scroll in a certain position (not at the bottom or up)
			@Test (enabled = false)
			public void use_of_scroll_down_and_scroll_up_by_javascriptExecutor () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.amazon.com/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// This will scroll down the page by 3000 pixel vertical
				// here 0 is x axis, 3000 y axis
				// you choose your pixel accordingly to reach to that web element
				Thread.sleep(5000);	
				js.executeScript("window.scrollBy(0, 3000)", ""); // scroll down
				// You can change the value of 3000, and put your own to see the web element you wanna test
				Thread.sleep(5000);	
				 js.executeScript("window.scrollBy(0, -3000)", ""); // scroll up
				// minus when it goes opposite of down
				Thread.sleep(4000);
				
				// not related with this test
				driver.navigate().back(); // Back to customer.resideo.com
				Thread.sleep(4000);	
				// How to refresh, getTitle by Javascript, 
				js.executeScript("history.go(0)"); // To do refresh by Javascript
				String sText = js.executeScript("return document.title;").toString(); // fetching page title by javascript
				System.out.println(sText);
				
			}
			
			// not important, just to know
			@Test (enabled = false)
			public void use_of_scroll_down_and_scroll_up_by_robot_class () throws InterruptedException, AWTException {
				Thread.sleep(5000);	
				driver.get("https://www.ebay.com/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				Robot robot = new Robot();
				// Scroll Down using Robot class
				robot.keyPress(KeyEvent.VK_PAGE_DOWN); // Constant for the PAGE_DOWN virtual key.
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(5000);
				
				// Scroll Up using Robot class
		        robot.keyPress(KeyEvent.VK_PAGE_UP); // Constant for the PAGE_UP virtual key. 
		        robot.keyRelease(KeyEvent.VK_PAGE_UP);
		        Thread.sleep(5000);
		        
		        driver.navigate().back();
		        Thread.sleep(5000);
				
			}
			
			// scroll Into View The Element
			// This is important, standard question
			//TODO Not working, Need to ask Nasir (other students device is also working)
			@Test(enabled = false)
			public void scrollIntoViewTheElement(WebElement wElement) throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.amazon.com/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(5000);
				WebElement frequentlyRepurchasedInHome = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Home']"));
				js.executeScript("arguments[0].scrollIntoView(true);", frequentlyRepurchasedInHome);
				Thread.sleep(5000);
			}
			
			// important for interview
			@Test(enabled = false)
			public void web_based_alert_accept_test () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Thread.sleep(4000);
				Alert alert = driver.switchTo().alert();
				Thread.sleep(4000);
				System.out.println("The text present in the alert is: " + alert.getText());
				alert.accept();
				// line 911, not part of the accept function, 
				// we just added to know about, the text is present in the alert or not
			}
			
			// important for interview
			@Test(enabled = false)
			public void web_based_alert_reject_test () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Thread.sleep(4000);
				Alert alert = driver.switchTo().alert();
				Thread.sleep(4000);
				alert.dismiss();
				
			}
			
			// important for interview
			@Test(enabled = false)
			public void authenticationPopUpTest () throws InterruptedException {
				Thread.sleep(5000);	
				String userName = "admin";
				String password = "admin";
				// adding user name, password with URL
				// original one is: "https://the-internet.herokuapp.com/basic_auth";
				// Updated one is: "https://admin:admin@the-internet.herokuapp.com/basic_auth";
				String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth"; // learn this line, important interview question	
				driver.get(url);
				Thread.sleep(5000);	
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(5000);
				
				// The below part is not part of this test
				// identify and get text after authentication of popup
				String t = driver.findElement(By.tagName("p")).getText(); // we use tag name as a locator in our course
				System.out.println("Text is: " + t);
			}
			
			// important for interview
			@Test(enabled = false)
			public void use_of_right_click_action () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement rcButton = driver.findElement(By.xpath("//span[text()='right click me']"));
				actions.moveToElement(rcButton).contextClick().build().perform(); // to do the right click, contextClick() is used
				Thread.sleep(4000);
				
				// Just keep below code, Can't find the web element for Edit at present, the line 968 is from my collection.
				// Below 2 is not relevant to right click, just doing some extra, which we know already
				// Next: I want to click on Edit link on the displayed menu options
				WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
				Thread.sleep(5000);
				edit.click(); // a regular click , not a right click
				Thread.sleep(5000);
				
				// Switch to the alert box and click on OK button
				Alert alert = driver.switchTo().alert();
				System.out.println("\nAlert Text:" + alert.getText());
				alert.accept();
				Thread.sleep(5000);		
			}
			
			// important for interview
			@Test(enabled = false)
			public void use_of_double_click_action () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement dcButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				actions.doubleClick(dcButton).build().perform();
				Thread.sleep(5000);	
				

				// Not part of the double click action
				// Switch to the alert box and click on OK button
				Alert alert = driver.switchTo().alert();
				System.out.println("\nAlert Text:" + alert.getText());
				alert.accept();
				Thread.sleep(5000);		
			}
			
			// not important for interview
			@Test(enabled = false)
			public void use_of_drag_and_drop_action () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Element which needs to drag (Bank)
				WebElement sourceLocator = driver.findElement(By.id("credit2"));
				// Element where need to be dropped.(In 'Account' field of debit side)
				WebElement targetLocator = driver.findElement(By.xpath("//ol[@id='bank']"));
				// We Use Actions class for drag and drop.
				actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
				Thread.sleep(4000);
			}
			
			// not important
			@Test(enabled = false)
			public void use_of_slider_action () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demoqa.com/slider/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Retrieve WebElemnt 'slider' to perform mouse hover
				// This is the field where volume is increased
				WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
				// Move mouse to x offset 50 i.e. in horizontal direction
				Thread.sleep(5000);
				// to test the slider is working or not
				// dragAndDrop (int xoffset, int yoffset)
				actions.dragAndDropBy(slider, 50, 0).build().perform(); // learn from here, 80 is in pixel which might not match with real volume change
				Thread.sleep(5000);
				// slider.click();
				System.out.println("Moved slider in horizontal directions");
			}
			
			// not important (alternate)
			@Test(enabled = false)
			public void use_of_slider_action_alternate () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demoqa.com/slider/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Retrieve WebElemnt 'slider' to perform mouse hover
				// This is the field where volume is increased
				WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
				// Move mouse to x offset 50 i.e. in horizontal direction
				Thread.sleep(5000);
				actions.clickAndHold(slider);
				actions.moveByOffset(65, 0).build().perform();
				Thread.sleep(5000);
				System.out.println("Moved slider in horizontal directions");
			}
			
			@Test(enabled = false)
			public void mouseHoverActionOnAboutUs() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.mountsinai.org/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement aboutUs = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
				Thread.sleep(5000);
				actions.moveToElement(aboutUs).build().perform();
				Thread.sleep(5000);
				
				List<WebElement> listofAboutUs =  driver.findElements(By.xpath("//a[normalize-space(text())='About Us']//following-sibling::div//child::div//child::div"));
				int numberOfElements = listofAboutUs.size();
				System.out.println("Number of web Elements: "+ numberOfElements);
				for(int i=0; i<numberOfElements; i++) {
					System.out.println(listofAboutUs.get(i).getText());
				}
				
				//a[contains(text(), 'About Us')]//following-sibling::div//child::div//child::div
				//a[contains(text(), 'Patient Care')]//following-sibling::div//child::div//child::div
				//a[contains(text(), 'Our Locations')]//following-sibling::div//child::div//child::div
				
			}
			
			@Test(enabled = false)
			public void mouseHoverActionOnPhotos() throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.costco.com/");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement photos = driver.findElement(By.xpath("//a[text()='Photo']"));
				Thread.sleep(5000);
				actions.moveToElement(photos).build().perform();
				Thread.sleep(5000);
				List<WebElement> listofPhotos =  driver.findElements(By.xpath("//a[text()='Photo']//following-sibling::div//child::div"));
				int numberOfElements = listofPhotos.size();
				System.out.println("Number of web Elements: "+ numberOfElements);
				for(int i=0; i<numberOfElements; i++) {
					System.out.println(listofPhotos.get(i).getText());
				}
				
				
			}
			
			@Test(enabled = false)
			public void switchBetweenWindow01 () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://demoqa.com/browser-windows");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				String parentWindow = driver.getWindowHandle();
				System.out.println("Parent Window ID: " + parentWindow + "\n");
				driver.findElement(By.xpath("//button[text()='New Window']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='New Window']")).click(); // clicked twice to open 2 child window
				Thread.sleep(3000);
				// very very important interview question:  How you handle windows from parent to child? 
				// or how you can recognize the parent and child window	
				// Get all window handles -- include parent + child = Total 3
				// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
				Set<String> allWindowHandles = driver.getWindowHandles();
				System.out.println("Total Windows Opened: " + allWindowHandles.size()); 
				// Extract Parent and child window from all window handles
				String parent = (String) allWindowHandles.toArray()[0];
				String child1 = (String) allWindowHandles.toArray()[1];
				String child2 = (String) allWindowHandles.toArray()[2];
				System.out.println("Parent Window ID: " + parent + "\n");
				System.out.println("Child1 Window ID: " + child1 + "\n");
				System.out.println("Child2 Window ID: " + child2 + "\n");
				// Then switch from one window to other window (parent to child) by below
				driver.switchTo().window(child1);
					
			}
			
			// same way for moving from child to window for different url
			@Test(enabled = false)
			public void switchBetweenWindow02 () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://enthrallit.com");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// to click seelenium
				driver.findElement(By.xpath("//a[text()='Selenium']")).click();
				Thread.sleep(3000);
				
				// This will scroll up the page by 1000 pixel vertically
				Thread.sleep(4000); // used to see the scroll
				js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
				Thread.sleep(4000);
				
				String mainWindow = driver.getWindowHandle(); // learn this line
				System.out.println("Main Window ID: " + mainWindow + "\n");
				
				// click on the Open Window button
				driver.findElement(By.xpath("(//button[text()='Open Window'])[1]")).click();
				Thread.sleep(5000);
				// interview question:  How you handle windows from parent to child? or how you can recognize the parent and child window
				
				// Get all window handles -- include parent + child
				// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
				Set<String> allWindowHandles = driver.getWindowHandles();
				System.out.println("Windows Open After Click: " + allWindowHandles.size());
				// Extract Parent and child window from all window handles
				String parent = (String) allWindowHandles.toArray()[0]; // first index: parent
				String child = (String) allWindowHandles.toArray()[1]; // second index: child 

				//	Use window handle to switch from one window to other window (parent to child)
				driver.switchTo().window(child); // switchTo() -- method is used to switch from one to another
				
			}
			
			// different way for moving from child to window for different url
			@Test(enabled = false)
			public void switchBetweenWindow03 () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://enthrallit.com");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(5000);	
				driver.findElement(By.xpath("//a[text()='Selenium']")).click();
				Thread.sleep(3000);
				
				// This will scroll up the page by 1000 pixel vertically
				Thread.sleep(4000); // used to see the scroll
				js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
				Thread.sleep(4000);
				
				String mainWindow = driver.getWindowHandle(); // learn this line
				System.out.println("Main Window ID: " + mainWindow + "\n");
				
				// click on the Open Window button
				driver.findElement(By.xpath("(//button[text()='Open Window'])[1]")).click();
				Thread.sleep(5000);
				
				// interview question:  How you handle windows from parent to child? or how you can recognize the parent and child window
				
				// Get all window handles -- include parent + child
				// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
				Set<String> allWindowHandles = driver.getWindowHandles();
				System.out.println("Total Windows Open: " + allWindowHandles.size());
				
				// for each loop
				for (String wh : allWindowHandles) {
					if (mainWindow.equals(wh)) {
						System.out.println("\t Window ID 1: \t" + wh + "\n \t URL: \t \t" + driver.getCurrentUrl()
								+ "\n \t Title: \t \t" + driver.getTitle());
					} else {
						driver.switchTo().window(wh);
						System.out.println("\t Window ID 2: \t" + wh + "\n \t URL: \t \t" + driver.getCurrentUrl()
								+ "\n \t Title: \t \t" + driver.getTitle());
					}
				}		
				
			}
			
			// How to read the content of a Table 
			@Test(enabled = false)
			public void read_table () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.amazon.com");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(5000);
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
				Thread.sleep(5000);
				WebElement table = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon"));
				System.out.println(table.getText());
			}
			
			// How to read the content of a Table 
			@Test(enabled = false)
			public void readAnyRowofTheTable () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.amazon.com");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(5000);
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
				Thread.sleep(5000);
				WebElement row = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon tr:nth-child(1)"));
				System.out.println(row.getText());
			}
			
			// How to read a cell of a Table 
			@Test(enabled = false)
			public void readAnyCellOfARowofTheTable () throws InterruptedException {
				Thread.sleep(5000);	
				driver.get("https://www.amazon.com");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(10000);
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
				Thread.sleep(5000);
				WebElement cell = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon tr:nth-child(1) td:nth-child(3)"));
				System.out.println(cell.getText());			
			}
			
			// Tough, don't try to understand the code, just understand the concept: time+condition+frequency
			// Interview question, generally not used in industry
			@Test (enabled = false)
			public void logoTest04() throws InterruptedException {
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(20))
						.pollingEvery(Duration.ofSeconds(5))
						.ignoring(NoSuchElementException.class); // line ends here
				WebElement logo = wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return driver.findElement(
								By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
					}
				});
				logo.isDisplayed();
			}
			
			@Test(enabled = false, priority = 1, groups = {"functionalTest", "sanityTest", "smokeTest", "regressionTest"})
			public void use_of_getTitle_method_with_assertion11() throws InterruptedException {
				// Your expected Title
				String expected = "CMS Enterprise Portal";
				String actual = driver.getTitle();
				System.out.println("The Title of the home Page is: " + actual);
				Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");  
				// Hard Assertion will not go to next line of failed, but move to next line when passed
				String currentURL = driver.getCurrentUrl();
				System.out.println("The current url is: " + currentURL);
				
			}
			
			@Test(enabled = false, priority = 1, groups = {"regressionTest"})
			public void use_of_getTitle_method_with_assertion12() throws InterruptedException {
				// Your expected Title
				String expected = "CMS Enterprise Portal           ";
				String actual = driver.getTitle();
				System.out.println("The Title of the home Page is: " + actual);
				Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");  // Hard Assertion, execution stopped here if Assertion fail
				// Hard Assertion will not go to next line of failed, but move to next line when passed
				String currentURL = driver.getCurrentUrl();
				System.out.println("The current url is: " + currentURL);
				
			}
			
			@Test(enabled = false, priority = 1, groups = {"sanityTest", "regressionTest"})
			public void use_of_getTitle_method_with_assertion13() throws InterruptedException {
				String expected = "A CMS Enterprise Portal"; // WHICH is wrong
				String actual = driver.getTitle();
				System.out.println("Home Page Title is: "+actual);
				SoftAssert softAssert = new SoftAssert(); 	// Soft Assertion, mainly interview question, not used generally
				softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ..." );
				String currentURL =	driver.getCurrentUrl();
				System.out.println("The current url from priority 3 is: "+currentURL);
			
			}
			
			@Test (enabled = false, priority = 4, groups = {"smokeTest", "sanityTest", "functionalTest", "regressionTest"})
			public void logoTest(){
				WebElement logo = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
				boolean flag = logo.isDisplayed();
				System.out.println("Is the logo displayed? Ans: "+flag);
				Assert.assertTrue(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
			
			}
			
			@Test(enabled = false)
			public void use_of_expectedExceptions01 () {
				System.out.println("We can verify whether a code throws the expected exception or not. Here it will fail");
				int i = 1/0;	
			}
			
			@Test(enabled = false, expectedExceptions = ArithmeticException.class)
			public void use_of_expectedExceptions02 () {
				System.out.println("We can verify whether a code throws the expected exception or not. Here it will pass");
				int i = 1/0;	
			}
			
			@Test(enabled = false, expectedExceptions = NoSuchElementException.class)
			public void use_of_expectedExceptions03 () throws InterruptedException {
				driver.findElement(By.id("ms-login-submit")).click();
				Thread.sleep(3000);
			}
			
			// use of invocation count, when? -- if you know some test cases fail for no reason
			// and then you fix it, you can run more than one time by invocation count	
			// use of threadPoolSize
			@Test (enabled = false, priority = 1, invocationCount = 10, timeOut = 10000)
			public void titleTest04() {	
				String expected = "CMS Enterprise Portal";
				String actual = driver.getTitle();
				System.out.println("Home Page Title is: "+actual);
				Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
				System.out.println("Thread: "+ Thread.currentThread().getName()); // to know which thread is running

			}

			//TODO Is the threadPoolSize working? NEED TO RESOLVED, may be working as multi threaded, can't see, need to be make sure
			// Ask Nasir to solve it
			@Test (enabled = false, priority = 1, threadPoolSize = 3, timeOut = 10000)
			public void titleTest() {	
				String expected = "CMS Enterprise Portal";
				String actual = driver.getTitle();
				System.out.println("Home Page Title is: "+actual);
				Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
				System.out.println("Thread: "+ Thread.currentThread().getName()); // to know which thread is running

			}
			
			@Test (enabled = false)
			public void b_logoTest01(){
				WebElement logo = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
				boolean flag = logo.isDisplayed();
				System.out.println("Is the logo displayed? Ans: "+flag);
				Assert.assertTrue(true, "Application Logo is not displayed .....");	
			}
			
			@Test(enabled = false, dependsOnMethods = "b_logoTest01")
			public void a_newUserRegistrationTest01() {
				boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
				System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
			}	
			// change the logoTest02 method to fail and see the above method skipped as it depends on logoTest02

			@Test (enabled = false)
			public void b_logoTest02(){
				// the xpath is wrong
				WebElement logo = driver.findElement(By.xpath("//mmem[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"));
				boolean flag = logo.isDisplayed();
				System.out.println("Is the logo displayed? Ans: "+flag);
				Assert.assertTrue(true, "Application Logo is not displayed .....");	
			}
			
			@Test(enabled = false, dependsOnMethods = "b_logoTest02")
			public void a_newUserRegistrationTest02() {
				boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
				System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
			}	
			// change the logoTest02 method to fail and see the above method skipped as it depends on logoTest02
			
			// Explain in the next class, forgot to add
			@Test(enabled = false, groups = { "functionalTest" })
			public void nonSkipHomePageTitleTest() {
				String expected = "CMS Enterprise Portal";
				String actual = driver.getTitle();
				System.out.println("home page title is: " + actual);
				Assert.assertEquals(actual, expected, "Home Page Title doesn't match...");	
				System.out.println("No need to skip the test");
			}	
			
			// only example where throw is used
			// How to skip a test?
			@Test(enabled = true, groups = { "functionalTest" })
			public void skipHomePageTitleTest01() {
				String title = "CMS Enterprise Portal";
				if (title.equals(driver.getTitle())) {
					throw new SkipException("Skipping -- as the title matches as expected");
				} else {
					System.out.println("Home Page Title doesn't match...");
				}
				System.out.println("I am out of the if else condition");
			}	
			
			@Test(enabled = true, groups = { "functionalTest" })
			public void skipHomePageTitleTest02() {
				// expected is different than actual
				String title = "CMS Enterprise Portal                      ";
				if (title.equals(driver.getTitle())) {
					throw new SkipException("Skipping -- as the title matches as expected");
				} else {
					System.out.println("Home Page Title doesn't match...");
				}
				System.out.println("I am out of the if else condition");
			}	
}
		