package demo1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gettable_data {
	
	WebDriver driver;
	 @BeforeTest
	    public void setup() throws Exception { 
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			 driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html"); 
	    } 
	 
}
