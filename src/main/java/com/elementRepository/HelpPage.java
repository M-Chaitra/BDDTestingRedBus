package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//i[@class='icon icon-help_new icon_rb_secondary_item']")
	private WebElement helpPage;
	
	public WebElement getHelpPage() {
		return helpPage;
	}
}
