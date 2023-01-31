package testPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://enthrallit.com/selenium/");
		Thread.sleep(3000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
		System.out.println("Test execution completed");
		driver = new ChromeDriver();
		driver.quit();
	}
}
