package datadrivenframework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {
	public WebDriver driver;
	
@Test (priority=1)
public void launchbrowser(){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
	 driver=new FirefoxDriver();
}
@Test (priority=2)
public void verifytitle(){
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	Assert.assertEquals("gmail", driver.getTitle());
	
}
@Test (priority=3)
public void close(){
	
}
}
