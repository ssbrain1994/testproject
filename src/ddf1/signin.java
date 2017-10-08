package ddf1;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class signin  extends executedat{
	WebDriver dr;
	String baseurl="https://mail.rediff.com/cgi-bin/login.cgi";
	
	@Test(dataProvider="testdata")
	public void customersignin(String username,String password,String result){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		dr.navigate().to(baseurl);
		dr.findElement(By.xpath(".//*[@id='login1']")).sendKeys(username);
		dr.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		String actual=dr.getTitle();
		String expected="Rediffmail";
		try{
			Assert.assertEquals(actual, expected);
			System.out.println("login test cases are passed");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
