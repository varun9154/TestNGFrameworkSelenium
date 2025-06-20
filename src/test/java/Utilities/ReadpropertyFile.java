package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\tvaru\\TestNgFrame-workspace\\TestNgSelenium\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		p.load(fr);
        
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}
}
