package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver ff= new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		ff.get("https://login.salesforce.com/?locale=in");
		
		try {
			System.out.println("start");
			ff.findElement(By.xpath("//*[@id='usernamexxxx']")).sendKeys("user1");
			
		}catch (NoSuchElementException e) {
			System.out.println("end");
			ff.findElement(By.xpath("//*[@id='username']")).sendKeys("user1");		
		} catch (Exception e) {
			System.out.println("elm is nto present");
		}
		
		ff.findElement(By.xpath("//*[@id='password']")).sendKeys("pwd1");
		
		//click on button
		ff.findElement(By.xpath("//*[@id='Login']")).click();
		
	}

}
