@seo1
@all
Feature: The Title of all the Pages should match the Test Data

  Scenario Outline: I will validate the Page Title
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the title should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | b8acfg221a74ah19df6gc35262aefh8d7g059 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | h146afed13c49h082c7f5b11f0086fbb3dd7f |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 61bcbaa94ahf35b0hc29f66136g5bc22724h |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | f48a00f4861gd6ec8e91f28bd7c45d8a31ahb |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 492c55dd1f77cf0f050g0e4gdg602bf1f8f923 |
