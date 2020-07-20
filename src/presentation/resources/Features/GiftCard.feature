Feature: GiftCard Shopping from amazon
  As a QE I want to automate gift card shopping funtionalities by searching the card

   
Scenario: Successful Amazon GiftCard Shopping from Amazon.com
    Given Customer is on homepage
    When Customer clicks on the GiftCard option
    And Customer chooses Delivery Type "Mail"
    And Customer chooses the featured brand "Amazon"
    And Customer enters the price range "$25 to $50"
    And Customer chooses the format "Greeting Card"
    And Customer  clicks on  the card "Amazon.com Gift Card in a Greeting Card (Various Designs)"
    And Customer adds the card to the shopping cart "Add to Cart"
    Then the price otal should be 50.00