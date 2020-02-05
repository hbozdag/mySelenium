package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1:
		 *  Add Employee 
		 * Open chrome browser
		 *  Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”  
		 *Login into the application
		 * Add Employee
		 *  Log out 
		 *  Quit the browser
		 *  
		 *  username: Syntax password: Syntax123!
	username: UserOne  password: Syntax123!
		 */
		
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("UserOne");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Brian");
		driver.findElement(By.id("lastName")).sendKeys("Carlisle"); 
		driver.findElement(By.id("btnSave")).click();
		driver.quit();
	}

}
