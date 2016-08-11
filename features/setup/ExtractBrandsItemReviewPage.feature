@setup
@itemsReview
Feature: We need to extract the Brands items review Page Data

Scenario: Extracting data from the brand's items in Famous Smoke
    Given I need to Setup the Features for the Items
    And I navigate to the page "https://www.famous-smoke.com/brand-list"
    And I crawl through the item review page of each brand
    When I store the extracted items review data
    Then I should process the base features templates
    And I should process the items review features templates