@f1
Feature: Login feature

Background:
			Given Login page is displayed

Scenario: Verify login is successful with valid login credentials
			When Enter the username
			When Enter the password
			When Click the login button
			Then The Product page is displayed
			Then The Page was closed


Scenario Outline: Login with valid and invalid login crendital
			When User Enter the username "<username>"
			When User Enter the password "<password>"
			When User Click the login button
			Then The application should display the message "<message>"
			Then The Page was closed

Examples: 
      | username      | password       | message  |
      | standard_user | secret_sauce   | Products |
      | standard_user | standard_user1 | Epic sadface: Username and password do not match any user in this service |