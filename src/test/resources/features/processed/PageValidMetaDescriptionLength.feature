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
  | https://www.famous-smoke.com/brandgroup/262+cigars | 10d65da518220ef1ef9b636163adc533011h7d |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 11ag45b264f0gd5861dfgh1ebeaa99gg0071e |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 1a9ghf963c1c4538h0f90709bc094c56deeehc |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 6a10c7048167gfe856hf82e7a41d7dbbde800c |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 36g66a39c341dh91b4g8bdhhgbeg7677c96cce |
