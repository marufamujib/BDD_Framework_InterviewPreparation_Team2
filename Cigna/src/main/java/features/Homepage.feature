Feature:Explore Cigna Home Page
  As a customer I want to explore Cigna.com to search different services

  Scenario: Search Insurance available in Cigna
     Given I am at Cigna Home Page
     When I click on Individual and Family Plans
    Then I should see All Health Insurance for Individuals and Family
