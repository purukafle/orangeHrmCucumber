package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.stepdefs.BaseClass;

public class AddCustomerPage extends BaseClass {
	public WebDriver driver;
	public AddCustomerPage(WebDriver _driver) {
		this.driver=_driver;
	}
	
	By lnkCustomer_menu=By.xpath("//a[@href='#')//span[contains(text(),'Customers')]");
	By lnkCustome_menuitem=By.xpath("//span[@class='menu_item-title'][contains(text(),'Customers')]");
	By btnAddNew=By.xpath("//span[@class='btn bg-blue]");
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	By txtCustomerRoles=By.xpath("");
	By lstitemadminstrator=By.xpath("");
	By lstitemRegistration=By.xpath("");
	By lstitemGuests=By.xpath("");
	By lstitemVendors=By.xpath("");
	By drpmgrOfVendor=By.xpath("");
	By txtFirstName=By.xpath("");
	By txtLastName=By.xpath("");
	By txtAdminContent=By.xpath("");
	By btnSave=By.xpath("");
	public void clickOnCustomerMenu() {
		driver.findElement(lnkCustomer_menu).click();
	}
	public void clickOnCustomerMenuItem() {
		driver.findElement(lnkCustome_menuitem).click();
	}
	public void clickOnAddNew() {
		driver.findElement(btnAddNew).click();
	}
	public void setEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
		
	}
	public void setCustomerRole(String role) throws InterruptedException {
		if(!role.equals("Vendors")) {
			driver.findElement(txtCustomerRoles).click();
			//WebElement.listitem;
			Thread.sleep(3000);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
