Feature: login functionality of LeafTaps application

Scenario: TC_0001 login with positive data

	
	Given The User enter the username as 'DemoSalesmanager'
	And Enter the password as 'crmsfa'
	When Click the login button
	Then User should see the welcom page
	When The user  click CRM/SFA link
	Then The user should see the Myhome page
	
	
	

