package expliandimplicite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {
	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		//explicit wait
		WebDriverWait dynamicWait;
		dynamicWait=new WebDriverWait(driver,15);


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("http://www.americangolf.co.uk/");

		Actions a=new Actions(driver);

	/*	WebElement golfClubMenu=*/driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a")).click();
				
			WebElement web1=driver.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[2]/ul/li[1]/a/span[1]"));
			WebElement web2= driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			a.moveToElement(web2).perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			a.click(web1);
			
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(web1));
			
			
		/*//Thread.sleep(5000);
		a.moveToElement(golfClubMenu).perform();

		dynamicWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='CLUBS_1']/ul/li[2]/ul/li[1]/a/span[1]")));


		driver.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[2]/ul/li[1]/a/span[1]")).click();
*/
	}
}
