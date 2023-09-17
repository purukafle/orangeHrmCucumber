package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver _driver) {
		this.driver=_driver;
		
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement	txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(id="Logout")
	@CacheLookup
	WebElement btnLogout;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public void clickLogout() {
		btnLogout.click();
	}
	
	
	

	
	
	

}
