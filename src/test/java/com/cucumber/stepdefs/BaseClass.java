package com.cucumber.stepdefs;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.cucumber.pages.AddCustomerPage;
import com.cucumber.pages.LoginPage;

import net.bytebuddy.utility.RandomString;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lpg;	
	public AddCustomerPage addcuspge;
	
	public static String randomstring() {
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	public static void sleepUntil(int sec) throws InterruptedException {
		Thread.sleep(sec);
		
	}
	
	
	

}
