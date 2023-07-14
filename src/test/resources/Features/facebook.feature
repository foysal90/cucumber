Feature: facebook login functionality

  Scenario Outline: check fb login with invalid credentials
    Given browser is getting open
    And user in on login page
    When user enters <username> and <password>
    #Then user is click on login button
    Then user gets error msg with invalid credentials
    Then browser close

    Examples: 
      | username | password |
      | foysal   | foy123   |
      | fahmed   | ahm123   |
      | foy      | foy1233  |
