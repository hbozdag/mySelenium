package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskXpath {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Using Xpath ONLY 
		 * 
		 * TC 1: Facebook login: Open chrome browser Go to
		 * “https://www.facebook.com/” Enter invalid username and invalid password and click
		 * login User successfully logged in 
		 * 
		 * TC 2: Mercury Tours Registration: Open
		 * chrome browser Go to “http://newtours.demoaut.com/” Click on Register Link
		 * Fill out all required info Click Submit User successfully registered
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hbozdag");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123434345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
		//driver.close();

	}

}
