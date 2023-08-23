package iomd_locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iomd_driver.IOMD_driver;

public class SafariLocators {
     
	public SafariLocators() {
		PageFactory.initElements(IOMD_driver.driver, this);
	}
	
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='Safari']")
	private WebElement safari;
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='Extensions']")
	private WebElement extension;
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='node.']")
	private WebElement extensionPopup;
	
	@FindBy(xpath="//XCUIElementTypeSwitch[@name='node.']")
	private WebElement allowExtension;
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='All Websites']")
	private WebElement askWebSite;
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='Allow']")
	private WebElement allowButton;

	public WebElement getSafari() {
		return safari;
	}

	public void setSafari(WebElement safari) {
		this.safari = safari;
	}

	public WebElement getExtension() {
		return extension;
	}

	public void setExtension(WebElement extension) {
		this.extension = extension;
	}

	public WebElement getExtensionPopup() {
		return extensionPopup;
	}

	public void setExtensionPopup(WebElement extensionPopup) {
		this.extensionPopup = extensionPopup;
	}

	public WebElement getAllowExtension() {
		return allowExtension;
	}

	public void setAllowExtension(WebElement allowExtension) {
		this.allowExtension = allowExtension;
	}

	public WebElement getAskWebSite() {
		return askWebSite;
	}

	public void setAskWebSite(WebElement askWebSite) {
		this.askWebSite = askWebSite;
	}

	public WebElement getAllowButton() {
		return allowButton;
	}

	public void setAllowButton(WebElement allowButton) {
		this.allowButton = allowButton;
	}
	
	@FindBy(xpath="//XCUIElementTypeCell[@name='Passwords']")
	public WebElement passwordButton;
	
	@FindBy(xpath="(//XCUIElementTypeSecureTextField[@name='Passcode field'])[2]")
	public WebElement passcodeField;
	
	
	
	
}
