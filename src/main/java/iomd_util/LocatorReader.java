package iomd_util;

import iomd_locators.IOMD_AppLocator;
import iomd_locators.SafariLocators;
import iomd_locators.webPageLocators;

public class LocatorReader {
	
	private static LocatorReader reader = new LocatorReader();
	
	private static IOMD_AppLocator appLocator;
	
	private static SafariLocators safariLoc;
	
	private static webPageLocators webPage;
	
	private LocatorReader() {
		
	}
	
	public static LocatorReader getInstance() {
		return reader;
	}
	
	public IOMD_AppLocator getApplocator() {
		return (appLocator == null) ? new IOMD_AppLocator():appLocator;
		
	}
	public SafariLocators getASafariLocator() {
		return (safariLoc == null) ? new SafariLocators():safariLoc;
		
	}public webPageLocators getWebPageLocator() {
		return (webPage == null) ? new webPageLocators():webPage;
		
	}

}
