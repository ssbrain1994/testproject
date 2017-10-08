package demo1;

import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_link_froomspecific_area {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.navigate().to("http://shopping.rediff.com/");
		List<WebElement> catLinks=driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		System.out.println(catLinks.size());

		for(WebElement elm:catLinks){
			//for(int i=0;i<catLinks.size();i++){
			//WebElement elm=catLinks.get(i);			
			elm.click();
			Thread.sleep(50000);	
			System.out.println(driver.getTitle());					
			driver.navigate().back();

			catLinks=driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		}

	}
}
