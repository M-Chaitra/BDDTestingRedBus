package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalCitiesSingaporePage {
	public GlobalCitiesSingaporePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "singapore_site_footer")
	private WebElement singapore;
	public WebElement getSingapore() {
		return singapore;
	}
	@FindBy(xpath = "//img[@alt='redBus Indonesia']")
	private WebElement indonesia;
	public WebElement getIndonesia() {
		return indonesia;
	}
	@FindBy(xpath = "//a[text()='Tiket Bus Online']")
	private WebElement tiketBusOnline;
	public WebElement getTiketBusOnline() {
		return tiketBusOnline;
	}
	@FindBy(xpath = "//div[text()='Bahasa Indonesia']")
	private WebElement bahasaIndonesia;
	public WebElement getBahasaIndonesia() {
		return bahasaIndonesia;
	}
	@FindBy(xpath = "//span[contains(text(),'English')]")
	private WebElement selectEnglish;
	public WebElement getSelectEnglish() {
		return selectEnglish;
	}
	
}
