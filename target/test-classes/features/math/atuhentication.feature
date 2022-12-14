@Auth
Feature: Authentication
  As a user
  I want access authentication
  So I can access

  Scenario Outline: Authentication Register
    Given i open app
    And i am on the login page
    And i click link buat sekarang
    When I input "<fullname>" fullname, "<notelp>" telp, "<email>" email, dan "<pass>" pass
    And click buat akun
    Then I get "<result>" result
  Examples:
  | fullname   | notelp  | email | pass    | result     |
  | akun20     | 12345   | akun  | akun201 | can regis  |
  |            |         |       |         | cant regis |
  |            | 12345   | akun  | akun201 | cant regis |
  | akun20     |         | akun  | akun201 | cant regis |
  | akun20     | 12345   |       | akun201 | cant regis |
  | akun20     | 12345   | akun  |         | cant regis |

# Scenario Outline: Auth Login
#   Given i open the app
#   And i am on the login page
#   When input "<email>" email, "<pass>" password
#   And click button masuk
#   Then i can login
#   Examples:
#   | email  | pass  |
#   | abc@mail.com | kelp20a |