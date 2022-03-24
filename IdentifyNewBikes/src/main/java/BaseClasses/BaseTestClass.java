package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LandingPage;

public class BaseTestClass {

	public static WebDriver driver;

	public static void invokeBrowser(String browserName) {

		try {

			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
			    op.addArguments("--disable-notifications");
				driver = new ChromeDriver(op);
			} else if (browserName.equalsIgnoreCase("Mozila")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid Input");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	public static LandingPage openApplication() {

		driver.get("https://www.zigwheels.com/");
		return PageFactory.initElements(driver, LandingPage.class);

	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
