@setup
@brandsReview
Feature: We need to extract the Brand review Page Data

  Scenario: Extracting data from famous smoke
    Given I need to Setup the Features for the Brands review
    And I navigate to the page "https://www.famous-smoke.com/brand-list"
    And I crawl through the brands list
    When I store the extracted brands review data
    Then I should process the base features templates
    And I should process the items features templates