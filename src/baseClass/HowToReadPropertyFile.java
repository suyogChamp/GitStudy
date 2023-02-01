package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HowToReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
    // create object of properties
		Properties prop=new Properties();
	// create file and send path of propertyFile
		FileInputStream myFile=new FileInputStream("C:\\Users\\user\\Desktop\\suyog\\SeleniumStudy\\myProperty.properties");
	// load
		prop.load(myFile);
	    
		String value=prop.getProperty("url");
		System.out.println(value);
	    System.out.println(prop.getProperty("mobileNum"));
	}

}
