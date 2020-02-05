package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		//the methods is opening syntax practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		//find input forms and click on it
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		//find the element select dropdown list and click
		driver.findElement(By.linkText("Select Dropdown List")).click();
		Thread.sleep(1000);
	
		
		
		//find the element with id select-demo and store it in a variable
		WebElement dd=driver.findElement(By.id("select-demo"));
		
		//to work wit dd, if the tagname starts with select, we  have to create object of select class
		Select select=new Select(dd);
		
		Thread.sleep(1000);
		
		//select 3 by index
		select.selectByIndex(3);
		
		Thread.sleep(1000);
		
		//selecting value by visible text
		select.selectByVisibleText("Friday");
		
		Thread.sleep(1000);
		
		//select an item by using value attribute
		select.selectByValue("Sunday");
		
		Thread.sleep(1000);
		
		//how to get the count of the drop down items
		
		List<WebElement> options=select.getOptions();
		
		// this will give you the nimber of items present in dd
		System.out.println(options.size());
		
		//storing each option in iterator so we can loop through
		//if you want to see and click all items on the drop down 
		Iterator<WebElement> it=options.iterator();
		while(it.hasNext()) {//loop through iterator if it has a next element
			it.next().click();
			Thread.sleep(1000);
		}
		
		System.out.println("Does this drop down support multi select?--> "+select.isMultiple());
		driver.quit();

	}

}
