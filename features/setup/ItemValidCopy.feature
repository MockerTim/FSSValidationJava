@seo1itemsreview
@itemsReview
Feature: The Item review Pages have a SEO Paragraph matching the extracted Data

  Scenario Outline: I will validate the Brand SEO Paragraph
    Given I want to the check the content of the item review url "<URL>"
    And the url is from an item review page
    When I navigate to the item review page
    Then the item review description should not be empty
    And the item review description should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | b1219g378ff40h9feg1258hh6ad98505e39f2 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 697992g2c2g4c04d8hb9fb86cbd065cb242b5b |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | 35f191ef8h0902e3db2c9aadf4d1b1gf1d5d3f |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | 7ea081hfhahhhcbd7c54d2d0ge1dg2ddff4e |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 42c894d7605h6e2b9d690f7703g3cbafef8dha |
