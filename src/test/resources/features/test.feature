Feature: My first cucumber test

  Scenario: My first scenario
    Given I open first site
    When I fill "Minsk" as name of first site
    Then I need to see site

  @QA
  Scenario: My first scenario
    Given I open first site
    When I fill "Gdansk" as name of first site
    Then I need to see site

  Scenario: My first scenario
    Given I open first site
    When I fill "Orunia" as name of first site
    Then I need to see site

  @QA
  Scenario: My first scenario
    Given I open first site
    When I fill "Kiev" as name of first site
    Then I need to see site

