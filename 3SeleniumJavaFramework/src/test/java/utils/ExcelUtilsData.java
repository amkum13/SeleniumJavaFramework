package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelUtilsData {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtilsData(String excelPath, String sheetName) {
				
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}



	public int getRowCount() {
		
		int rowCount = 0;

		try {
			

			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("Rows in data.xlsx: "+rowCount);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return rowCount;
	}

	public int getColCount() {
		
		int colCount = 0;

		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Cols in data.xlsx: "+colCount);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return colCount;
	}

	public String getCellDataString(int rowNum, int colNum) {
		
		String cellValue = "";

		try {
			cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			//System.out.println("String cell value in data.xlsx: "+cellValue);

		} catch (Exception e) {

			e.printStackTrace();
		}
		 return  cellValue;
	}

	public double getCellDataNumber(int rowNum, int colNum) {
		
		double password = 0;

		try {
			password = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println("Numeric cell value in data.xlsx: "+password);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return  password;
	}

}
