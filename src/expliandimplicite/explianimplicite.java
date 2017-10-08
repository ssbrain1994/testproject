package expliandimplicite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableBiMap.Builder;

public class explianimplicite {

@Test
public void explicite()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
	WebDriver dr=new FirefoxDriver();
	dr.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
	dr.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	dr.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	
	
	/*WebElement testu= dr.findElement(By.xpath(""));
	Actions act=new Actions(dr);
	Action seriesofaction=(Action) act.keyDown(testu,Keys.DOWN);
		*/
	
	
	}
}
