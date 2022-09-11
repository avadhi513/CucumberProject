package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FlipkartSteps {

	@Given("User is on Flipkart settings page")
	public void user_is_on_Flipkart_settings_page() {
		Assert.assertTrue(true);
	}

	@When("User clicks on change password")
	public void user_clicks_on_change_password() {
		Assert.assertTrue(true);
	}

	@When("user enters old, new and confirm password and click the change password")
	public void user_enters_old_new_and_confirm_password_and_click_the_change_password() {
		Assert.assertTrue(true);
	}

	@Then("user verify the success message")
	public void user_verify_the_success_message() {
		Assert.assertTrue(true);
	}

}
