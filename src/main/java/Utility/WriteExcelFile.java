package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/* this code is developed by prithwiraj */
/* this class is developed to write to excel file */
public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		String path = "D://DemoFile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		for(int i=0; i<=lastRow; i++){
			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(2);

			cell.setCellValue("WriteintoExcel");

		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	}

}
