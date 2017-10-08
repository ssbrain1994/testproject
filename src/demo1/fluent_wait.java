package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluent_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		WebDriverWait dynamicWait;
		dynamicWait=new WebDriverWait(driver,5);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
		fWait.withTimeout(1, TimeUnit.SECONDS);
		fWait.pollingEvery(1, TimeUnit.SECONDS);
		fWait.ignoring(NoSuchElementException.class);
		fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}

}
