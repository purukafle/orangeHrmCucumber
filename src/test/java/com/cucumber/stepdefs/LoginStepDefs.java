package com.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.LoginAction;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefs {

	//@Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;

	@Steps
	LoginAction loginPage;

	@Given("I go to OrangeHRM website {string}")
	public void i_go_to_orange_hrm_website(String url) throws Exception {
		loginPage = new LoginAction();
		loginPage.goto_website(url);
	}

	@Given("I login using {string} and {string}")
	public void i_login_using_admin_user_and_admin_password(String adminUser, String adminPassword) throws Exception {
		loginPage.login(adminUser, adminPassword);
	}

	@Given("I should see OrangeHRM dashboard home page")
	public void i_should_see_orange_hrm_dashboard_home_page() throws Exception {
		loginPage.verify_dashboad_homePage();
	}

}
