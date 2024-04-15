package com.vmmapsforgetpassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aavin\\eclipse-workspace\\VmMapsLogin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("login-email"));
     	email.sendKeys("madhankaushik@gmail.com");    
     	
     	WebElement frgtPass = driver.findElement(By.xpath("//span[@id='Forgot-Password']"));
     	frgtPass.click();
     	Thread.sleep(10000);
     	
     	WebElement resendOtp = driver.findElement(By.xpath("//*[@id=\"ResetresendOTP\"]"));
     	resendOtp.click();
     	
     	WebElement passTextBox = driver.findElement(By.xpath("//*[@id=\"Resetpassword\"]"));
     	passTextBox.sendKeys("Madhan123@");
     	
     	WebElement changePass = driver.findElement(By.xpath("//span[@id='reset-login-otp-text']"));
     	changePass.click();
     	
     	
     	
     	
     	
     	
	}

}
