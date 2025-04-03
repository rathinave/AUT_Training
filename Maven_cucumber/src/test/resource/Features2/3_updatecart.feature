@f3
Feature: Update the Cart page
@set3
Scenario: To Verify that update happens in cart page
When User select the product "<row>" 
And Update the quantity of the product "<row>" qty "<qty>"

And Click the Update shopping button
Then Verify the product quantuty updated or not "<message>"


Examples:
       | row | qty | message|   
       | 1   | 5   | 10     |
       | 2   | 5   | 15     |