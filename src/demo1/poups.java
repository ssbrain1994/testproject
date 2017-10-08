package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class poups {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		String alertMessage="";
				driver.get("http://jsbin.com/usidix/1");
		        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		       driver.switchTo().alert().accept();
		       driver.switchTo().alert().getText();
		        System.out.println(alertMessage);
	}
	}
