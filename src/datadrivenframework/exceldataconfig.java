package datadrivenframework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import demo1.file_Upload;

public class exceldataconfig {
XSSFWorkbook wb;
XSSFSheet sheet;
public exceldataconfig(String excelpath){
	try{
		File src=new File(excelpath);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
