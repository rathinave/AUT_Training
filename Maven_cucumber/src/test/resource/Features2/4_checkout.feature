@f4
Feature: CheckOut
@set4
Scenario Outline: To verify the order placed or not

Given The Shopping page is displayed
When User click the checkout button
And  User select the country "<country>"
And  User enter the city name "<city>"
And  User enter the address "<address>"
And  User enter zip code "<zip>"
And  User enter the phone number "<Phn_no>"
When User click the continue1 button
When User click the continue2 button
When User click the continue3 button
When User click the continue4 button
When User click the continue5 button
When User click the confrim button
Then The order id should be match 

Examples:
      | country | city       | address | zip    | Phn_no     |
      | India   | Tamil Nadu | South   | 621717 | 8940268794 |