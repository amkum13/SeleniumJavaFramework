package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelUtils {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
				
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}



	public void getRowCount() {

		try {
			

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Rows in data.xlsx: "+rowCount);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void getColCount() {

		try {
			

			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Cols in data.xlsx: "+colCount);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void getCellDataString(int rowNum, int colNum) {

		try {
			String cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			System.out.println("String cell value in data.xlsx: "+cellValue);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void getCellDataNumber(int rowNum, int colNum) {

		try {
			double password = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println("Numeric cell value in data.xlsx: "+password);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
