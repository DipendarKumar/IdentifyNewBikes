package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LandingPage;


public class PageBaseClass extends BaseTestClass  {
	
	public WebDriver driver;
	
	public PageBaseClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage OpenApplication() {

		driver.get("https://www.zigwheels.com/");
		return PageFactory.initElements(driver, LandingPage.class);

	}
}
