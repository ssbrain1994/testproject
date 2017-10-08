package xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xls {

	public static void main(String[] args) throws Throwable {

		File src= new File("C:\\Users\\shubham\\Desktop\\shubham.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		FileOutputStream fout=new FileOutputStream(src);
		System.out.println("donee");
		wb.write(fout);
		wb.close();	
	}
}
