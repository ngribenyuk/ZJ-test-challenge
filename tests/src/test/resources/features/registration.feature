@registration
Feature: Registration process

  Background:
    Given user is logged out
    Given prepare test user

  Scenario: new customer can open registration form
    Given open landing page
    And no one is signed into the system
    When expand "My Account" tab
    When click "Start Here" link
    Then registration page is opened

  @smoke
  Scenario: new customer can register a new account
    Given open registration page
    When fill an email address
    And fill password and repeat password
    And click on Register button
    When close welcome bonus screen
    Then user account page is opened and hello message is visible

  Scenario Outline: validation rules for email field
    Given open registration page
    When fill custom <email> address
    When click on Register button
    Then validation error <message> is visible
    Examples:
      | email            | message                                         |
      |                  | Bitte E-Mail-Adresse angeben.                   |
      | test             | Bitte geben Sie eine gültige E-Mail-Adresse an. |
      | test@.de         | Bitte geben Sie eine gültige E-Mail-Adresse an. |
      | email.domain.com | Bitte geben Sie eine gültige E-Mail-Adresse an. |


  Scenario Outline: validation rules for password fields
    Given open registration page
    When fill an email address
    When fill custom <password> and <repeat> password
    When click on Register button
    Then validation error <message> is visible
    Examples:
      | password | repeat  | message                                                  |
      | T$tL1    | T$tL1   | Das Passwort sollte zwischen 6 und 50 Zeichen lang sein. |
      | qwerty   | qwerty1 | Die Passwörter stimmen nicht überein.                    |