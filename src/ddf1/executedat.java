package ddf1;

import java.io.FileInputStream; 
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.*;
public class executedat {
@DataProvider(name="testdata")
public Object [][] Exceldatas()throws Exception,IOException{
	String filepath="C:\\Users\\shubham\\Desktop\\shubham.xls";
	//read excel data
	FileInputStream fis=new FileInputStream(filepath);
	//read workbook
	Workbook exbook=Workbook.getWorkbook(fis);
	
	Sheet exsheet=exbook.getSheet("testdata");

	//read sheet
	int Rows=exsheet.getRows();
	int Columns=exsheet.getColumns();
	//read rows and columns in sheet
	String testdata[][]=new String [Rows-1][Columns];
	int count=0;
	for(int i=0;i<Rows;i++)
	{
		for(int j=0;j<Columns;j++){
			Cell excell=exsheet.getCell(j,i);
			testdata[count][j]=excell.getContents();
			
		}
		count++;
		
	}
	fis.close();
	return testdata;
	
}
}
