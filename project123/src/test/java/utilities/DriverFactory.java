package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\johnpurdy\\eclipse-workspace\\project123\\src\\test\\java\\utilities\\data.properties");

		//pass values from properties file
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		//if chrome
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","c:\\software\\chromedriver.exe");
			driver = new ChromeDriver();

		//if internet explorer	
		}else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","c:\\software\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		//if firefox	
		}else {
			System.setProperty("webdriver.gecko.driver","c:\\software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	//get screenshots on failure
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\software\\" + result + "screenshot.png"));
	}
}
