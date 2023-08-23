package iomd_driver;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import iomd_pages.commonUtilityMethods;
import iomd_util.LocatorReader;
import iomd_util.PropertyLoad;

public class IOMD_driver extends PropertyLoad {

	public static DesiredCapabilities capabilities;

	public static DesiredCapabilities capabilities2;

	public static AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> driver1;

	public static AppiumDriver<MobileElement> driver2;

	public static AppiumDriver<MobileElement> IomdApplicationLauncher() throws IOException {

		driver = null;
	

		try {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
					PropertyLoad.propLoad().getProperty("platformName"));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					PropertyLoad.propLoad().getProperty("platformVersion"));
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					PropertyLoad.propLoad().getProperty("deviceName"));
			capabilities.setCapability(MobileCapabilityType.UDID, PropertyLoad.propLoad().getProperty("udid"));
			capabilities.setCapability(MobileCapabilityType.APP, PropertyLoad.propLoad().getProperty("APP"));
			
			capabilities.setCapability("safariAllowPopups", "true");
			capabilities.setCapability("fullReset", "true");
			driver = new IOSDriver<MobileElement>(new URL(PropertyLoad.propLoad().getProperty("localhost")),
					capabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static void settingsExtensionEnable() {

		try {

			HashMap<String, Object> ref = new HashMap<String, Object>();
			ref.put("bundleId", "com.apple.Preferences");
			driver.executeScript("mobile: activateApp", ref);

			Thread.sleep(2000);
			WebElement safari = LocatorReader.getInstance().getASafariLocator().getSafari();
			safari.click();
			Thread.sleep(2000);
			WebElement extension = LocatorReader.getInstance().getASafariLocator().getExtension();
			extension.click();
			Thread.sleep(2000);
			WebElement extensionPopup = LocatorReader.getInstance().getASafariLocator().getExtensionPopup();
			extensionPopup.click();
			Thread.sleep(2000);
			WebElement allowExtension = LocatorReader.getInstance().getASafariLocator().getAllowExtension();
			Thread.sleep(2000);
			if (allowExtension.getAttribute("value").equals("1")) {
				System.out.println("Extension popup is enabled already");
			} else {
				allowExtension.click();
				Thread.sleep(2000);
			}

			LocatorReader.getInstance().getASafariLocator().getAskWebSite().click();
			Thread.sleep(2000);
			LocatorReader.getInstance().getASafariLocator().getAllowButton().click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void safariApplicationLaunching() {
		try {

			HashMap<String, Object> ref = new HashMap<String, Object>();
			ref.put("bundleId", "com.apple.mobilesafari");
			driver.executeScript("mobile: activateApp", ref);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void closeApplication() throws IOException {
		driver.terminateApp("com.apple.mobilesafari");
		HashMap<String, Object> ref = new HashMap<String, Object>();
		ref.put("bundleId", "com.apple.Preferences");
		driver.executeScript("mobile: activateApp", ref);
		driver.terminateApp("com.apple.Preferences");

	}

	public static boolean switchIOMDApplication() {
		boolean IOMDApplication = true;
		try {
			HashMap<String, Object> ref = new HashMap<String, Object>();
			ref.put("bundleId", "com.iomd.i2iautofill");
			driver.executeScript("mobile: activateApp", ref);
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		return IOMDApplication;
	}

	public static boolean deleteIOMDApplication() throws Throwable {
		boolean IOMDApplication = true;
		try {
			commonUtilityMethods.userClicksAllowBtn();
			HashMap<String, Object> ref = new HashMap<String, Object>();
			ref.put("bundleId", "com.iomd.i2iautofill");
			driver.removeApp("com.iomd.i2iautofill");
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		return IOMDApplication;
	}

	public static boolean switchIomdAdminApp() {
		boolean passwordUpdate = true;
		try {
			capabilities2 = new DesiredCapabilities();
			capabilities2.setCapability(MobileCapabilityType.PLATFORM_NAME,
					PropertyLoad.propLoad().getProperty("platformName"));
			capabilities2.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					PropertyLoad.propLoad().getProperty("platformVersion"));
			capabilities2.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			capabilities2.setCapability(MobileCapabilityType.DEVICE_NAME,
					PropertyLoad.propLoad().getProperty("deviceName"));
			capabilities2.setCapability(MobileCapabilityType.UDID, PropertyLoad.propLoad().getProperty("udid"));
			capabilities2.setCapability(MobileCapabilityType.APP, PropertyLoad.propLoad().getProperty("APP"));
			capabilities2.setCapability(MobileCapabilityType.APP, PropertyLoad.propLoad().getProperty("AdminAPP"));
			HashMap<String, Object> ref = new HashMap<String, Object>();
			ref.put("bundleId", "com.iomd.i2iautofilladmin");
			driver.executeScript("mobile: activateApp", ref);
			Thread.sleep(5000);

		} catch (Exception e) {

		}
		return passwordUpdate;
	}

}
