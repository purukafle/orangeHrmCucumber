package com.cucumber.stepdefs;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.cucumber.pages.AddUserAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class AddUserStepDefs {

	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;

	/*
	 * @BeforeClass public void beforeClassOneTimeSetup() {
	 * System.out.println("this is the before class method section..."); }
	 */
	
	@Steps
	AddUserAction addUserAction;
	
	@Given("I select {string} and enter {string}")
	public void i_select_and_enter(String string, String string2) {

	}

	@Given("I select {string}")
	public void i_select(String string) {

	}
	
	@Given("I enter {string} for user name field")
	public void i_enter(String string) {

	}

	@Given("I enter {string} for two times to password field")
	public void i_enter_two_times(String string) {

	}

	@Given("I click Admin tab on the left side")
	public void i_click_admin_tab_on_the_left_side() {
		addUserAction = new AddUserAction();
		addUserAction.i_click_admin_tab_on_the_left_side();
	}

	@Given("I click on Add button")
	public void i_click_on_add_button() {
		addUserAction.i_click_on_add_button();
	}

	@When("I click Save button")
	public void i_click_save_button() {

	}

	@Then("I verify user is created under records found section")
	public void i_verify_user_is_created_under_records_found_section() {

	}
	
	@Then("I log out from OrangeHRM application")
	public void i_log_out_from_orange_hrm_applicaion() {
	    addUserAction.i_log_out_from_orange_hrm_applicaion();
	}
}
