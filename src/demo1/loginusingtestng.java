package demo1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginusingtestng {
	public WebDriver driver;
	@Test
	public void main(){
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys("shubham123");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("shubham123");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		System.out.println("login successfully");
	}

	@BeforeMethod
	public void beforemethode(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}

	
}

