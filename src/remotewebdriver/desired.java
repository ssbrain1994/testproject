package remotewebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.Is;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import demo1.select_drop_down;

public class desired {
	static RemoteWebDriver dr;
	
	public static void main(String[] args) throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("Mozilla");
		cap.setJavascriptEnabled(true);
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		dr=new RemoteWebDriver(new URL("http://192.168.0.111:4444/wd/hub"), cap);
		
		FirefoxDriver dr = new FirefoxDriver(cap);
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("shubham bedre");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("bedreshubham");
		dr.findElement(By.xpath("")).click();
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("Ssbbrain123@");
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("Ssbbrain123@");
		dr.findElement(By.xpath(".//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("bedreshubham@gmail.com");
		WebElement alternetmail=null;
		alternetmail=dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		System.out.println("before--"+alternetmail.isSelected());
		dr.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		
WebElement elm=dr.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select"));
		
		List<WebElement> dropDownValueCol=elm.findElements(By.xpath("//option"));
		
		System.out.println(dropDownValueCol.size());
		
		dr.findElement(By.xpath("")).sendKeys("");
		dr.findElement(By.xpath("")).sendKeys("");
		dr.findElement(By.xpath(".//*[@id='Register']")).click();
		
		
		
		
		
		
	}

}
