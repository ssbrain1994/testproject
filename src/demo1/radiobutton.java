package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.get("http://www.echoecho.com/htmlforms10.htm");

		driver.findElement(By.xpath("//input[@name='group1']")).click();
		
		List<WebElement> radiBtns=driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radiBtns.size());
		List<WebElement> radio=driver.findElements(By.xpath(""));
		System.out.println(radio.size());
		
	}

}
