#@mustRun
Feature: login with cucumber tags

  Background: Browser set up for all test cases
    Given browser setUp

  @smoke
  Scenario: 
    When put islahi login credentials and click on login button
    Then user must be navigated to Home page

  @regression
  Scenario: 
    When user click on logout button
    Then user must be navigated to sign in page

  #@smoke @regression
  #Scenario: 
    #When user click on logout button
    #Then user must be navigated to sign in page
    
    
  #@important @regression
  #Scenario: 
    #When user click on logout button
    #Then user must be navigated to sign in page
