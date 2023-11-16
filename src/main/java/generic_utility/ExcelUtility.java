package generic_utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

public class ExcelUtility {
	public String getDataFromExcel(String worksheetName,int rowNum,int cellNum) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\selenium floder\\vtigerdata.xlsx\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(worksheetName);
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		System.out.println(data);
		return data;
	}	
}
