@seo2
@brands1
Feature: The Brand Pages have a SEO paragraph matching the extracted Data

  Scenario Outline: I will validate the Brand Description
    Given I want to the check the content of the brand url "<URL>"
    And the url is from a brand page
    When I navigate to the brand page
    Then the brand description should not be empty
    And the brand description should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brand/no.+famous+cigars | 1af32e7d1e8161468601f2d976ag6ag7h8hfb1 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 226f5a8hdh7ad82349d5g85gh6682d3f4h8b4b |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 50g70e3d26d0cec7edh1h720cabb83dh0eebd7 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 2af9458f2g12g9e1h72ee0f4e3ge890c098g38 |
