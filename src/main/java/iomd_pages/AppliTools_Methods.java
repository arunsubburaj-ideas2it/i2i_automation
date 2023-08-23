package iomd_pages;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;

import iomd_driver.IOMD_driver;
import iomd_testdata.iomd_TestData;

public class AppliTools_Methods implements iomd_TestData {

	private static WebDriver driver;
	private static Eyes eyes = new Eyes();

	public static void waitForElement(String ele) throws Throwable {
		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(IOMD_driver.driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean userStartEyestoValidate(String testname) throws Throwable {
		boolean value = true;
		try {
			eyes.setApiKey("0GQX4PR62hoqrbkhX5MTLN0tQFypuBo3lP7utC24KIo110");
			eyes.setBranchName("Branch1");
			eyes.open(IOMD_driver.driver, "Node Application testing", testname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userCloseEyestoValidate() throws Throwable {
		boolean value = true;
		try {
			eyes.close();
			eyes.abort();
			eyes.abortIfNotClosed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userChecksAllowPopupScreen() throws Throwable {
		boolean value = true;
		try {
			int ele;
			eyes.checkWindow("Allow Popup");
			waitForElement("//*[@name='Allow']");
			ele = IOMD_driver.driver.findElements(By.xpath("//*[@name='Allow']")).size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("//*[@name='Allow']")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userChecksSplashScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("Splash Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userChecksCheckboxScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("Checkbox Screen");
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[1]"))
					.click();
			eyes.checkWindow("With 1 checkbox selected");
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[2]"))
					.click();
			eyes.checkWindow("With 2 checkbox selected");
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[3]"))
					.click();
			eyes.checkWindow("With 3 checkbox selected");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Save and continue", "1");
			assertEquals(val, true, "unable to click the button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesBeginSetupScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("BeginSetup Screen");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Begin setup", "1");
			assertEquals(val, true, "unable to click the button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesSetupstep1Screen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("Setupstep1 Screen");
			val = commonUtilityMethods.userEnterTokenisedEmail();
			assertEquals(val, true, "unable to enter the emailId");
			eyes.checkWindow("Tokenised email Screen");
			val = commonUtilityMethods.userClicksBeginButton();
			assertEquals(val, true, "unable to click the Begin button");
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userChecksTellyourFriendsScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("TellyourFriends Screen");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("TELL YOUR FRIENDS", "1");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("Share Screen");
			val = commonUtilityMethods.userClicksButtonByOnlyName("Close");
			assertEquals(val, true, "unable to click the button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesSetupstep2Screen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("Setupstep2 Screen");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Enable Safari Browser Extension", "1");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("Setupstep2 Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userEnablesExtandSwitchtoApp() throws Throwable {
		boolean val = true;
		try {
			HomePage.userNaviagtesToTheSettingsApplication();
			boolean switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesExtensionEnabledScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("ExtensionEnabled Screen1");
			eyes.checkWindow("ExtensionEnabled Screen2");
			eyes.checkWindow("ExtensionEnabled Screen3");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Taking you to the dashboard...", "1");
			assertEquals(val, true, "unable to click the button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesAnimatedCardsInTheHomepage() throws Throwable {
		boolean val = true;
		boolean switchIOMDApplication;
		try {
			eyes.checkWindow("AnimatedCards Screen1");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open Safari to try this", "3");
			assertEquals(val, true, "unable to click the button");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");

			eyes.checkWindow("AnimatedCards Screen2");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Import Passwords", "2");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("Import Password Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();

			eyes.checkWindow("AnimatedCards Screen3");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open Safari to try this", "2");
			assertEquals(val, true, "unable to click the button");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
			
			eyes.checkWindow("AnimatedCards Screen4");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("TRY IT", "1");
			assertEquals(val, true, "unable to click the button");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static boolean userValidatesForwardEmailScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("ForwardEmail Screen");
			val = commonUtilityMethods.userClicksButtonByNameAndIndex("GOT IT", "1");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("ForwardEmail Screen2");
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeOther[1]/XCUIElementTypeButton)[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesBusinessTabScreen() throws Throwable {
		boolean val = true;
		try {
			eyes.checkWindow("Business Screen1");
			boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheBusinessTab();
			assertEquals(transactionTab, true, "User switches to the business tab");
			eyes.checkWindow("Business Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesInteractionTabScreen() throws Throwable {
		boolean val = true;
		try {
			boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheInteractionsTab();
			assertEquals(transactionTab, true, "User switches to the Interaction tab");
			eyes.checkWindow("Interaction Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesMessagesTabScreen() throws Throwable {
		boolean val = true;
		try {
			boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheMessagesTab();
			assertEquals(transactionTab, true, "User switches to the Messages tab");
			eyes.checkWindow("Messages Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesProfileScreen() throws Throwable {
		boolean val = true;
		try {
			boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheProfileTab();
			assertEquals(transactionTab, true, "User switches to the Profile tab");
			eyes.checkWindow("Profile Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesSettingsScreen() throws Throwable {
		boolean val = true;
		try {
			boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheSettingsTab();
			assertEquals(transactionTab, true, "User switches to the Settings tab");
			eyes.checkWindow("Settings Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesShowMeMagicInSettingsScreen() throws Throwable {
		boolean val = true;
		boolean switchIOMDApplication;
		try {
			userValidatesSettingsScreen();
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Show me the magic");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("ShowmeMagicScreen Screen");
			
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeOther[1]/XCUIElementTypeButton)[2]")).click();
			eyes.checkWindow("CurativeLifestyle Screen");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
			eyes.checkWindow("ShowmeMagicScreen Screen1");
			
			userValidatesSettingsScreen();
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Show me the magic");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("ShowmeMagicScreen Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			eyes.checkWindow("Reuters Screen");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
			eyes.checkWindow("ShowmeMagicScreen Screen2");
			
			userValidatesSettingsScreen();
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Show me the magic");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("ShowmeMagicScreen Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeButton")).click();
			eyes.checkWindow("BOFA Screen");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
			eyes.checkWindow("ShowmeMagicScreen Screen3");
			
			userValidatesSettingsScreen();
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Show me the magic");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("ShowmeMagicScreen Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeButton")).click();
			eyes.checkWindow("ChatGPT Screen");
			switchIOMDApplication = IOMD_driver.switchIOMDApplication();
			assertEquals(switchIOMDApplication, true, "User switches back to the application");
			eyes.checkWindow("ShowmeMagicScreen Screen4");
			
			val = commonUtilityMethods.userClicksButtonByOnlyName("whitebackicon");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("Settings Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public static boolean userValidatesCredentialsInSettingsScreen() throws Throwable {
		boolean val = true;
		try {
			userValidatesSettingsScreen();
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Saved Credentials");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("SavedCredentials Screen");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();
			eyes.checkWindow("Settings Screen");
			
			val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Add Credential");
			assertEquals(val, true, "unable to click the button");
			eyes.checkWindow("AddCredentials Screen");
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeOther[1]/XCUIElementTypeButton)[1]")).click();
			eyes.checkWindow("Settings Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
}
