package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXcel {

	public String[][] xcelData (String sheetName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("D:\\Albert Temp\\Files\\ReadExcel.xlsx");
		XSSFSheet ws = wb.getSheet(sheetName);
		int row = ws.getLastRowNum();
		System.out.println("Row :" + row);
		int cell = ws.getRow(0).getLastCellNum();
		System.out.println("Cell : " + cell);
		String[][] data = new String[row][cell];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cell; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
			}
		}
		wb.close();
		return data;
	}

}
