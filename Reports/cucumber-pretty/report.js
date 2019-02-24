$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/login/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 150925857597,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application;login-to-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter email address as \"test902@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Login is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToAutomationPractices.navigate_to_application()"
});
formatter.result({
  "duration": 11311511509,
  "status": "passed"
});
formatter.match({
  "location": "LoginToAutomationPractices.user_click_on_sign_in_link()"
});
formatter.result({
  "duration": 21797643455,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test902@gmail.com",
      "offset": 24
    }
  ],
  "location": "LoginToAutomationPractices.enter_email_address_as(String)"
});
formatter.result({
  "duration": 3413232988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 19
    }
  ],
  "location": "LoginToAutomationPractices.enter_password_as(String)"
});
formatter.result({
  "duration": 2706687057,
  "status": "passed"
});
formatter.match({
  "location": "LoginToAutomationPractices.click_on_sign_in_button()"
});
formatter.result({
  "duration": 31054499221,
  "status": "passed"
});
formatter.match({
  "location": "LoginToAutomationPractices.login_is_successful()"
});
formatter.result({
  "duration": 148974120593,
  "error_message": "java.lang.AssertionError: LoginToAutomationPractices is fail expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.cucumber.framework.stepdefinition.login.LoginToAutomationPractices.login_is_successful(LoginToAutomationPractices.java:51)\r\n\tat ✽.Then Login is successful(featurefile/login/login.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 4102381435,
  "status": "passed"
});
