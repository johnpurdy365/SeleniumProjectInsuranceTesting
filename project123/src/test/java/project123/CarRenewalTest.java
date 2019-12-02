package project123;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.CarRenewal;
import pageObjects.LandingPage;
import utilities.DriverFactory;

public class CarRenewalTest extends DriverFactory {

	private LandingPage lp;
	private CarRenewal cr;
	private String pageTitle = "Renew your Car Insurance Online with 123.ie";


	@BeforeTest
	public void homePageNavigation() throws IOException {
		utilities.DriverFactory.initializeDriver();
		utilities.DriverFactory.driver.get(prop.getProperty("url"));
		lp = new LandingPage(driver);
		lp.renewPolicy().click();
	}

	//navigate to car renewal page and get page title
	@Test(priority=1)
	public void carRenewal() {

		//navigate to car renewal page
		lp = new LandingPage(driver);
		lp.carRenewal().click();
		System.out.println("Current page title = " + driver.getTitle());
	}

	//test the page title is correct
	@Test(priority=2)
	public void pageTitle() {
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}

	//test policy number field
	@Test(priority=3)
	public void carRenewalPolicyNumberField() {
		cr = new CarRenewal(driver);
		Assert.assertTrue(cr.regOrPolicyNumber().isDisplayed());
		Assert.assertTrue(cr.regOrPolicyNumber().isEnabled());
	}

	//test date of birth field
	@Test(priority=4)
	public void carRenewalDateOfBirthField() {
		cr = new CarRenewal(driver);
		Assert.assertTrue(cr.dateOfBirth().isDisplayed());
		Assert.assertTrue(cr.dateOfBirth().isEnabled());
	}

	//test login button
	@Test(priority=5)
	public void carRenewalLoginButton() {
		cr = new CarRenewal(driver);
		Assert.assertTrue(cr.loginButton().isDisplayed());
		Assert.assertTrue(cr.loginButton().isEnabled());
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
