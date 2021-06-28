Feature: DeleteLead in LeafTaps application

Background:
	
	Given The User enter the username as 'DemoSalesmanager'
	And Enter the password as 'crmsfa'
	When Click the login button
	Then User should see the welcom page
	When The user  click CRM/SFA link
	Then The user should see the Myhome page
	When Click the leads link in the that page
	Then The leads page should be displayed

	Scenario Outline:: TC_0004 deleteLead with given data
	
	When The user clicks the find lead link
	Then Find leads page should be displayed
	When The user clicks the phone link
	Given The user enter the phone number as "<phone_no>" in that page
	When The user clicks find leads button
	Then The result should be shown 
	And The user should store the Id of the first result
	When The user clicks the first result 
	Then The view lead page should be loaded 
	When The user clicks the delete link
	Then The user should see the My Leads page
	When The user clicks find leads button again
	Given The user enter the stored lead ID in the lead ID text box
	Then Clicks the find leads button
	And The user store the dispalyed reslut 
	Given The displayed result is same as "<message>" 
	Then The ID is deleted successfully
	
	Examples:
|phone_no|message|
|	99		 |No records to display|
