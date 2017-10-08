package ddf1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadrivensinglepagescript {
	WebDriver dr;
	@Test(dataProvider="testdata")
	public void customersignin(String username,String password){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.findElement(By.xpath(".//*[@id='login1']")).sendKeys(username);
		dr.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		String actual=dr.getTitle();
		String expected="Rediffmail";
		
	
	}

	@DataProvider(name="testdata")
	public Object [][] Exceldatas()throws BiffException,IOException{
		String filepath="C:\\Users\\shubham\\Desktop\\shubham.xls";
		//read excel data
		FileInputStream fis=new FileInputStream(filepath);
		//read workbook
		Workbook exbook=Workbook.getWorkbook(fis);

		Sheet exsheet=exbook.getSheet("sheet1");

		//read sheet
		int Rows=exsheet.getRows();
		int Columns=exsheet.getColumns();
		String testdata[][]=new String [Rows][Columns];

		for(int i=0;i<Rows;i++)
		{
			for(int j=0;j<Columns;j++){
				Cell excell=exsheet.getCell(j,i);
				testdata[i][j]=excell.getContents();
			}
		}
		return testdata;
		/*int row=exsheet.getrows();
		 * int columns=exsheet.getcolumns();
		 * String testdata[][]=new String[row][columns];
		 * for(int i=0;i<columns;i++){
		 * for(int j=0;j<rows;j++){
		 * cell excell=exsheet.getcell(i,j);
		 * testdata[i][j]=excell.getcontent();
		 * new fileinputstream fis=new fileinputstream(src);
		 * xssfworkbook wf=new xssfworkbook(fis);
		 * xssfsheet sheet=wf.getsheetat(0);
		 * 
		 * */
		
	}
}