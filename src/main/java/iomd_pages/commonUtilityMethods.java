package iomd_pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iomd_driver.IOMD_driver;
import iomd_testdata.iomd_TestData;
import iomd_util.LocatorReader;
import iomd_util.PropertyLoad;

public class commonUtilityMethods implements iomd_TestData {

	/*
	 * Common Utility Methods subject to Extension and Fill options
	 */

	public static void waitForElement(String ele) throws Throwable {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(IOMD_driver.driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static boolean userEnterTheValueInTheInputBox(String emailid) throws Throwable {

		boolean email = false;
		try {

			WebElement emailValue = LocatorReader.getInstance().getApplocator().getEmailValue();
			email = emailValue.isDisplayed();
			emailValue.sendKeys(emailid);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return email;

	}

	public static boolean userEnterThePasswordAndDeleteData(String emailid) throws Throwable {

		boolean val = false;
		try {
			WebElement value = LocatorReader.getInstance().getApplocator().getPhPasswordValue();
			val = value.isDisplayed();
			value.sendKeys(emailid);
			IOMD_driver.driver.findElement(By.xpath("//*[@name='Done']")).click();
			Thread.sleep(3000);
			val = userClicksButtonByNameAndIndex("Delete All", "1");
			assertEquals(val, true, "Button is not getting displayed as expected");
			val = userClicksButtonByOnlyName("Confirm");
			assertEquals(val, true, "Button is not getting displayed as expected");
		} catch (Exception e) {
			e.printStackTrace();

		}

		return val;

	}

	public static boolean userClicksAllowBtn() throws Throwable {
		boolean email = false;
		try {
			Thread.sleep(5000);
			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Allow']")).size();
			if (ele > 0) {
				WebElement allow = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Allow']"));
				email = allow.isDisplayed();
				allow.click();
				Thread.sleep(2000);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	public static boolean userEnterTokenisedEmail() throws Throwable {
		boolean email = false;
		try {
			Thread.sleep(2000);
			int ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenEmailName + "')]"))
					.size();
			if (ele > 0) {
			} else {
				WebElement emailValue = LocatorReader.getInstance().getApplocator().getEmailValue();
				email = emailValue.isDisplayed();
				emailValue.click();
				emailValue.clear();
				emailValue.sendKeys(iomd_TestData.tokenEmailName);
				IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	public static boolean userEntersEmailInOnboardingFlow() throws Throwable {
		boolean email = false;
		try {
			Thread.sleep(2000);
			int ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenEmailName + "')]"))
					.size();
			if (ele > 0) {
			} else {
				WebElement emailValue = LocatorReader.getInstance().getApplocator().getEmailValue();
				email = emailValue.isDisplayed();
				emailValue.click();
				emailValue.clear();
				emailValue.sendKeys(iomd_TestData.tokenEmailName);
				IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	public static boolean userClicksOnTheFetchButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getFetch();
			fetchbutton = fetch.isDisplayed();
			fetch.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchbutton;

	}

	public static boolean userSelectsTheAddressFromTheExtension() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("ADDRESS"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			WebElement addressField = LocatorReader.getInstance().getWebPageLocator().getAddressField();
			addressField.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userSelectsTheOtherAddressFromTheExtension() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("ADDRESS"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			WebElement addressField = LocatorReader.getInstance().getWebPageLocator().getAddress2Field();
			addressField.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userSelectsPhoneNumberFromTheExtension() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("PHONE"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			WebElement phoneField = LocatorReader.getInstance().getWebPageLocator().getPhoneField();
			phoneField.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userSelectsAnonymousName() throws Throwable {
		boolean name = true;

		try {
			Thread.sleep(5000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("NAME"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			WebElement anonymousName = LocatorReader.getInstance().getWebPageLocator().getAnonymousName();
			anonymousName.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;

	}

	public static boolean userSelectsUserName() throws Throwable {
		boolean name = true;

		try {
			Thread.sleep(5000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("NAME"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			WebElement anonymousName = LocatorReader.getInstance().getWebPageLocator().getUserName();
			anonymousName.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;

	}

	public static boolean userSelectsAnonymousMailId() throws Throwable {
		boolean mailid = true;

		try {
			Thread.sleep(3000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.name("SIGN IN"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			WebElement anonomyousMailId = LocatorReader.getInstance().getWebPageLocator().getAnonomyousMailId();
			anonomyousMailId.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailid;
	}

	public static boolean userEnablesTheExtension() throws Throwable {
		boolean extension = true;
		Thread.sleep(8000);
		WebElement autofillExt;
		try {
			Thread.sleep(2000);
			int ele;
			ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeButton[@name='PageFormatMenuButton']"))
					.size();
			if (ele > 0) {
				autofillExt = LocatorReader.getInstance().getWebPageLocator().getAutoFillExtension();
				autofillExt.click();
				Thread.sleep(2000);
			} else {
				ele = IOMD_driver.driver
						.findElements(By.xpath("//*[contains(@value,'.com') or contains(@value,'.app')]")).size();
				if (ele > 0) {
					WebElement fetch = IOMD_driver.driver
							.findElement(By.xpath("//*[contains(@value,'.com') or contains(@value,'.app')]"));
					extension = fetch.isEnabled();
					fetch.click();
					Thread.sleep(2000);
					autofillExt = LocatorReader.getInstance().getWebPageLocator().getAutoFillExtension();
					autofillExt.click();
					Thread.sleep(2000);
				}

			}
			WebElement iomdExtension = LocatorReader.getInstance().getWebPageLocator().getIomdExtension();
			iomdExtension.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return extension;

	}

	public static boolean userClicksFillButton() throws Throwable {
		boolean fillBtn = true;

		try {
			LocatorReader.getInstance().getWebPageLocator().getFillButtonClick().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return fillBtn;

	}

	public static boolean ClickAndValidateSavedCardPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			waitForElement("//*[@name='Save this card on your device & never type it again.']");
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator().getSaveCardmessageAlert();
			messageAlert = messageAlert2.isDisplayed();

			// XCUIElementTypeStaticText[@name="OK"]
			WebElement okBtn = LocatorReader.getInstance().getApplocator().getSaveCardsOKBtn();
			messageAlert = okBtn.isEnabled();
			okBtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean ClicksOKBtninPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			Thread.sleep(5000);
			WebElement fetch;
			int ele1 = IOMD_driver.driver.findElements(By.xpath("//*[@name='Not Now']")).size();
			if (ele1 > 0) {
				fetch = IOMD_driver.driver.findElement(By.xpath("//*[@name='Not Now']"));
				messageAlert = fetch.isEnabled();
				fetch.click();
				Thread.sleep(2000);
			}
			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name='OK']")).size();
			if (ele > 0) {
				fetch = LocatorReader.getInstance().getApplocator().getOkBtn();
				messageAlert = fetch.isEnabled();
				fetch.click();
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean ClickAndUpdateCardPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			waitForElement("//*[@name='Update this card on your device & never type it again.']");
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator().getUpdateCardmessageAlert();
			messageAlert = messageAlert2.isDisplayed();
			WebElement okBtn = LocatorReader.getInstance().getApplocator().getSaveCardsOKBtn();
			messageAlert = okBtn.isEnabled();
			okBtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean ClickAndValidateSavedCredentialsPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			waitForElement("//XCUIElementTypeTextView[@name='Save your login credentials to never type again.']");
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator().getSaveCredentialsmessageAlert();
			messageAlert = messageAlert2.isDisplayed();
			WebElement okBtn = LocatorReader.getInstance().getApplocator().getSaveCredentialOKBtn();
			messageAlert = okBtn.isEnabled();
			okBtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean ClickAndValidateSaveSignupCredentialsPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			waitForElement(
					"//XCUIElementTypeTextView[@name='Save your personal profile and login credentials to never type again.']");
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator()
					.getSaveSignupCredentialsmessageAlert();
			messageAlert = messageAlert2.isDisplayed();
			WebElement okBtn = LocatorReader.getInstance().getApplocator().getSaveCredentialOKBtn();
			messageAlert = okBtn.isEnabled();
			okBtn.click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean userValidatesTheSavedCardDetails() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[3]")).click();
			waitForElement("//XCUIElementTypeButton[@name='Cards']");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Cards']")).click();
			List<WebElement> cardValues = LocatorReader.getInstance().getApplocator().getSavedCardDetails();
			for (int i = 0; i < cardValues.size(); i++) {
				cardValues.get(i).isDisplayed();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean ClickAndValidateSavePasswordPopup() throws Throwable {
		boolean messageAlert = true;

		try {
			waitForElement(
					"//XCUIElementTypeTextView[@name='Is this the right password to save for future use in IOMD?']");
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator().getSavePwdAlert();
			messageAlert = messageAlert2.isDisplayed();
			WebElement okBtn = LocatorReader.getInstance().getApplocator().getsavePwdOKBtn();
			messageAlert = okBtn.isEnabled();
			okBtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean userValidatesAndClicksOnTheInteractionsTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(2000);
//			userValidatesAndClicksOnTheProfileTab();
//			userValidatesAndClicksOnTheBusinessTab();
			// waitForElement("//XCUIElementTypeStaticText[@name='Interactions']");
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getInteractionsTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheProfileTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(2000);
			// waitForElement("//XCUIElementTypeTabBar[@name='Tab
			// Bar']/XCUIElementTypeButton[3]");
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getProfilesTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}
	public static boolean userValidatesAndClicksOnTheSettingsTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(2000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getSettingsTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheHomeTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(2000);
			// waitForElement("//XCUIElementTypeTabBar[@name='Tab
			// Bar']/XCUIElementTypeButton[2]");
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getHomeTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheLoginFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getLoginInteraction();
			transactiontab = transactionTab2.isDisplayed();
//			transactionTab2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnThePwdChangeFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getPwdInteraction();
			transactiontab = transactionTab2.isDisplayed();
//			transactionTab2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheOthersFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getOthersInteraction();
			transactiontab = transactionTab2.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheRegisterFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getRegisterInteraction();
			transactiontab = transactionTab2.isDisplayed();
//			transactionTab2.click();
//			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheCheckoutFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getCheckoutInteraction();
			transactiontab = transactionTab2.isDisplayed();
//			transactionTab2.click();
//			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnThePaymentFromInteractionTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(3000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getPaymentInteraction();
			transactiontab = transactionTab2.isDisplayed();
//			transactionTab2.click();
//			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheBusinessTab() throws Throwable {
		boolean transactiontab = true;
		try {
			WebElement transactionTab2;
			Thread.sleep(2000);
			transactionTab2 = LocatorReader.getInstance().getApplocator().getInteractionsTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(2000);
			transactionTab2 = LocatorReader.getInstance().getApplocator().getBusinessNameTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userValidatesAndClicksOnTheMessagesTab() throws Throwable {
		boolean transactiontab = true;
		try {
			Thread.sleep(2000);
			WebElement transactionTab2 = LocatorReader.getInstance().getApplocator().getMessageTab();
			transactiontab = transactionTab2.isDisplayed();
			transactionTab2.click();
			Thread.sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactiontab;

	}

	public static boolean userClicksBusinessWithOnlyNameAndStaticText(String business) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + business + "']"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userClicksThebuisnessAndVerifiesTheEmailDetailsPresentInside() {
		boolean enterButton = true;
		try {
			Thread.sleep(3000);
			WebElement emailSelected = LocatorReader.getInstance().getApplocator().getOtheremailSelected();
			enterButton = emailSelected.isDisplayed();
			WebElement backbutton = LocatorReader.getInstance().getApplocator().getBackbutton();
			Thread.sleep(3000);
			backbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return enterButton;
	}

	public static boolean userClicksThebuisnessAndVerifiesThePhoneDetailsPresentInside() {
		boolean enterButton = true;
		try {
			Thread.sleep(3000);
			WebElement phSelected = LocatorReader.getInstance().getApplocator().getPhoneSelected();
			enterButton = phSelected.isDisplayed();
			WebElement backbutton = LocatorReader.getInstance().getApplocator().getBackbutton();
			Thread.sleep(3000);
			backbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return enterButton;
	}

	public static boolean userValidatesHomePageData() {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getHeaderText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"The fastest, most convenient, and safest platform to interact online without sharing any personal information.");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Welcome to the online revolution. It's personal.");

			textData = LocatorReader.getInstance().getApplocator().getEmailFieldText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"Create a random tokenized email. This can be changed anytime.");

			textData = LocatorReader.getInstance().getApplocator().getEmailDomainText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "@iomd.info");

			textData = LocatorReader.getInstance().getApplocator().getKeyHeaderText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "You can now use this anywhere:");

			textData = LocatorReader.getInstance().getApplocator().getKeyItemsText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains("Stop all spam, phishing, & hacking"));
			assertTrue(textData.getAttribute("name").contains("End email clutter and focus on what you want"));
			assertTrue(textData.getAttribute("name").contains("Forward to your existing inbox instantly"));

			WebElement savebutton = LocatorReader.getInstance().getApplocator().getSaveTokenizedEmailBtn();
			value = savebutton.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesFirstScreenInOnboarding() {
		boolean value = true;
		try {
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).click();
			Thread.sleep(3000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getWelcomeText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Welcome to your node.");

			textData = LocatorReader.getInstance().getApplocator().getHeaderText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"The fastest, safest, most convenient way to  interact online.");

			textData = LocatorReader.getInstance().getApplocator().getPersonalFieldText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), ("It’s personal."));

			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("direction", "left");
			js.executeScript("mobile: swipe", scrollObject);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userNavigatesFirstScreenInOnboarding() throws Throwable {
		boolean value = true;
		try {

			int ele;
			waitForElement("//*[@name='Allow']");
			ele = IOMD_driver.driver.findElements(By.xpath("//*[@name='Allow']")).size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("//*[@name='Allow']")).click();
			}
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).click();
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[1]")).click();
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[2]")).click();
			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='checkMark Unselected'])[3]")).click();
			commonUtilityMethods.userClicksButtonByNameAndIndex("Continue","1");
			Thread.sleep(3000);
			commonUtilityMethods.userClicksButtonByNameAndIndex("Begin setup","1");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userContinuesFirstScreenInOnboarding() throws Throwable {
		boolean value = true;
		try {

			int ele;

			Thread.sleep(2000);
			waitForElement("(//*[contains(@name,'Open')])[1]");
			ele = IOMD_driver.driver.findElements(By.xpath("(//*[contains(@name,'Open')])[1]")).size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("(//*[contains(@name,'Open')])[1]")).click();
			}

			waitForElement("//*[@name='Allow']");
			ele = IOMD_driver.driver.findElements(By.xpath("//*[@name='Allow']")).size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("//*[@name='Allow']")).click();
			}

			Thread.sleep(2000);
			waitForElement("//*[@name='Allow Paste']");
			ele = IOMD_driver.driver.findElements(By.xpath("//*[@name='Allow Paste']")).size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("//*[@name='Allow Paste']")).click();
			}

			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeButton")).click();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("direction", "left");
			js.executeScript("mobile: swipe", scrollObject);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userClicksOpenBtn() throws Throwable {
		boolean value = true;
		try {
			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name='OK']")).size();
			if (ele > 0) {
				WebElement fetch = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='OK']"));
				value = fetch.isEnabled();
				fetch.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesOnSuccessfullLoginWithTokenizedEmail() {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getHeaderText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"The fastest, most convenient, and safest platform to interact online without sharing any personal information.");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Welcome to the online revolution. It's personal.");

			textData = LocatorReader.getInstance().getApplocator().getCongratsEmailText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name")
					.contains("Congratulations, you now have a super-power tokenized email!"));
			assertTrue(textData.getAttribute("name").contains(
					"IOMD automatically recognizes any site that asks for an email, and gives you the choice to instantly enter"));

			textData = LocatorReader.getInstance().getApplocator().getKeyItemsText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains("Stop all spam, phishing, & hacking"));
			assertTrue(textData.getAttribute("name").contains("End email clutter and focus on what you want"));
			assertTrue(textData.getAttribute("name").contains("Forward to your existing inbox instantly"));

			WebElement savebutton = LocatorReader.getInstance().getApplocator().getCheckYourMessageBtn();
			value = savebutton.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesDatainTokenisedAndPersonalInfoPage() {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getHeaderText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"The fastest, most convenient, and safest platform to interact online without sharing any personal information.");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Welcome to the online revolution. It's personal.");

			textData = LocatorReader.getInstance().getApplocator().getPersonalTokenisedText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains(
					"Here is the personal and tokenized information you have on this device so far. Once it's here, you never have to type it again."));

			textData = LocatorReader.getInstance().getApplocator().getTokenisedPersonalInfoText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Tokenized personal information:");

			textData = LocatorReader.getInstance().getApplocator().getTokenisedPersonalInfoData();
			String info = textData.getAttribute("name");
			assertTrue(info.contains(
					"When you don’t feel you are benefitting from providing your information, have the choice to tokenize it!"));
			assertTrue(info.contains(
					"It’ll stop unnecessary email and text spam, phishing, email clutter, physical junk mail, and give you a choice not to give information if you are not immediately benefitting from it."));

			textData = LocatorReader.getInstance().getApplocator().getTokenisedEmailData();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name")
					.contains("Use this to stop spam, phishing, hacking & end email clutter."));

			textData = LocatorReader.getInstance().getApplocator().getTokenisedPhData();
			assertTrue(textData.getAttribute("name").contains("Use this when you don't need a text or a call back."));

			textData = LocatorReader.getInstance().getApplocator().getTokenisedAddressData();
			assertTrue(textData.getAttribute("name").contains(
					"Use this when you don't need anything shipped to you or you don't want eco-unfriendly junk mail that wastes paper."));

			textData = LocatorReader.getInstance().getApplocator().getTokenisedUsernameData();
			assertTrue(textData.getAttribute("name")
					.contains("Don't want to share your name? Enter the name of your choice"));

			textData = LocatorReader.getInstance().getApplocator().getPersonalInfoText();
			assertTrue(textData.getAttribute("name").contains("Personal information:"));

			textData = LocatorReader.getInstance().getApplocator().getPersonalInfoData();
			String info1 = textData.getAttribute("name");
			assertTrue(info1.contains("You don’t have to type anything now if you don’t want to!"));
			assertTrue(info1.contains(
					"You can use IOMD anywhere online immediately, and the first time you enter any of this information, the system will give you a choice to save it only if you want to, so you never have to type it again."));
			assertTrue(info1.contains(
					"Ofcourse, if you want to add it now, go ahead!  You can also scan a document if you prefer the system to get the information from there. Your choice!"));

			WebElement savebutton = LocatorReader.getInstance().getApplocator().getSaveAndshowMeMagicBtn();
			value = savebutton.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesWelcomeEmailData() {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getWelcomeSubjectText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Welcome to IOMD");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"),
					"Welcome to the online revolution. It’s personal. The magic begins:");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentPoint1Text();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Here’s what you can do now with the tokenized email:");

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentAText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains("Forward to your personal email. Try it now! "
					+ "Click on the upper right arrow and enter your personal email. "
					+ "You will also be asked whether you want to save your personal email for future use. Type once, never type again!."));

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentBText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name")
					.contains("Use it anywhere & get all your communications and receipts here - online & offline. "
							+ "Enter or updated your tokenized email on any website or app, or you can even say it when some asks you for your email in a store or over the phone. "
							+ "This ensures that all communications gets organized in one place, and you will never get spammed or phished if your information ever gets compromised on any of those sites."));

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentCText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains("End email clutter by organizing. "
					+ "Click on Messages above first and then the filter icon on the upper left, and see how everything gets automatically organized. "
					+ "Direct all your emails here, simplify your life by keeping all relevant product purchases, tracking, returns, marketing offers "
					+ "and newsletters instantly accessible, and keep your life safe with no spam or phishing ever."));

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailContentPoint2Text();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name")
					.contains("All this cool stuff just by choosing to tokenize your email! "
							+ "How about choosing to tokenize your phone number, address, and even name? Let’s see what you gain!"));

			textData = LocatorReader.getInstance().getApplocator().getWelcomeEmailFinishText();
			value = textData.isDisplayed();
			assertTrue(textData.getAttribute("name").contains("Now to finish up!"));

			WebElement savebutton = LocatorReader.getInstance().getApplocator().getShowMeMagicBtn();
			value = savebutton.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesTokenPesonalInfoPage() {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement textData;
			textData = LocatorReader.getInstance().getApplocator().getEmailFieldText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "you now have a tokenized email address.");

			textData = LocatorReader.getInstance().getApplocator().getCongratsEmailText();
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Congratulations!");

			textData = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Tokenized Info']"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Tokenized Info");
			textData = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='only on this device'])[1]"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "only on this device");

			textData = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Personal Info']"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "Personal Info");
			textData = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='only on this device'])[2]"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "only on this device");

			textData = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='populate my personal info later']"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "populate my personal info later");

			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='infoIcon'])[1]")).click();
			textData = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name='Your tokenized info you can choose to share with businesses.']"));
			assertEquals(textData.getAttribute("name"), "Your tokenized info you can choose to share with businesses.");
			IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name='Your tokenized info you can choose to share with businesses.']"))
					.click();

			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='infoIcon'])[2]")).click();
			textData = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeStaticText[@name='Your personal info, only available on this device. ']"));
			assertEquals(textData.getAttribute("name"), "Your personal info, only available on this device. ");
			IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeStaticText[@name='Your personal info, only available on this device. ']"))
					.click();

			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='infoIcon'])[3]")).click();
			textData = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name='You can choose to save your info on node. whenever you sign in next.']"));
			assertEquals(textData.getAttribute("name"),
					"You can choose to save your info on node. whenever you sign in next.");
			IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name='You can choose to save your info on node. whenever you sign in next.']"))
					.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesEnableExtensionPage() {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement textData;

			textData = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='node. needs to communicate with your browser']"));
			value = textData.isDisplayed();
			assertEquals(textData.getAttribute("name"), "node. needs to communicate with your browser");

			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Enable Extension']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userClicksEnableExtension() {
		boolean value = true;
		try {

			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Enable Extension']"))
					.size();
			if (ele > 0) {
				IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Enable Extension']")).click();
				Thread.sleep(2000);
				boolean switchIOMDApplication = IOMD_driver.switchIOMDApplication();
				assertEquals(switchIOMDApplication, true, "User switches back to the application");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatesShowMeMagicPage() {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement textData;

			textData = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Experience node. wherever you want.']"));
			assertEquals(textData.getAttribute("name"), "Experience node. wherever you want.");

			textData = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Instant, Automatic, Safe.']"));
			assertTrue(textData.getAttribute("name").contains("Instant, Automatic, Safe."));

			textData = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'CurativeLifestyle')]"));
			assertTrue(textData.getAttribute("name").contains("CurativeLifestyle"));

			textData = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Reuters')]"));
			assertTrue(textData.getAttribute("name").contains("Reuters"));

			textData = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Bank Of America')]"));
			assertTrue(textData.getAttribute("name").contains("Bank Of America"));

			textData = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'ChatGPT')]"));
			assertTrue(textData.getAttribute("name").contains("ChatGPT"));

			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userClicksBeginButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getSaveTokenizedEmailBtn();
			fetchbutton = fetch.isEnabled();
			fetch.click();
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchbutton;

	}

	public static boolean userClicksSaveAndShowMeMagicButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getSaveAndshowMeMagicBtn();
			fetchbutton = fetch.isDisplayed();
			fetch.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchbutton;

	}

	public static boolean userClicksCheckYourMessageButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getCheckYourMessageBtn();
			fetchbutton = fetch.isDisplayed();
			fetch.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchbutton;

	}

	public static boolean userClicksShowMeMagicButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getShowMeMagicBtn();
			fetchbutton = fetch.isDisplayed();
			fetch.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fetchbutton;
	}

	public static boolean userClicksOkGotItButton() throws Throwable {

		boolean button = false;
		try {
			waitForElement("//XCUIElementTypeButton[@name='Ok! Got it!']");
			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Ok! Got it!']")).size();
			if (ele > 0) {
				WebElement fetch = LocatorReader.getInstance().getApplocator().getOkGotitBtn();
				button = fetch.isEnabled();
				fetch.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return button;
	}

	public static boolean userClicksIOMDBackButton() throws Throwable {

		boolean fetchbutton = false;
		try {
			WebElement fetch = LocatorReader.getInstance().getApplocator().getIomdBackBtn();
			fetchbutton = fetch.isDisplayed();
			fetch.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fetchbutton;
	}

	public static boolean userEntersTokenisedFirstAndLastname() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);

			WebElement firstName = LocatorReader.getInstance().getApplocator().getTokenisedFirstName();
			value = firstName.isDisplayed();
			firstName.click();
			firstName.clear();
			firstName.sendKeys("TokenFirst");
			WebElement lastName = LocatorReader.getInstance().getApplocator().getTokenisedLastName();
			value = lastName.isDisplayed();
			lastName.click();
			lastName.clear();
			lastName.sendKeys("TokenLast");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersPersonalisedData() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(7000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='onswitch']")).click();

			WebElement firstName = LocatorReader.getInstance().getApplocator().getPersonalFirstName();
			value = firstName.isEnabled();
			firstName.click();
			firstName.clear();
			firstName.sendKeys(iomd_TestData.personalfirstName);

			WebElement lastName = LocatorReader.getInstance().getApplocator().getPersonalLastName();
			value = lastName.isEnabled();
			lastName.click();
			lastName.clear();
			lastName.sendKeys(iomd_TestData.personallastName);

			WebElement email = LocatorReader.getInstance().getApplocator().getPersonalEmailId();
			value = email.isEnabled();
			email.click();
			email.clear();
			email.sendKeys(iomd_TestData.personalMailId);

			WebElement address = LocatorReader.getInstance().getApplocator().getPersonalStreetAdd1();
			value = address.isEnabled();
			address.click();
			address.clear();
			address.sendKeys(iomd_TestData.personalAddressIOMDPay1);

			WebElement city = LocatorReader.getInstance().getApplocator().getPersonalCity();
			value = city.isEnabled();
			city.click();
			city.clear();
			city.sendKeys(iomd_TestData.personalCity);

			WebElement state = LocatorReader.getInstance().getApplocator().getPersonalState();
			value = state.isEnabled();
			state.click();
			state.clear();
			state.sendKeys(iomd_TestData.personalState);

			WebElement country = LocatorReader.getInstance().getApplocator().getPersonalCountry();
			value = country.isEnabled();
			country.click();
			country.clear();
			country.sendKeys(iomd_TestData.personalCountry);

			WebElement zipcode = LocatorReader.getInstance().getApplocator().getPersonalZipCode();
			value = zipcode.isEnabled();
			zipcode.click();
			zipcode.clear();
			zipcode.sendKeys(iomd_TestData.personalzipCode);

			WebElement phno = LocatorReader.getInstance().getApplocator().getPersonalPhoneNo();
			value = phno.isEnabled();
			phno.click();
			phno.clear();
			phno.sendKeys(iomd_TestData.personalPhoneNumber);

			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Save']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersPersonalisedDataWithInvalidAddress() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='onswitch']")).click();
			WebElement email = LocatorReader.getInstance().getApplocator().getPersonalEmailId();
			value = email.isDisplayed();
			email.click();
			email.clear();
			email.sendKeys("personaltest@gmail.com");

			WebElement phno = LocatorReader.getInstance().getApplocator().getPersonalPhoneNo();
			value = phno.isDisplayed();
			phno.click();
			phno.clear();
			phno.sendKeys("4081123232");

			WebElement address1 = LocatorReader.getInstance().getApplocator().getTokenStreetAdd1();
			value = address1.isDisplayed();
			address1.click();
			address1.clear();
			address1.sendKeys("Invalid Address");

			WebElement zipcode1 = LocatorReader.getInstance().getApplocator().getTokenZipCode();
			value = zipcode1.isDisplayed();
			zipcode1.click();
			zipcode1.clear();
			zipcode1.sendKeys("9402590");

			WebElement address = LocatorReader.getInstance().getApplocator().getPersonalStreetAdd1();
			value = address.isDisplayed();
			address.click();
			address.clear();
			address.sendKeys("842 South Broadway");

			WebElement city = LocatorReader.getInstance().getApplocator().getPersonalCity();
			value = city.isDisplayed();
			city.click();
			city.clear();
			city.sendKeys("Los Angeles");

			WebElement state = LocatorReader.getInstance().getApplocator().getPersonalState();
			value = state.isDisplayed();
			state.click();
			state.clear();
			state.sendKeys("California");

			WebElement country = LocatorReader.getInstance().getApplocator().getPersonalCountry();
			value = country.isDisplayed();
			country.click();
			country.clear();
			country.sendKeys("United States");

			WebElement zipcode = LocatorReader.getInstance().getApplocator().getPersonalZipCode();
			value = zipcode.isDisplayed();
			zipcode.click();
			zipcode.clear();
			zipcode.sendKeys("94025");

			WebElement firstName = LocatorReader.getInstance().getApplocator().getPersonalFirstName();
			value = firstName.isDisplayed();
			firstName.click();
			firstName.clear();
			firstName.sendKeys("PersonalFirst");

			WebElement lastName = LocatorReader.getInstance().getApplocator().getPersonalLastName();
			value = lastName.isDisplayed();
			lastName.click();
			lastName.clear();
			lastName.sendKeys("PersonalLast");

			IOMD_driver.driver.findElement(By.xpath("//*[@name='Done']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesPersonalDataInIOMD() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement element;

			IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[3]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Personal']")).click();

			element = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.personalMailId + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.personalfirstName + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.personallastName + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.personalPhoneNumber + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.personalAddressIOMD + "')]"));
			assertTrue(element.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTokenisedDataInIOMD() throws Throwable {
		boolean value = true;
		try {
			WebElement element;
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Tokenized']")).click();
			element = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@value,'"
					+ PropertyLoad.propLoad().getProperty("tokenEmailID") + "@iomd.info')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.tokenisedfirstName + "')]"));
			assertTrue(element.isDisplayed());
			element = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.tokenisedlastName + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.tokenisedPhoneNumber + "')]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[contains(@value,'" + iomd_TestData.tokenisedAddressIOMD + "')]"));
			assertTrue(element.isDisplayed());
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeImage[@name='tabHome']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	/*
	 * =============================================================================
	 * ======= Optimisation Methods
	 * =============================================================================
	 * =======
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

	public static boolean userEntersRandomEmaildetailsInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of email: " + IOMD_driver.driver
					.findElement(
							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.iomdEmail + "')]"))
					.getAttribute("value"));
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getEmailIdFieldValue();
			emailAddressDetails.click();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField"))
					.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersValidEmaildetailsForNyTimes() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
//			System.out.println("Value of email: " + IOMD_driver.driver
//					.findElement(
//							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.iomdEmail + "')]"))
//					.getAttribute("value"));
//			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getEmailIdFieldValue();
//			emailAddressDetails.click();
//			emailAddressDetails.clear();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField")).clear();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField"))
					.sendKeys("smitha.rajagopal@ideas2it.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheEmaildetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of email: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousMailId + "')]"))
					.getAttribute("value"));
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getEmailIdFieldValue();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheFirstNamedetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of FirstName: " + IOMD_driver.driver
					.findElement(
							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.firstName + "')]"))
					.getAttribute("value"));

			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getFirstNameFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.firstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheLastNamedetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of FirstName: " + IOMD_driver.driver
					.findElement(
							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.lastName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getLastNameFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheAnonymousPhoneNumberdetailsAreGettingAsExpectedInTheWebsite()
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out
					.println(
							"Value of Phone number: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.anonymousPhoneNumber + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getPhoneNumberFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.anonymousPhoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheAnonymousPhoneNumberdetailsWithFormatInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out
					.println(
							"Value of Phone number: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.anonymousPhWithFormat + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator()
					.getPhoneNumberWithFormatFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.anonymousPhWithFormat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheOtherPhoneNumberdetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of PhoneNumber: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.otherPhoneNumber + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getOtherPhoneNumberFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.otherPhoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheCountrydetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			int ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCountry + "')]"))
					.size();
			if (ele > 0) {
				System.out.println("Element is present");
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getCountryFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.Country);
			} else {
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getCountrySFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalCountryShort);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheCitydetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			int ele = IOMD_driver.driver
					.findElements(By
							.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCity + "')]"))
					.size();
			if (ele > 0) {
				System.out.println("Element is present");
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getCountryFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalCity);
			} else {
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getCitySFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalCityShort);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheStatedetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			int ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalState + "')]"))
					.size();
			if (ele > 0) {
				System.out.println("Element is present");
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getStateFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalState);
			} else {
				WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getStateSFieldValue();
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalStateShort);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheZipCodedetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of ZipCode: " + IOMD_driver.driver
					.findElement(
							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.zipCode + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = LocatorReader.getInstance().getWebPageLocator().getZipCodeFieldValue();
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.zipCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userLaunchesUrl(String url) throws Throwable {
		boolean value = true;
		try {
			IOMD_driver.driver.get(url);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByName(String btnName) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			waitForElement("//*[contains(@name,'" + btnName + "')]");
			WebElement btn = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'" + btnName + "')]"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByOnlyStaticText(String btnName) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + btnName + "']"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByOnlyName(String btnName) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(7000);
			WebElement btn = IOMD_driver.driver.findElement(By.xpath("//*[@name='" + btnName + "']"));
			btn.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userClicksButtonByOnlyStaticTextAndIndex(String btnName, String index) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='" + btnName + "'])[" + index + "]"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByNameAndIndex(String btnName, String index) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("(//*[contains(@name,'" + btnName + "')])[" + index + "]"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByValue(String linkName) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement link = IOMD_driver.driver.findElement(By.xpath("//*[contains(@value,'" + linkName + "')]"));
			value = link.isEnabled();
			link.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userRefreshThePage() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			IOMD_driver.driver.navigate().refresh();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksButtonByOnlyVisibleText(String btnName) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement btn = IOMD_driver.driver.findElement(By.xpath("//*[text()='" + btnName + "']"));
			value = btn.isEnabled();
			btn.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesRecentRecordInPurchaseColumn() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement btn = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell"));
			value = btn.isEnabled();
			value = btn.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userclicksNodeButtonInWoo() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement btn = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[8]/XCUIElementTypeButton"));
			value = btn.isEnabled();
			btn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userclicksNodeButtonInShopify() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			RemoteWebElement parent1 = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeButton[3]"));
			String parentId1 = parent1.getId();
			JavascriptExecutor js1 = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject1 = new HashMap<>();
			scrollObject1.put("element", parentId1);
			scrollObject1.put("direction", "down");
			js1.executeScript("mobile:scroll", scrollObject1);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeButton[3]"));
			value = btn.isEnabled();
			btn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userclicksNodeButtonInShopifyFromCartPage() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement btn = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeButton[5]"));
			value = btn.isEnabled();
			btn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/*
	 * =============================================================================
	 * ======= Selecting Tokenised and Personal data Methods
	 * =============================================================================
	 * =======
	 */

	public static boolean userSelectsTokenisedMailId() throws Throwable {
		boolean value = true;
		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'email')]");
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//*[contains(@name,'" + iomd_TestData.tokenEmailID + "')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'email')]"));
			field.click();
			Thread.sleep(2000);
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.tokenEmailID + "']"));
			value = field.isEnabled();
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsTokenisedUserName() throws Throwable {
		boolean value = true;
		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'User ')]");
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'User ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'User ')]"));
			field.click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.tokeniseduserName + "']"));
			value = field.isEnabled();
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsTokenisedAddress() throws Throwable {
		boolean value = true;
		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'Address ')]");
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Address ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Address ')]"));
			field.click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.tokenisedAddress + "']"));
			value = field.isEnabled();
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsTokenisedPhoneNumber() throws Throwable {
		boolean value = true;

		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'Phone ')]");

			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Phone ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Phone ')]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.tokenisedPhoneNumber + "']"));
			value = field.isEnabled();
			field.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsPersonalMailId() throws Throwable {
		boolean value = true;

		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'Email ')]");
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Email ')]"));
			field.click();
			Thread.sleep(2000);

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.personalMailId + "']"));
			value = field.isEnabled();
			field.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsPersonalUserName() throws Throwable {
		boolean value = true;

		try {
			WebElement field;
			// waitForElement("//XCUIElementTypeButton[contains(@name,'User ')]");
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'User ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'User ')]"));
			field.click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.personaluserName + "']"));
			value = field.isEnabled();
			field.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsPersonalAddress() throws Throwable {
		boolean value = true;

		try {
			WebElement field;
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Address ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

			field = IOMD_driver.driver // XCUIElementTypeButton[contains(@name,'PO Box 15656198')]
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'"
							+ iomd_TestData.tokenisedAddressIOMDPay1 + "')]"));
			field.click();
			Thread.sleep(2000);
			RemoteWebElement parent1 = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Phone ')]"));
			String parentId1 = parent1.getId();
			JavascriptExecutor js1 = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject1 = new HashMap<>();
			scrollObject1.put("element", parentId1);
			scrollObject1.put("direction", "down");
			js1.executeScript("mobile:scroll", scrollObject1);

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[contains(@name,'" + iomd_TestData.personalAddressIOMDPay1 + "')]"));
			value = field.isEnabled();
			field.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userSelectsPersonalPhoneNumber() throws Throwable {
		boolean value = true;

		try {
			WebElement field;
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Phone ')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Phone ')]"));
			field.click();
			Thread.sleep(2000);
			RemoteWebElement parent1 = (RemoteWebElement) IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeStaticText[contains(@name,'" + iomd_TestData.personalPhoneNumber + "')]"));
			String parentId1 = parent1.getId();
			JavascriptExecutor js1 = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject1 = new HashMap<>();
			scrollObject1.put("element", parentId1);
			scrollObject1.put("direction", "down");
			js1.executeScript("mobile:scroll", scrollObject1);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeStaticText[@name='" + iomd_TestData.personalPhoneNumber + "']"));
			value = field.isEnabled();
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	/*
	 * =============================================================================
	 * ======= Verification of Tokenised and Personal data Methods
	 * =============================================================================
	 * =======
	 */

	public static boolean userVerifiesTheTokenisedEmaildetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of Email: " + IOMD_driver.driver
					.findElement(By
							.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenEmailID + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenEmailID + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenEmailID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedPhoneNumberdetailsAreGettingAsExpectedInTheWebsite()
			throws Throwable {
		boolean value = true;
		try {
			System.out
					.println(
							"Value of PhoneNumber: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.tokenisedPhoneNumber + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedPhoneNumber + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenisedPhoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedPhoneNumberWithFormatIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out
					.println(
							"Value of PhoneNumberWithFormat: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.tokenisedPhWithFormat + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedPhWithFormat + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenisedPhWithFormat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedZipCodeAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of ZipCode: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedzipCode + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedzipCode + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenisedzipCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedUserNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of UserName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokeniseduserName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokeniseduserName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokeniseduserName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedFirstNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of FirstName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedfirstName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedfirstName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenisedfirstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheTokenisedLastNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of LastName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedlastName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.tokenisedlastName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.tokenisedlastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalEmaildetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of Email: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalMailId + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalMailId + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesThePersonalPhoneNumberdetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement fieldValues;
			int ele;
			ele = IOMD_driver.driver
					.findElements(
							By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalPhWithFormat
									+ "') or contains(@value,'" + iomd_TestData.personalPhoneNumber
									+ "') or contains(@value,'" + iomd_TestData.personalPhoneNumberFormat2 + "')]"))
					.size();
			if (ele > 0) {
				fieldValues = IOMD_driver.driver.findElement(
						By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalPhWithFormat
								+ "') or contains(@value,'" + iomd_TestData.personalPhoneNumber
								+ "') or contains(@value,'" + iomd_TestData.personalPhoneNumberFormat2 + "')]"));
				value = fieldValues.isEnabled();

				// assertEquals(fieldValues.getAttribute("value"),
				// iomd_TestData.personalPhWithFormat);
			}

//			} else {
//				ele = IOMD_driver.driver.findElements(By.xpath(
//						"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalPhoneNumber + "')]"))
//						.size();
//				if (ele > 0) {
//					fieldValues = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
//							+ iomd_TestData.personalPhoneNumber + "')]"));
//					assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalPhoneNumber);
//				}
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheCardNumberdetailsAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			int ele;
			WebElement fieldValues;
			ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousCardNo + "')]"))
					.size();
			if (ele > 0) {
				fieldValues = IOMD_driver.driver.findElement(By
						.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousCardNo + "')]"));
				assertEquals(fieldValues.getAttribute("value").replace(" ", ""), iomd_TestData.anonymousCardNo);
			} else {
				ele = IOMD_driver.driver
						.findElements(By.xpath(
								"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.iOMDPayCardNo + "')]"))
						.size();
				if (ele > 0) {
					fieldValues = IOMD_driver.driver.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.iOMDPayCardNo + "')]"));
					assertEquals(fieldValues.getAttribute("value"), iomd_TestData.iOMDPayCardNo);
				}
			}

			fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousCVV + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.anonymousCVV);

			ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personaluserName + "')]"))
					.size();
			if (ele > 0) {
				fieldValues = IOMD_driver.driver.findElement(By.xpath(
						"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personaluserName + "')]"));
				assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personaluserName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksOnTheCreditCardDetailsAndClicksOnTheFillButton() throws Throwable {
		Thread.sleep(3000);
		boolean value = true;
		try {
			WebElement field;
			waitForElement("//XCUIElementTypeButton[contains(@name,'Card')]");
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Card')]"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[contains(@name,'Card')]"));
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userVerifiesThePersonalPhoneNumberWithFormatIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out
					.println(
							"Value of PhoneNumberWithFormat: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.personalPhWithFormat + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalPhWithFormat + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalPhWithFormat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalZipCodeAreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of ZipCode: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalzipCode + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalzipCode + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalzipCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalAddrress1AreGettingAsExpectedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out
					.println(
							"Value of Address1: "
									+ IOMD_driver.driver
											.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'"
													+ iomd_TestData.personalAddressIOMDPay1 + "')]"))
											.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalAddressIOMDPay1 + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalAddressIOMDPay1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalUserNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of UserName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personaluserName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personaluserName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personaluserName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalFirstNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of FirstName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalfirstName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalfirstName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personalfirstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesThePersonalLastNameIsDisplayedInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			System.out.println("Value of LastName: " + IOMD_driver.driver
					.findElement(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personallastName + "')]"))
					.getAttribute("value"));
			WebElement fieldValues = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personallastName + "')]"));
			assertEquals(fieldValues.getAttribute("value"), iomd_TestData.personallastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userAddCardDetails() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			String url = "https://iomdqaenv.web.app/sampleCard.html";
			userLaunchesUrl(url);
			Thread.sleep(5000);
			int ele = IOMD_driver.driver.findElements(By.xpath("//*[contains(@name,'Done')]")).size();
			if (ele > 0) {
				WebElement emailValue = IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]"));
				value = emailValue.isEnabled();
				emailValue.click();
			}
			userEnablesTheExtension();
			userSelectsPersonalUserName();
			userClicksFillButton();
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[3]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[3]"))
					.sendKeys(iomd_TestData.anonymousCardNo);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[4]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[4]"))
					.sendKeys(iomd_TestData.anonymousExpiryDate);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[5]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[5]"))
					.sendKeys(iomd_TestData.anonymousCVV);
			userClicksButtonByOnlyName("Submit");
			value = ClickAndValidateSavedCardPopup();
			assertEquals(value, true, "Fields are not getting displayed as expected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userAddCardDetailsWithValidation() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			String url = "https://iomdqaenv.web.app/sampleCard.html";
			userLaunchesUrl(url);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[1]"))
					.sendKeys(iomd_TestData.personalfirstName);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[2]"))
					.sendKeys(iomd_TestData.personallastName);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[3]"))
					.sendKeys(iomd_TestData.anonymousCardName);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[4]"))
					.sendKeys(iomd_TestData.anonymousExpiryDate);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[5]"))
					.sendKeys(iomd_TestData.anonymousCVV);
			userClicksButtonByOnlyName("Submit");
			value = ClickAndValidateSavedCardPopup();
			assertEquals(value, true, "Fields are not getting displayed as expected");
			IOMD_driver.switchIOMDApplication();
			value = userValidatesAndClicksOnTheProfileTab();
			assertEquals(value, true, "Fields are not getting displayed as expected");
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Cards']")).click();
			value = userValidatesTheSavedCardDetails();
			assertEquals(value, true, "Fields are not getting displayed as expected");
			IOMD_driver.safariApplicationLaunching();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersPasswordInCoravinWebsite() throws Throwable {
		boolean value = true;
		try {
			WebElement coravinCreateAnAccount = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeSecureTextField"));
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
