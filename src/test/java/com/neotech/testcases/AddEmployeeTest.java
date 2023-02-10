package com.neotech.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.pages.DashBoardPage;
import com.neotech.pages.LogInPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

@Listeners(com.neotech.testbase.Listener.class)

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "tomi", groups = "tomka")
	public void addEmployee(String username, String lastname, String employeeId, String location) {

		LogInPage logIn = new LogInPage();
		DashBoardPage dashboard = new DashBoardPage();
		SoftAssert soft = new SoftAssert();

		sendText(logIn.username, ConfigsReader.getProperty("username"));

		sendText(logIn.password, ConfigsReader.getProperty("password"));

		click(logIn.Login);

		soft.assertTrue(dashboard.accountname.isDisplayed(), "Can not log in");

		click(dashboard.pim);

		click(dashboard.addemployee);

		soft.assertTrue(dashboard.employeeId.isDisplayed(), "Can not open the add employ");

		sendText(dashboard.firstName, username);
		sendText(dashboard.lasName, lastname);

		sendText(dashboard.numberId, employeeId);

		selectDropdown(dashboard.location, location);
		wait(2);

		click(dashboard.save);
		wait(8);

		String name = dashboard.testname.getText();
		String expetedName = username + " " + lastname;

		soft.assertEquals(name, expetedName, "can not verify new employ");

		wait(2);

		soft.assertAll();

	}

	@DataProvider(name = "tomi")
	public Object[][] getExcelData() {

		return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "/data/igli.xlsx", "Employee");

	}

}
