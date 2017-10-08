package extendsreport;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class extentreport23 {
	ExtentReports report;
	ExtentTest 	logger;
	WebDriver 	dr;
	@Test
	public void verifytitle(){
		report=new ExtentReports("C:\\Users\\shubham\\Desktop\\extentreportjars\\shubham23.html");
		logger=report.startTest("verifytitle");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shubham\\Desktop\\IEDriverServer.exe");
		dr=new InternetExplorerDriver();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		logger.log(LogStatus.INFO, "running");
		String title=dr.getTitle();
		logger.log(LogStatus.INFO, "title captured");
		Assert.assertTrue(title.contains("verify title"));
		logger.log(LogStatus.PASS, "title verified");

	}

	@AfterMethod
	public void teardown(ITestResult result){
		if (result.getStatus()==ITestResult.FAILURE){
			System.out.println("failure test cases");
		}
		report.endTest(logger);
		report.flush();
		dr.close();

	}
}
