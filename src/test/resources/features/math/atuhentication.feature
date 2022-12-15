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
    And click ckls syarat
    And click buat akun
    Then I get "<result>" result
    Examples:
  | fullname   | notelp  | email             | pass    | result         |
  | akunku     | 12345   | akun20@mail.com  | akun201 | can regis      |
  |            |         |                   |         | cant regis     |
  |            | 12345   | akun20@mail.com  | akun201 | error fullname |
  | akunku     |         | akun20@mail.com  | akun201 | error notelp   |
  | akunku     | 12345   |                   | akun201 | error email    |
  | akunku     | 12345   | akun20@mail.com  |         | error pass     |

# Scenario Outline: Auth Login
#   Given i open app
#   And i am on the login page
#   When input "<email>" email, "<pass>" password
#   And click button masuk
#   Then i can login
#   Examples:
#   | email  | pass  |
#   | akun20@mail.com  | akun201  |
#   | akun20@mail.com  | akun20   |
#   | akun20@mail.com  |          |
#   | akun19@mail.com  | akun201  |
#   | akun19@mail.com  | akun20   |
#   | akun19@mail.com  |          |
#   |                  | akun201  |
#   |                  |          |