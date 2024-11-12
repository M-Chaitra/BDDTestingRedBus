Feature: FAQ Section on Red Bus

Scenario: Validate that user is able to click on all FAQs help topic

Given the user is on Help page
When the user clicks on Technical issues
Then the user should navigate to the Technical issues topics
When the user clicks on redBus Referral Help
Then the user should navigate to the redBus Referral Help 
When the user clicks on New bus booking help 
Then the user should navigate to the New bus booking help

 