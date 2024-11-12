package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.RedCarePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaqSection {
	WebDriver driver = DriverFactory.getDriver();
	RedCarePage redCarePage = new RedCarePage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();

	@When("the user clicks on Technical issues")
	public void the_user_clicks_on_technical_issues() throws Exception {
		String helpPage = fileUtility.getDataFromPropertiesFiles("helpurl");
		webDriverUtility.switchToTabOnUrl(driver, helpPage);
		webDriverUtility.switchToFrame(driver, redCarePage.getGetBusTicketimageIframe());
		redCarePage.getGetTechnicalIssues().click();
		redCarePage.getNoBusesFound().click();
		redCarePage.getNoThanks().click();
		Reporter.log("The User is able to click on Technical Issues", true);

	}

	@Then("the user should navigate to the Technical issues topics")
	public void the_user_should_navigate_to_the_technical_issues_topics() {
		Assert.assertTrue(redCarePage.getGetTechnicalIssuestitle().isDisplayed());
		Reporter.log("The User is navigated to Technical issues topics", true);
		redCarePage.getWindowBack().click();
	}

	@When("the user clicks on redBus Referral Help")
	public void the_user_clicks_on_red_bus_referral_help() throws InterruptedException {
		redCarePage.getRedbusReferralHelp().click();
		Reporter.log("The user is able to click on the redBus Referral Help");
	}

	@Then("the user should navigate to the redBus Referral Help")
	public void the_user_should_navigate_to_the_red_bus_referral_help()  {
		Assert.assertTrue(redCarePage.getRedBusRefferalHelptitle().isDisplayed());
		Reporter.log("The user is navigating to redBus Referral Help");
		redCarePage.getRedBusWindowBack().click();
	}

	@When("the user clicks on New bus booking help")
	public void the_user_clicks_on_new_bus_booking_help() throws InterruptedException {
		redCarePage.getNewBusBookingHelp().click();
		Reporter.log("The user is able to click on new bus booking help");
	}

	@Then("the user should navigate to the New bus booking help")
	public void the_user_should_navigate_to_the_new_bus_booking_help() throws InterruptedException {
		Assert.assertTrue(redCarePage.getNewBusBookingHelpTitle().isDisplayed());
		Reporter.log("The user is navigating to redBus Referral Help");
	}

}
