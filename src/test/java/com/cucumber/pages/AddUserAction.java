package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AddUserAction extends PageObject{

	

	@Step("I select {string} and enter {string}")
	public void i_select_and_enter(String string, String string2) {
		
	}

	@Step("I select {string}")
	public void i_select(String string) {

	}

	@Step("I enter {string} for user name field")
	public void i_enter(String string) {

	}

	@Step("I enter {string} for two times to password field")
	public void i_enter_two_times(String string) {

	}

	@Step("I click Admin tab on the left side")
	public void i_click_admin_tab_on_the_left_side() {
		WebElement adminElem = getDriver().findElement(By.cssSelector("div.oxd-sidepanel-body > ul > li:nth-child(1) > a > span"));
		adminElem.click();
	}

	@Step("I click on Add button")
	public void i_click_on_add_button() {
		WebElement addBtnElem = getDriver().findElement(By.cssSelector("div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button"));
		addBtnElem.click();
	}

	@Step("I click Save button")
	public void i_click_save_button() {

	}

	@Step("I verify user is created under records found section")
	public void i_verify_user_is_created_under_records_found_section() {

	}
	
	@Step("I log out from OrangeHRM applicaion")
	public void i_log_out_from_orange_hrm_applicaion() {
	    WebElement userProfileDropDownElem = getDriver().findElement(By.cssSelector("div.oxd-topbar-header-userarea > ul > li > span > p"));
	    userProfileDropDownElem.click();
	    
	    WebElement logoutElem = getDriver().findElement(By.linkText("Logout"));
	    logoutElem.click();
	}
}
















