package com.vmmaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class VmMapsLogin extends BaseClass {
	public static void main(String[] args)  {
		/**@author madhan
		 * CHROME DRIVER
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aavin\\eclipse-workspace\\VmMapsLogin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
		
		/**
		 * USER NAME
		 */
     	LoginPojoVmMaps l = new LoginPojoVmMaps();
     	WebElement email = driver.findElement(By.id("login-email"));
     	//WebElement email = l.getTxtPass();     
     	fillTextBox(email, "madhankaushik@gmail.com");
     	
     	/**
     	 * PASSWORD
     	 */
     	WebElement pass = driver.findElement(By.id("login-password"));
     	fillTextBox(pass, "Madhan@123");
     	
     	/**
     	 * LOGIN BUTTON
     	 */
     	WebElement btnLogin = driver.findElement(By.className("Submit"));
     	btnLogin.click();
     	
	}
	
}
