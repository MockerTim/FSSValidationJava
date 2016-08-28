@seo2
@all
Feature: The Title length of all Pages should be in a particular range

  Scenario Outline: I will validate the length of the Page Title
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the title should be  under 70 characters
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 55gb0gg3g784bdfggg73748g4c236044h2880 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 7788gb466197cb9ba1be0d342ffc710c7d501g |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 41178ca82cc93aee0hg7763bbbf28958774b6d |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 7adeg792e89g0d4ha68gc0929128f9hh883c5f |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 79gd2562ab97f48aeg1f57d0gad9e222c0258c |
