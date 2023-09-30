package com.cucumber.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.cucumber.pages.AddCustomerPage;
import com.cucumber.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomersSteps extends BaseClass {
	public WebDriver driver;
	public LoginPage lpg;
	public AddCustomerPage addcuspge;
//31 minutes

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {

		addcuspge = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcuspge.getPageTitle());
		// thread.sleep()//need to be implemented in base class

	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() {
		addcuspge.clickOnCustomerMenu();

	}

	@When("user click on customers menu Item")
	public void user_click_on_customers_menu_item() {
		addcuspge.clickOnCustomerMenuItem();

	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		addcuspge.clickOnAddNew();
		// thread.sleep

	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals(" ", addcuspge.getPageTitle());

	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		String email = randomstring() + "@gmail.com";
		addcuspge.setEmail(email);
		addcuspge.setPassword("test123");
		addcuspge.setManagerOfVendor("Vendor 2");
		addcuspge.setGender("Male");
		addcuspge.setFirstName(" ");
		addcuspge.setLastName(" ");
		addcuspge.setDob(" ");
		addcuspge.setCompanyContent(" ");
		addcuspge.setAdminContent(" ");

	}

	@When("Click on Save button")
	public void click_on_save_button() throws InterruptedException {
		addcuspge.clickOnSave();
		sleepUntil(5);

	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String message) throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("the new customer has been added successfully"));
		sleepUntil(5);
	}
	
	//Steps for search customers by EmailId

	@When("click on customers Menu")
	public void click_on_customers_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter customer Email")
	public void enter_customer_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Close Browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
