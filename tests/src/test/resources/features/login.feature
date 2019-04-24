@login
Feature: Login
  @smoke
  Scenario: customer can log into the system with already created account
    Given open landing page
    When click on "Sign in" link
    And fill an email address and password of already created user
    And click on "Log in" button
    Then user account page is opened and hello message is visible