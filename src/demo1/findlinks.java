package demo1;

import java.util.List;   
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findlinks {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://shopping.rediff.com/");
		
		List<WebElement> links=driver.findElements(By.xpath(".//*[@id='popular_cat']/h3/a"));
		
		System.out.println("total links->"+links.size());
		
		/*for(int i=1;i<=links.size();i++){
			driver.findElement(By.xpath(".//*[@id='popular_cat']/h3["+i+"]/a")).click();
			System.out.println(driver.getTitle());					
			driver.navigate().back();
		
			links=driver.findElements(By.xpath(".//*[@id='popular_cat']/h3/a"));
		*/
		
		for(WebElement e:links){
			e.click();
			
			System.out.println(e.getText());
			driver.navigate().back();
			/*links=driver.findElements(By.xpath(".//*[@id='popular_cat']/h3/a"));
			*/
		}

	}
}
