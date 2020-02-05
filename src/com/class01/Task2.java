package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String a= driver.getCurrentUrl();
		if (a.contains("syntax")) {
			System.out.println("Url is verified");
		}else {
			System.err.println("Url is not verified");
		}
		
		driver.close();
	}

}
