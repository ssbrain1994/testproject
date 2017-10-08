package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import javascript.javascriptexecuter;

public class javascript {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		((JavascriptExecutor)driver).executeScript("document.findelementByName('fd0').click()");

	}
}
 