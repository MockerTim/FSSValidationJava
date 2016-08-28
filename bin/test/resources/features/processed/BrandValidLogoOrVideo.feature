@validation
@brands
Feature: The Brand Pages should have a visible Logo or visible Video

  Scenario Outline: I will validate the Brand Logo or Video
    Given I want to the validate the brand in "<URL>"
    When I load the brand page
    Then the brand identification should be visible
    And the brand page should not be a placeholder image url ending in na.gif

    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+cigar+reviews/HFA | 2ae2377fcf1had7fc406ae58a4474a2f765gh7 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+cigar+reviews/L94 | 4c48gbe5g5fhfe5e283ec3a97d2a56efb97873 |
| https://www.famous-smoke.com/262+ideology+cigar+reviews/2ID | 2b59d2h58522bf18h121d7hh6781h05fd7h12h |
