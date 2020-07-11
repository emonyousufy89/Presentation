
Feature: Sign Up into Amazon.com
  Aa QE I want to automate creating account as a unregistered customer

Background: Customer is on Amazon Homepage

  @tag1
  Scenario: Customer wants to create an account with valid data
    Given Customer clicks in the signIn button
    And Customer clicks on create an account
    When Custoemer lands in account creating page
    And Enters name
    And Enters email
    And Enters password
    And Check password
    Then Customer clicks on Submit button
    

  