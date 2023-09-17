@regression
Feature: Login to OrangeHRM website
  I want to login to OrangeHRM website
 
  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
        
  @login
  Scenario Outline: Login with admin credentials 
    And I login using "<AdminUser>" and "<AdminPassword>"
    And I should see OrangeHRM dashboard home page
    
  Examples:
      | AdminUser | AdminPassword | 
      | Admin 	  |  admin123	    |