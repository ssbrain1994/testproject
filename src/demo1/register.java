package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class register {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver ff= new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		ff.get("https://www.pamperedchef.com/register");
		ff.findElement(By.xpath(".//*[@id='personalInfoFormTagFirstName']")).sendKeys("shubham ");
		ff.findElement(By.xpath(".//*[@id='userData.emailAddress']")).sendKeys("bedreshubham@gmail.com");
		ff.findElement(By.xpath(".//*[@id='confirmEmailAddress']")).sendKeys("bedreshubham@gmail.com");
		ff.findElement(By.xpath(".//*[@id='personalInfoFormTagLastName']")).sendKeys("Bedre");
		ff.findElement(By.xpath(".//*[@id='userData.password']")).sendKeys("shubhambrain123@");
		ff.findElement(By.xpath(".//*[@id='confirmPassword']")).sendKeys("shubhambrain123@");
		WebElement loginCheckbox=null;
		loginCheckbox=ff.findElement(By.xpath(".//*[@id='termPolicyCheckbox']"));
		loginCheckbox.click();
		
		
		ff.findElement(By.xpath(".//*[@id='createAccountFormNextButton']")).click();
		
	}

}
