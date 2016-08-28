@seo2
@all
Feature: The MetaDescription of all the Pages should match the Test Data

  Scenario Outline: I will validate Page MetaDescription
    Given I want to the check the content of the url "<URL>"
    When I navigate to the page
    Then the meta description should match the Test Data
    Examples:
      | URL | SCENARIO-ID |
  | https://www.famous-smoke.com/brandgroup/262+cigars | 7b3a57448fe3ae2be8g4e76d0c569cdcf2e769 |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | 4cgd0cd4c6b82g0hc64f37b71edb90b4a6g48c |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 68hcd6126h365h5h87gg75ff2g7db6b8achb98 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 1c7a04b8449e31ag3bdd19g0ge7bf6ec9ce7ae |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 1a846c5e1gh70b21d41f73644b2476278b8f6b |
