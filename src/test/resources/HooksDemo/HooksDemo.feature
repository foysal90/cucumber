Feature: Check HooksTest
  
  
  
  @smoke
  Scenario: 
    Given user is on login page
    When user enters invalid credrntials
    Then browser close Hooks

  Scenario: 
    Given user is on login page
    When user enters invalid credrntials
    Then browser close Hooks
    #Examples: 
      #| username1    | password1   |
      #| foysal2121   | foy12322    |
      #| foysal122222 | foy12342225 |
