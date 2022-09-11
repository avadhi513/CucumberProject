package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\CucumberProject\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		return driver;

	}

	public static void getUrl(String txt) {
		driver.get(txt);

	}

	public static void type(WebElement element, String txt) {
		element.sendKeys(txt);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

}
