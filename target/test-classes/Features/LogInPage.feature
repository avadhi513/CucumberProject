@Fun2 @Info2
Feature: Verifying the Facebook Details

  @Reg @Sanity
  Scenario: Verifying the login details with invalid credentials
    Given User is on Facebook page
    When User enters username and password
    Then User clicks on the Login button

  @Reg @E2E
  Scenario: Verifying the login details with invalid credentials
    Given User is on Facebook page
    When User enters username and password
    Then User clicks on the Login button
