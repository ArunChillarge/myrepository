package excel_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.*;

import com.google.common.collect.Table.Cell;

public class Reading_Excel_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
				String excelFilepath = ".\\datafiles\\Countries population.xlsx";
				FileInputStream inputStream= new FileInputStream(excelFilepath);
				XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				//XSSFSheet sheet = workbook.getSheetAt("0");
				
				//using For loop
			/*	int rows = sheet.getLastRowNum();
				int cols= sheet.getRow(1).getLastCellNum();
				
				for(int r=0;r<=rows;r++)
				{
					XSSFRow row=  sheet.getRow(r);
					for (int c = 0; c < cols; c++)
					{
					XSSFCell cell =	row.getCell(c);
					
					switch( cell.getCellType())
					{
					case STRING: System.out.print(cell.getStringCellValue());break;
					case NUMERIC: System.out.print(cell.getNumericCellValue());break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
					
					}
					System.out.print(" ! ");
					}
				System.out.println();
				}*/
				
			///////Iterator /////////////
				
				Iterator iterator=  sheet.iterator();
				
				while (iterator.hasNext()) {
					XSSFRow row = (XSSFRow) iterator.next();
				Iterator CellIterator = row.cellIterator();
				
				while (CellIterator.hasNext()) {
					XSSFCell cell = (XSSFCell) CellIterator.next();
					switch( cell.getCellType())
					{
					case STRING: System.out.print(cell.getStringCellValue());break;
					case NUMERIC: System.out.print(cell.getNumericCellValue());break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
					
					}
					System.out.print(" | ");
				}
				System.out.println();
				}
	}

}
