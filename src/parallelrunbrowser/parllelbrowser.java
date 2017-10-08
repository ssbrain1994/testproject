package parallelrunbrowser;

import java.io.File;  
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import demo1.takescreenshot;


public class parllelbrowser {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifylogin(String browsername){
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();			
		}
		else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=fUSl-WhqymU");
		System.out.println(driver.getTitle());
		driver.quit();
		
		/* public void verifylogin(string browsername){
		 * if(browsername.equalignorecase(firefox)){
		 * System.setproperty("","");
		 * driver=new firefoxdriver();}*/
	}
}


