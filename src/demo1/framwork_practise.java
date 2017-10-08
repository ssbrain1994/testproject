package demo1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class framwork_practise {

	
	@Test(dataProvider="WordpressData")
	public void LoginWordpress(String usernmae,String password) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(usernmae);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@DataProvider(name="wordpressdata")
	public Object[][] passData(){
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="demo";
		
		data[1][0]="bedreshubham@gmail.com";
		data[0][1]="Ssbbrain123@";
		
		data[1][0]="bedreshubham";
		data[0][1]="Ssbbrain12";
		return data;
		
		
	}
}


