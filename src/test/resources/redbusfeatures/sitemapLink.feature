Feature: Sitemap Link 

Background:
Given the user is on Help page
When the user clicks on sitemap link
Then the user should navigate to sitemap page

Scenario: Validate that user is able click and Navigate to sitemap and SRS Travels

And the user clicks on SRS Travles link
Then the user should navigate to SRS Travels page
And the user should scroll down to the SRS Travels location
And the user clicks on dropdown of locations
And the user clicks on Ahmedabad location
And the user clicks on Chennai location

Scenario: Validate that user is able to click and navigate to Mumbai to Goa Bus routes

Then the user clicks on Mumbai to Goa Bus 
And the user should navigate to Mumbai to Goa Bus page
