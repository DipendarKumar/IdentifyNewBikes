package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;

public class LandingPage extends PageBaseClass {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//a[normalize-space()='New Bikes']")
	public WebElement newBikes;
	
	@FindBy(xpath = "//a[@data-track-component='navigation'][normalize-space()='Upcoming Bikes']")
	public WebElement upcomingBikes;
	

	public UpcomingBikesPage clickUpcomingBikes() {
		
		Actions action = new Actions(driver);
		action.moveToElement(newBikes).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(upcomingBikes).click().build().perform();

		return PageFactory.initElements(driver, UpcomingBikesPage.class);
	}
	
}
