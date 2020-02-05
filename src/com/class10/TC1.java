package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TC1 extends CommonMethods {

	public static void main(String[] args) {
		/* 
		 * TC 1: HRMS Login

Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”

TC 2: HRMS Login

Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
		 */

		setUp("chrome", Constants.HRMS_URL);
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
			
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	
		//driver.quit();
		
		
		
	}

}
