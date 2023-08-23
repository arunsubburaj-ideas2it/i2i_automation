package iomd_stepdef;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.applitools.eyes.selenium.Eyes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import iomd_driver.IOMD_driver;
import iomd_util.ElementUtils;

public class MyHooks extends ElementUtils {

	public static AppiumDriver<MobileElement> driver;

	private static Eyes eyes = new Eyes();
	
	
	@Before(order = 0)
	public void openBrowser_EnterUrl(Scenario sc) throws MalformedURLException {
		try {
			startApp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strScenario = sc.getName();
	}

	@After(order = 1)
	public void tearDown(Scenario sc) {
		if (sc.isFailed()) {
			String scenarioName = sc.getName().replaceAll(" ", "_");
			byte[] source = ((TakesScreenshot) IOMD_driver.driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(source, "image/png", scenarioName);
		}
	}

	@After(order = 0)
	public void close_Browser(Scenario sc) {
		String strScenario = sc.getName();
		//eyes.close();
      //  driver.quit();
		//IOMD_driver.driver.close();

	}

}
