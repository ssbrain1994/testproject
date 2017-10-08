package demo1;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		//		driver.get("http://jqueryui.com/demos/draggable/");
		//		Actions act=new Actions(driver);
		//		WebElement src=driver.findElement(By.xpath(".//*[@id='draggable']"));
		//		WebElement dest=driver.findElement(By.xpath(".//*[@id='droppable']"));
		//		act.dragAndDrop(src, dest);
		//		System.out.println(driver.findElement(By.xpath(".//*[@id='droppable']")));

		//		WebElement obj = driver.findElement(By.xpath("//div[@id='draggable']"));
		//		Actions act = new Actions(driver);
		//		//act.dragAndDropBy(obj, 50, 50).build().perform();
		//		
		//		act.clickAndHold(obj).dragAndDropBy(obj, 200, 200).build().perform();
		WebDriverWait dynamicWait;
		dynamicWait=new WebDriverWait(driver,15);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("xyz");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("xyz");

	}



}
