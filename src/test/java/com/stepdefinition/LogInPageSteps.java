package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Utility;
import com.manager.PageObjectManager;
import com.pages.BookHotelPage;
import com.pages.LogInPage;
import com.pages.RegisterPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInPageSteps extends Utility {
	PageObjectManager manager;
	LogInPage logInPage;

	@Given("User is on Facebook page")
	public void user_is_on_Facebook_page() {
		getDriver();
		getUrl("https://www.facebook.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		manager = new PageObjectManager();
		logInPage = manager.getLogInPage();
		type(logInPage.getTxtEmail(), "Java");
		type(logInPage.getTxtPwd(), "Selenium");

	}

	@Then("User clicks on the Login button")
	public void user_clicks_on_the_Login_button() {
		btnClick(logInPage.getFbLoginBtn());
	}
}