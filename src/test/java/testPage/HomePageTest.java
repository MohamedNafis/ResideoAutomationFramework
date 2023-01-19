package testPage;


import common.CommonAction.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
			WebElement field = driver.findElement(By.xpath("//body/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]"));
			js.executeScript("arguments[0].valus='For Test Use'", field);
			Thread.sleep(5000);
			
			// not important
			// Extra code
			// Extra not related to hidden elements and not important
			// To find out what you send as text, not necessary for this scenario
			// Just save the below code for future reference
			String s = (String) js.executeScript("return document.getElementById('//body/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]').value");
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
			@Test (enabled = true)
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
}
		