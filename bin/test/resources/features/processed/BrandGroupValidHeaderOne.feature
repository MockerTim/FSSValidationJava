@seo1
@brands
Feature: The Brand Group Pages have a Header One matching the extracted Data

  Scenario Outline: I will validate the Brand Group Header One
    Given I want to the check the content of the brand url "<URL>"
    And the url is from a brand group page
    When I navigate to the brand page
    Then the brand header one should not be empty
    And the brand header one should match the TestData
    Examples:
      | URL | SCENARIO-ID |
      
