package datadrivenframework;

import java.sql.Driver;  
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@Test(dataProvider="rediff")
	public void loginrediffmail(String username,String password) throws InterruptedException{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(2000);	
		/*driver.getTitle();*/
		Assert.assertTrue(driver.getTitle().contains("Rediffmail"));
	}

	@DataProvider(name="rediff")
	public Object [][] passData()
	{
		Object [][] data =new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";

		data[1][0]="admin2";
		data[1][1]="demo2";

		data[2][0]="admin3";
		data[2][1]="demo3";
		return passData();
	}
}
