package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;
import BaseClasses.TopMenuClass;

public class LandingPage extends PageBaseClass {

	public WebDriver driver;
	public TopMenuClass topMenu;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		topMenu = PageFactory.initElements(driver, TopMenuClass.class);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[@id='forum_login_wrap_lg']")
	public WebElement loginSignup;

	public void clickLoginSignupButton() {
		loginSignup.click();
	}
	
	public TopMenuClass getTopMenu() {
		return topMenu;
	}
	
	
	
}
