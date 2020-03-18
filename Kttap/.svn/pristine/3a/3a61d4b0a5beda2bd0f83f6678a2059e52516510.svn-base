package ExcelGenerator;

import java.io.File;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Excelreport {

	
	@Test
	public void FinalReport() throws Exception {
		
try {
			
			File file = new File("./ExcelReport.xlsx");
			if(file.exists()) {
				file.delete();
				System.out.println("Found And deleted !!!");
				Thread.sleep(5000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		Xl.generateReport(".", "ExcelReport.xlsx");
	}
}
