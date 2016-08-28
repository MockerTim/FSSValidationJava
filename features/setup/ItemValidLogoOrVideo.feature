@validationlogo
@items
Feature: The Item review Pages should have a visible Logo or visible Video

  Scenario Outline: I will validate the Brand Logo or Video
    Given I want to the validate the review item in "<URL>"
    When I load the item review page
    Then the review item identification should be visible
    And the item review page should not be a placeholder image url ending in na.gif

    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | 38c9305f0ef35113257f4063ecgfa129691351 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 1218a07d3d77heg9dabe9ga79h8bgd242d27c0 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | bce62d4g6e7cd4246a6d1ggg60bdhah523461 |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | 5fc8ae4gbf89g058a4fh3ab653e51d41dea2e4 |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 11h97b42668g0890g79494485227dd4hbb6573 |
