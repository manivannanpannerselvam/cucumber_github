Feature: 
       Verify different GET Operation using RestAssured

  Scenario: verify the one author of the post
    Given I perform GET operation for "/post"
    And I perform GET for the post number "1"
    Then I should author name as "karthick ka"
