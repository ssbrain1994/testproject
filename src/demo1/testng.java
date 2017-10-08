package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng {
	WebDriver  driver;
	@Test
	@Parameters("browser")
	public void verifyTitle(String BrowserName){
		if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();



	}
}
