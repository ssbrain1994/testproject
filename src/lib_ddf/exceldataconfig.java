package lib_ddf;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataconfig {
	XSSFWorkbook wb;
	XSSFSheet 	sheet1;
	public exceldataconfig(String excelpath){
		try{
			File src=new File(excelpath);
			FileInputStream fin=new FileInputStream(src);
			wb=new XSSFWorkbook(fin);

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int sheetnumber,int row,int column)
	{
		sheet1=wb.getSheetAt(sheetnumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}
	public int getrowcount(int sheetindex){
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;

	}
}
