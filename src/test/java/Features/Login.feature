Feature: Application Login #Requirement

  Scenario: Home Page Default Login #Testcase
    Given User is on Login Page
    When User logs into application with username and password
    And User clicks login button
    Then Home Page is populated