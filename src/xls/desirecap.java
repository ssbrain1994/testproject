package xls;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;
import com.sun.jna.platform.FileUtils;

import demo1.takescreenshot;
import remotewebdriver.webdriverbasic_prog;

public class desirecap {
	@Test
	public void testgrid() throws IOException{
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.XP);
		URL url=new URL("http://192.168.1.109:4444/wd/hub/");
		WebDriver dr=new RemoteWebDriver(url,cap);
		dr.get("www.google.co.in");
	/*	DesiredCapabilities cap1=DesiredCapabilities.chrome();
		cap1.setBrowserName("chrome");
		cap1.setPlatform(Platform.ANY);
		URL url1=new URL("");
		WebDriver dr1=new RemoteWebDriver(url1,cap);
		dr1.get("www.google.com");
	*/

		
	}
}
