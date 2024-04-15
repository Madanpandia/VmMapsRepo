package com.vmmapsregister;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class VmMapsRegister extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
/**@author madhan
* @param CHROME DRIVER
*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aavin\\eclipse-workspace\\VmMapsLogin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
/**
* @param Register Button- User should able click the register button
*/		
		WebElement regBtn = driver.findElement(By.xpath("//span[@id='registerHere']"));
		btnClick(regBtn);
		
/**
* @param Full name - to able to write his/her full name text box
*/
		WebElement nameTextBox = driver.findElement(By.xpath("//input[@id='signup-username']"));
		fillTextBox(nameTextBox, "Madhan K");
/**
* @param Full name - to able to write his/her full name text box
*/	
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='signup-email']"));
		fillTextBox(emailTextBox, "madhankaushik@gmail.com");
		
/**
* @param Full name - to able to write his/her full name text box
*/			
		WebElement numTextBox = driver.findElement(By.xpath("//input[@id='signup-mobile']"));
		fillTextBox(numTextBox, "8248145817");
/**
* @param Full name - to able to write his/her full name text box
*/			
		WebElement passTextBox = driver.findElement(By.xpath("//input[@id='signup-password']"));
		fillTextBox(passTextBox, "Madhan@123");
/**
* @param Full name - to able to write his/her full name text box
*/			
		WebElement cfmPassTextBox = driver.findElement(By.xpath("//input[@id='signup-confirmPassword']"));
		fillTextBox(cfmPassTextBox, "Madhan@123");
/**
* @param Full name - to able to write his/her full name text box
*/			
		
		WebElement termCheckBox = driver.findElement(By.xpath("//input[@id='terms-vms-policy']"));
		termCheckBox.click();
/**
* @param Full name - to able to write his/her full name text box
*/		
		WebElement newsltrCheckBox = driver.findElement(By.xpath("//input[@id='newsLetter']"));
		newsltrCheckBox.click();
		
		String mainWindowId = driver.getWindowHandle();
		
		WebElement priPoly = driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div/div[11]/span/a[1]"));
		priPoly.click();
		Thread.sleep(3000);
		Set<String> windowIds = driver.getWindowHandles();
		
		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().equals("https://vmmaps.com/legal/privacypolicy.html")) {
				driver.close();}}
		driver.quit();
		
		WebElement regBtn1 = driver.findElement(By.xpath("//*[@id=\"signup-submit\"]/button"));
		regBtn1.click();
		
	}

}
