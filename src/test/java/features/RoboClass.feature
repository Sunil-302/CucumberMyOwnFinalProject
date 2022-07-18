#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@mCom
Feature: I want to check the Upload file Functionality

 Scenario: validating the upload file by RoboClass MEthod
    Given i will be at the monstor.com page   
    When i will click on Upload Resume button
    And i will click on the SelectFileToUpload button
    Then i will handle to rest with RoboClass

  Scenario: validating the upload file by SendKeys method
    Given i will be at the monstor.com page   
    When i will click on Upload Resume button
    And i using SendKeys method i will upload the file
    

    

   
    
  
  

  