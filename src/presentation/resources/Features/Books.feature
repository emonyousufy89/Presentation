
Feature: Book Shopping from amazon
  As a QE I want to automate book shopping funtionalities by searching the item

  Background: Customer is on the homepage
  
  Scenario: Customer wants to order picture book for toddler
    Given Customer enters item name in the search box
    When Customer clicks on search icon
    Then Customer lands on toddler book page
    And Customer clicks in the sort option
    And Customer selects high to low option
    Then Customer selects prime options
    And Customer selects picture book from the filter option
    And Customer selects my first reader from the next filter option
    And Customer clicks in th polar bear picture book
    Then Customer lands on Item page
    And Customer clicks the quantity button
    And Customer selects the quantity of the item
    And Customer clicks on add to cart
    Then Customer lands on the check out option page

  