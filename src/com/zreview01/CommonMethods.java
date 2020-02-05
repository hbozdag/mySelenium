package com.zreview01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver driver;

	public static void setUp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().fullscreen();

		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().fullscreen();
		}else {
			System.err.println("Browser is not supported.");
		}

	}

}
