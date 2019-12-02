package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By getQ = By.xpath("//a[@class='is-active'][contains(text(),'Get a Quote')]");
	By renewP = By.xpath("//a[@class='is-active'][contains(text(),'Renew Policy')]");
	By renewC = By.xpath("//li[@class='js-active']//ul//li//a[contains(text(),'Car Insurance')]");
	By homeQ = By.linkText("Home Insurance");
	By carQ = By.linkText("Car Insurance");
	
	//create constructor
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//get quote on nav bar
	public WebElement getQuote() {
		return driver.findElement(getQ);
	}
	
	//get car quote on nav bar
	public WebElement carQuote() {
		return driver.findElement(carQ);
	}
	
	//renew policy on nav bar
	public WebElement renewPolicy() {
		return driver.findElement(renewP);
	}
	
	//renew car insurance under renew policy
	public WebElement carRenewal() {
		return driver.findElement(renewC);
	}
	
	//get home insurance quote under get quote
	public WebElement homeQuote() {
		return driver.findElement(homeQ);
	}

}
