@setup
@brandsReview
Feature: We need to extract the Brand review Page Data

  Scenario: Extracting data from famous smoke
    Given I need to Setup the Features for the Brands
	And I Test the url
    And I navigate to the page "https://www.famous-smoke.com/brand-list"
    And I crawl through the brands list
    When I store the extracted brands data
    