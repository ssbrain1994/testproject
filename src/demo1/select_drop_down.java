package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class select_drop_down {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver ff= new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		ff.get("http://www.gmail.com");
		
		WebElement elm=ff.findElement(By.xpath("//select[@id='lang-chooser']"));
		
		List<WebElement> dropDownValueCol=elm.findElements(By.xpath("//option"));
		
		System.out.println(dropDownValueCol.size());
		
	}

}
