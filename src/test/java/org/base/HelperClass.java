
package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
	public static WebDriver driver;
	public static	Actions a;
	
	public static void launchChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}

	public static void maxi() {
	
		driver.manage().window().maximize();
	}
	
	public static void implictwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	
	public static void closeBrow() {
	driver.quit();
	}
	
	public static String printTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	
	public static void textPass(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	
	public static void btnClick(WebElement element) {
		element.click();

	}
	
	
	public static void mouseMove(WebElement element) {
		 a=new Actions(driver);
		
		a.moveToElement(element);
		
	}
	
	public static void screenShot(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\zubee\\ClassWorkSpace\\Maven11am\\ScreenShot\\"+name+".png");
		
		FileUtils.copyFile(src, des);
		
	}
		
		public static String readtheexcel(String sheet,int row,int cell) throws IOException {
			
			File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber11.30am\\sheets\\SampleData.xlsx");
			
			FileInputStream fi= new FileInputStream(f);
			Workbook book= new XSSFWorkbook(fi);
			Sheet sheets = book.getSheet(sheet);
			Row rows = sheets.getRow(row);
			Cell c = rows.getCell(cell);
			
			int type = c.getCellType();
			
			String name="";
		//sheet("login",1,0)	
			if (type==1) {
				name = c.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				
				SimpleDateFormat s= new SimpleDateFormat("dd, MMMM, yyyy");
				name = s.format(d);
			}
			else {
				double d = c.getNumericCellValue();
				long l= (long)d;
				name = String.valueOf(l);
			}
			
			return name;
		}
		
	
	public static void datetime() {
			Date d = new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");	
		String da = s.format(d);	
		System.out.println(da);	
	}
	
}
