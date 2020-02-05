package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class WaitTask extends CommonMethods {
	
	//command+o ==> you can see all the methods in your class

	public static void main(String[] args) {
		/*
		 * TC 1: Verify element is present
		 * 
		 * Open chrome browser Go to “https://the-internet.herokuapp.com/” Click on
		 * “Click on the “Dynamic Loading” link Click on “Example 1...” and click on
		 * “Start” Verify element with text “Hello World!” is displayed Close the
		 * browser
		 */
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
			
			driver.findElement(By.partialLinkText("Example 1")).click();

			driver.findElement(By.tagName("button")).click();
			
		
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
			
			boolean displayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
			if(displayed) {
				System.out.println("Pass");
			}else {
				System.out.println("fail");
			}
			
			driver.quit();
	}

}
