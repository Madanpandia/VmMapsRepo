package com.vmmaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoVmMaps extends VmMapsLogin {
  
	public LoginPojoVmMaps() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@name='pswd']")
	private WebElement txtPass;

	public WebElement getTxtUser() {
		return txtUser;
	}
	
	public WebElement getTxtPass() {
		return txtPass;
	}


	
	
}
