@seo2
@items
Feature: The Item review Pages have a Header One matching the extracted Data

  Scenario Outline: I will validate the Brand Header One
    Given I want to the check the content of the item review url "<URL>"
    And the url is from an item review page
    When I navigate to the item review page
    Then the item review header one should not be empty
    And the item review header one should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | 1b4d07g3fb35916hf069925ff7b1b62g78ea0 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 42c22f1bhceh1155f6hee2gaea652d601ehgaa |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | 670b862g2a0a6g694785aeedf24e0bb5b232ee |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | 2fa29dhb0c8211gb88g6f575b7fhb27hh67b89 |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 54g5ee717196f8g3f7g7965gh383991edh75h8 |
