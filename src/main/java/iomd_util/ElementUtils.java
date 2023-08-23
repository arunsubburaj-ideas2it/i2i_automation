package iomd_util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iomd_driver.DriverFactory;
import iomd_driver.IOMD_driver;


public class ElementUtils {

	// private RemoteWebDriver driver;
	
	//public static //logger //log;

	public void startApp() throws IOException {

		IOMD_driver.IomdApplicationLauncher();
	}


	
	public WebElement locateElement(String locator, String locatorValue) {
		try {
			switch (locator) {
			case "id":
				return DriverFactory.getDriver().findElement(By.id(locatorValue));
			case "name":
				return DriverFactory.getDriver().findElement(By.name(locatorValue));
			case "classname":
				return DriverFactory.getDriver().findElement(By.className(locatorValue));
			case "linktext":
				return DriverFactory.getDriver().findElement(By.linkText(locatorValue));
			case "partiallinktext":
				return DriverFactory.getDriver().findElement(By.partialLinkText(locatorValue));
			case "tagname":
				return DriverFactory.getDriver().findElement(By.tagName(locatorValue));
			case "xpath":
				return DriverFactory.getDriver().findElement(By.xpath(locatorValue));
			// case "css": return driver.findElementByCssSelector(locatorValue);

			}
		} catch (NoSuchElementException e) {
			
			//log.fatal("No such Element Exception while locating Element locator - "+locatorValue);

			e.printStackTrace();
		} catch (WebDriverException e) {
			
			//log.fatal(e.getMessage()+ "- while locating Element locator - "+locatorValue);

			e.printStackTrace();
		}

		return null;

	}

	public List<WebElement> locateElements(String locator, String locatorValue) {
		try {
			switch (locator) {
			case "id":
				return DriverFactory.getDriver().findElements(By.id(locatorValue));
			case "name":
				return DriverFactory.getDriver().findElements(By.name(locatorValue));
			case "classname":
				return DriverFactory.getDriver().findElements(By.className(locatorValue));
			case "linktext":
				return DriverFactory.getDriver().findElements(By.linkText(locatorValue));
			case "partiallinktext":
				return DriverFactory.getDriver().findElements(By.partialLinkText(locatorValue));
			case "tagname":
				return DriverFactory.getDriver().findElements(By.tagName(locatorValue));
			case "xpath":
				return DriverFactory.getDriver().findElements(By.xpath(locatorValue));
			// case "css": return driver.findElementByCssSelector(locatorValue);

			}
		} catch (NoSuchElementException e) {

			//log.fatal("No such Element Exception while locating Element locator - "+locatorValue);

			e.printStackTrace();
		} catch (WebDriverException e) {

			//log.fatal(e.getMessage()+ "- while locating Element locator - "+locatorValue);

			e.printStackTrace();
		}

		return null;

	}

