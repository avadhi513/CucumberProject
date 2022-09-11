Feature: Setting details in the Flipkart Page

  Scenario: Validation of Change Password
    Given User is on Flipkart settings page
    When User clicks on change password
    And user enters old, new and confirm password and click the change password
    Then user verify the success message
