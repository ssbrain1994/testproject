package javascript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class javascriptexecuter {
	@Test	
	public void java() throws  Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
	WebDriver driver=new ChromeDriver();

	//java script executor		
	JavascriptExecutor js=(JavascriptExecutor)driver;


	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

	WebElement elmGo=driver.findElement(By.xpath("//input[@name='proceed']"));


	//js.executeScript("alert('hello there!!')");

	//performing click on an element
	js.executeScript("argument[0].click();", elmGo);

	//calling the javascript function directly
	js.executeScript("checkLogin();");

}
	}

