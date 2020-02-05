package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task extends CommonMethods {

	public static final String URL = "https://www.yahoo.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CommonMethods.setUp("chrome", URL);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"https://mail.yahoo.com/?.src=fp\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-username")).sendKeys("haenry");
		driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
		//driver.findElement(By.id("login-signin")).click();

		WebElement err = driver.findElement(By.id("username-error"));
		System.err.println(err.getText());
		
		// driver.close();
	}

}
