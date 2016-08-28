@seo2
@brands
Feature: The Brand Pages have a SEO paragraph matching the extracted Data

  Scenario Outline: I will validate the Brand Description
    Given I want to the check the content of the brand url "<URL>"
    And the url is from a brand page
    When I navigate to the brand page
    Then the brand description should not be empty
    And the brand description should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+cigar+reviews/HFA | 285a5g8hdf9f8e91h3dhghe43efce8hh5b95e9 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+cigar+reviews/L94 | 2644f8ehd221398ch3g98050f2259dfbe18bc0 |
| https://www.famous-smoke.com/262+ideology+cigar+reviews/2ID | 2a978ba1dcb76f0cb58bc0d2h44d0ghg610bhb |
