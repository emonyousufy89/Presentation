
Feature: Electronics shopping 
  I want to automate buying electronics item as a customer

Background: User is on amazon homepage

  Scenario: Customer purchase TV using different filtering options
    Given Customer clicks on ham burgur icon
    And Customer selects electronics from drop down
    When Customer clicks TV & Video from next drop down
    And Customer clicks 2020 model from filtering option
    And Customer clicks SAMSUNG Brand from filtering option
    Then Customer lands on Samsung brand listing page
    And Customer clicks on a TV from the right side 
    And Customer clicks add to cart
    Then Customer lands on warrenty option
    And Customer clicks on add warrenty option
    Then Customer lands on checkOut Page & see the price
    

  