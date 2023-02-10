package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashBoardPage extends CommonMethods {

	@FindBy(id = "account-name")
	public WebElement accountname;

	@FindBy(xpath = "//*[@id='menu_pim_viewPimModule']/a/span[2]")
	public WebElement pim;

	@FindBy(css = "#menu_pim_addEmployee > span.left-menu-title")
	public WebElement addemployee;

	@FindBy(css = "#modal-holder > div > div > div > div.modal-body > form > oxd-decorator > div > div.form-group.col-8 > div > div:nth-child(2) > div > div.form-group.col-3 > label")
	public WebElement employeeId;

	@FindBy(id = "first-name-box")
	public WebElement firstName;

	@FindBy(id = "last-name-box")
	public WebElement lasName;

	@FindBy(id = "location")
	public WebElement location;

	@FindBy(id = "employeeId")
	public WebElement numberId;

	@FindBy(id = "modal-save-button")
	public WebElement save;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/header/div/nav/div/div/ul[2]/li[2]/ul/li[1]/span")
	public WebElement testname;

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

}
