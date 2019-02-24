@launch_the_Applicationss
Feature: Login to  not application adawe

  @Login_to_applications
  Scenario: Login to with invalid application fille
    Given navigate to applicationss
    When user click on signs in link
    And enter Invalid email address as "test902@gmail.com"
    And enter inavlid password as "password"
    And click on sign ins button
    Then Login iss successful

  @Login_is_not_applicationss
  Scenario: Login is not should application fjss
    Given navigate to applications
    When user click on sign ins link
    And enter valid email address as "test903@gmail.com"
    And enter correct password as "passwords"
    And click on signs in button
    Then Login iss not successful
