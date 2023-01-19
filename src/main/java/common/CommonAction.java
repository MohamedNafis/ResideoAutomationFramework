package common;


import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reporting.Logs;

public class CommonAction {

	public static void clickElement(WebElement element) {

		try {
			element.click();
			Logs.log(element + " <-----> has been clicked"); // Here WebElement type converted to String type, String+String
			Assert.assertTrue(true); 
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found");
			Assert.fail();
		}


	}

	public static void inputText(WebElement element, String input ) {
		try {
			element.sendKeys(input);
			Logs.log(input + " <-----> has been put into <-----> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found, so couldn't put the input");
			Assert.fail();
		}
	}
	

	public static void clearText(WebElement element) {
		try {
			element.clear();
			Logs.log(element + " <-----> has been cleared ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found");
			Assert.fail();

		}

	}
	
	public static void enter_or_return(WebElement element) {
		
		try {
			element.sendKeys(Keys.ENTER);
			Logs.log(Keys.ENTER + " <-----> has been Entered " + element);
			try {
				element.sendKeys(Keys.RETURN);
			}catch (NoSuchElementException | NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + " <-----> has not been found");
			Assert.fail();
		}
	}	
}