@seo2
@all
Feature: The MetaDescription of all the Pages should match the Test Data

  Scenario Outline: I will validate Page MetaDescription
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the meta description should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 314efh41h47gc9a0fb8g02d7b5ead11g21bfd1 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 7e571f7c156g28074813gc96d0aae00ab3fe7a |
| https://www.famous-smoke.com/brand/262+ideology+cigars | h999c4c09171d5d5325ga41b9035fa71cag8h |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 30762a24gf61fb8g91b36a8dgd8923f2c96101 |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 77g4h2bbdbbh61g46hfhef9b3661217eegf0dg |
