package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClasses.PageBaseClass;

public class LoginWithGooglePage extends PageBaseClass {

	public WebDriver driver;
	
	public LoginWithGooglePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"identifierId\"]")
	public WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
	public WebElement emailNextButton;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	public WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")
	public WebElement wrongPasswordMsg;
	
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")
	public WebElement wrongEmailMsg;
	

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
	public WebElement passwordNextButton;

	
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
		
	}
	
	public void clickEmailNextButton() {
		emailNextButton.click();
	}
	
	public void enterPassword(String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		passwordField.sendKeys(password);
	}
	
	public void clickPasswordNextButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		passwordNextButton.click();
	}
	
	public void incorrectPasswordMsg() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = wrongPasswordMsg.getText();
		System.out.println(errorMsg);
	}
	
	public void incorrectEmailMsg() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = wrongEmailMsg.getText();
		System.out.println(errorMsg);
	}
	

	
}
