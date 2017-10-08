package remotewebdriver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import demo1.firefox;

public class crossbrowser2 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser)throws MalformedURLException {
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("firefox is running ");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			driver= new FirefoxDriver();

		}else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome is running now curently");
			System.setProperty("chromedriver", "C:\\Users\\shubham\\Desktop\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	}
}

