Feature: verify the login page with valid credentials
  Description: This feature will test the login username and password

  Scenario: Succefull login with valid credital on interdesign project
    Given User enter the sale center page
    When user naviage the sale center report page
    And verify the sale center reprot page
    And Successfully login the page
    Then Successuly Alert message displayed in sale center page
