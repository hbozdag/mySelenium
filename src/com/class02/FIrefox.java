package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIrefox {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://hsacarrollton.harmonytx.org/");

		Thread.sleep(1000);
		driver.navigate().to("https://skyward.iscorp.com/HarmonyTXStuSTS");

		Thread.sleep(2000);
		driver.findElement(By.id("UserName")).sendKeys("Harun.Bozdag");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("Password")).sendKeys("harmonyy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[starts-with(@type,'submit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signOutButton")).click();
		driver.close();

	}

}
