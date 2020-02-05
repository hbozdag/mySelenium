package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {

		
		//                     key                          value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		//-->hypertext transfer protocol
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("VincentEthan");
		driver.findElement(By.id("txtPassword")).sendKeys("VincentEthan@&12");
		driver.findElement(By.id("btnLogin")).click();
	}

}