	public void clearAndenterText(WebElement ele, String text) throws InterruptedException {
		try {
			Thread.sleep(200);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys(text);
			//log.info("entered Text - "+text);
			

		} catch (StaleElementReferenceException e) {
		
			//log.fatal("Stale Element Reference exception while entering text - "+text);

			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			//log.fatal("Element not Interactable exception while entering text - "+text);

			e.printStackTrace();
		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ "-  while entering text - "+text);

			e.printStackTrace();
		}

	}

	public void click(WebElement ele, String elementContent) throws InterruptedException {
		try {
			Thread.sleep(200);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.elementToBeClickable(ele));

			ele.click();
			
			//log.info("Clicked Element - "+elementContent);
			

		} catch (StaleElementReferenceException e) {
			//log.fatal("Stale Element Reference exception while clicking element  - "+elementContent);

			e.printStackTrace();
			
		} catch (ElementClickInterceptedException e) {
			//log.fatal("Element click intercepted exception while clicking element  - "+elementContent);

			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			//log.fatal("Element Not interactable exception while clicking element  - "+elementContent);

			e.printStackTrace();
		}

		catch (NoSuchElementException e) {
			//log.fatal("No Such Element exception while clicking element  - "+elementContent);

			throw new RuntimeException();
		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ " - while clicking element  - "+elementContent);

			throw new RuntimeException();
		}
		
		finally {
			
		}
	}

	public void clickUsingJavaScriptExecutor(WebElement ele, String elementContent) throws InterruptedException {
		try {
			Thread.sleep(100);

			JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
			jse.executeScript("arguments[0].click()", ele);
			
			//log.info("Clicked Element"+elementContent);
		} catch (StaleElementReferenceException e) {
			//log.fatal("Stale Element Reference exception while clicking element  - "+elementContent);

			e.printStackTrace();
		} catch (ElementClickInterceptedException e) {
			//log.fatal("Element click intercepted exception while clicking element  - "+elementContent);

			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			//log.fatal("Element Not interactable exception while clicking element  - "+elementContent);

			e.printStackTrace();
		}

		catch (NoSuchElementException e) {
			//log.fatal("No Such Element exception while clicking element  - "+elementContent);

			e.printStackTrace();
		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ "- while clicking element  - "+elementContent);

			e.printStackTrace();
		}

	}

	public void waitUntilVisibilityOfElement(WebElement ele, String elementContent) throws InterruptedException {
		try {
			Thread.sleep(300);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			//log.info("Waiting for element - "+elementContent+ " till it is visible");
		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ "-  while waiting for element  - "+elementContent+ " till it is visible");

			e.printStackTrace();
		}

	}

	public void waitUntilSpecificAttributeOfElementChanges(String xpath, String attributeName,String attributeValueExpected, String elementContent) throws InterruptedException {
		
			int counter = 0;
			
			if(locateElements("xpath", xpath).size()>0)
			{
				while (!locateElement("xpath", xpath).getAttribute(attributeName).contains(attributeValueExpected) & counter <= 10) {

					Thread.sleep(1000);

					counter++;
				}
			}
	}

	public void waitUntil_ElementClickable(WebElement ele, String elementContent) throws InterruptedException {
		try {
			Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			//log.info("Waiting for element - "+elementContent+ " till it is clickable");
		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ "-  while waiting for element  - "+elementContent+ " till it is clickable");

			e.printStackTrace();
		}

	}
	
	public void waitUntil_InvisibilityOfElement(WebElement ele, String elementContent) throws InterruptedException {
		try {
			Thread.sleep(500);
			
			
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.invisibilityOf(ele));
			
		
			
			//log.info("Waiting for element - "+elementContent+ " till it is not visible");

		}

		catch (WebDriverException e) {
			//log.fatal(e.getMessage()+ "-  while waiting for element  - "+elementContent+ " till it is not visible");
			e.printStackTrace();
		}

	}
	

	public String getElementText(WebElement ele, String elementContent) throws InterruptedException {
		String text = "";
		try {
			Thread.sleep(100);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			text = ele.getText();
			
			//log.info("Fetched Element text - "+text+ " from Element - "+elementContent);

		} catch (StaleElementReferenceException e) {
			
			//log.fatal("Element is stale now when fetching text from element " + elementContent);
			e.printStackTrace();
		}

		catch (ElementNotInteractableException e) {
			
			//log.fatal("Element " + elementContent + " not interactable");
			e.printStackTrace();
		}

		catch (WebDriverException e) {
			
			//log.fatal("Unknown exception when when clicking element -  " + elementContent);
			e.printStackTrace();
		}

		return text;
	}

	public String getElementAttributeText(WebElement ele, String attribute, String elementContent)
			throws InterruptedException {
		String text = "";
		try {
			Thread.sleep(100);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			text = ele.getAttribute("aria-label");
			
			//log.info("Fetched Element attribute - "+text+ " from Element - "+elementContent);

		} catch (StaleElementReferenceException e) {
			//log.fatal("Element is stale now when fetching attribute from element " + elementContent);
			e.printStackTrace();
		}

		catch (ElementNotInteractableException e) {
		
			//log.fatal("Element " + elementContent + " not interactable");
			e.printStackTrace();
		}

		catch (WebDriverException e) {
			//log.fatal("Unknown exception when when clicking element -  " + elementContent);
			e.printStackTrace();
		}

		return text;
	}

	public void scrollToElement_Using_JavaScriptExecutor(WebElement ele, String elementContent)
			throws InterruptedException {

		try {
			Thread.sleep(200);
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView(true);", ele);
			
			//log.info("Scrolling to Element - "+elementContent);

		} catch (StaleElementReferenceException e) {
		
			//log.fatal("Element is stale now when scrolling to element  " + elementContent);
			e.printStackTrace();
			
		}

		catch (ElementNotInteractableException e) {
		
			//log.fatal("Element " + elementContent + " not interactable");
			e.printStackTrace();
		}

		catch (WebDriverException e) {
			
			//log.fatal("Unknown exception when  clicking element - "+elementContent);
			e.printStackTrace();
		}
	}

	public boolean isElementDisplayed(WebElement ele, String elementContent) {
		boolean bool = false;
		try {
			Thread.sleep(200);
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOf(ele));

			bool = ele.isDisplayed();
			//log.info("Element - "+elementContent + " is displayed");
		} catch (StaleElementReferenceException e) {
			
			e.printStackTrace();
		} catch (ElementNotInteractableException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {

		} catch (WebDriverException e) {
			
			e.printStackTrace();
		}

		return bool;
	}

	public String getBrowserTitle() {
		String title = "";
		try {
			title = DriverFactory.getDriver().getTitle();
		} catch (WebDriverException e) {
			// reportStep("Unknown exception getting title","fail",true);
			e.printStackTrace();
		}

		return title;
	}

	public static void writeAllContentsToExcel(Map<String, List<String>> map, String month, String className, String sections)
			throws IOException, ParseException {
		// Open Excel using file input stream, Create sheet and get the same sheet
		// -------------------------------------------------------------------
		String fileName = "./outputfolder/" +month+"_"+ className + "_" + sections + ".xlsx";
		FileInputStream in = null;
		XSSFWorkbook workbook = null;
		XSSFSheet sheet = null;

		if(new File(fileName).exists()) {
			
			in = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(in);
			sheet = workbook.getSheet("Sheet1");
		} else {
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("Sheet1");
		}

		XSSFCellStyle style = workbook.createCellStyle();

		XSSFRow row = null;
		XSSFCell cell = null;
		int rowCount = 0;

		// Enter contents in Row 0 (0,0), (0,1)
		// -------------------------------

		sheet.createRow(rowCount);
		row = sheet.getRow(rowCount);

		if (row.getCell(0) == null) {
			cell = row.createCell(0);
		}
		cell.setCellValue("Admission No");

		if (row.getCell(1) == null) {
			cell = row.createCell(1);
		}
		cell.setCellValue("Student Name");

		// Enter contents in Row 0 (0,2), (0,3)...... and so on
		// -------------------------------

		int headercell = 2;

		Set<Entry<String, List<String>>> entrySet = map.entrySet();

		for (Entry each : entrySet) {
			List<String> lst = (List<String>) each.getValue();
			if (lst.size() > 0) {
				if (row.getCell(headercell) == null) {
					/*
					 * Date date_Fetched = new SimpleDateFormat("M").parse(month); int
					 * intMonthFetched = getMonthNumber(date_Fetched);
					 */
				
					row.createCell(headercell).setCellValue((String) each.getKey());
					headercell = headercell + 1;
				}

			}

		}

		int TotalRows = 0;
		int dateCol = 2;
		for (Entry each : entrySet) {
			List<String> lst = (List<String>) each.getValue();

			TotalRows = lst.size();

			int eachKey = Integer.parseInt("" + each.getKey());

			if (TotalRows > 0) {
				rowCount = 0;
				for (int i = 0; i < TotalRows; i++) {

					// Date in row 0, Column
					rowCount = rowCount + 1;
					String adm_no = lst.get(i).split("~")[1];
					String stud_name = lst.get(i).split("~")[0];
					String attendance_status = lst.get(i).split("~")[2];

					if (sheet.getRow(rowCount) == null) {
						sheet.createRow(rowCount);
						row = sheet.getRow(rowCount);
					} else {
						row = sheet.getRow(rowCount);

					}

					if (row.getCell(0) == null) {
						cell = row.createCell(0);
						cell.setCellValue(adm_no);
					}

					if (row.getCell(1) == null) {
						cell = row.createCell(1);
						cell.setCellValue(stud_name);
					}

					if (row.getCell(dateCol) == null) {
						cell = row.createCell(dateCol);

					}
					if(attendance_status.equalsIgnoreCase("HD"))
					{
						attendance_status="P";
					}
					cell.setCellValue(attendance_status);

				}

				dateCol = dateCol + 1;

			}

		}
		// in.close();
		FileOutputStream out = new FileOutputStream(fileName);
		workbook.write(out);
		workbook.close();
		out.close();
		
		//log.info("Wrote all contents to Excel - "+fileName);

	}
	
	
	public static void write_Only_Absentees_ContentsToExcel(Map<String, List<String>> map, String month, String className, String sections)
			throws IOException, ParseException {
		// Open Excel using file input stream, Create sheet and get the same sheet
		// -------------------------------------------------------------------
		String fileName = "./outputfolder/Absentees/" +month+"_"+ className + "_" + sections + ".xlsx";
		FileInputStream in = null;
		XSSFWorkbook workbook = null;
		XSSFSheet sheet = null;
		

		if(new File(fileName).exists()) {
			
			in = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(in);
			sheet = workbook.getSheet("Sheet1");
			
		} else {
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("Sheet1");
			
		}

		XSSFRow row = null;
		XSSFCell cell = null;
		int rowCount = 0;

		// Create Row index 0 and get row
		// -------------------------------

		sheet.createRow(rowCount);
		row = sheet.getRow(rowCount);
		

		// Enter contents in Row 0 (0,0), (0,1), (0,2)...... and so on
		// -------------------------------

		int headercell = 0;

		Set<Entry<String, List<String>>> entrySet = map.entrySet();

		for (Entry each : entrySet) {
			List<String> lst = (List<String>) each.getValue();
			if (lst.size() > 0) {
				if (row.getCell(headercell) == null) {
					
					row.createCell(headercell).setCellValue((String) each.getKey());
					headercell = headercell + 1;
				}

			}

		}

		int TotalRows = 0;
		int dateCol = 0;
		for (Entry each : entrySet) {
			List<String> lst = (List<String>) each.getValue();
			
			TotalRows = lst.size();
			if (TotalRows > 0) {
				rowCount = 0;
				for (int i = 0; i < TotalRows; i++) {

					// Date in row 0, Column
					rowCount = rowCount + 1;
					
					String stud_name = lst.get(i);
					
					if (sheet.getRow(rowCount) == null) {
						sheet.createRow(rowCount);
						row = sheet.getRow(rowCount);
					} else {
						row = sheet.getRow(rowCount);

					}
					
				

					if (row.getCell(dateCol) == null) {
						cell = row.createCell(dateCol);

					}
					cell = row.getCell(dateCol);
					cell.setCellValue(stud_name);
				}

				dateCol = dateCol + 1;

			}

		}
			
		//Write contents to Excel sheets:
		//--------------------------------
		FileOutputStream out = new FileOutputStream(fileName);
		workbook.write(out);
		workbook.close();
		out.close();
		
		//log.info("Wrote all absentees contents to Excel - "+fileName);

	}

	
	
	
	
	
	public static int getMonthNumber(Date dt) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int month = cal.get(Calendar.MONTH);

		return month;
	}
	
	
	public static int getCurrentYear(Date dt) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int year = cal.get(Calendar.YEAR);

		return year;
	}

	public void closeBrowser() {
		DriverFactory.getDriver().close();
		
		//log.info("Browser closed");
	}

}
