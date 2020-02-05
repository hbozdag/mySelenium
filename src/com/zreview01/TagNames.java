package com.zreview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TagNames extends CommonMethods{

	public static void main(String[] args) {
		

		setUp("chrome", Constants.welcomeToTheInternetUrl);
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		int links= allLinks.size();

		System.out.println("The number of links on Welcome to the Internet page is "+links+".");
		
		for (WebElement link:allLinks) {
			System.out.println(link.getText()+" = "+link.getAttribute("href"));
		}
		
		driver.quit();

	}

}
