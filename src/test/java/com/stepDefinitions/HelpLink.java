package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HelpPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpLink {
	WebDriver driver=DriverFactory.getDriver();
	//To Extract the URL and Browser
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	HelpPage helpPage=new HelpPage(driver);
	
	@Given("The Browser is open and URL is navigated to RedBus page")
	public void the_browser_is_open_and_url_is_navigated_to_red_bus_page() throws Exception {
		String actualUrl=driver.getCurrentUrl();    
	    String expectedUrl=fileUtility.getDataFromPropertiesFiles("url");
	    Assert.assertEquals(actualUrl, expectedUrl,"The URL is not Navigated");
	    Reporter.log("Navigated to the URL " +  expectedUrl,true);
	}

	@When("The User clicks on help link")
	public void the_user_clicks_on_help_link() throws Exception {
		  helpPage.getHelpPage().click();
		  Reporter.log("The User is able to Click on Help",true);
	}

	@Then("The USer should be navigated to redCare Help Page")
	public void the_u_ser_should_be_navigated_to_red_care_help_page() throws Exception {
		String help=fileUtility.getDataFromPropertiesFiles("helpurl");
		  webDriverUtility.switchToTabOnUrl(driver, help);
		  System.out.println(driver.getCurrentUrl());
	    Reporter.log("The User is navigated to redCare Help Page " ,true);
	}

}
