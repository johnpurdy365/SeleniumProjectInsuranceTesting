package project123;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CarQuote;
import pageObjects.LandingPage;
import utilities.DriverFactory;

public class CarTest extends DriverFactory{
	
	private LandingPage lp;
	private CarQuote cq;
	private String url = "url";
	private String carReg = "06rn1672";
	private String firstName = "John";
	private String secondName = "Purdy";
	private String email = "jp@gmail.com";
	private String phoneNumber = "0871234569";
	private String dateOfBirth = "14-12-1984";
	private String jobTitle = "Business Analyst";
	private String eirCode = "D10 K230";

	@BeforeTest
	public void homePageNavigation() throws IOException {
		utilities.DriverFactory.initializeDriver();
		utilities.DriverFactory.driver.get(prop.getProperty(url));
		lp =  new LandingPage(driver);
		lp.getQuote().click();
	}
	
	//navigate to home quote page and get page title
	@Test(priority = 1)
	public void navigateToCarQuotePage() {
		lp = new LandingPage(driver);
		lp.carQuote().click();
		System.out.println("Current page title = " + driver.getTitle());
	}
	
	//fill out the form details
	@Test(priority = 2)
	public void carQuote() throws InterruptedException {
		cq = new CarQuote(driver);

		//click standard insurance option
		cq.standardInsurance().click();

		//click comprehensive cover option
		cq.compCover().click();

		//choose policy start date, month and year
		Select startDate = new Select(cq.policyStartDate());
		startDate.selectByVisibleText("27");
		Select monthYear = new Select(cq.policyMonthYear());
		monthYear.selectByIndex(2);

		//select driving experience
		Select drivingExperience = new Select(cq.driversExperience());
		drivingExperience.selectByValue("string:NCB");
		cq.noYearsExp().click();

		//claims details
		cq.noClaims().click();

		//car details
		cq.registration().sendKeys(carReg);
		cq.carFinder().click();

		//Need to tidy up later
		driver.findElement(By.id("security")).click();
		driver.findElement(By.xpath("//div[@id='securityWrap']//option[4]")).click();

		Select mileage = new Select(cq.carMiles());
		mileage.selectByValue("string:10000");

		Select carValue = new Select(cq.vehicleValue());
		carValue.selectByIndex(3);

		cq.carUsage().click();

		Select monthBought = new Select(cq.monthPurchased());
		monthBought.selectByIndex(3);
		Select yearBought = new Select(cq.yearPurchased());
		yearBought.selectByIndex(6);

		//driving history
		Select licenceType = new Select(cq.licenceType());
		licenceType.selectByValue("string:D");

		cq.countryTest().click();

		Select licenceHeld = new Select(cq.licenceYearsHeld());
		licenceHeld.selectByValue("string:5");

		cq.points().click();
		cq.noConvictions().click();
		cq.noMedicalConditions().click();

		//about you
		Select personTitle = new Select(cq.personalTitle());
		personTitle.selectByValue("string:MR");
		cq.forename().sendKeys(firstName);
		cq.surname().sendKeys(secondName);
		cq.emailAddress().sendKeys(email);
		cq.phone().sendKeys(phoneNumber);

		cq.birthDate().clear();
		cq.birthDate().sendKeys(dateOfBirth);
		Thread.sleep(2000);
		cq.birthDate().sendKeys(Keys.TAB);

		Select empStatus = new Select(cq.jobStatus());
		empStatus.selectByValue("string:01");

		Thread.sleep(2000);
		cq.selectOccupation().click();
		Thread.sleep(2000);
		
		cq.selectPosition().sendKeys(jobTitle);
		Thread.sleep(2000);
		cq.selectPosition().sendKeys(Keys.ARROW_DOWN);
		cq.selectPosition().sendKeys(Keys.ENTER);
		
		cq.proposersAddress().clear();
		cq.proposersAddress().sendKeys(eirCode);
		Thread.sleep(2000);
		cq.proposersAddress().sendKeys(Keys.ARROW_DOWN);
		cq.proposersAddress().sendKeys(Keys.ENTER);

		cq.ownHome().click();
		cq.additionalPolicies().click();

		//additional driver
		cq.noAdditionalDriver().click();
		cq.disclosureAcceptance().click();
		cq.dataAcceptance().click();
		
		//cq.submitButton().click();
		Thread.sleep(2000);
		cq.submitButton().click();
		Thread.sleep(5000);
		WebElement textElement = driver.findElement(By.id("btnEditDetails"));
		String expectedText = textElement.getText();
		String actualText = "Edit your Details";
		Assert.assertEquals(actualText, expectedText);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}



}
