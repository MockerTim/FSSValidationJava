@validation
Feature: We need to validate current page do not have any na.gif image

  Scenario: Validate current page do not have any na.gif page
    Given I need to Setup the Features for the Brands
    And I navigate to the page "https://www.famous-smoke.com/brand/nomad+therapy+cigars"
    Then the page should not have any na.gif image