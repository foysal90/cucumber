Feature: check google search functionality

  Scenario: validate google search
    Given browser is open
    And user is on google search page
    When user enters a text in google search box
    And hits enter
    Then user is navigated to search result page
