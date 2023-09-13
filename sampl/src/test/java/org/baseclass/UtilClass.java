package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UtilClass {

	public static WebDriver driver;

	public static void edgeBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public  void maxi() {
		driver.manage().window().maximize();
	}

	public  void impWait(int second) {
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	}
	public  void url(String url) {
		driver.get(url);
	}
	public  void textPass(WebElement element,String value) {
		element.sendKeys(value);
	}
	public  void elementClick(WebElement element) {
	element.click();
	}
	
	
	public  void screenShot(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\zubee\\ClassWorkSpace\\MavenProjectMorning\\screenshot\\"+name+".png");
		FileUtils.copyFile(src, des);
		//FileUtils.copyFile(src, new File("C:\\Users\\zubee\\ClassWorkSpace\\MavenProjectMorning\\screenshot\\"+name+".png"));
		
	}
	
	
	public static String excelData(String sheetName,int rowNo,int cellNo) throws IOException {
	
		File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\MavenProjectMorning\\sheet\\SampleData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook book= new XSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();//0,1
	
		String value="";
		if (type==1) {
			value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s= new SimpleDateFormat("dd, MMMM, yyyy");
			 value = s.format(d);
		}
		else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			
			 value = String.valueOf(l);
			
			
		}
		
		return value;
	
	}
	
	public static void datetime() {
		Date d = new Date();
	SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");	
	String da = s.format(d);	
	System.out.println(da);	
}
	
	
}
