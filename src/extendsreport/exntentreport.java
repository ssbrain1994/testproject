package extendsreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class exntentreport {
ExtentReports report;
ExtentTest logger;
WebDriver dr;
@Test
public void verifytitle(){
	report=new ExtentReports("");
	logger=report.startTest("verifytitle");
	System.setProperty("", "");
	dr=new FirefoxDriver();
	dr.get("");
	logger.log(LogStatus.INFO, "running test case");
	String title=dr.getTitle();
	Assert.assertTrue(title.contains("google"));
	logger.log(LogStatus.PASS, "test verified");
	
}
@AfterMethod
public void teardown(ITestResult result){
	if(result.getStatus()==ITestResult.FAILURE){
		System.out.println("test  case failure");
	}
	report.endTest(logger);
	report.flush();
	dr.get("");
}

}
