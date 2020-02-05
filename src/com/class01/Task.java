package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		 Thread.sleep(1000);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		
		
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is verified");
			//System.out.println("Amazon.com:Online Shoppingfor Electronics, Appael, Computers, Books, DVDs & more");
		}else {
			System.err.println("Title is not verified");
		}
		
		driver.close();
	}

}
