 package datadrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib_ddf.exceldataconfig;

public class loginexcel {
	WebDriver driver;
	@Test(dataProvider="rediff")
	public void loginrediffmail(String username,String password) throws Exception{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(2000);	
		/*driver.getTitle();*/
		/*Assert.assertTrue(driver.getTitle().contains("dashboard"));*/
		
			
	}
	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
	}
	@DataProvider(name="rediff")
	public Object [][] passData()
	{
		
		
			exceldataconfig config=new exceldataconfig ("C:\\Users\\shubham\\workspace\\seliniumdemo\\testdata\\input.xlsx");
		int row=config.getrowcount(0);
		Object [][] data =new Object[row][2];
		for(int i=0;i<row;i++)
		{
			data[i][0]=config.getdata(0, i, 0);
			data[i][1]=config.getdata(0, i, 1);
			
		}
				return passData();
	}
}
