package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pages.UpcomingBikesPage;
import Pages.UsedCarsPage;

public class TopMenuClass extends PageBaseClass{
	
	public WebDriver driver;
	
	public TopMenuClass(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Used Cars']")
	public WebElement usedCars;
	
	@FindBy(xpath = "//a[@data-track-component='navigation'][normalize-space()='New Bikes']")
	public WebElement newBikes;
	
	@FindBy(xpath = "//a[normalize-space()='Upcoming Bikes']")
	public WebElement upcomingBikes;
	
	public UpcomingBikesPage clickNewBikes() {
		mouseHover(newBikes);
		mouseHover(upcomingBikes);
		upcomingBikes.click();
		
		return PageFactory.initElements(driver, UpcomingBikesPage.class);
	}
	
	@FindBy(xpath = "//a[@href='/used-car/Chennai']")
	public WebElement chennai;
	public UsedCarsPage clickUsedCars() {
		mouseHover(usedCars);
		mouseHover(chennai);
		chennai.click();
		return PageFactory.initElements(driver, UsedCarsPage.class);
	}
	

}
