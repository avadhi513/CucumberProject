package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"com\\stepdefinition" }, monochrome = true, dryRun = false, strict = true, plugin= {"pretty", "json:src\\test\\resources\\Reports\\Cucumber.json"})

public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty(("user.dir")+  "src\\test\\resources\\Reports\\Cucumber.json"));
	}

}
