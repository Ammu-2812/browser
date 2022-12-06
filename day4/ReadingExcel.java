package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel {
	
	@Test
	
	public void testData()
	{
		File src=new File("C:\\Users\\seesushm\\Desktop\\SapientTestData.xlsx");	
		try
        {
            XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\seesushm\\Desktop\\SapientTestData.xlsx")));
            XSSFSheet sh1=wb.getSheet("loginData");
//            XSSFRow r1=sh1.getRow(0);
//            XSSFCell c1=r1.getCell(0);
	            int row=sh1.getPhysicalNumberOfRows();
	            int col=sh1.getRow(0).getPhysicalNumberOfCells();
	            for(int i=0;i<row;i++) {
                for(int j=0;j<col;j++) {
                    String value=sh1.getRow(i).getCell(j).getStringCellValue();
                    System.out.println(value);
                }
            }
		        }catch(FileNotFoundException e) {
		            System.out.println("Path is incorrect");
		        }catch(IOException e) {
		            System.out.println("unexpected error");
		        }
    }

}










//		try {
//			FileInputStream fis=new FileInputStream(src);
//			XSSFWorkbook wb=new XSSFWorkbook(fis);
//			XSSFSheet sh1=wb.getSheet("LoginData");
//			XSSFRow r1=sh1.getRow(0);
//			XSSFCell c1=r1.getCell(0);
//			String username=c1.getStringCellValue();
//			System.out.println(username);
//			wb.close();
//		}catch (FileNotFoundException e)
//		{
//			System.out.println("Please check data file path"+e.getMessage());
//		}catch (IOException e) {
//			System.out.println("Something went wrong IO"+e.getMessage());
//		}
//	}

