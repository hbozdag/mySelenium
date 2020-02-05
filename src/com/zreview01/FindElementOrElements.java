package com.zreview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementOrElements extends CommonMethods {

	public static void main(String[] args) {
		

		setUp("chrome", Constants.welcomeToTheInternetUrl);
		
		//find element gives exception code stops 
		//driver.findElement(By.linkText("Checkboxe")).click();
		
		
		//find elements does not give exception. code continues
		driver.findElements(By.linkText("Checkboxe"));
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		int numberOfAllLinks=allLinks.size();
		
		System.out.println(numberOfAllLinks);
		
		//next step is get the text and hyperlinks of all links on the web page
		//using getText() method and getAttribute () method
		
		for (WebElement link:allLinks) {
			System.out.println(link.getText()+" "+link.getAttribute("href"));
		}
		
		driver.quit();

	}

}
