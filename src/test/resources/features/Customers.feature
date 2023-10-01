Feature: Customer 
Background: Common steps 
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.noncommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "Admin" 
	And Click on Login 
	Then User can view Dashboard 
	
	
Scenario: Add new Customer 

	When user click on customers menu 
	And user click on customers menu Item 
	And click on Add new button 
	Then User can view Add new customer page 
	When User enter customer info 
	And Click on Save button 
	Then User can view confirmation message "The new customer has been added successfully." 
	And Close browser 
	
Scenario: Search Customer By EmailId 

	When user click on customers menu 
	And user click on customers menu Item 
	And Enter customer Email 
	When Click on search button 
	Then User should found email in the search table 
	And Close browser 
Scenario: Search customer by firsname and latname 

	When user click on customers menu 
	And user click on customers menu Item 
	And Enter customer FirstName 
	And Enter Cuatomer Lastname 
	When Click on search button 
	Then User should found Name in the search table 
	And Close browser 
  