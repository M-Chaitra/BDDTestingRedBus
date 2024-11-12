package com.stepDefinitions;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.aventstack.extentreports.reporter.FileUtil;
import com.elementRepository.GlobalCitiesSingaporePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlobalCitiesSingapore {
	WebDriver driver = DriverFactory.getDriver();
	GlobalCitiesSingaporePage globalCitiesSingaporepage = new GlobalCitiesSingaporePage(driver);
	FileUtility fileUtility = new FileUtility();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javascriptUtil = new JavaScriptUtil(driver);

	@When("the user clicks on Singapore global cities")
	public void the_user_clicks_on_singapore_global_cities() throws InterruptedException {
		globalCitiesSingaporepage.getSingapore().click();
		Reporter.log("The user is able to click on Singapore", true);
	}

	@Then("the user navigates to singapore page")
	public void the_user_navigates_to_singapore_page() throws Exception {
		String singapore = fileUtility.getDataFromPropertiesFiles("singaporeurl");
		webDriverUtility.switchToTabOnUrl(driver, singapore);
		Reporter.log("The user is validating to Singapore Page", true);

	}

	@Then("the user clicks on the Indonesia")
	public void the_user_clicks_on_the_indonesia() {
		globalCitiesSingaporepage.getIndonesia().click();
		Reporter.log("The user is able to click on Indonesia", true);
	}

	@Then("the user navigates to Indonesia page")
	public void the_user_navigates_to_indonesia_page() throws Exception {
		Reporter.log("The user is validating to indonesia Page", true);
	}

	@Then("the user clicks on Tiket Bus Online")
	public void the_user_clicks_on_tiket_bus_online() throws InterruptedException {
		globalCitiesSingaporepage.getTiketBusOnline().click();
		Reporter.log("The user is able to click on Tiket Bus Online");
	}
	@Then("the user clicks on Bahasa Indonesia")
	public void the_user_clicks_on_bahasa_indonesia() throws InterruptedException {
		globalCitiesSingaporepage.getBahasaIndonesia().click();
	}
}
