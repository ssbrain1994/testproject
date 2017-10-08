package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class firstprog_using_testng {
	
public static String baseurl="http://newtours.demoaut.com/";
public static WebDriver driver;

	@BeforeTest
public void  setbaseurl(){
	driver=new FirefoxDriver();
	driver.get(baseurl);	
}
	@Test
public void verifyhomepagetitle(){
	String expectedtitle="Welcome: Mercury tours";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
}
	@AfterTest
	public void endsession(){
		driver.quit();
	}
}