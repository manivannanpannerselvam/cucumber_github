@aktreasignup
Feature: verify the aktrea signup page

  @tag1
  Scenario: verify the aktrea signup page with valid credentials
    Given open the valid url in Aktrea application
    Then Enter the valid username in username field "aktrea"
    Then Enter the valid password in password field in "aktrea@123"
    And verify the application not  succesffully.

  @tag2
  Scenario: verify the aktrea signup page with invalid credentials
    Given open the valid url in Aktrea application
    Then Enter the valid username in username field "aktreadsds"
    Then Enter the valid password in password field in "aktrea@123sds"
    And verify the application not  succesffully.

  @tag3
  Scenario: verify the aktrea invalid signup page with invalid credentials
    Given open the valid url in Aktrea application
    Then Enter the valid username in username field "aktreadsdsSas"
    Then Enter the valid password in password field in "aktrea@123sdsASA"
    And verify the application not  succesffully.

  @tag4
  Scenario: verify the aktrea valid signup page with valid credentials
    Given open the valid url in Aktrea application
    Then Enter the valid username in username field "aktr"
    Then Enter the valid password in password field in "aktrea@123sdsASA"
    And verify the application succesffully.
