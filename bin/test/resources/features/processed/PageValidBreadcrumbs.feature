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
      | https://www.famous-smoke.com/brandgroup/262+cigars | 36c4dae584gc8b4c817gf874g5ee9c34g384g3 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 34bfb01ec3cf32604h2d45h1c3gh80h4b63d21 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 136a4d0120egdc962544f1be777b66da414762 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 3b8bh0f16eb9adb4adcaf7a7aa45ch9fe2f270 |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 173d70880heh73ch5dh1b4172fbb09a9bdd044 |
