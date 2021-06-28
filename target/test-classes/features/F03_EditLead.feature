Feature: EditLead in LeafTaps application

Background:
	
	Given The User enter the username as 'DemoSalesmanager'
	And Enter the password as 'crmsfa'
	When Click the login button
	Then User should see the welcom page
	When The user  click CRM/SFA link
	Then The user should see the Myhome page
	When Click the leads link in the that page
	Then The leads page should be displayed
	
Scenario Outline: TC_0003 editLead with given data
	
	When The user clicks the find lead link
	Then Find leads page should be displayed
	When The user clicks the phone link
	Given The user enter the phone number as "<phone_number>"
	When The user clicks find leads button
	Then The result should be shown 
	When The user clicks the first result of that list
	Then The view lead page should be loaded 
	When The user clicks the edit link 
	Given The user edit the company name as "<comp_name>"
	Then click the update button

Examples:
|phone_number|comp_name|
|	99		 |TCS	|
	