package demo1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dropdown {

	
	
	@Test
	public void test(){

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		WebElement elm=driver.findElement(By.xpath("//*[@id='selAge' and @name='selAge']"));
		List<WebElement> dropDownValueCol=elm.findElements(By.xpath("//option"));

		System.out.println(dropDownValueCol.size());
		Select selectbyind=new Select(driver.findElement(By.xpath(".//*[@id='selAge']")));
		selectbyind.deselectByIndex(2);
		selectbyind.selectByIndex(3);

		Select drp=new Select(driver.findElement(By.xpath("")));
		drp.selectByIndex(1);
		drp.selectByValue("");


		/*Select selectByValue = new Select(driver.findElement(By.id("SelectID_One")));
		??????/u can select by index also ?????
		             selectByValue.selectByValue("greenvalue");
		 */

	}
}
