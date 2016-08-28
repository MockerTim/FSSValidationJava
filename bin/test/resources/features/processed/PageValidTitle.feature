@seo1
@all
Feature: The Title of all the Pages should match the Test Data

  Scenario Outline: I will validate the Page Title
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the title should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 6428h892d6f6e0cc6b7gh01gcd5d7d5ah9h842 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 39a33dc34ea9a3e64h632391bg0a4833c6cgbf |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 4a9d5cfba90h6a72gd1h1ge4f2bb060b12cd9f |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 22f472d91g505f450e5ae0884c1689168774ad |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 3fgfc5ac47f4f5d0hde777ahc8h6c175a3361g |
