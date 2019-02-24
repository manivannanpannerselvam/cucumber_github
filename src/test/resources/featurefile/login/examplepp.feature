@tag
Feature: Enter the new login the application

  @tag1
  Scenario: Verify the login new functionality
    Given navigate to the new  logins  application
    When click the new sign in link in regstrtation page
    And Enter the valid Username in username field "manivannanp@gmail.com"
    And Enter the valid password in password field "password@123"
    Then login the successfully success message
