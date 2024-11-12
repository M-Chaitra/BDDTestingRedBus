package com.stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.elementRepository.MalaysiaPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Malaysia {
	WebDriver driver = DriverFactory.getDriver();
	MalaysiaPage malaysiaPage = new MalaysiaPage(driver);
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	FileUtility fileUtility = new FileUtility();
	WebDriverUtility webDriverUtility = new WebDriverUtility();

	@When("the user clicks on Malaysia")
	public void the_user_clicks_on_malaysia() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false, malaysiaPage.getMalaysiaLink());
		malaysiaPage.getMalaysiaLink().click();
		Thread.sleep(3000);
	}

	@Then("the user navigates to Malaysia Page")
	public void the_user_navigates_to_malaysia_page() throws Exception {
		String malaysia = fileUtility.getDataFromPropertiesFiles("malaysiaurl");
		webDriverUtility.switchToTabOnUrl(driver, malaysia);
		Reporter.log("The user is able to navigate to Malaysia Bus Pages");
	}

	@Given("the user is able to enter {int} location")
	public void the_user_is_able_to_enter_location1(Integer int1) throws Exception {
		String fromLocation = fileUtility.getDataFromExcel("Malaysia", int1, 0);
		malaysiaPage.getFromTextField().sendKeys(fromLocation);
	}

	@Then("the user is able to enter {int} destination")
	public void the_user_is_able_to_enter_destination(Integer int2) throws Exception {
		malaysiaPage.getToTextField().click();
		String toLocation = fileUtility.getDataFromExcel("ToMalaysia", int2, 0);
		malaysiaPage.getFirstToLocation().click();
		//Thread.sleep(5000);
	}

	@Given("the user is able to select Date from calendar")
	public void the_user_is_able_to_select_date_from_calendar() throws InterruptedException {
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		Thread.sleep(3000);
		//act.click(malaysiaPage.selectDate(driver, "22 Nov")).click().perform();
		WebElement ele = driver.findElement(By.xpath("//text[text()='22 Nov']"));
		act.click(ele).perform();
	    //Thread.sleep(3000);
	}

}
