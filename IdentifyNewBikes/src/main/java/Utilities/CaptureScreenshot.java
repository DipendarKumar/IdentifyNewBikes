package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaptureScreenshot {
	
	// Capture full page screenshot.
	public static void takeFullScreenshot(WebDriver driver, String fileName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./Screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Capture particular webelement screenshot.
	public static void takeElementScreenshot(WebElement element, String fileName) {
		File File = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(File, new File("./Screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
