package com.zreview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LocatorsRecap extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		

		setUp("chrome", Constants.SytaxUrl);
		
		driver.findElement(By.id("btn_basic_example")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Select Dropdown List")).click();
		
	WebElement select= driver.findElement(By.id("select-demo"));
		
		Select list=new Select(select);
		
		list.selectByIndex(3);
		Thread.sleep(2000);
		list.selectByValue("Monday");
		Thread.sleep(2000);
		list.selectByVisibleText("Tuesday");
		
		System.out.println(list.getOptions().size());
		
		List<WebElement> lists=driver.findElements(By.tagName("select"));
		
		Select newList=new Select((WebElement) lists);
		
		System.out.println(newList.getOptions());
		driver.quit();
		
	}

}
