package iomd_pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import iomd_driver.IOMD_driver;
import iomd_testdata.iomd_TestData;
import iomd_util.LocatorReader;
import iomd_util.PropertyLoad;

public class iomdPayMethods implements iomd_TestData {

	/*
	 * Common Utility Methods subject to IOMDPay Admin and IOMDPay Extension
	 */

	public static String getAlphaNumericString(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	public static boolean userEntersCredentialsInIOMDAdminAndNavigateToOrders() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Welcome, please sign in']/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.sendKeys("iomddevmagentoadmin");
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Welcome, please sign in']/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField"));
			field.click();
			field.click();
			field.clear();
			field.sendKeys("I0mddevmagentoadmin");

			value = commonUtilityMethods.userClicksButtonByOnlyName("Sign in");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			value = commonUtilityMethods.userClicksButtonByName("SALES");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			value = commonUtilityMethods.userClicksButtonByOnlyStaticText("Orders");
			assertEquals(value, true, "Buttons are not getting clicked as expected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String userFetchesOrderNumber() throws Throwable {
		String orderno = "";
		try {
			Thread.sleep(4000);
			WebElement field;
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]"));
			orderno = field.getAttribute("value");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderno;
	}

	public static boolean userVerifiesOrderNumberInAdmin(String orderno) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'" + orderno + "')]"));
			value = val.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesDataInIOMDPayExt() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;
			RemoteWebElement parent;
			String parentId;
			JavascriptExecutor js;
			HashMap<String, String> scrollObject;

			/*
			 * Card Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Card Details')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[1]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.iOMDPayCardNo + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.iOMDPayExpiryDate + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

			/*
			 * Billing Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Billing Details')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[2]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalAddressIOMDPay1 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalAddressIOMDPay2 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

			/*
			 * Shipping Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Shipping Details')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[3]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.tokenisedAddressIOMDPay1 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.tokenisedAddressIOMDPay2 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalAddressIOMDPay1 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalAddressIOMDPay2 + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

			/*
			 * Name Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Name')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[4]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.tokeniseduserName + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personaluserName + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

			/*
			 * Email Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Email')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[5]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.tokenEmailID + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalMailId + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

			/*
			 * Phone Details Validation
			 */
			parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,'Phone')]"));
			parentId = parent.getId();
			js = (JavascriptExecutor) IOMD_driver.driver;
			scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[5]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.tokenisedPhoneNumber + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personalPhoneNumber + "')]"));
			value = field.isEnabled();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectInvalidAddressInIOMDPayExt() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='arrow_forward_ios'])[1]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver.findElement(By.xpath("//*[contains(@value,'Invalid Address')]"));
			value = field.isEnabled();
			field.click();

			field = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='close'])[2]"));
			field.click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTotalWithShippingCost() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val;
			double sum = 0;
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[18]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[18]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String shipval = val.getAttribute("value").replace(" ", "");

			sum = sum + Double.parseDouble(prodval.replace("$", "")) + Double.parseDouble(shipval.replace("$", ""));
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[18]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			DecimalFormat df = new DecimalFormat("#.00");
			String sumFormated = df.format(sum);
			System.out.println("Expected Total value : " + sumFormated);
			String actualval = val.getAttribute("value").replace(" ", "");
			System.out.println("Actual Total value : " + actualval.replace("$", ""));
			assertTrue(sumFormated.contains((actualval).replace("$", "")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userVerifiesTotalWithShippingCostForWoo() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val;
			double sum = 0;
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String shipval = val.getAttribute("value").replace(" ", "");

			sum = sum + Double.parseDouble(prodval.replace("$", "")) + Double.parseDouble(shipval.replace("$", ""));
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			DecimalFormat df = new DecimalFormat("#.00");
			String sumFormated = df.format(sum);
			System.out.println("Expected Total value : " + sumFormated);
			String actualval = val.getAttribute("value").replace(" ", "");
			System.out.println("Actual Total value : " + actualval.replace("$", ""));
			assertTrue(sumFormated.contains((actualval).replace("$", "")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userVerifiesTotalWithShippingCostForShopify() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val;
			double sum = 0;
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String shipval = val.getAttribute("value").replace(" ", "");

			sum = sum + Double.parseDouble(prodval.replace("$", "")) + Double.parseDouble(shipval.replace("$", ""));
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			DecimalFormat df = new DecimalFormat("#.00");
			String sumFormated = df.format(sum);
			System.out.println("Expected Total value : " + sumFormated);
			String actualval = val.getAttribute("value").replace(" ", "");
			System.out.println("Actual Total value : " + actualval.replace("$", ""));
			assertTrue(sumFormated.contains((actualval).replace("$", "")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userVerifiesTotalWithShippingCostForShopifyWithDiscount() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val;
			double sum = 0;
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String shipval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String discVal = val.getAttribute("value").replace(" ", "");

			sum = sum + Double.parseDouble(prodval.replace("$", "")) + Double.parseDouble(shipval.replace("$", ""));
			sum = sum - Double.parseDouble(discVal.replace("$", ""));

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[15]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			DecimalFormat df = new DecimalFormat("#.00");
			/*
			 * Validate Discount value
			 */
			double discamt = 0;
			discamt = discamt + Double.parseDouble(prodval.replace("$", ""));
			discamt = (discamt * 5)/100;
			String discFormated = df.format(discamt);
			System.out.println("Expected Discounted value : " + discFormated);
			assertTrue(discFormated.contains((discVal).replace("$", "")));
			/*
			 * validate total value
			 */

			String sumFormated = df.format(sum);
			System.out.println("Expected Total value : " + sumFormated);
			String actualval = val.getAttribute("value").replace(" ", "");
			System.out.println("Actual Total value : " + actualval.replace("$", ""));
			assertTrue(sumFormated.contains((actualval).replace("$", "")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}
	
	public static boolean userVerifiesTotalWithShippingCostForWooWithDiscount() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement val;
			double sum = 0;
			double prodsum=0;
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval1 = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText"));
			System.out.println("Product value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String prodval2 = val.getAttribute("value").replace(" ", "");
			
			prodsum = prodsum + Double.parseDouble(prodval1.replace("$", "")) + Double.parseDouble(prodval2.replace("$", ""));
			
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String shipval = val.getAttribute("value").replace(" ", "");

			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			System.out.println("Shipping value : " + val.getAttribute("value").replace("$", "").replace(" ", ""));
			String discVal = val.getAttribute("value").replace(" ", "");

			sum = sum + prodsum + Double.parseDouble(shipval.replace("$", ""));
			sum = sum - Double.parseDouble(discVal.replace("$", ""));
			
			
			val = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[17]/XCUIElementTypeOther[8]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
			DecimalFormat df = new DecimalFormat("#.00");
			/*
			 * Validate Discount value
			 */
			double discamt = 0;
			discamt = discamt + prodsum;
			discamt = (discamt * 5)/100;
			String discFormated = df.format(discamt);
			System.out.println("Expected Discounted value : " + discFormated);
			assertTrue(discFormated.contains((discVal).replace("$", "")));
			/*
			 * validate total value
			 */

			String sumFormated = df.format(sum);
			System.out.println("Expected Total value : " + sumFormated);
			String actualval = val.getAttribute("value").replace(" ", "");
			System.out.println("Actual Total value : " + actualval.replace("$", ""));
			assertTrue(sumFormated.contains((actualval).replace("$", "")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userValidatesDiscountsForBuyAgain(String discount) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;
			value = commonUtilityMethods.userClicksButtonByNameAndIndex("offerUnselected", "1");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			field = IOMD_driver.driver.findElement(By.xpath("//*[contains(@value,'" + discount + "% thru')]"));
			value = field.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userValidatesAutofilledDataInPayment() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(20000);
			WebElement field;
			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.iOMDPayCardNo + "')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.personaluserName + "')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.anonymousExpiryDate + "')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			field = IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@value,'" + iomd_TestData.anonymousCVV + "')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static boolean userEntersThePasswordandClicksOnTheEnterButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement password = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[@name='nodeNextGen'])[1]/XCUIElementTypeSecureTextField"));
			password.sendKeys("N0deNextGen");
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			value = commonUtilityMethods.userClicksButtonByOnlyName("Enter");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static boolean userfillsdataincheckoutpageforNodenextGen() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement field;
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTextField[@name='Email or mobile phone number']"));
			field.click();
			field.sendKeys("JasonSamuel231@gmail.com");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTextField[@name='First name (optional)']"));
			field.click();
			field.sendKeys("Jason");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTextField[@name='Last name']"));
			field.click();
			field.sendKeys("Samuel");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[@name='Address'])[2]"));
			field.click();
			field.sendKeys("766");
			Thread.sleep(2000);
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[contains(@name,'766, Anna Salai')]"));
			field.click();
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			value = commonUtilityMethods.userClicksButtonByOnlyName("Continue to shipping");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
			
			value = commonUtilityMethods.userClicksButtonByOnlyName("Continue to payment");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
			
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[contains(@name,' Card number')])[2]/XCUIElementTypeOther/XCUIElementTypeTextField"));
			field.click();
			field.sendKeys(iomd_TestData.iOMDPayCardNo);
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[contains(@name,' Name on card')])[2]/XCUIElementTypeOther/XCUIElementTypeTextField"));
			field.click();
			field.sendKeys(iomd_TestData.anonymousCardName);
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[contains(@name,' Expiration date')])[2]/XCUIElementTypeOther/XCUIElementTypeTextField"));
			field.click();
			field.sendKeys(iomd_TestData.anonymousExpiryDate);
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			field = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeOther[contains(@name,' Security code')])[2]/XCUIElementTypeOther/XCUIElementTypeTextField"));
			field.click();
			field.sendKeys(iomd_TestData.anonymousCVV);
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			
			value = commonUtilityMethods.userClicksButtonByOnlyName("Pay now");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			Thread.sleep(7000);
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
			
			value = commonUtilityMethods.ClicksOKBtninPopup();
			assertEquals(field, true, "Fields are not getting displayed as expected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}




	public static boolean userverifiesdeeplinkcontentandclicksonit() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement field;
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@value,'Want to manage your orders and keep your personal email private?')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@value,'Get a tokenized email to prevent spam and phishing attempts. Save and manage all your orders instantly and securely only on your phone using')]"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='node']"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='100% private. Instant & secure access on your phone.']"));
			value = field.isEnabled();
			assertEquals(value, true, "Data are not getting displayed as expected");
			
			value = commonUtilityMethods.userClicksButtonByOnlyName("Securely manage orders with node .");
			assertEquals(value, true, "Buttons are not getting clicked as expected");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}


}
