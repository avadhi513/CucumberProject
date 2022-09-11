@Fun1
Feature: Payment Details

  @Smoke
  Scenario: Payment with netbanking
    Given user is on netbanking page
    When user enters details

  @Sanity @Reg
  Scenario: Payment with debit card
    Given user is on debit card page
    When user enters details

  @Retest
  Scenario: Payment with credit card
    Given user is on credit card page
    When user enters details

  Scenario: Payment with UPI
    Given user is on UPI page
    When user enters details

  Scenario: Payment with visa card
    Given user is on visa card page
    When user enters details
