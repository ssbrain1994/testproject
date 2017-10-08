package remotewebdriver;

import java.net.URL; 

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class launchbrowser {
	
	DesiredCapabilities cap;
	RemoteWebDriver rd;

	@Test(dataProvider="data")
	public void login(String browser,String url) throws Throwable{
		System.out.println("login test running with browser-"+browser+", url-"+url);
		cap=new DesiredCapabilities().firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		rd=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		rd.get("http://www.seleniumhq.org/docs/04_webdriver_advanced.jsp");
		System.out.println(rd.getTitle());
		Thread.sleep(5000);
		rd.close();
		rd.quit();
	}

	@DataProvider(name="data",parallel=true)
	public Object[][] getData(){
		Object[][] obj=new Object[4][2];
		obj[0][0]="FF1";
		obj[0][1]="google";
		
		obj[1][0]="FF2";
		obj[1][1]="gmail";
		
		obj[2][0]="FF3";
		obj[2][1]="gmail";
		
		obj[3][0]="FF4";
		obj[3][1]="gmail";		
		return obj;
		}
	}
