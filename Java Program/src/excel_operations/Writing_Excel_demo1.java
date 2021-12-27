package excel_operations;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Workbook--> sheet--> Rows--> Cells
public class Writing_Excel_demo1 {

	public static void main(String[] args) {
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("EMP INFO");
		Object empdata[][]= {{"EmpID","name","Job"},
							{ 101,"David","Engineer"},
							{102,"Smith","manager"},
							{103,"scott","Anayst"}
																										
							};
		///Using normal for loop
		int rows = empdata.length;
		int cols=empdata[0].length;
		System.out.println(rows);
		System.out.println(cols );
		
		
		
		
	}

}
