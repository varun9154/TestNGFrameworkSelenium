package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ReadXLSdata;
import base.BaseTest;

public class MyFirstTest extends BaseTest {
    @Test(dataProviderClass=ReadXLSdata.class,dataProvider="Zohodata")
	public static void LoginTest(String username, String password) throws InterruptedException {
    	
    	driver.get(loc.getProperty("url"));
        Thread.sleep(2000); 

        driver.findElement(By.id(loc.getProperty("email_field_id")))
              .sendKeys(username);

        driver.findElement(By.id(loc.getProperty("next_button_id"))).click();

        Thread.sleep(2000); 

        driver.findElement(By.id(loc.getProperty("password_field_id")))
              .sendKeys(password);

        driver.findElement(By.id(loc.getProperty("next_button_id"))).click();
    }
   /*@DataProvider(name="testdata")
    public Object[][] tData()
    {
		return new Object[][] {
			{"t.varunkumar1010@gmail.com","VarunHoney@24"},
			{"varun@gmail.com","VarunHoney@267"},
			{"honey@gmail.com","VarunHoney@278"},
			{"naveen@gmail.com","VarunHoney@27"}
		};
    }*/
}
