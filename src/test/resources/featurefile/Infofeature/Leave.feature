@InfoTech_Leave_Software
Feature: verify the InfoTech_cloud Leave_Software page

  @RegressionTest
  Scenario Outline: verify the InfoTech_cloud Leave software
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@info-tech.com.sg"
    Then Enter the valid passwordsdsd in password field "demo1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info_Leave icon
    And verify the leave software application is visible properly
    Then click the master icon
    Then click the Employee Basic Details
    Then click the New button
    Then Enter the Employee Code "<EmployeeCodes>"
    Then Enter the Employee Name "<EmployeeName>"
    Then Select the Gender field "<Gender>"
    Then Select the Marital status "<Maritalstatus>"
    Then Enter the Email Address "<EmailAddress>"
    Then Enter the Mobile Number "<MobileNumber>"
    Then Enter the Join Date "<JoinDate>"
    Then Enter the NRIC number "<NRICnumber>"
    Then click the App Access
    Then click the E Levae button button
    Then Select the final Approver "<Final>"
    Then click the Save button
    And Verify the Employee Details successfully registered
    Then Enter the Employee name in search text field "<EmployeeName>"
    Then click the Search button
    Then Delete the Employee Data in staff Details grid list
    Then Enter the password in Delete Confirmation pop up page "demo1"
    Then click the Delete  button in Delete confirmation pop up page.
    And verify the Delete button is working properly

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress                | MobileNumber | JoinDate   | NRICnumber | Final     |
      | Second001     | secondEmp    | MALE   | Single        | empnewfirsgt@mailinator.com |     98678419 | 12-12-2018 | S2390023H  | Demo User |
