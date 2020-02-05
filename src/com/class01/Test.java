package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		Thread.sleep(1000);
		
		
		//it will navigate to given url
		driver.navigate().to("http:www.facebook.com");
		
		//it will navigate back
		driver.navigate().back();
		//it will navigate one step forward
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("http:www.syntaxtechs.com");
		Thread.sleep(1000);
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		final String expectedTitle="Google";
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("I am on the right page");
		}else {
			System.out.println("Expected title does not match with the actual title!!!");
		}
		
		System.out.println("&&&&&&&&&&&");
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="http://google.com";
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Both Urls mathced");
		}else {
			System.err.println("Actual and expected not matched");
		}
		driver.close();

		
		
		
		//the difference beteweeen .get and .navigate
		
		//navigate will allow you to go back and forward. 
		//navigate creates history
		
		
		
		

		
	}

}

