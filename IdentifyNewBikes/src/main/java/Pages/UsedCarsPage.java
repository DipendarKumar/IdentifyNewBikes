package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class UsedCarsPage extends PageBaseClass{
	
	public WebDriver driver;
	public TopMenuClass topMenu;
	public UsedCarsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		topMenu = PageFactory.initElements(driver, TopMenuClass.class);
	}
	
	@FindBy(xpath = "//div[@class='gsc_thin_scroll']/ul/li/label")
	public List<WebElement> popularModels;
	
	public ArrayList<String> getPopularModels() {
		
		ArrayList<String> models = new ArrayList<String>();
		
		for(WebElement model : popularModels) {
			models.add(model.getText());
		}
		
		return models;
	}
	
	

}
