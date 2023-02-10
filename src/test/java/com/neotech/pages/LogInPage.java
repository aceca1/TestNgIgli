package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LogInPage {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div/form/div[3]/button")
	public WebElement Login;

	public LogInPage() {
		PageFactory.initElements(CommonMethods.driver, this);
	}

}
