package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.InvestorsOverviewPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvestorsOverview {
	WebDriver driver=DriverFactory.getDriver();
	InvestorsOverviewPage investorsOverview=new InvestorsOverviewPage(driver); 
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	
	@When("the user clicks on Investors Relations")
	public void the_user_clicks_on_investors_relations() throws InterruptedException  {
		investorsOverview.getInverstorLink().click();
		Reporter.log("The user is able to click on Investors Relations",true);
		Thread.sleep(3000);
	}

	@Then("the user navigates to Investors Overview page")
	public void the_user_navigates_to_investors_overview_page() throws Exception {
	   String investorOverview=fileUtility.getDataFromPropertiesFiles("investorOverviewurl");
	   webDriverUtility.switchToTabOnUrl(driver, investorOverview);
	   Reporter.log("The user navigates to Investors Overview page",true);
	   
	}
	@Then("the user clicks on shareholders communication")
	public void the_user_clicks_on_shareholders_communication() throws InterruptedException {
	    investorsOverview.getShareholdersCommunication().click();
	    Reporter.log("The user is able to click on shareholders communication",true);
	}

	@Then("the user sees shareholders communication")
	public void the_user_sees_shareholders_communication() throws Exception {
		String investorOverview=fileUtility.getDataFromPropertiesFiles("investorOverviewurl");
		   webDriverUtility.switchToTabOnUrl(driver, investorOverview);
		   Reporter.log("The user navigates to Investors Overview page",true);
	}
	@Then("the user clicks on red bus india private limited")
	public void the_user_clicks_on_red_bus_india_private_limited() throws InterruptedException {
	    investorsOverview.getRedBusPrivateLimited().click();
	    Reporter.log("The user is able to click on red bus india private limited");
	}
	@Then("the user navigates to red bus india private limited")
	public void the_user_navigates_to_red_bus_india_private_limited() throws Exception {
		String redbusPrivateLimited=fileUtility.getDataFromPropertiesFiles("redbusPrivateLimitedurl");
		   webDriverUtility.switchToTabOnUrl(driver, redbusPrivateLimited);
		   Reporter.log("The user navigates to red bus PrivateLimitedurl page",true);
	}

}
