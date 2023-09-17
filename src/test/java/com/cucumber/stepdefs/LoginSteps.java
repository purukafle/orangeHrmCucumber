package com.cucumber.stepdefs;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.pages.LoginPage;

import io.cucumber.java.en.*;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public WebDriver driver;
	public LoginPage lpg;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lpg=new LoginPage(driver);
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		
	   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lpg.setUserName(email);
		lpg.setPassword(password);
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		lpg.clickLogin();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);		
		
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click in Log out Link")
	public void user_click_in_log_out_link() throws InterruptedException {
		lpg.clickLogout();
		Thread.sleep(3000);
	    
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
		
	    
	}

}
