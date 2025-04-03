@f2
Feature: Add to cart 
@set2
Scenario: To Verify the add to cart page
When User select the categories
When User click the product Name "<product_name>"
And  User Enter the Quantity "<qty>"
And  User click the add to cart button
When User click the shopping cart button
Then The product added to shopping cart page "<message>"
	
Examples:
        
        | product_name           | qty | message                     |
        | Computing and Internet | 15  | Computing and Internet      |
        | Health Book            | 20  | Health Book                 |