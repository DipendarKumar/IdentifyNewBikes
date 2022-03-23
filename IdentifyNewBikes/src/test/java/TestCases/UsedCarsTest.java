package TestCases;

import BaseClasses.BaseTestClass;
import BaseClasses.TopMenuClass;
import Pages.LandingPage;
import Pages.UsedCarsPage;

public class UsedCarsTest extends BaseTestClass{

	public static void main(String args[]) {
		invokeBrowser("chrome");
		LandingPage  landingPage = openApplication();
		TopMenuClass topMenu = landingPage.getTopMenu();
		UsedCarsPage usedCars = topMenu.clickUsedCars();
		usedCars.getPopularModels();
		
	}
}
