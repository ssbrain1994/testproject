package demo1;

import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.navigate().to("http://apycom.com/website-buttons/exframe.html");
				System.out.println(driver.findElement(By.tagName("frame")).getSize());
				
				
				driver.switchTo().frame("left_wnd");
				System.out.println(driver.findElement(By.xpath("/html/body/p/span")));
				driver.switchTo().frame("top_wnd");
				System.out.println(driver.findElement(By.xpath("/html/body/p/span")).getText());
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
				driver.close();
				driver.quit();
		}

	}
