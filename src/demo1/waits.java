package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		
		WebDriver ff= new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		ff.get("https://www.jobserve.com/in/en/Job-Search/");
		ff.findElement(By.xpath(".//*[@id='SPTPosTitleLink']")).click();g                                                                                       
		
		String mainwindowhandle=ff.getWindowHandle();
		System.out.println("main window handle____"+mainwindowhandle);
		
		System.out.println("logo is displayed __"+ff.findElement(By.xpath(".//*[@id='JobServe_logo']")).isDisplayed());
	
	}

	
}
