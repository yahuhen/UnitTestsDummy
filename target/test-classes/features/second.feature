Feature: My second cucumber test

  Scenario Outline: My first scenario
    Given I open first site
    When I fill "<city>" as name of first site
    Then I need to see site
    Examples:
    | city |
    | Minsk |
    | Gdynia |
    | Sopot |
    | Rewa |
    | Helm |


