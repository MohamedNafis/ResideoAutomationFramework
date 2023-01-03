package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonAction {

	public static void clickElement(WebElement element) {

		try {
			element.click();
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}

	}

	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}

	public static void clearText(WebElement element) {
		try {
			element.clear();
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();

		}

	}
}
