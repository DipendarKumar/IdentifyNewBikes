package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	static WebDriver driver;
	
	public static WebDriver getWebDriver(String browserName) {
		
		// For Chrome browser.
		if(browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		// For FireFox browser.
		else if(browserName.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Invalid Input");
		}
		return driver;
	}
	
}
