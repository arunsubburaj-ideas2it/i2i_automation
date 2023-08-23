package iomd_driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import iomd_util.ConfigReader;

public class DriverFactory {
	
	
	private static ThreadLocal<WebDriver> threadLocal_driver = new ThreadLocal();
	private static ThreadLocal<EventFiringWebDriver> threadLocal_eventDriver = new ThreadLocal();
	
	public void init_driver(String browser) throws MalformedURLException
	{
		String gridOrLocal =ConfigReader.readConfigFile().getProperty("grid");
		if(gridOrLocal.equals("true")) {
			String host = "localhost";
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			
			/*
			 * if(System.getProperty("HUB_HOST")!=null) {
			 * host=System.getProperty("HUB_HOST"); }
			 */
			
			String completeURL = "http://"+host+":4444/wd/hub";
			threadLocal_driver.set(new RemoteWebDriver(new URL(completeURL),dc));
		}
		else
		{
	//		WebDriverManager.chromedriver().setup();
	//		threadLocal_driver.set(new ChromeDriver());
			
			
		}
		
		/*
		 * EventFiringWebDriver eventDriver = new EventFiringWebDriver(getDriver());
		 * 
		 * MyWebDriverListeners myWebDriverListener = new MyWebDriverListeners();
		 * eventDriver.register(myWebDriverListener);
		 * 
		 * threadLocal_eventDriver.set(eventDriver);
		 */
		
				
		getDriver().manage().deleteAllCookies();
		
		getDriver().manage().window().maximize();
	
	}
	
	
	public static RemoteWebDriver getDriver()
	{
		return (RemoteWebDriver) threadLocal_driver.get();
	}
	
	
	

}
