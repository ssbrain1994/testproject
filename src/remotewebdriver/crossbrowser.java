package remotewebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossbrowser {
	WebDriver dr;

	@Test
	@Parameters("browser")
	public void verifytitle(String browsername) throws Exception{
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			dr=new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\chromedriver.exe");
			dr=new ChromeDriver();
		}
	dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Assert.assertEquals(dr.getTitle(),"Rediffmail");	
	}
}
