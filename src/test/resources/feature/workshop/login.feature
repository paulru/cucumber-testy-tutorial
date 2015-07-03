Feature: login

  Scenario: Login successfullyuuuu
    Given i access the login page
    And i insert valid credential
    When i click login button
    Then i check if user is logged in


#  Scenario: Log in with wrong credentials
#    Given i access the login page
#    And i insert invalid credential
#    When i click login button
#    Then i expect invalid credential message







