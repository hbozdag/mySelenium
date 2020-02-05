package com.zreview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.costco.com/");

		driver.manage().window().fullscreen();
		Thread.sleep(2000);

		String url = driver.getTitle();
		
		
		if (url.equals("Welcome to Costco Wholesale")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("title is not verified");
		}

		driver.navigate().refresh();

		driver.findElement(By.id("Home_Ancillary_0")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='h5-style-guide eco-ftr-6across-title']")).click();
//		String current = driver.getCurrentUrl();
//		if (current.contains("grocery") || current.contains("food")) {
//			System.out.println("You are on the right page");
//		} else {
//			System.err.println("Wrong page is loaded");
//		}
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//div[@class='h5-style-guide eco-ftr-6across-title']")).click();
//		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Personal")).click();
		
		//driver.quit();

	}

}
