package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;
import com.elementRepository.HelpPage;
import com.elementRepository.SitemapPage;
import com.elementRepository.SrsTravelsPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SitemapLink {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility fileUtility = new FileUtility();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	HelpPage helpPage = new HelpPage(driver);
	SitemapPage sitemapPage = new SitemapPage(driver);
	SrsTravelsPage srsTravelsPage = new SrsTravelsPage(driver);
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

	@Given("the user is on Help page")
	public void the_user_is_on_help_page() {
		helpPage.getHelpPage().click();
		Reporter.log("The User is able to navigate to help page", true);
	}

	@When("the user clicks on sitemap link")
	public void the_user_clicks_on_sitemap_link() throws InterruptedException {
		sitemapPage.getSitemapClickLink().click();
		Reporter.log("The user is able to navigate to sitemap page", true);
		Thread.sleep(4000);
	}

	@Then("the user should navigate to sitemap page")
	public void the_user_should_navigate_to_sitemap_page() throws Exception {
		String sitemap = fileUtility.getDataFromPropertiesFiles("sitemapurl");
		webDriverUtility.switchToTabOnUrl(driver, sitemap);
		Assert.assertEquals(driver.getCurrentUrl(), sitemap);
		Reporter.log("The User is navigated to sitemap  Page ", true);
		Thread.sleep(4000);
	}

	@Then("the user clicks on SRS Travles link")
	public void the_user_clicks_on_srs_travles_link() throws InterruptedException {
		srsTravelsPage.getsrsTravelsLinkClick().click();
		Reporter.log("The user is able to navigate to srsTravels page", true);
		Thread.sleep(4000);
	}

	@Then("the user should navigate to SRS Travels page")
	public void the_user_should_navigate_to_srs_travels_page() throws Exception {
		String srsTravels = fileUtility.getDataFromPropertiesFiles("srsTravelsurl");
		webDriverUtility.switchToTabOnUrl(driver, srsTravels);
		Assert.assertEquals(driver.getCurrentUrl(), srsTravels);
		Reporter.log("The User is navigated to srsTravels Help Page ", true);
	}

	@Then("the user should scroll down to the SRS Travels location")
	public void the_user_should_scroll_down_to_the_srs_travels_location() {
		javaScriptUtil.jsScrollIntoView(false, srsTravelsPage.getSrsLocations());
		Reporter.log("The user is able to scroll down to srs travels location", true);
	}

	@Then("the user clicks on dropdown of locations")
	public void the_user_clicks_on_dropdown_of_locations() {
		srsTravelsPage.getSrsLocations().click();
		Reporter.log("The user is able to click on dropdown locations ");
	}

	@Then("the user clicks on Ahmedabad location")
	public void the_user_clicks_on_ahmedabad_location() throws Exception {
		webDriverUtility.select(srsTravelsPage.getSrsLocations(),
				fileUtility.getDataFromPropertiesFiles("srslocationtitle"));
		Reporter.log("The user is able to click on Ahmedabad location", true);
	}

	@Then("the user clicks on Chennai location")
	public void the_user_clicks_on_chennai_location() throws Exception {
		webDriverUtility.select(srsTravelsPage.getSrsLocations(),
				fileUtility.getDataFromPropertiesFiles("srslocationtitle1"));
		Reporter.log("The user is able to click on Chennai location", true);
	}

	@Then("the user clicks on Mumbai to Goa Bus")
	public void the_user_clicks_on_mumbai_to_goa_bus() {
		javaScriptUtil.jsScrollIntoView(false, srsTravelsPage.getMumbaiToGoa());
		srsTravelsPage.getMumbaiToGoa().click();
		Reporter.log("The user is able to click on Mumbai to Goa Bus Routes", true);
	}

	@Then("the user should navigate to Mumbai to Goa Bus page")
	public void the_user_should_navigate_to_mumbai_to_goa_bus_page() throws Exception {
		String mumbaiToGoa = fileUtility.getDataFromPropertiesFiles("mumbaitogoaurl");
		webDriverUtility.switchToTabOnUrl(driver, mumbaiToGoa);
		Assert.assertEquals(driver.getCurrentUrl(), mumbaiToGoa);
		Reporter.log("The User is navigated to sitemap  Page ", true);
	}

}
