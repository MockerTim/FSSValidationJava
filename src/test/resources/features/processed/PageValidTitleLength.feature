@seo2
@all
Feature: The Title length of all Pages should be in a particular range

  Scenario Outline: I will validate the length of the Page Title
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the title should be  under 70 characters
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | cagb251d42e49c1db31058743g4gheb04a36g |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 26341dbebf646ehba42hc50c4hh54445103ad0 |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 1635772be7e11bb410eb889798f576d07a9785 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 6d7a1333d17994hdh58891a30ebchgbh5cg51b |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 2601g61a6ffdb02e86c15bh0c5h823a0d194eg |
