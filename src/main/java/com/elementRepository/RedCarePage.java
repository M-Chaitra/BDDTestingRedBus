package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedCarePage {
	public RedCarePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//iframe[@style='overflow:visible;']")
	private WebElement getBusTicketimageIframe;

	public WebElement getGetBusTicketimageIframe() {
		return getBusTicketimageIframe;
	}
	@FindBy(xpath = "//div[@title='Technical Issues']")
	private WebElement getTechnicalIssues;

	public WebElement getGetTechnicalIssues() {
		return getTechnicalIssues;
	}
	@FindBy(xpath = "//span[@class='bordingDetailsText']")
	private WebElement getTechnicalIssuestitle;

	public WebElement getGetTechnicalIssuestitle() {
		return getTechnicalIssuestitle;
	}
	@FindBy(xpath = "//div[text()='No buses found']")
	private WebElement noBusesFound;

	public WebElement getNoBusesFound() {
		return noBusesFound;
	}
	@FindBy(xpath = "//div[text()='No, thanks']")
	private WebElement noThanks;

	public WebElement getNoThanks() {
		return noThanks;
	}
	@FindBy(xpath = "//img[@class='window-back']")
	private WebElement windowBack;

	public WebElement getWindowBack() {
		return windowBack;
	}
	@FindBy(xpath = "//span[text()='redBus Referral Help']")
	private WebElement redbusReferralHelp;

	public WebElement getRedbusReferralHelp() {
		return redbusReferralHelp;
	}
	@FindBy(xpath = "//span[@class='bordingDetailsText']")
	private WebElement redBusRefferalHelptitle;

	public WebElement getRedBusRefferalHelptitle() {
		return redBusRefferalHelptitle;
	}
	@FindBy(xpath = "//img[@alt='windowback']")
	private WebElement redBusWindowBack;

	public WebElement getRedBusWindowBack() {
		return redBusWindowBack;
	}
	@FindBy(xpath = "//span[text()='New bus booking help']")
	private WebElement newBusBookingHelp;

	public WebElement getNewBusBookingHelp() {
		return newBusBookingHelp;
	}
	@FindBy(xpath = "//span[text()='Bus availability/ Child fare, Luggage & Insurance policy']")
	private WebElement newBusBookingHelpTitle;

	public WebElement getNewBusBookingHelpTitle() {
		return newBusBookingHelpTitle;
	}
	
}