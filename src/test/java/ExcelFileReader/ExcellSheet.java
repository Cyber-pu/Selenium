package ExcelFileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellSheet {
	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream(new File("./data/data.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fio);
		XSSFSheet sheet=wb.getSheet("sheet1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"     ");
			}
			System.out.println();
		}
		
//		String data=sheet.getRow(1).getCell(2).getStringCellValue();
//		System.out.println(data);
	}
}
