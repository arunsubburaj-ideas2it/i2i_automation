package iomd_util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import iomd_driver.IOMD_driver;



public class Helper {
	
	public static AppiumDriver<MobileElement> driver;
	
	
	public static void highlightAndUnhighlightElement(WebElement emailValue) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", emailValue);
		Thread.sleep(3000);
		js.executeScript("arguments[0].removeAttribute('style','')", emailValue);
	}

}
