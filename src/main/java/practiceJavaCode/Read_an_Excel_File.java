package practiceJavaCode;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_an_Excel_File {

	public static void main(String[] args) {
		
		ArrayList<Cell> list = new ArrayList<Cell>();

		Workbook workbook = null;
		FileInputStream fis = null;

		try {

			File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\Notes_DataExport.xlsx");

			fis = new FileInputStream(file);

			workbook = new XSSFWorkbook(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		File file = new File(System.getProperty("user.dir") + "\\I-O_StreamRelated\\Notes_DataExport.xlsx");
//
//		FileInputStream fis = new FileInputStream(file);
//
//		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet1");

//		int rowNumber = sheet.getLastRowNum();

		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();			

				if (cell.getCellType() == CellType.STRING) {
					System.out.print(cell.getStringCellValue() + "\t");
				} else if (cell.getCellType() == CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue() + "\t");
				} else if (cell.getCellType() == CellType.BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + "\t");
				}
				
//				list.add(cell);

			}

			System.out.println("");			
			

		}
		
//		System.out.println(list);

		try {
			workbook.close();
			fis.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
