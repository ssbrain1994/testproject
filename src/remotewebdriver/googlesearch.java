package remotewebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class googlesearch {

	RemoteWebDriver driver;
	@Test(dataProvider="getData")
	public void searchTest(String u, String p, String b) throws MalformedURLException{
		System.out.println("Google " + b);
		// RemoteWebdriver
		DesiredCapabilities cap = null;
				
		if(b.equals("firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox"); // chrome,iexplore
			cap.setPlatform(Platform.ANY);
		}else if (b.equals("chrome")){
			cap = DesiredCapabilities.chrome(); // no need path of chrome exe
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}else if (b.equals("iexplore")){
			cap = DesiredCapabilities.internetExplorer(); // no need path of chrome exe
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		
		// give URL of Hub+cap to remote webdriver		
		if(driver==null)
		driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys(u);
		driver.findElement(By.id("Passwd")).sendKeys(p);
		//driver.quit();
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData(){		
		Object data[][] = new Object[2][3];
		// row 1
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="chrome";		
		// row 2
		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="firefox";		
		return data;
		
	}

}
