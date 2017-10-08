package extendsreport;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class extendsreport {
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void stattest(){
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Myownreport.html",true);
		extent.addSystemInfo("Hostname", "krishna")
		.addSystemInfo("enviroment", "QA")
		.addSystemInfo("username", "krishna satalala");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.conig"));

	}
	@Test
	public void demoreportpass(){

		test=extent.startTest("demoreportpass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");

	}
	@Test
	public void demoreportfail(){
		test=extent.startTest("demoreportfail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "assert fail as condition is false");

	}
	@AfterMethod
	public void getresult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);

	}
	@AfterTest
	public void endreport(){
		extent.flush();
		extent.close();

	}
}
