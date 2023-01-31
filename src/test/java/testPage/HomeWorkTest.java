package testPage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomeWorkTest  extends BaseClass{
	
	@Test(enabled = false)
	public void alert_accept_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js.executeScript("window.scrollBy(0, 600)","");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space(text()) = 'Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		alert.accept();
		
	}
	
	@Test(enabled = false)
	public void alert_Dismiss_Test() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js.executeScript("window.scrollBy(0, 600)","");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space(text()) = 'Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		alert.dismiss();
		
	}
	@Test(enabled = false, groups = "functionalTest")
	public void use_Of_TestNg_Groups() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Enthrall IT']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");
		
	}
	
	@Test(enabled = false, groups = "functionalTest")
	public void b_Use_Of_TestNg_DependsOnMethod1() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Enthrall IT']"));
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flag);
		Assert.assertTrue(true, "Application Logo is not displayed .....");
		
	}
	@Test(enabled = false, dependsOnMethods = "b_Use_Of_TestNg_DependsOnMethod1")
	public void a_Use_Of_TestNg_DependsOnMethod2() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='exampleRadios1']//following-sibling::label[normalize-space(text())='Male']")).click();
		
	}
	@Test(enabled = false, expectedExceptions = NoSuchElementException.class)
	public void use_of_expectedExceptions() {
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='exampleRadios1']//following-sibling::label[normalize-space(text())='*??*']")).click();
	}
	@Test(enabled = false, priority = 1, threadPoolSize = 3, timeOut = 10000)
	public void titleTest1() {
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expected = "Enthrall IT";
		String actual = driver.getTitle();
		System.out.println("Home page Title is : " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
		System.out.println("Thread" + Thread.currentThread().getName());
	}
	
	@Test(enabled = false, priority = 1, invocationCount = 10, timeOut = 10000)
	public void titleTest2() {
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expected = "Enthrall IT";
		String actual = driver.getTitle();
		System.out.println("Home page Title is : " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ...");
		System.out.println("Thread" + Thread.currentThread().getName());
	}
	
	@Test(enabled = false)
	public void read_table () throws InterruptedException {
			
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js.executeScript("window.scrollBy(0, 1500)","");
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable no-footer']//parent::div[@class='dataTables_scrollHeadInner']"));
		System.out.println(table.getText());
	}
	@Test( enabled = true)
	public void windowHandle() throws InterruptedException {
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window ID: " + parentWindow + "\n");
		driver.findElement(By.xpath("//button[contains(text(),'Open Window')]//parent::a//parent::div//parent::div//preceding-sibling::h5[@class='e-head']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Open Window')]//parent::a//parent::div//parent::div//preceding-sibling::h5[@class='e-head']")).click();
		Thread.sleep(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Total Windows Opened: " + allWindowHandles.size());
	}
	
}
