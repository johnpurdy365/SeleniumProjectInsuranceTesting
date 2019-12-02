package project123;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomeQuote;
import pageObjects.LandingPage;
import utilities.DriverFactory;

public class HomeTest extends DriverFactory{

	private LandingPage lp;
	private HomeQuote hq;
	private String url = "url";
	private String eirCode = "D24 Y4X7";
	private String firstName = "John";
	private String secondName = "Purdy";
	private String email = "jp@gmail.com";
	private String phoneNumber = "0871234567";
	private String expectedText = "Your Home Insurance Quote";

	
	@BeforeTest
	public void homePageNavigation() throws IOException {
		utilities.DriverFactory.initializeDriver();
		utilities.DriverFactory.driver.get(prop.getProperty(url));
		lp =  new LandingPage(driver);
		lp.getQuote().click();
	}

	//navigate to home quote page and get page title
	@Test(priority = 1)
	public void navigateToHomeQuotePage() {
		lp = new LandingPage(driver);
		lp.homeQuote().click();
		System.out.println("Current page title = " + driver.getTitle());
	}

	//fill out the form details
	@Test(priority = 2)
	public void homeQuote() throws InterruptedException, IOException {
		
		//about your property section
		hq = new HomeQuote(driver);
		hq.ownProperty().click();

		hq.liveInProperty().click();

		Select propertyType = new Select(hq.propertyType());
		propertyType.selectByValue("string:Semi-Detached");

		Select propertyBuilt = new Select(hq.propertyBuilt());
		propertyBuilt.selectByValue("string:1960:1979");

		Select yearBuilt = new Select(hq.yearBuilt());
		yearBuilt.selectByIndex(3);

		Select numOfBeds = new Select(hq.noOfBedrooms());
		numOfBeds.selectByValue("string:3");

		Select heatingType = new Select(hq.heatingType());
		heatingType.selectByVisibleText("Electric & Fire");

		hq.standardAlarm().click();

		hq.smokeDetectors().click();

		hq.homeAddress().click();
		hq.homeAddress().sendKeys(eirCode);

		Thread.sleep(2000);

		hq.homeAddress().sendKeys(Keys.ARROW_DOWN);
		hq.homeAddress().sendKeys(Keys.ENTER);

		//about your cover
		Select claimsFree = new Select(hq.claimsFreeYears());
		claimsFree.selectByValue("string:0");

		Select rebuildCost = new Select(hq.rebuildCost());
		rebuildCost.selectByValue("string:160000");

		Select contents = new Select(hq.contentsCover());
		contents.selectByValue("string:15000");

		Select inceptionDay = new Select(hq.inceptionDay());
		inceptionDay.selectByIndex(7);

		Select inceptionMonth = new Select(hq.inceptionMonth());
		inceptionMonth.selectByIndex(2);

		hq.excessAmount().click();

		//about you
		Select title = new Select(hq.selectTitle());
		title.selectByValue("string:mr");

		hq.firstName().sendKeys(firstName);
		hq.surname().sendKeys(secondName);
		hq.emailAddress().sendKeys(email);
		hq.phoneNumber().sendKeys(phoneNumber);

		Select birthDay = new Select(hq.birthDay());
		birthDay.selectByValue("string:14");

		Select birthMonth = new Select(hq.birthMonth());
		birthMonth.selectByValue("string:12");

		Select birthYear = new Select(hq.birthYear());
		birthYear.selectByValue("string:1984");

		hq.noOtherPolicies().click();
		hq.disclosureAcceptance().click();
		hq.dataAcceptance().click();
		hq.submitButton().click();

		String actualText = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("comprehensive_title"))).getText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
