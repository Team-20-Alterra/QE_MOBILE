Feature: Authentication
  As a user
  I want access authentication
  So I can access

  Scenario: Authentication Register
    Given i open app
    And i am on the login page
    And i click link buat sekarang
    When I input fullname
    And input no telp
    And input password
    And click buat akun
    Then I can register

 Scenario Outline: Auth Login
   Given i open the app
   And i am on the login page
   When input "<email>" email, "<pass>" password
   And click button masuk
   Then i can login
   Examples:
   | email  | pass  |
   | abc@mail.com | kelp20a |