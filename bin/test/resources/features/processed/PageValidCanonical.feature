@seo1
@all
Feature: The Canonical URL of all the Pages should match the Test Data

  Scenario Outline: I will validate the Page Canonical URL
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the canonical url should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 3fb65c6c962be3gfbfa41147652f932176dbb6 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 19f3dbb1ba2he2175a02hb917cf57d8hg58f9g |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 4de142f0eee919f0e4de20d735ffde0b46c856 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 56f1b8554e0g95bfbe47c4a39879fehd4b8hf |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 53dc9689agb8859ch8h2027g0488ac8aah9514 |
