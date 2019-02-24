@tag
Feature: Login to application

@tag1
Scenario: Login to application
Given navigate to application
	When user click on sign in link
  And enter email address as "test902@gmail.com"
	And enter password as "password"
	And click on sign in button
	Then Login is successful
	
@tag2
Scenario: Login is not  application
Given navigate to application
	When user click on sign in link
  And enter email address as "test903@gmail.com"
	And enter password as "passwords"
	And click on sign in button
	Then Login is not successful

@tag3
Scenario: Login is not  application
Given navigate to application
	When user click on sign in link
  And enter email address as "test904@gmail.com"
	And enter password as "passwords"
	And click on sign in button
	Then Login is not successful
	
	
	