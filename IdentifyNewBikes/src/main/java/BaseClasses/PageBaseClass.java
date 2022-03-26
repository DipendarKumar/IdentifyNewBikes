package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class PageBaseClass {
	
	public static WebDriver driver;
	
	public PageBaseClass(WebDriver driver) {
		PageBaseClass.driver = driver;
	}
	
	public void selectDropDownValue(WebElement webElement, String value){
		try {
			Select select = new Select(webElement);
			select.selectByVisibleText(value);

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static void mouseHover(WebElement webElement) {
		Actions action = new Actions(driver);
		action.moveToElement(webElement).build().perform();
	}
	
	public void switchWindow() {
		String originalWindow = driver.getWindowHandle();


		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
	}


}
