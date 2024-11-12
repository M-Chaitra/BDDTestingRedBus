package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MalaysiaPage {
	public MalaysiaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Malaysia')]")
	private WebElement malaysiaLink;

	public WebElement getMalaysiaLink() {
		return malaysiaLink;
	}
	@FindBy(id = "src")
	private WebElement fromTextField;
	public WebElement getFromTextField() {
		return fromTextField;
	}
	@FindBy(xpath = "//text[text()='Kuala Lumpur (All Locations)']")
	private WebElement firstFromLocation;
	public WebElement getFirstFromLocation() {
		return firstFromLocation;
	}
	@FindBy(id = "dest")
	private WebElement toTextField;
	public WebElement getToTextField() {
		return toTextField;
	}

	@FindBy(xpath = "//text[text()='Ipoh (All Locations)']")
	private WebElement firstToLocation;
	public WebElement getFirstToLocation() {
		return firstToLocation;
	}
	public WebElement selectDate(WebDriver driver,String datemon) {
		return driver.findElement(By.xpath("//text[contains(text(),'"+datemon+"')]"));
		
	}

}
