Feature: Audition form
Scenario: Fill all the details in audition form
Given User is at audition form
When User fill all the information from excel sheet
And User click on Submitt button
Then Verify page title "Please Complete"

Given User is at audition form
When User fill all the information from excel sheet set1
And User click on Submitt button
Then Verify page title "Please Complete"