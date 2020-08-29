Feature: Example feature description

  Background:
    Given User is logged in

  Scenario: Example scenario
    Given User has 200 USD on their account
    When User withdraws 100 USD
    Then User should have 100 USD on their account