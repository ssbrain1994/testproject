package datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_excelfiel {
	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\shubham\\Desktop\\shubham.xlsx");
		FileInputStream fin=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("shubham");
		sheet1.getRow(0).createCell(3).setCellValue("bedre");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);

		wb.close();
   /*file src=new file(path)
    * fileinputstream fis=new fileinputstream(src)
    * xssfworkbook wb =new xssfworkbook
    * xssfsheet sheet1=wb.getsheetat(0)
    * sheet1.getrow(0).createcell(2).setcellvalue("shubham");
    * sheet1.getrow(0).createcell(1).getcellvalue();
    *  */
	}
}
