package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("johny" );
		driver.findElement(By.name("lastName")).sendKeys("bonny" );
		driver.findElement(By.name("phone")).sendKeys("123-34-4545" );
		driver.findElement(By.name("userName")).sendKeys("jbonny@gmail.com" );
		driver.findElement(By.name("address1")).sendKeys("501 bonny street " );
		driver.findElement(By.name("address2")).sendKeys("building 2" );
		driver.findElement(By.name("city")).sendKeys("Dallas" );
		driver.findElement(By.name("state")).sendKeys("TX" );
		driver.findElement(By.name("postalCode")).sendKeys("727282" );
		driver.findElement(By.name("email")).sendKeys("jbonny@gmail.com" );
		driver.findElement(By.name("password")).sendKeys("727282" );
		driver.findElement(By.name("confirmPassword")).sendKeys("727282" );
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
