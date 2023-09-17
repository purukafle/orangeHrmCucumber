Feature: Customer

Scenario: Add new Customer
	Given User Launch Chrome browser
	When User opens URL "http://admin-demo.noncommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "Admin"
	And Click on Login
	Then User can view Dashboard
	When user click on customers menu
	And user click on customers menu Item
	And click on Add new button
	Then User can view Add new customer page
	When User enter customer info
	And Click on Save button
	Then User can view confirmation message "The new customer has been added successfully."
	And Close browser