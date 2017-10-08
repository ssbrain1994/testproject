package remotewebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class googlesearchprog {
	WebDriver driver;
	@BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("www.google.com");
	}
	@Test(dataProvider="SearchProvider")
	public void test(String author,String searchkey) throws InterruptedException{
		{
			WebElement searchtext=driver.findElement(By.xpath(".//*[@id='Register']"));
			searchtext.sendKeys("shubham ");
			System.out.println("welcom"+author+"you search key"+searchkey);
			Thread.sleep(3000);

			String testValue = searchtext.getAttribute("value");

			System.out.println(testValue +"::::"+searchkey);

			searchtext.clear();

			//Verify if the value in google search box is correct

			Assert.assertTrue(testValue.equalsIgnoreCase(searchkey));

		}
	}

	 @DataProvider(name="SearchProvider")

	    public Object[][] getDataFromDataprovider(){

	        return new Object[][] {

	                { "Guru99", "India" },

	                { "Krishna", "UK" },

	                { "Bhupesh", "USA" }

	            };
	 }

}
