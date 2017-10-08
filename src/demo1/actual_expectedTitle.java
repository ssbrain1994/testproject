package demo1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actual_expectedTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseurl="http://newtours.demoaut.com";
		String expectedurl="Welcome: Mercury Tours";
		String actualtitle="";
		driver.get(baseurl);
		actualtitle=driver.getTitle();
		if(actualtitle.contentEquals(expectedurl)){
			System.out.println("test passed");
		}else {
			System.out.println("test fails");
		}
	driver.get("http://onlinsbi.com");
	WebElement txt_username=driver.findElement(By.id("unmae"));
	
	try{
		if(txt_username.isEnabled()){
			txt_username.sendKeys("shubham123");
		}
	}catch (NoSuchElementException e) {
		System.out.println(e.toString());
				}
			}
		}
	



