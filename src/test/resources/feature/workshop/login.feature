Feature: login

  Scenario: Open any page
    Given i open this url "http://google.com"
    Then i send 10 into search field


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







