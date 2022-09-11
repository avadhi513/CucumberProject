package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utility {

	@Before
	public void beforeScenario() {
		System.out.println("Scenario starts");
	}

	@After
	public void afterScenario(Scenario sc) {

		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] bk = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(bk, "image/png");

		}

	}

}
