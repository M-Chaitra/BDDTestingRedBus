package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestorsOverviewPage {
	public InvestorsOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "investor_relations_footer")
	private WebElement inverstorLink;
	public WebElement getInverstorLink() {
		return inverstorLink;
	}
	@FindBy(id = "tab2")
	private WebElement shareholdersCommunication;
	public WebElement getShareholdersCommunication() {
		return shareholdersCommunication;
	}
	@FindBy(xpath = "(//a[@class='rightFix'])[1]")
	private WebElement redBusPrivateLimited;
	public WebElement getRedBusPrivateLimited() {
		return redBusPrivateLimited;
	}

}
