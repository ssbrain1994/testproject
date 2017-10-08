package remotewebdriver;

import org.openqa.selenium.By;  
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import java.net.URL;
public class Browserstack {
	public static final String USERNAME = "shubhambedre1";
	  public static final String AUTOMATE_KEY = "G9XPRxZCGSawZhSF4GRK";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	   caps.setPlatform(Platform.MAC);
	  
	   caps.setCapability("device", "iPhone 5");
	    caps.setCapability("browserstack.debug", "true");
	    
	    

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("Shubham bedre");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
	  }
}
