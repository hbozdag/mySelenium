package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * TC 2: Verify element is clickable
		 * 
		 * Open chrome browser Go to “https://the-internet.herokuapp.com/”
		 * 
		 * “Click on the “Dynamic Controls” link Select checkbox and click Remove Click
		 * on Add button and verify “It’s back!” text is displayed Close the browser
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		String text = driver.findElement(By.id("message")).getText();
		System.out.println(text);

		if (text.equals("It's back!")) {
			System.out.println("Verified");
		} else {
			System.out.println("not verified");
		}
		
		driver.quit();

	}

}
