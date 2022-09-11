package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class LogInPage extends Utility {
	
public LogInPage() {
	PageFactory.initElements(driver,this);
}
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtEMail;
	
	@FindBy(name="pass")
	private WebElement txtPwd;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement fbLoginBtn;
	
	
	//right click ---source ---generate getters and setters

	public WebElement getTxtEmail() {
		return txtEMail;
	}

	public WebElement getTxtPwd() {
		return txtPwd;
	}

	public WebElement getFbLoginBtn() {
		return fbLoginBtn;
	}
	
}