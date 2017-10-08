package remotewebdriver;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.URI.MalformedURIException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;
import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import demo1.takescreenshot;

public class webdriverbasic_prog {
  WebDriver driver;
  @BeforeTest
	public  void f()  throws MalformedURIException, MalformedURLException{

		DesiredCapabilities cap=new DesiredCapabilities().firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
	RemoteWebDriver rc =new RemoteWebDriver(new URL("http://192.168.0.110:1233/wd/hub"),cap);
	
	rc.get("https://www.google.com");
	
	System.out.println(rc.getTitle());
	rc.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("satya");
	}

 
}
