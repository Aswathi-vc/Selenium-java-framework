package sheet_package;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ReadExcelfile(String excelPath)
	{
		try
		{
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage())	;
			}
	}
public String getData(int sheetnumber,int row,int column)
{
	sheet=wb.getSheetAt(sheetnumber);
	String data=sheet.getRow(row).getCell(column).getStringCellValue();
	return data;
}
public int getRowCount(int sheetIndex)	
{
	int row=wb.getSheetAt(sheetIndex).getLastRowNum();//3
	row=row+1;//4
	return row;
}

}
