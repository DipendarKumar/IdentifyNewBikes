package TestCases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClasses.BaseTestClass;
import Pages.LandingPage;
import Pages.LoginWithFacebookPage;
import Utilities.TestDataProvider;

public class LoginWithFacebookTestClass extends BaseTestClass{
	
	@Test(dataProvider="getFacebookLoginTestData")
	public void FacebookLoginTest(Hashtable<String, String> testData) {
		
		invokeBrowser("chrome");
		LandingPage  landingPage = openApplication();
		landingPage.clickLoginSignupButton();
		LoginWithFacebookPage facebookLogin = landingPage.clickContinueWithFacebook();
		facebookLogin.enterEmail(testData.get("Email"));
		facebookLogin.enterPassword(testData.get("Password"));
		facebookLogin.clickLoginButton();
		facebookLogin.incorrectPasswordMsg();
		
	}
	
	@DataProvider
	public Object[][] getFacebookLoginTestData(){
		return TestDataProvider.getTestData("LoginTestData.xlsx", "LoginTest", "Facebook Login");
	}

	
}
