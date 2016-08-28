@seo1
@all
Feature: The Canonical URL of all the Pages should match the Test Data

  Scenario Outline: I will validate the Page Canonical URL
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the canonical url should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 5c96hghh9dhch5355f5a1e5815b2ba23b5fah5 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 7827h7301fg7e27dd1b651c6ebga0452b3ea4g |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 33b4e56267chc7bhe405e75e816744e0aghgf0 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 6822c7346d829eada55eea8e7dcggce8g6af46 |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 176h243d2bb2d4245375502b57dgb3757g912d |
