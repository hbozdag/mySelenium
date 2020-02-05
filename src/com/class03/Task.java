package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: HRMS Application Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username and password Click on login button Then verify Syntax Logo is
		 * displayed.
		 * 
		 *  
		 *  TC 2: HRMS Application Negative Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username Leave password field empty Verify error message with text
		 * “Password cannot be empty” is displayed.
		 */
		
		
		

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.findElement(By.name("txtUsername")).sendKeys("VincentEthan");
			Thread.sleep(1000);
			driver.findElement(By.name("txtPassword")).sendKeys("VincentEthan@&12");
			Thread.sleep(1000);
			driver.findElement(By.className("button")).click();
			
			
			
			
			
		

	}

}
