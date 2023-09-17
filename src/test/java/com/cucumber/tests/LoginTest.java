
package com.cucumber.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.pages.LoginAction;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {

	// @Managed(driver = "chrome", options = "headless")

	@Managed(driver = "chrome")
	WebDriver driver;

	LoginAction loginAction;

	@Test
	public void i_am_login_using_admin_credentials() throws Exception {
		loginAction.goto_website(null);
		loginAction.login("Admin", "admin123");
	}

}
