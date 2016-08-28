@seobrandsreview
@brands
Feature: The Brand Pages have a Header One matching the extracted Data

  Scenario Outline: I will validate the Brand Review Header One
    Given I want to the check the content of the brand review url "<URL>"
    And the url is from a brand review page
    When I navigate to the brand review page
    Then the brand review header one should not be empty
    And the brand review header one should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+cigar+reviews/HFA | 6fhahfefcb76219f5118422a111191gh92a264 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+cigar+reviews/L94 | 5bh12c6134h78h228ga35b2fc29g7cbegecfb7 |
| https://www.famous-smoke.com/262+ideology+cigar+reviews/2ID | f763c40773fb3d746h4e704cc446b14ch7396 |
