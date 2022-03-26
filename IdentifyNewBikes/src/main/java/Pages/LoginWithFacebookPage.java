package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClasses.PageBaseClass;

public class LoginWithFacebookPage extends PageBaseClass{
	
	public WebDriver driver;
	
	public LoginWithFacebookPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"pass\"]")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@name=\"login\"]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"error_box\"]/div[1]")
	public WebElement incorrectPasswordMsg;
	
	@FindBy(xpath = "//*[@id=\"error_box\"]/div[1]")
	public WebElement incorrectEmailMsg;
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void incorrectEmailMsg() {
		String errorMsg = incorrectEmailMsg.getText();
		System.out.println(errorMsg);
	}
	
	public void incorrectPasswordMsg() {
		String errorMsg = incorrectPasswordMsg.getText();
		System.out.println(errorMsg);
	}
}
