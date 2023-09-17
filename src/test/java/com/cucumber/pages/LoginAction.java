package com.cucumber.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginAction extends PageObject {

	WebElement userNameElem;
	WebElement userPasswordElem;
	WebElement loginButtonElem;
	WebElement dashboardElem;
	

	public LoginAction () {
		
	}
	
	@Step("I go to OrangeHRM website {string}")
	public void goto_website(String string) {
		openUrl("https://opensource-demo.orangehrmlive.com/");
		String pageTitle = getDriver().getTitle();
		System.out.println("Frank_Page_Title: " + pageTitle);
	}

	@Step("I login using {string} and {string}")
	public void login(String userName, String userPass) throws Exception {

		userNameElem = getDriver().findElement(By.name("username"));
		userNameElem.clear();
		userNameElem.sendKeys(userName);

		userPasswordElem = getDriver().findElement(By.name("password"));
		userPasswordElem.clear();
		userPasswordElem.sendKeys(userPass);

		loginButtonElem = getDriver().findElement(By.cssSelector("div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		loginButtonElem.click();
		//Thread.sleep(30 * 1000);
	}

	@Step("I should see OrangeHRM dashboard home page")
	public void verify_dashboad_homePage() {
		dashboardElem = getDriver().findElement(By.cssSelector("header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6"));
		String dashboardTxt = dashboardElem.getText();
		System.out.println("Dashboard landing page displayed sucessfully.");
		assertEquals("Dashboard", dashboardTxt);
		
	}

}
