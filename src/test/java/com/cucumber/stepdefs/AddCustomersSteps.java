package com.cucumber.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.cucumber.pages.AddCustomerPage;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.SearchCustomerPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomersSteps extends BaseClass {
	public WebDriver driver;
	public LoginPage lpg;
	public AddCustomerPage addcuspge;
	public SearchCustomerPage search;
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

	@When("Enter customer Email")
	public void enter_customer_email() {
		search=new SearchCustomerPage(driver);
		search.searchCustomerByEmail("");
	    
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    search.clickSearch();
	    //thread.sleep
	}

	@Then("User should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	    boolean status=search.searchCustomerByEmail(" hhh@gmail.com");
	    Assert.assertEquals(true, status);
	}
	
	//Steps SearchCustomer by Name
	@When("Enter customer FirstName")
	public void enter_customer_first_name() {
	    search.setFirstName("");
	}

	@When("Enter Cuatomer Lastname")
	public void enter_cuatomer_lastname() {
	    search.setLastName("");
	}

	@Then("User should found Name in the search table")
	public void user_should_found_name_in_the_search_table() {
	  boolean status= search.searchCustomerByName("Name");
	  Assert.assertEquals(true, status);
	}
	


}
