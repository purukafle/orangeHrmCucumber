@AddUser
Feature: Add an user
	As admin user, I want to add another user in the system

#	Background: Login to Orange HRM using Admin credentials
    #Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/" 
    #And I login using "Admin" and "admin123"
    #And I should see OrangeHRM dashboard home page
    
	Scenario Outline: 
	Given I click Admin tab on the left side
	And I click on Add button
	And I select "<UserRole>" and enter "<EmployeeName>"
	And I select "<Status>"
	And I enter "<UserName>" for user name field
	And I enter "<UserPassword>" for two times to password field
	When I click Save button
	Then I verify user is created under records found section
	And I log out from OrangeHRM application
	
	Examples: 	
	|UserRole|EmployeeName|Status|UserName|UserPassword|
	| Admin  | Joe  Root	  |Enabled | joe_root 			 |123456      |
	| ESS		 | Jadine Jackie|Disabled| jadine_jackie   |654321      |