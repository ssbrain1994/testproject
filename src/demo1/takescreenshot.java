package demo1;

import java.io.File;  
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takescreenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver ff= new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		ff.get("https://login.salesforce.com/?locale=in");

		File f1=((TakesScreenshot)ff).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("myloginscreenshot.png"));	
	}
}
