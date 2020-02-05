package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8080/secure/BrowseProjects.jspa?selectedCategory=all");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-form-username")).sendKeys("hbozdag");
		driver.findElement(By.name("os_password")).sendKeys("Sachse2019");
		Thread.sleep(2000);
		driver.findElement(By.id("login-form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("aui-layout aui-theme-default  browse-projects")).click();
		//driver.close();
	}

}
