package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadFirst {
	XSSFSheet sheet;

	public ExcelReadFirst() throws IOException {
		File newfile=new File("C:\\Users\\ahkil\\Desktop\\java\\ExcelSheet.xlsx");
		FileInputStream file = new FileInputStream(newfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");

	}

	public String readDataFromExcel(int i, int j) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(i);
		return cell.getStringCellValue();

	}

	public static void main(String[] args) throws Exception {

		ExcelReadFirst ob = new ExcelReadFirst();
		String value=ob.readDataFromExcel(0,0);
		System.out.println(value);
	}

}
