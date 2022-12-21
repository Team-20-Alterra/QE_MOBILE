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
    And click "<seePass>" see pass
    And click ckls syarat
    And click buat akun
    Then I get "<result>" result
    Examples:
  | fullname   | notelp     | email            | pass    | seePass | result         |
#  | akunku     | 12345678   | mylnanggi@gmail.com | akun201 |  see    | can regis      |
#  |            |            |                  |         |  no see | cant regis     |
#  |            | 12345678   | akun20@gmail.com  | akun201 |  see    | error fullname |
#  |            |            | akun20@gmail.com  | akun201 |  see    | error notelp   |
  |            |            |                  | akun201 |  see    | error email    |
  | akunku     |            | akun20@gmail.com | akun201 |  see    | error notelp   |
#  | akunku     |            |                  | akun201 |  see    | error notelp   |
#  | akunku     |            |                  |         |  no see | error email    |
#  | akunku     | 12345678   |                  | akun201 |  see    | error email    |
#  | akunku     | 12345678   |                  |         |  no see | error pass     |
#  |            | 12345678   |                  |         |  no see | error fullname |
#  | akunku     | 12345678   | akun20@gmail.com  |         |  no see | error pass     |


#
# Scenario Outline: Authentication Login
#   Given i open app
#   And i am on the login page
#   When input "<email>" email, "<pass>" password
#   And click button masuk
#   Then I get "<result>" result
#   Examples:
#   | email                 | pass     | result       |
#   | maylananggi@gmail.com  | password  | can login    |
#   | maylananggi@gmail.com  | password123   | error pass   |
#   | maylananggi@mail.com  |          | error pass   |
#   | maylan@gmail.com  | akun201  | error email  |
#   | maylan@gmail.com  | akun20   | error email  |
#   | maylananggi@gmail.com  |          | error pass   |
#   |                  | akun201  | error email  |
#   |                  |          | error email  |