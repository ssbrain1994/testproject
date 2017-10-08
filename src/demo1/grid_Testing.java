package demo1;


import java.net.URL; 
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class grid_Testing {
public static void main(String args[]) throws Throwable{
	DesiredCapabilities cap=new DesiredCapabilities().firefox();
	cap.setBrowserName("firefox"); // chrome,iexplore
	cap.setPlatform(Platform.ANY);
	
	/*cap.setBrowserName("firefox");
	cap.setPlatform(Platform.ANY);
	cap.setJavascriptEnabled(true);
	*/

//	System.setProperty("webdriver.gecko.driver", "H:\\BowserDrivers\\geckodriver.exe");

	RemoteWebDriver rc=new RemoteWebDriver(new URL("http://192.168.0.110:1233/wd/hub"),cap);
	rc.get("https://www.google.com");
	
	System.out.println(rc.getTitle());
	
	
}
}
