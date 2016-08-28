@seo21
@itemsReview
Feature: The Item review Pages have a Header One matching the extracted Data

  Scenario Outline: I will validate the Brand Header One
    Given I want to the check the content of the item review url "<URL>"
    And the url is from an item review page
    When I navigate to the item review page
    Then the item review header one should not be empty
    And the item review header one should match the TestData
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/no.+famous+petite+corona+cigars/item+49360 | 22h8hd4a3che21b0h1be138hd4dgg6abc8h7e0 |
| https://www.famous-smoke.com/no.+famous+toro+cigars/item+49358 | 52f05adc2d99h9a99b04fabh1eeaf22eaa9b40 |
| https://www.famous-smoke.com/1994+by+la+flor+dominicana+aldaba+cigars/item+45891 | 24d96c1fdghhe8524f5193e1fbcegg3bag3bd5 |
| https://www.famous-smoke.com/262+ideology+bp+toro+10+pack+cigars/item+53641 | 6h4b0eg2hf5661abg94b5a442aac1482865d62 |
| https://www.famous-smoke.com/262+ideology+robusto+5+pack+cigars/item+42687 | 2h7ffaee2c9gddag1c7efd58bdc6e96c3b1f62 |
