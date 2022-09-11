package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PaymentDetailsSteps {
	
	@Given("user is on netbanking page")
	public void user_is_on_netbanking_page() {
		Assert.assertTrue(true);
	}

	@When("user enters details")
	public void user_enters_details() {
		Assert.assertTrue(true);
	}

	@Given("user is on debit card page")
	public void user_is_on_debit_card_page() {
		Assert.assertTrue(true);
	}

	@Given("user is on credit card page")
	public void user_is_on_credit_card_page() {
		Assert.assertTrue(true);
	}

	@Given("user is on UPI page")
	public void user_is_on_UPI_page() {
		Assert.assertTrue(true);
	}

	@Given("user is on visa card page")
	public void user_is_on_visa_card_page() {
		Assert.assertTrue(true);
	}

}
