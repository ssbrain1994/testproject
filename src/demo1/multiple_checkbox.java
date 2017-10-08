package demo1;

import org.openqa.selenium.By;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_checkbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );*/
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> links=driver.findElements(By.xpath("//input[@name='lang' and @type='radio' ]"));
		System.out.println("total links->"+links.size());
		
		for(WebElement e:links){
			e.click();
			
		}
		
		
		
		/*for(int i=0;i<links.size();i++ ){
			WebElement local=links.get(i);
			String value=local.getAttribute("value");
			System.out.println("values"+value);
			if(value.equalsIgnoreCase("JAVA")){
				local.click();
			}*/
		}

		
	}

