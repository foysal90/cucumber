Feature: testing in background mode

  Background: url open in background
    Given user should be in login page

  Scenario: 
    When user put valid login data such as username and password
    Then user must be navigate to dashboard

  Scenario: 
    When user put valid login data such as username and password
    Then user must be navigate to dashboard
