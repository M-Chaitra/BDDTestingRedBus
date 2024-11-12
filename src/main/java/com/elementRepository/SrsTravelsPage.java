package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrsTravelsPage {
	public SrsTravelsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class='D128_data_url'])[7]")
	private WebElement srsTravelsLinkClick;
	public WebElement getsrsTravelsLinkClick() {
		return srsTravelsLinkClick;
	}
	@FindBy(xpath = "//select[@class='agencyDropdown']")
	private WebElement srsLocations;
	public WebElement getSrsLocations() {
		return srsLocations;
	}
	@FindBy(xpath = "(//a[@class='D128_data_url'])[38]")
	private WebElement mumbaiToGoa;
	public WebElement getMumbaiToGoa() {
		return mumbaiToGoa;
	}
	
}
