Feature: CreateLead in LeafTaps application
Background:

	Given The User enter the username as 'DemoSalesmanager'
	And Enter the password as 'crmsfa'
	When Click the login button
	Then User should see the welcom page
	When The user  click CRM/SFA link
	Then The user should see the Myhome page
	When Click the leads link in the that page
	Then The leads page should be displayed
	
Scenario Outline: TC_0002 createLead with given datas
	
	When The user click the create lead link
	Given The user fill the comapany name as "<company_name>"
	And The user fill the first name as "<first_name>"
	And The user fill th last name as '<last_name>'
	And The user fill the phonenumber as '<phone_number>'
	When Click the create lead button
	Then New lead should be formed

Examples:
|company_name|first_name|last_name	|phone_number|
|Test Leaf	|Albert		|Xavier		|99			|
