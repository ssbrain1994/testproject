package demo1;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class checkbox {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );*/
		driver.get("https://login.salesforce.com/?locale=in");
		
		//click on checkbox
		WebElement loginCheckbox=null;
		loginCheckbox=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		System.out.println("before-"+loginCheckbox.isSelected());
		loginCheckbox.click();

		System.out.println("after-"+loginCheckbox.isSelected());
		//click on same checkbox 
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		
		/*@Test
	public void navigationForwardExample() throws Throwable
	{
		System.property("webdriver.gecko.driver","path");
		webdriver dr=new firefoxdriver();
		dr.navigate().to("");
		actions act=new actions(dr);
		act.keydown(keys.control).sendkeys(keys.f5).perform();
	}
		 */


		/*@Test
		public void testRefreshPage() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			driver= new FirefoxDriver();
			driver.navigate().to("http://www.google.co.in");
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		}*/


	}

}


