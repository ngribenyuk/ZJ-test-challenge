@search
Feature: Search

  @smoke
  Scenario: customer is able to search in Travel section
    Given open landing page
    When select "Reise" in navigation header
    And fill all required fields for search
    And click on Search button
    Then destination search results are appeared and contain at least 1 item