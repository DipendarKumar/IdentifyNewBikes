package Pages;

import java.util.ArrayList;
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

/*
	@FindBy(xpath = "//div[@id='carModels']//strong")
	public List<WebElement> namelist;
	
	public void bikesName() {
		System.out.println("ALL UPCOMING BIKES");
		for(WebElement name : namelist) {
			System.out.println(name.getText());
		}
	}
*/
	@FindBy(xpath="//ul[@id=\"modelList\"]//li[@data-price]")
	public List<WebElement> prices;
	
	@FindBy(xpath="//ul[@id='modelList']//li[@data-price]//a")
	public List<WebElement> names;
	
	@FindBy(xpath = "//ul[@id='modelList']/li[@data-price]/div[1]/div[3]/div[2]")
	public List<WebElement> launchDates;
	
	public ArrayList<String[]> underFourLakhBikes() {

		ArrayList<String []> bikesDetails = new ArrayList<String []>();

		for(int i=0; i<prices.size(); i++ ) {
			
			if(Integer.parseInt(prices.get(i).getAttribute("data-price")) < 400000) {
				
				String details[] = new String[3];
				details[0] = names.get(i).getAttribute("title");
				details[1] = prices.get(i).getAttribute("data-price");
				details[2] = launchDates.get(i).getText().substring(14);
				bikesDetails.add(details);
				
			}
		}
		
		return bikesDetails;
	}
	

	
	
	
}
