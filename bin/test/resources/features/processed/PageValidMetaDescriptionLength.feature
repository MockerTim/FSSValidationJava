@seo2
@all
Feature: The MetaDescription length of all Pages is in a range

  Scenario Outline: I will validate the length of the Page MetaDescription
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the meta description should be over 1 characters
    And the meta description should be under 185 characters
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 3d5120848302590c7230705h1b52hh3458hdag |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 3e7c9c7945dgbb76gbbef0cafae073g73110b7 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 1g7d4cfbe7752120hf00h4bfdbg7f4a11h15f9 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 21960f63305a80af57e6a5bfbgb16795eb9h4 |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 1039ef71g123g0752b015gg12a2647eb9fhd77 |
