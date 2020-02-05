package com.zreview02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
		
		
		Alert handleAlert=driver.switchTo().alert();
		
		String aa=handleAlert.getText();
		
		System.out.println(aa);
		Thread.sleep(2000);
		handleAlert.accept();
		
		driver.findElement(By.xpath("//li[@class='tree-branch'][5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bootstrap Alerts")).click();
		Thread.sleep(2000);
		
		WebElement cc=driver.findElement(By.id("normal-btn-success"));
		System.out.println(cc.getText());
		cc.click();
		Thread.sleep(2000);
		
		WebElement ff=driver.findElement(By.xpath("//div[@style='display: block;']"));
		System.out.println(ff.getText());
		
		
//		WebElement dd=driver.findElement(By.xpath("//button[@class='close'][1]"));
//		System.out.println(dd.getText());
//		dd.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
