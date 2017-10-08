package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table_sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		WebElement tbl=driver.findElement(By.xpath("//*[@id='full-scorecard']/div[2]/div/table[1]/tbody]"));
		
		WebElement rows=tbl.findElement(By.xpath("//tr[not (@class)]"));
	}

}
