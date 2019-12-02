package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeQuote {
	
	public WebDriver driver;
	
	//define WebElements
	By ownPropButton = By.id("propOwnedBy0");
	By liveInPropButton = By.id("propOccupiedBy0");
	By propTypeButton = By.id("propertyType");
	By propBuiltButton = By.id("yearPropertyGrpBuilt");
	By yearBuiltButton = By.id("yearBuilt");
	By bedroomsButtom = By.id("bedrooms");
	By typeOfHeating = By.id("heatingType");
	By standardAlarmButton = By.id("alarm1");
	By smokeDetectorsButton = By.id("smoke0");
	By homeAddressField = By.cssSelector("#proposerAddress");
	By claimsFree = By.id("noClaimsYears");
	By rebuildCostTab = By.id("buildingsSI");
	By contentsCoverTab = By.id("contentsSI");
	By inceptionDayTab = By.id("inceptionDate");
	By inceptionMonthTab = By.id("inceptionDateMonth");
	By excessButton = By.id("excess1");
	By titleDropdown = By.id("title");
	By firstNameTab = By.id("firstName");
	By surnameTab = By.id("surName");
	By emailTab = By.id("email");
	By phoneNumberTab = By.id("phone");
	By birthDayDropdown = By.id("birthDay");
	By birthMonthDropdown = By.id("birthMonth");
	By birthYearDropdown = By.id("birthYear");
	By noOtherPoliciesButton = By.id("hasOtherPolicies1");
	By disclosureCheckbox = By.id("termsCheckbox");
	By dataProtectionCheckbox = By.id("dataProtectionStatementCheckbox");
	By getQuoteButton = By.id("btnQuote");
	
	public HomeQuote(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement ownProperty() {
		return driver.findElement(ownPropButton);
	}
	
	public WebElement liveInProperty() {
		return driver.findElement(liveInPropButton);
	}
	
	public WebElement propertyType() {
		return driver.findElement(propTypeButton);
	}
	
	public WebElement propertyBuilt() {
		return driver.findElement(propBuiltButton);
	}
	
	public WebElement yearBuilt() {
		return driver.findElement(yearBuiltButton);
	}
	
	public WebElement noOfBedrooms() {
		return driver.findElement(bedroomsButtom);
	}
	
	public WebElement heatingType() {
		return driver.findElement(typeOfHeating);
	}
	
	public WebElement standardAlarm() {
		return driver.findElement(standardAlarmButton);
	}
	
	public WebElement smokeDetectors() {
		return driver.findElement(smokeDetectorsButton);
	}
	
	public WebElement homeAddress() {
		return driver.findElement(homeAddressField);
	}
	
	public WebElement claimsFreeYears() {
		return driver.findElement(claimsFree);
	}
	
	public WebElement rebuildCost() {
		return driver.findElement(rebuildCostTab);
	}
	
	public WebElement contentsCover() {
		return driver.findElement(contentsCoverTab);
	}
	
	public WebElement inceptionDay() {
		return driver.findElement(inceptionDayTab);
	}
	
	public WebElement inceptionMonth() {
		return driver.findElement(inceptionMonthTab);
	}
	
	public WebElement excessAmount() {
		return driver.findElement(excessButton);
	}
	
	public WebElement selectTitle() {
		return driver.findElement(titleDropdown);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstNameTab);
	}
	
	public WebElement surname() {
		return driver.findElement(surnameTab);
	}
	
	public WebElement emailAddress() {
		return driver.findElement(emailTab);
	}
	
	
	public WebElement phoneNumber() {
		return driver.findElement(phoneNumberTab);
	}
	
	public WebElement birthDay() {
		return driver.findElement(birthDayDropdown);
	}
	
	public WebElement birthMonth() {
		return driver.findElement(birthMonthDropdown);
	}
	
	public WebElement birthYear() {
		return driver.findElement(birthYearDropdown);
	}
	
	public WebElement noOtherPolicies() {
		return driver.findElement(noOtherPoliciesButton);
	}
	
	public WebElement disclosureAcceptance() {
		return driver.findElement(disclosureCheckbox);
	}
	
	public WebElement dataAcceptance() {
		return driver.findElement(dataProtectionCheckbox);
	}
	
	public WebElement submitButton() {
		return driver.findElement(getQuoteButton);
	}

}
