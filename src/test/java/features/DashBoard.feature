Feature: Lets do some automation on DashBoard PAge

Scenario: Lets adda new Examinee every type

Given The User is on the DashBoard page
When We should be navigating to AddExaminee page
And We will try to give all the necessary details and click on SAVE button
Then we should be able to see the SAVED SUCCESSFUL pop up
And page will navigate itself to the Child info page





 