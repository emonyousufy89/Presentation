
Feature: Sign Up into Amazon.com
  Aa QE I want to automate creating account as a unregistered customer

Background: Customer is on Amazon Homepage

  
  Scenario: Customer wants to create an account with valid data
    Given Customer clicks in the signIn button
    And Customer clicks on create an account
    When Custoemer lands in account creating page
    And Customer Enters name
    And Customer Enters email
    And Customer Enters password
    And Customer Check password
    Then Customer clicks on Submit button
    

  