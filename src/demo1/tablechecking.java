package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tablechecking {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		WebElement tbl=driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		List<WebElement> rows=tbl.findElements(By.xpath("//tr"));
		
		for(WebElement r:rows){
			List<WebElement> cols=r.findElements(By.xpath("//td[5]"));
			for(WebElement c:cols){
				System.out.println(c.getText());
			}
			
		}
	}

}
