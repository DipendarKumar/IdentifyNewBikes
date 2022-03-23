package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import BaseClasses.PageBaseClass;

public class UpcomingBikesPage extends PageBaseClass {

	public WebDriver driver;
	
	public UpcomingBikesPage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//select[@id='makeId']")
	public WebElement manufacture;
	
	public void selectHonda() {

		selectDropDownValue(manufacture,"Honda");
		
	}
	
	@FindBy(xpath = "//span[contains(text(),'View More Bikes')]")
	public WebElement viewMore;
	
	public void clickViewMore() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(viewMore).click().build().perform();

	}
	
	@FindBy(xpath = "//div[@id='carModels']//strong")
	public List<WebElement> namelist;
	
	public void bikesName() {
		System.out.println("ALL UPCOMING BIKES");
		for(WebElement name : namelist) {
			System.out.println(name.getText());
		}
	}
	
	@FindBy(xpath="//ul[@id=\"modelList\"]//li[@data-price]")
	public List<WebElement> prices;
	
	@FindBy(xpath="//ul[@id='modelList']//li[@data-price]//a")
	public List<WebElement> names;
	
	@FindBy(xpath = "//ul[@id='modelList']/li[@data-price]/div[1]/div[3]/div[2]")
	public List<WebElement> launchDates;
	
	public void under4lacBikes() {

		System.out.println("BIKES UNDER 4LAKH");
		for(int i=0; i<prices.size(); i++ ) {
			if(Integer.parseInt(prices.get(i).getAttribute("data-price")) < 400000) {
				
				System.out.println(names.get(i).getAttribute("title") + " || " + prices.get(i).getAttribute("data-price") + " || "+ launchDates.get(i).getText());
			}
		}
	}
	
	
	
}
