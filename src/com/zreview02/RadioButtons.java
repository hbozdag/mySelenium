package com.zreview02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.zreview01.CommonMethods;
import com.zreview01.Constants;

public class RadioButtons extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		

		setUp("chrome", Constants.ToolsQA);
		Thread.sleep(3000);
		
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("profession-0")).click();
		
		WebElement aa= driver.findElement(By.id("tool-0"));
		aa.click();
		System.out.println(aa.isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("tool-2")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}
