package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	protected Properties prop;

	public WebDriver initilizeBrowser(String browserName) throws IOException {

		prop = new Properties();
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Testngproject\\src\\test\\java\\org\\base\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver =new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}
	public void gmailSignIn() {
		String gmailSignin = prop.getProperty("gmailSignIn");
		driver.get(gmailSignin);
	}
	public void greentech() {
		String greentech=prop.getProperty("greentech");
		driver.get(greentech);
	}
	public void flipkarturl() {
		String flipkarturl=prop.getProperty("flipkarturl");
		driver.get(flipkarturl);
	}

	public void geturl() {
		String url = prop.getProperty("url");
		driver.get(url);
	}

	public void redbusurl() {
		String redbusurl = prop.getProperty("redbusurl");
		driver.get(redbusurl);
	}

	public void demoQA() {
		String demoQA = prop.getProperty("demoQA");
		driver.get(demoQA);
	}
	

	public boolean authenticate(String username, String password) {

		if (username.equals(prop.getProperty("email")) && password.equals(prop.getProperty("password"))) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean authenticate(String firstname, String lastname, String email, String mobileNumber,String subjectName,
			String currentAddress) {
		if (firstname.equals(prop.getProperty("firstname")) && lastname.equals(prop.getProperty("lastname"))
				&& email.equals(prop.getProperty("email2")) && mobileNumber.equals(prop.getProperty("mobileNo"))
				&& subjectName.equals(prop.getProperty("subjectname")) &&  currentAddress.equals(prop.getProperty("currentAddress"))) {
			return true;
		} else {
			return false;
		}

	}
	
	public  String excelData(String sheetName, int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Testngproject\\src\\test\\java\\org\\resource\\testData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();
		String value = "";
		if (type == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd,MMMM,yyyy");
			value = s.format(date);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;

	}

	public void closure() {
		driver.quit();
	}

}
