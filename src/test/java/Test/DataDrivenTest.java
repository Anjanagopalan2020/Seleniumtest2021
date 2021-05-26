package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class DataDrivenTest{
	
	public String Read() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\asus\\Downloads\\ClientInfo.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
                    //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
                    //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
                   	System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		String cellval = cell.getStringCellValue();
		return cellval;
	}

}
