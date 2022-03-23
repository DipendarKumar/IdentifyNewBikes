package TestCases;

import BaseClasses.BaseTestClass;
import BaseClasses.TopMenuClass;
import Pages.LandingPage;
import Pages.UpcomingBikesPage;

public class UpcomingBikesTest extends BaseTestClass {
	
	public static void main(String args[]) {
		invokeBrowser("chrome");
		LandingPage  landingpage = openApplication();
		TopMenuClass topMenu = landingpage.getTopMenu();
		UpcomingBikesPage upcoming = topMenu.clickNewBikes();
		upcoming.selectHonda();
		upcoming.clickViewMore();
		upcoming.bikesName();
		upcoming.under4lacBikes();
	}
}
