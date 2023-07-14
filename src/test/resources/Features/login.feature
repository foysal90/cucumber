
Feature: feature to test login functionality

Scenario: Check login is successful with valid credentials
    Given user is login page
    When user enters username and password
    And click on login button
    Then user is navigated to the dashboard or Home page

    

#using parameterized method

  #Scenario Outline: Check login is successful with valid credentials
    #Given user is login page
    #When user enters <username> and <password>
    #And click on login button
    #Then user is navigated to the dashboard or Home page
#
    #Examples: 
      #| username | password |
      #| foysal   | abc123   |
      #| ahmed    |   123456 |
