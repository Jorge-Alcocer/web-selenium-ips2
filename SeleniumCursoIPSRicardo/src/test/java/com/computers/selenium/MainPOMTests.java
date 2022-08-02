package com.computers.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.base.Base;
import com.selenium.base.GlobalVariables;
import com.selenium.poc.MainPage;

public class MainPOMTests {

	// POM

	WebDriver driver;
	Base base;
	MainPage mainPage;
	String expectedComputer;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromeDriverCon();
		mainPage = new MainPage(driver);
		expectedComputer = base.getJSONValue("tc001", "computer");
	}

	@Test
	public void tc001() {

		// Step 1 - Launch browser
		base.launchBrowser(GlobalVariables.QA_URL);

		// Step 2 - Insert computer name in text box
		// Step 3 - Click on "Filter by name"
		mainPage.filterComputerByName(expectedComputer);

		// Step 4 - Validate computers is displayed in table
		Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
	}

	@Test
	public void tc002() {
	}

	@AfterTest
	public void afterTest() {
		base.closeBrowser();
	}

}
