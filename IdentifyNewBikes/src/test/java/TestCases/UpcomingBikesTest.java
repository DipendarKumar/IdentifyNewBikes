package TestCases;

import BaseClasses.BaseTestClass;
import Pages.LandingPage;
import Pages.UpcomingBikesPage;

public class UpcomingBikesTest extends BaseTestClass{
	
	public static void main(String args[]) {
		BaseTestClass b = new BaseTestClass();
		b.invokeBrowser("chrome");
		LandingPage  landingpage = b.OpenApplication();
		UpcomingBikesPage upcoming = landingpage.clickUpcomingBikes();
		upcoming.selectHonda();
		upcoming.clickViewMore();
		upcoming.bikesName();
		upcoming.under4lacBikes();
	}
}
