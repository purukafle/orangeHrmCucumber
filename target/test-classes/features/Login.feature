Feature: Login
Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.noncommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "Admin"
	And Click on Login
	Then Page Title should be "Dashboard / nonCommerce administration"
	When User click in Log out Link
	Then Page Title should be "Your store. Login"
	And Close browser