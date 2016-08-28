@actionvalidation
@all
Feature: On both item and brand pages all breadcrumbs must go to correct links

  Scenario Outline: I will validate the navigation of the breadcrumbs
    Given I want to check the breadcrumb of "<URL>"
    When I click the link to navigate to each breadcrumb page
    Then the breadcrumb page should exist and be the correct page
    Examples:
    | URL | SCENARIO-ID |
    | https://www.famous-smoke.com/brandgroup/262+cigars | 23381a3e31f951a910795gg3cgahhb1eb71c80 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 5145ga5f6d67d5ee70ge802bcb587c33g12b50 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 6f9eg38dg9d8e2208g3gf9209hb8f2a2a9027h |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 2cb8469h32775f34ee32bh6a122h3fh152df0h |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 3576h0f49595ee0d0bad5069effhage8gb38d3 |
