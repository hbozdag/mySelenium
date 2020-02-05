package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * TC 3: Verify element is enabled
		 * 
		 * Open chrome browser Go to “https://the-internet.herokuapp.com/” “Click on the
		 * “Dynamic Controls” link Click on enable button Enter “Hello” and verify text
		 * is entered successfully Close the browser
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='text']")));

		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		String aa = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println(aa);

		if (aa.equals("Hello")) {
			System.out.println("Pass");
		} else if (aa.equals("It's enabled!")) {
			System.err.println("Wrong text");
		} else {
			System.err.println("Fail");
		}

		driver.close();
	}}
