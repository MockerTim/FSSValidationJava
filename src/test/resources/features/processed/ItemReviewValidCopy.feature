@seo1
@items
Feature: The Item review Pages have a SEO Paragraph matching the extracted Data

  Scenario Outline: I will validate the Brand SEO Paragraph
    Given I want to the check the content of the item review url "<URL>"
    And the url is from an item review page
    When I navigate to the item review page
    Then the item review description should not be empty
    And the item review description should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | 1035cg91672hdc833b49379975hgegcgg9bf85 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 2c06e8g6fb9974f7g08c1ce07hcdh56h52a2h9 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | 7b939bb0ed1hdg79d14b662bb9e1f07a12c304 |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | 3821h3g9bh29c4ff28ag21352gc425h6gcd49f |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 49ehha9cc937gb05d1dc1hb68f240108g4c6b3 |
