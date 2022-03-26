package TestCases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClasses.BaseTestClass;
import Pages.LandingPage;
import Pages.LoginWithGooglePage;
import Utilities.TestDataProvider;

public class LoginWithGoogleTestClass extends BaseTestClass{

	@Test(dataProvider="getGoogleLoginTestData")
	public void GoogleLoginTest(Hashtable<String, String> testData) {
		
		invokeBrowser("chrome");
		LandingPage  landingPage = openApplication();
		landingPage.clickLoginSignupButton();
		LoginWithGooglePage googleLogin = landingPage.clickContinueWithGoogle();
		googleLogin.enterEmail(testData.get("Email"));
		googleLogin.clickEmailNextButton();
		googleLogin.enterPassword(testData.get("Password"));
		googleLogin.clickPasswordNextButton();
		googleLogin.incorrectEmailMsg();
	}
	
	@DataProvider
	public Object[][] getGoogleLoginTestData(){
		return TestDataProvider.getTestData("LoginTestData.xlsx", "LoginTest", "Google Login");
	}
			
}
