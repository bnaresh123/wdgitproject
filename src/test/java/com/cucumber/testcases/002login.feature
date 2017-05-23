Feature: Validate home page objects
in order to check the objects

Scenario Outline: verify home page
Given user enter email "<email>"
When user enter password "<password>"
Then user click on login buttton


Examples:
|email			 |password	|
|test@testing.com|testing123|

