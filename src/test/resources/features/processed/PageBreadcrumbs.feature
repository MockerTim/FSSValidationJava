@actionvalidation
@all
Feature: On both item and brand pages all breadcrumbs must go to correct links

  Scenario Outline: I will validate the navigation of the breadcrumbs
    Given I want to check the breadcrumb of "<URL>"
    When I click the link to navigate to each breadcrumb page
    Then the breadcrumb page should exist and be the correct page
    Examples:
    | URL | SCENARIO-ID |
    | https://www.famous-smoke.com/brandgroup/262+cigars | 6g6b56eh0324917b1663bf6g920db21agee6cc |
| https://www.famous-smoke.com/brand/1994+by+la+flor+dominicana+cigars | a372515gfh2h2bd7ha580a63b7b4fb7dd03ae |
| https://www.famous-smoke.com/brand/262+ideology+cigars | 68bg74bd69fef54dh0861a1dd9ee16g4ab95g1 |
| https://www.famous-smoke.com/brand/262+allegiance+cigars | 5004h60g94775ghf619ch223g48b1ef7aff27g |
| https://www.famous-smoke.com/brand/no.+famous+cigars | 145cd7666689h9aa5b0272bcc128a9192960gg |
