package TestCases;

import java.util.ArrayList;

import org.testng.annotations.Test;

import BaseClasses.BaseTestClass;
import BaseClasses.TopMenuClass;
import Pages.LandingPage;
import Pages.UpcomingBikesPage;
import Utilities.WriteExcelFile;

public class UpcomingBikesTest extends BaseTestClass {
	
	@Test
	public void upcomingBikesTest() {
		invokeBrowser("chrome");
		LandingPage  landingPage = openApplication();
		landingPage.clickLoginClose();
		TopMenuClass topMenu = landingPage.getTopMenu();
		UpcomingBikesPage upcoming = topMenu.clickNewBikes();
		upcoming.selectHonda();
		upcoming.clickViewMore();
		ArrayList<String[]> bikesDetails= upcoming.underFourLakhBikes();
		WriteExcelFile.writeBikesDetails(bikesDetails);
		closeBrowser();
	}
}
