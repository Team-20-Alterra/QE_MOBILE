@Auth
Feature: Authentication
  As a user
  I want access authentication
  So I can access

  @Register
  Scenario Outline: Authentication Register
    Given i open app
    And i am on the login page
    And i click link buat sekarang
    When I input "<fullname>" fullname, "<notelp>" telp, "<email>" email, dan "<pass>" pass
    And click "<seePass>" see pass register
    And click "<cklsSyrt>" ckls syarat
    And click buat akun
    Then I get "<result>" result register
    Examples:
  | fullname   | notelp     | email                | pass     | seePass | cklsSyrt   | result         |
  | akunku     | 12345678   | testing20@gmail.com  | password |  see    | ckls       | can regis      |
  | akunku     | 12345678   | testing20@gmail.com  | password |  see    | ckls       | error regis    |
  |            |            |                      |          |  no see | no ckls    | cant regis     |
  |            | 12345678   | testing20@gmail.com  | password |  see    | ckls       | error fullname |
  |            |            | testing20@gmail.com  | password |  see    | ckls       | error notelp   |
  |            |            |                      | password |  see    | no ckls    | error email    |
  | akunku     |            | testing20@gmail.com  | password |  see    | no ckls    | error notelp   |
  | akunku     |            |                      | password |  see    | ckls       | error notelp   |
  | akunku     |            |                      |          |  no see | no ckls    | error email    |
  | akunku     | 12345678   |                      | password |  see    | ckls       | error email    |
  | akunku     | 12345678   |                      |          |  no see | no ckls    | error pass     |
  |            | 12345678   |                      |          |  no see | no ckls    | error fullname |
  | akunku     | 12345678   | testing20@gmail.com  |          |  no see | ckls       | error pass     |

  @Login
  Scenario Outline: Authentication Login
   Given i open app
   And i am on the login page
   When input "<email>" email, "<pass>" password
   And click "<seePass>" see pass login
   And click button masuk
   Then I get "<result>" result login
   Examples:
   | email                  | pass          | seePass       |  result      |
   | maylananggi@gmail.com  | password      | see           | can login    |
   | maylananggi@gmail.com  |               | no see        | error pass   |
   |                        | password      | see           | error email  |
   |                        | akun201       | see           | error email  |
   | maylan@gmail.com       |               | see           | error email  |
   |                        |               | no see        | error email  |

   @LupaPass
   Scenario Outline: Authentication Login Lupa Kata Sandi
    Given i open app
    And i am on the login page
    When input "<email>" email
    And click lupa pass
    And I get pop up lupa pass
    Then input "<email>" email lupa
    And click "<action>" action lupa sandi
    Examples:
      | email                  | action |
      | maylananggi@gmail.com  | kirim  |
      | maylananggi@gmail.com  | batal  |
      |                        | kirim  |
      |                        | batal  |
      | abcdefghijk            | kirim  |