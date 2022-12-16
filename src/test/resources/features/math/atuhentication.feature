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
#  | akunku     | 12345   | akun201@mail.com  | akun201 | can regis      |
  |            |            |                   |         | cant regis     |
  |            | 12345678   | akun20@mail.com  | akun201 | error fullname |
  |            |            | akun20@mail.com  | akun201 | error notelp   |
  |            |            |                  | akun201 | error email    |
  | akunku     |            | akun20@mail.com  | akun201 | error notelp   |
  | akunku     |            |                  | akun201 | error notelp   |
  | akunku     |            |                  |         | error email    |
  | akunku     | 12345678   |                  | akun201 | error email    |
  | akunku     | 12345678   |                  |         | error pass     |
  |            | 12345678   |                  |         | error fullname |
  | akunku     | 12345678   | akun20@mail.com  |         | error pass     |



 Scenario Outline: Authentication Login
   Given i open app
   And i am on the login page
   When input "<email>" email, "<pass>" password
   And click button masuk
   Then I get "<result>" result
   Examples:
   | email            | pass     | result       |
#   | akun20@mail.com  | akun201  | can login    |
   | akun20@mail.com  | akun20   | error pass   |
   | akun20@mail.com  |          | error pass   |
   | akun19@mail.com  | akun201  | error email  |
   | akun19@mail.com  | akun20   | error email  |
   | akun19@mail.com  |          | error pass   |
   |                  | akun201  | error email  |
   |                  |          | error email  |