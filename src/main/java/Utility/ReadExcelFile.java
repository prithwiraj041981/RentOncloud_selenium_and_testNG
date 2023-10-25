package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/* this code is developed by prithwiraj */
/* this Class is developed For reading excel file */
public class ReadExcelFile {
	public static String usernameexcel="";
	public static String passwordexcel="";
	public static String Userrow="";
	public static String passrow="";
	/* this code is developed For reading username from excel file */
	public static String Readexcelusername() throws IOException{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(1);
		String Userrow=sheet.getRow(0).getCell(0).toString();
		if(Userrow.equalsIgnoreCase("Username")) {
			usernameexcel=sheet.getRow(1).getCell(0).toString();
			System.out.println("The userid is:"+" "+usernameexcel);
		}
		return usernameexcel;	
	}
	/* this code is developed For reading password from excel file */
	public static String Readexcelpassword() throws IOException{

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(1);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(0);
		String Userrow=sheet.getRow(0).getCell(1).toString();
		if(Userrow.equalsIgnoreCase("Password")) {
			passwordexcel=sheet.getRow(1).getCell(1).toString();
			System.out.println("The password is:"+" "+passwordexcel);
		}
		return passwordexcel;
	}
	public static String RenterReadexcelusername() throws IOException{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(1);
		String Userrow=sheet.getRow(0).getCell(0).toString();
		if(Userrow.equalsIgnoreCase("Username")) {
			usernameexcel=sheet.getRow(2).getCell(0).toString();
			System.out.println("The userid is:"+" "+usernameexcel);
		}
		return usernameexcel;	
	}
	
	public static String RenterReadexcelpassword() throws IOException{

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(1);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(0);
		String Userrow=sheet.getRow(0).getCell(1).toString();
		if(Userrow.equalsIgnoreCase("Password")) {
			passwordexcel=sheet.getRow(2).getCell(1).toString();
			System.out.println("The password is:"+" "+passwordexcel);
		}
		return passwordexcel;
	}
	
	
	public static String TradesmanReadexcelusername() throws IOException{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(1);
		String Userrow=sheet.getRow(0).getCell(0).toString();
		if(Userrow.equalsIgnoreCase("Username")) {
			usernameexcel=sheet.getRow(3).getCell(0).toString();
			System.out.println("The userid is:"+" "+usernameexcel);
		}
		return usernameexcel;	
	}
	
	public static String TradesmanReadexcelpassword() throws IOException{

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "Test_data.xlsx" );
		//Creating a workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(1);
		@SuppressWarnings("unused")
		Cell cell = row.getCell(0);
		String Userrow=sheet.getRow(0).getCell(1).toString();
		if(Userrow.equalsIgnoreCase("Password")) {
			passwordexcel=sheet.getRow(3).getCell(1).toString();
			System.out.println("The password is:"+" "+passwordexcel);
		}
		return passwordexcel;
	}
}

