package demo1;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ifcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );*/
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement> links=driver.findElements(By.xpath("//input[@name='lang' and @type='radio' ]"));
		System.out.println("total links->"+links.size());
//list<webelement> links=dr.findelementby xpath((""));
		//syso("total links"+links.size());
		for(int i=0;i<=links.size();i++){
			WebElement local=links.get(i);
			String value=local.getAttribute("value");
			System.out.println(value);

			if(value.equalsIgnoreCase("Python")){
				local.click();
			}
		}

		/*for (int i=0;i<lins.size;i++)
		 * webelement loclal=links.size();
		 * String value=local.getattribute(value);
		 * SYSO(value)
		 * 
		 * 
		 * if (value.equalsignorecase("ruby")){
		 * local.click();
		 * */

		/*for(int i=1;i<=10;i++){
			if(i==6){
				System.out.println(i);
			}

		}
		 */
	}
}
