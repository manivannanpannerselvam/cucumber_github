@InfoTech_Hr
Feature: verify the InfoTech_cloud login page

  @RegressionTest
  Scenario: verify the InfoTech_cloud sigin page with valid_username and Invalid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@info-tech.com.sg"
    Then Enter the valid passwordsdsd in password field "aktrea@123"
    Then click the submit button
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @SmokeTest @RegressionTest
  Scenario: verify the InfoTech_cloud sigin page with Invalid_username and valid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
    Then Enter the valid passwordsdsd in password field "demo1"
    Then click the submit button
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @RegressionTest
  Scenario: verify the InfoTech_cloud sigin page with Invalid_username and Invalid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
    Then Enter the valid passwordsdsd in password field "demo123"
    Then click the submit button
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @RegressionTest
  Scenario: verify the InfoTech_cloud sigin page with valid_username and valid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@info-tech.com.sg"
    Then Enter the valid passwordsdsd in password field "demo1"
    Then click the submit button
    And verify the applicationsssaadsasds successfully.
    
     
    
    
    
