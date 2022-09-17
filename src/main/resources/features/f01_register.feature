@smoke

Feature: F01 Register // users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter email "test1@gmail.com" field
    And user fills Password 1st field "P@ssw0rd" and 2nd field "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed
