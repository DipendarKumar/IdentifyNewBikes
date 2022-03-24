package TestCases;

import java.util.ArrayList;

import org.testng.annotations.Test;

import BaseClasses.BaseTestClass;
import BaseClasses.TopMenuClass;
import Pages.LandingPage;
import Pages.UsedCarsPage;
import Utilities.WriteExcelFile;

public class UsedCarsTest extends BaseTestClass{

	@Test
	public void usedCarsTest() {
		invokeBrowser("chrome");
		LandingPage  landingPage = openApplication();
		landingPage.clickLoginClose();
		TopMenuClass topMenu = landingPage.getTopMenu();
		UsedCarsPage usedCars = topMenu.clickUsedCars();
		ArrayList<String> models = usedCars.getPopularModels();
		WriteExcelFile.writePopularModels(models);
		closeBrowser();
		
	}
}
