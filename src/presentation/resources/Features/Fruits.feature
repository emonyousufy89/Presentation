Feature: Fruits Shopping

  As a QA I want to automate fruits module on amazon.com

  Background: Customer is on amazon homepage

  Scenario: Customer purchase Fruits using different filtering options

    Given Customer clicks on hamburger icon
    And Customer select Food & Grocery from drop down
    When Customer clicks Amazon fresh from next drop down
    And Customer clicks close button on pop-up windows
    And Customer clicks Fresh Produce
    And Customer clicks Fresh Fruit
    And Customer clicks Bananas
    Then Customer clicks Dole Bananas
