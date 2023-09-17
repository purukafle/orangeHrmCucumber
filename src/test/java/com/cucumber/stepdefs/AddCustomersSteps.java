package com.cucumber.stepdefs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomersSteps {
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
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    
	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() {
	    
	}

	@When("user click on customers menu Item")
	public void user_click_on_customers_menu_item() {
	    
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	    
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	    
	}

	@When("Click on Save button")
	public void click_on_save_button() {
	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    
	}


}
