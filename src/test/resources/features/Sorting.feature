Feature: Validate sorting
  Scenario: check if products are according to the criteria
    Given user opens the website
    Then verify user is on login page
    When user enters username "valid.username" and password "valid.password"
    Then verify user is on home page
    When filter Z to A order
    Then verify the products are in Z to A order