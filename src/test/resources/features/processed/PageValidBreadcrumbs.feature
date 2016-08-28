@seo1
@all
Feature: The breadcrumbs of all the Pages should match the Test Data

  Scenario Outline: I will validate the Page Breadcrumbs
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the breadcrumbs should not be empty
    And the breadcrumbs text should match the Test Data
    And the breadcrumbs links should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
      | https://www.famous-smoke.com/brandgroup/262+cigars | f1ac0a1h1h4fh6e1027a47g5407c47g1cdhd |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 6bhg9g9f5490ebb5b4903032g344b040d5f01 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 70934c79cdf61acf48g23760e4b829c69g81hh |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 4951c92h45dd312086f3f8770fcb5782fg9fa7 |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 6a5hh93db9feb7ccbdc887ah01afecdh3ee972 |
