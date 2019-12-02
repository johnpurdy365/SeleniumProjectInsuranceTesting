package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarRenewal {
	
	public WebDriver driver;
	
	By regOrPolicyField = By.id("regOrPolicyNo");
	By dateOfBirthField = By.id("dateOfBirth");
	By loginButton = By.id("btnLogin");
		
	public CarRenewal(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement regOrPolicyNumber() {
		return driver.findElement(regOrPolicyField);
	}
	
	public WebElement dateOfBirth() {
		return driver.findElement(dateOfBirthField);
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}

}
