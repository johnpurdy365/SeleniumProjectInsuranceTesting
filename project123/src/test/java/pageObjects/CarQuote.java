package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarQuote {
	
	public WebDriver driver;
	
	//define WebElements
	By standarnIns= By.id("preferredInsurance0");
	By youngIns = By.id("preferredInsurance1");
	By comprehensiveCover = By.id("preferredCover0");
	By policyStart = By.id("policyStartDay");
	By policyMonthYear = By.id("policyStartMonthYear");
	By experience = By.id("drivingExperienceType");
	By yearsExp = By.id("experienceYears5");
	By claims = By.id("hasClaims1");
	By regNo = By.id("registration");
	By carLookup = By.id("carLookupButton");
	
	By miles = By.id("mileage");
	By value = By.id("valueOfCar");
	By usage = By.id("classOfUse0");
	By monthPurchased = By.id("vehiclePurchaseMonth");
	By yearPurchased = By.id("vehiclePurchaseYear");
	By licence = By.id("licenceType");
	By licenceYears = By.id("yearsHeld");
	By testCountry = By.id("drivingTestPassedIEUK0");
	By penaltyPoints = By.id("hasPenaltyPoints1");
	By convictions = By.id("hasConvictions1");
	By medicalConditions = By.id("medicalCondition1");
	By title = By.id("title");
	By firstName = By.id("firstname");
	By secondName = By.id("surname");
	By email = By.id("email");
	By phoneNumber = By.id("phoneNumber");
	By dateOfBirth = By.id("dateOfBirth");
	By employmentStatus = By.id("employmentStatus");
	By occupation = By.xpath("//span[@class='custom-combobox']");
	By position = By.xpath("//span[@class='custom-combobox']/input[1]");
	By address = By.id("proposerAddress");
	By homeOwner = By.id("homeOwner1");
	By otherPolicies = By.id("hasOtherPolicies1");
	By additionalDriver = By.id("hasAdditionalDrivers1");
	By acceptDisclosure = By.id("chkPerm");
	By acceptData = By.id("chkDataProtectionStatement");
	By submit = By.id("btnQuote");

	public CarQuote(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement standardInsurance () {
		return driver.findElement(standarnIns);
	}
	
	public WebElement youngDriverIns() {
		return driver.findElement(youngIns);
	}
	
	public WebElement compCover() {
		return driver.findElement(comprehensiveCover);
	}
	
	public WebElement policyStartDate() {
		return driver.findElement(policyStart);
	}
	
	public WebElement policyMonthYear() {
		return driver.findElement(policyMonthYear);
	}
	
	public WebElement driversExperience() {
		return driver.findElement(experience);
	}
	
	public WebElement noYearsExp() {
		return driver.findElement(yearsExp);
	}
	
	public WebElement noClaims() {
		return driver.findElement(claims);
	}
	
	public WebElement registration() {
		return driver.findElement(regNo);
	}
	
	public WebElement carFinder() {
		return driver.findElement(carLookup);
	}
	
	public WebElement carMiles() {
		return driver.findElement(miles);
	}
	
	public WebElement vehicleValue() {
		return driver.findElement(value);
	}
	
	public WebElement carUsage() {
		return driver.findElement(usage);
	}
	
	public WebElement monthPurchased() {
		return driver.findElement(monthPurchased);
	}
	
	public WebElement yearPurchased() {
		return driver.findElement(yearPurchased);
	}
	
	public WebElement licenceType() {
		return driver.findElement(licence);
	}
	
	public WebElement licenceYearsHeld() {
		return driver.findElement(licenceYears);
	}
	
	public WebElement countryTest() {
		return driver.findElement(testCountry);
	}
	
	public WebElement points() {
		return driver.findElement(penaltyPoints);
	}
	
	public WebElement noConvictions() {
		return driver.findElement(convictions);
	}
	
	public WebElement noMedicalConditions() {
		return driver.findElement(medicalConditions);
	}
	
	public WebElement personalTitle() {
		return driver.findElement(title);
	}
	
	public WebElement forename() {
		return driver.findElement(firstName);
	}
	
	public WebElement surname() {
		return driver.findElement(secondName);
	}
	
	public WebElement emailAddress() {
		return driver.findElement(email);
	}
	
	public WebElement phone() {
		return driver.findElement(phoneNumber);
	}
	
	public WebElement birthDate() {
		return driver.findElement(dateOfBirth);
	}
	
	public WebElement jobStatus() {
		return driver.findElement(employmentStatus);
	}
	
	public WebElement selectOccupation() {
		return driver.findElement(occupation);
	}
	
	public WebElement selectPosition() {
		return driver.findElement(position);
	}
	
	public WebElement proposersAddress() {
		return driver.findElement(address);
	}
	
	public WebElement ownHome() {
		return driver.findElement(homeOwner);
	}
	
	public WebElement additionalPolicies() {
		return driver.findElement(otherPolicies);
	}
	
	public WebElement noAdditionalDriver() {
		return driver.findElement(additionalDriver);
	}
	
	public WebElement disclosureAcceptance() {
		return driver.findElement(acceptDisclosure);
	}
	
	public WebElement dataAcceptance() {
		return driver.findElement(acceptData);
	}
	
	public WebElement submitButton() {
		return driver.findElement(submit);
	}

}
