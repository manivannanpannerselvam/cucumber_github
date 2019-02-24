@Registration_page
Feature: Veify the Registrtaion page

  @tags
  Scenario Outline: Verify the signup page and login files
    Given open the browser and enter the url page
    When click the signup page in newtour application
    Then page is redirect to the registration page successfuly
    Then Enter the Firstname in firstname field "<firstName>"
    Then Enter the lastname in lastname field "<lastname>"

    
  Examples: 
      | firstName | lastname |
      | test      | tests    |