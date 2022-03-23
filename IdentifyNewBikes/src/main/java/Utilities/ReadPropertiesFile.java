package Utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
	
	// Configure for read property file.
	public static Properties readPropertyFile() throws Exception{
		FileReader reader = new FileReader("src\\main\\resources\\browsername.properties");
		
		Properties prop = new Properties();
		prop.load(reader);
		
		return prop;
	}
}
