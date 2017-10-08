package datadrivenframework;

import java.io.File; 
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelfile {
public static void main(String[] args) throws Exception {
	File src= new File("C:\\Users\\shubham\\Desktop\\shubham.xlsx");
	FileInputStream fin=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fin);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	String data=sheet1.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println("data from excel is "+data);
	
	String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
	
	System.out.println("data from excel is "+ data1);
	wb.close();
	/*file src=new file(path);
	 * fileinputstream fis=new fileinputstream(src);
	 * xssfworkbook wb=new xssfworkbook(fis);
	 * xssf sheet=wb.getsheetat(0);
	 * sheet.getrow(0).getcell(0).getcellvalue();  sheet.getrow(0).createcell(2).setcellvalue("shubham");
	 * sheet.getrow(0).getcell(1).getcellvalue()  or getstringcellvalue(); sheet.getrow(0).createcell(2).setcellvalue("bedre");
	 * wb.close*/
	
}
}
