package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class auto_it {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	//WebDriver driver=new ChromeDriver();

	//java script executor		
	JavascriptExecutor js=(JavascriptExecutor)	driver;
	

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.navigate().to("https://www.cs.tut.fi/~jkorpela/forms/file.html");

	
	Thread.sleep(3000);
	
	/*Process process = new ProcessBuilder("C:\\Users\\user\\Desktop\\file_upload_1.exe",
			"E:\\shubham.txt", "Open").start();*/
	driver.findElement(By.xpath("/html/body/form[1]/p[2]/input")).sendKeys("E:\\shubham.txt");
	driver.findElement(By.xpath(".//*[@id='txt']")).sendKeys("shubhamfile");
	driver.findElement(By.xpath("html/body/form[1]/div/input")).click();
	driver.findElement(By.xpath(".//*[@id='hm_top_navlink_div']/a[1]/div")).click();
	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("")).clear();
	
	}

}
