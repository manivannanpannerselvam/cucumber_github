@Support_page
Feature: Veify the Registrtaion page

  @tags_Support
  Scenario Outline: Verify the signup page and login files
    Given open the browser and enter the url page
    When click the signup page in newtour application
    Then page is redirect to the registration page successfuly
    Then Enter the Firstname in firstname field "<firstName>"
    Then Enter the lastname in lastname field "<lastname>"
    Then click the support button in newtour application
    Then click the Back to Home button

    Examples: 
      | firstName | lastname |
      | test      | tests    |
