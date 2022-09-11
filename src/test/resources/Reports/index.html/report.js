$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Fipkart.feature");
formatter.feature({
  "name": "Setting details in the Flipkart Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of Change Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Flipkart settings page",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartSteps.user_is_on_Flipkart_settings_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on change password",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartSteps.user_clicks_on_change_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters old, new and confirm password and click the change password",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartSteps.user_enters_old_new_and_confirm_password_and_click_the_change_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartSteps.user_verify_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/LogInPage.feature");
formatter.feature({
  "name": "Verifying the Facebook details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Fun2"
    },
    {
      "name": "@Info2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on Facebook page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verifying login details with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun2"
    },
    {
      "name": "@Info2"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user enters the username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on Facebook page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verifying login details with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun2"
    },
    {
      "name": "@Info2"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "user enters the username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/Features/PaymentDetails.feature");
formatter.feature({
  "name": "Payment Details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Fun1"
    }
  ]
});
formatter.scenario({
  "name": "Payment with netbanking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on netbanking page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_is_on_netbanking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment with debit card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun1"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "user is on debit card page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_is_on_debit_card_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment with credit card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun1"
    },
    {
      "name": "@Retest"
    }
  ]
});
formatter.step({
  "name": "user is on credit card page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_is_on_credit_card_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment with UPI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun1"
    }
  ]
});
formatter.step({
  "name": "user is on UPI page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_is_on_UPI_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment with visa card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fun1"
    }
  ]
});
formatter.step({
  "name": "user is on visa card page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_is_on_visa_card_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters details",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentDetailsSteps.user_enters_details()"
});
formatter.result({
  "status": "passed"
});
});