package demo1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popups {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait dynamicWait;
		dynamicWait=new WebDriverWait(driver,5);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		
		//driver.get("http://shopping.rediff.com/");
		
		driver.findElement(By.xpath("//a[@href='http://www.aspiremediagroup.net/minisite/default.htm']")).click();
		
		String mainWinHandel=driver.getWindowHandle();
		System.out.println("main win handel-"+mainWinHandel);
		
		Set<String> winHandels=driver.getWindowHandles();
		String aspireMediaTabId = null;
		Iterator<String> winIds=winHandels.iterator();
		while(winIds.hasNext()){
			String id=winIds.next(); 
			if(id!= mainWinHandel){
				aspireMediaTabId=id;
			}			
	}
	}
}
