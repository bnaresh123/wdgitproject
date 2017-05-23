Feature: Validate home page objects
in order to check the objects

Scenario Outline: verify home page
Given user open "<browser>"
When user navigate "<url>"
Then user click on rediffmail


Examples:
|browser|url|
|chrome |http://rediff.com|

