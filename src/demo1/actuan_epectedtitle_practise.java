package demo1;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class actuan_epectedtitle_practise {

	@Test
public void testingload(){
		
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.rediff.com/");
	}

}
