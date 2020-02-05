package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard");
		Thread.sleep(1000);

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("VincentEthan");

		Thread.sleep(1000);

		driver.findElement(By.name("txtPassword")).sendKeys("VincentEthan@&12");

		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

		driver.close();
	}

}
