Feature: login

  Scenario: Login successfullyuuuu
    Given i access the login page
    And i insert valid credential
    When i click login button
    Then i check if user is logged in


  Scenario: Log in with wrong credentials
    Given i access the login page
    And i insert invalid credential
    When i click login button
    Then i expect invalid credential message

  Scenario: Login with no password
    Given i access the login page
    When i enter "aaa@fast.com"/"asdasd" credentials
    And i click login button
    Then  i expect "Please enter your password!" message

  Scenario Outline: failed login
    Given i access the login page
    When i enter "<email>"/"<password>" credentials
    And i click login button
    Then i expect "<message> error message
    Examples:
      | email       | password | message                     |
      | aa@fast.com |          | Please enter your password! |
      |             | onlypass | Please enter your email!    |
      | aa@fast.com | somepass | Invalid user or password!   |
      |             |          | Please enter your email!    |

    Scenario Logout success
      Given I successfully login
      Then i check if user is logged in

