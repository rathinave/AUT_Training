@f1
Feature: Login feature
@set1
Scenario Outline: Verify login is successful with valid login credentials
      Given Login page is displayed
			When Enter the username "<User-name>"
			When Enter the password "<Pwd>"
			When Click the login button
			Then The Product page is displayed "<Message>"
			Then The Page was closed

Examples:
        | User-name               | Pwd           | Message  |
        | standard_user           | secret_sauce  | Products |
        | problem_user            | ecret_sauce   | Products |
        | performance_glitch_user | secret_sauce  | Products |
        | error_user              | secret_sauce  | Products |
        | visual_user             | secret_sauce  | Products |