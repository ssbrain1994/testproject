package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitewait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		WebDriverWait dynamicWait;
		dynamicWait=new WebDriverWait(driver,5);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");

		
		//org.openqa.selenium.TimeoutException
		dynamicWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='js-switch__option']/div[2]/label")));
		
		
		boolean disStatus=driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).isDisplayed();
		System.out.println(disStatus);
		
	}

}
