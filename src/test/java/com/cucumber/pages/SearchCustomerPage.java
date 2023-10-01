package com.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.WaitHelper;

public class SearchCustomerPage {
	public WebDriver driver;
	WaitHelper waithelper;

	public SearchCustomerPage(WebDriver _driver) {
		this.driver = _driver;
		waithelper = new WaitHelper(driver);

	}

	@FindBy(how = How.ID, using = "SearchEmail")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "SearchFirstname")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "SearchLastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	@CacheLookup
	WebElement drpdobMonth;

	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	@CacheLookup
	WebElement drpdobDay;

	@FindBy(how = How.ID, using = "SearchCompany")
	@CacheLookup
	WebElement txtCompany;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement txtcustomerRoles;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement listitemAdministrators;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement listitemRegister;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement listitemGuests;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement listitemVendors;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement tblSearchResults;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement table;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	List<WebElement> tblRows;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	List<WebElement> tblColumns;

	public void setEmail(String email) {
		waithelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setFirstName(String firstName) {
		waithelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		waithelper.WaitForElement(txtFirstName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lastName);
	}
	public int getNoOfRows() {
		return(tblRows.size());
	}
	public int getNoOfColumns() {
		return(tblColumns.size());
	}
	public boolean searchCustomerByEmail(String email) {
		boolean flag=false;
		for(int i=1; i<getNoOfRows();i++) {
			String emailid=table.findElement(By.xpath("")).getText();
			System.out.println(emailid);
			if(emailid.equals(email)) {
				flag=true;
			}
			
		}
		
		return flag;
	}
	public void clickSearch() {
		btnSearch.click();
		
	}
	public boolean searchCustomerByName(String Name) {
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++) {
			String name=table.findElement(By.xpath("")).getText();
			String names[]=name.split(" ");
			
			if (names[0].equals("firstName")&& names[1].equals("lastName")) {
				flag=true;
				
			}
			
		}
		return flag;
		
		
	}
	
	}
	
	

