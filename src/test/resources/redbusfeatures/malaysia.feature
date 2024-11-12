Feature: Malaysia Link Navigation

Background:
Given the user is on Help page
When the user clicks on Malaysia 
Then the user navigates to Malaysia Page

Scenario Outline:  Validate that user is able to click and navigate to Malaysia
Given the user is able to enter <From> location
And the user is able to enter <To> destination
And the user is able to select Date from calendar

Examples:
|From||To|
|1   ||1 |

