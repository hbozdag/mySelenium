package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WashingtonPost {
	
	public static final String URL="https://www.washingtonpost.com/?reload=true";

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'politics')]")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();

	}

}
