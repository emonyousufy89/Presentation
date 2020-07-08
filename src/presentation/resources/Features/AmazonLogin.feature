
Feature: SignIn to Amazon.com
  As a QE I want to automate signIn module as a customer
  
 Background: User is on amazon homepage

  
  Scenario: Registered Customer Sign In with valid credentials
    Given Customer clicks on Hello Sign In button
    And Customer enters username
    When Customer see continue button
    And Customer click continue button
    And Customer enters password
    And Customer clicks signIn button
    Then Customer lands on account homepage
   
    

  
  
