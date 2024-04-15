package com.vmmapsregister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void chromeDriver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aavin\\eclipse-workspace\\VmMapsLogin\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
	public static void launchUrl(String url) {
		driver.get(url);	
	}
	public static void maxWin() {
      driver.manage().window().maximize();		
	}
	
	
	public static void fillTextBox(WebElement element, String value) {
    element.sendKeys(value);
	}
	public static void btnClick(WebElement ref) {
    ref.click();
	}
	
	
	
}
