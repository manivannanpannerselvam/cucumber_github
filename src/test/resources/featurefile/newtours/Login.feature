@InfoTech_Hr
Feature: verify the InfoTech_cloud login page

  @tag1
  Scenario: verify the InfoTech_cloud sigin page with valid_username and Invalid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@info-tech.com.sg"
    Then Enter the valid passwordsdsd in password field "aktrea@123"
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @tag2
  Scenario: verify the InfoTech_cloud sigin page with Invalid_username and valid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
    Then Enter the valid passwordsdsd in password field "demo1"
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @tag3
  Scenario: verify the InfoTech_cloud sigin page with Invalid_username and Invalid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
    Then Enter the valid passwordsdsd in password field "demo123"
    And verify the applicatisdfsfdsondgdgdd not  successfully.

  @tag4
  Scenario: verify the InfoTech_cloud sigin page with valid_username and valid_Password credentials
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "aktr"
    Then Enter the valid passwordsdsd in password field "aktrea@123sdsASA"
    And verify the applicationsssaadsasds successfully.
