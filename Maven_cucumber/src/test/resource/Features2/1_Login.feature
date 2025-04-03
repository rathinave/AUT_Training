	@f1
	Feature: Login Feature
	@set1
	Scenario Outline: Verify the login successful for valid cerdential
	Given Login Page Displayed
	When User click the login button
	When User enter the email_id "<email_id>"
	When User enter the password "<password>"
	When User click login 
	Then Check the account "<message>"


	Examples:
	        | email_id               |password       |message                  |  
	        |rathinavelrv28@gmail.com|Rathinavel@2003|rathinavelrv28@gmail.com |
