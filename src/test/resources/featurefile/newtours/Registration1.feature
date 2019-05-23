@Registration_page
Feature: Veify the Registrtaion page

  @tags
  Scenario Outline: Verify the signup page and login files
    Given open the browser and enter the url page
    When click the signup page in newtour application
    Then page is redirect to the registration page successfuly
    Then Enter the Address in address field "<Address>" 
    Then Enter the city in city field "<city>"
    
    

    Examples: 
      | Address | city  |
      | test    | tests |
