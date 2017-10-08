package extendsreport;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.mustache.Value;



public class dropdown {
	@Test
	public  void selectddvalues() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");

		WebDriver dr = new FirefoxDriver();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("shubham bedre");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement month_dropdown= dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[1]"));
		Select month_dd=new Select(month_dropdown);


		month_dd.selectByValue("15");
	

		WebElement month_dropdown2= dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[2]"));
		Select month_mm=new Select(month_dropdown2);
		month_mm.selectByVisibleText("FEB");
		Thread.sleep(3000);
		WebElement month_dropdown4= dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[3]"));
		Select month_yy=new Select(month_dropdown4);
		month_yy.selectByValue("1994");


		List<WebElement>radio =dr.findElements(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[26]/td[3]"));
		for(int i=0;i<radio.size();i++)
		{
			WebElement radio_local=radio.get(i);
			String value=radio_local.getAttribute("value");
			System.out.println("value from radio buttons");
		
			if(value.equalsIgnoreCase("male"))
			{
				radio_local.click();
			}
		}
		
	}
}
