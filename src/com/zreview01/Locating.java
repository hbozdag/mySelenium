package com.zreview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locating extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.welcomeToTheInternetUrl);

		driver.findElement(By.partialLinkText("Check")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Dropdown")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Dynamic Load")).click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		Thread.sleep(2000);
		WebElement checkBox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		checkBox1.click();
		
		if (checkBox1.isSelected()) {
			System.out.println("Checkbox 1 was selected");
		}else {
			System.err.println("Checkbox 1 was not selected");
		}
		
		WebElement checkBox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		checkBox2.click();
		
		if (checkBox2.isSelected()) {
			System.out.println("Checkbox 2 was selected");
		}else {
			System.out.println("Checkbox 2 was already selected by default");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
