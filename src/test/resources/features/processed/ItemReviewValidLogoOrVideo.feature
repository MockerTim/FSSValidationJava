@validation
@items
Feature: The Item review Pages should have a visible Logo or visible Video

  Scenario Outline: I will validate the Brand Logo or Video
    Given I want to the validate the review item in "<URL>"
    When I load the item review page
    Then the review item identification should be visible
    And the item review page should not be a placeholder image url ending in na.gif

    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | c5cfae473a9ac51ehg94ff2a925dge8055e06 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 561h53695191156e1b9399f251815e5846h573 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | 28c9hdgg64f22701f3ga6a4b204c38gce8c673 |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | d3dd5302ha7g84187927b3d9de5718d04dhe8 |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 1ff554fd60e908a2f23d73097dha224d55dd1g |
