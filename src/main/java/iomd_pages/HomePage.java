
package iomd_pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import iomd_driver.IOMD_driver;
import iomd_testdata.iomd_TestData;
import iomd_util.ElementUtils;
import iomd_util.Helper;
import iomd_util.LocatorReader;
import net.bytebuddy.implementation.Implementation.Context;

public class HomePage implements iomd_TestData {

	public static AppiumDriver<MobileElement> driver;

	public void getAutomationName() throws IOException {

		AppiumDriver<MobileElement> Iomd = IOMD_driver.IomdApplicationLauncher();
		System.out.println("Automation steps executed");

	}

	public static String getAlphaNumericString(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	public static boolean userVerifiesDisplayOfThe(String username) throws Throwable {

		boolean userFullName = true;
		try {
			WebElement userName = LocatorReader.getInstance().getApplocator().getAnonmyousUserType();
			String userFullName1 = userName.getText();
			System.out.println(username);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return userFullName;

	}

	public static boolean userVeriifesTheDisplayOfTheUserTypeAccount(String usertype) throws Throwable {
		boolean userTypeValue = false;
		try {
			WebElement userOneDetails = LocatorReader.getInstance().getApplocator().getUserOneType();
			String userFullName1 = userOneDetails.getText();
			userTypeValue = userFullName1.contains(usertype);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return userTypeValue;
	}

	public static void userVerifiestheDisplayOfThemailaddressandphonenumberinTheApplicationPage(String mailid,
			String phonenumber, String addressdetails) throws Throwable {
		try {

			WebElement emailValue = LocatorReader.getInstance().getApplocator().getEmailValue();
			assertEquals(emailValue.getText(), mailid);
			WebElement phoneNumber2 = LocatorReader.getInstance().getApplocator().getPhoneNumber();
			assertEquals(phoneNumber2.getText(), phonenumber);
			WebElement userOneAddressDetails = LocatorReader.getInstance().getApplocator().getUserOneAddressDetails();
			assertEquals(userOneAddressDetails.getText(), iomd_TestData.addressOne);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean userVerifiesTheDisplayOfThePrimaryUserTyper(String usertype) throws Throwable {
		boolean primaryUserType = false;
		try {

			WebElement userOneType = LocatorReader.getInstance().getApplocator().getUserOneType();
			String userOneAddress = userOneType.getText();
			assertEquals(userOneAddress, usertype);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return primaryUserType;

	}

	public static void userVerifiesTheDisplayOfTheAnonymousMailIDNumberAndAddressDetails(String anonomyousmailid,
			String anonomyousphonenumber, String anonomyousaddressdetail) throws Throwable {
		try {

			WebElement anonymousMailId = LocatorReader.getInstance().getApplocator().getAnonymousMailId();
			assertEquals(anonymousMailId.getText(), anonomyousmailid);
			WebElement anonomyousPhoneNumber2 = LocatorReader.getInstance().getApplocator().getAnonomyousPhoneNumber();
			assertEquals(anonomyousPhoneNumber2.getText(), anonomyousphonenumber);
			WebElement anonomyousAddress = LocatorReader.getInstance().getApplocator().getAnonomyousAddress();
			assertEquals(anonomyousAddress.getText(), iomd_TestData.anonymousAddress);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean userVerifiesTheDisplayOfTheDisplayofTheAnonymousUser(String anonomyoususertype)
			throws Throwable {
		boolean usertype = true;

		try {
			WebElement anonmyousUserType = LocatorReader.getInstance().getApplocator().getAnonmyousUserType();
			assertEquals(anonmyousUserType.getText(), anonomyoususertype);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return usertype;

	}

	public static boolean ValidaytesthedisplayofthemessageAlertAsUserIsNotDisplaying() throws Throwable {
		boolean messageAlert = true;

		try {
			WebElement messageAlert2 = LocatorReader.getInstance().getApplocator().getMessageAlert();
			messageAlert = messageAlert2.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return messageAlert;
	}

	public static boolean userValidatesTheDisplayOfIncorrectMailIdErrorMessageAfterEnteringTheincorrectDetails()
			throws Throwable {
		boolean alertMessage = true;
		try {

			WebElement messageAlert = LocatorReader.getInstance().getApplocator().getValidMail();
			alertMessage = messageAlert.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return alertMessage;

	}

	public static void userNaviagtesToTheSettingsApplication() throws Throwable {

		try {

			IOMD_driver.settingsExtensionEnable();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void userNavigatestoTheUrl(String URL) throws Throwable {
		try {
			IOMD_driver.driver.get(URL);
			System.out.println("switched to the url");
			Thread.sleep(15000);
			LocatorReader.getInstance().getWebPageLocator().getAcceptCookies().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean userVerifiesTheExtensionIsGettingEnabledAndVerifesRequiredDetails() throws Throwable {
		boolean pageDetails = true;

		try {
			Thread.sleep(4000);
			WebElement acceptAllcookies = LocatorReader.getInstance().getWebPageLocator().getAutoFillExtension();
			acceptAllcookies.click();
			Thread.sleep(4000);
			WebElement iomdExtension = LocatorReader.getInstance().getWebPageLocator().getIomdExtension();
			iomdExtension.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return pageDetails;

	}

	public static boolean userValidatesTheDisplahyOfTheHeaderValue(String headervalue) throws Throwable {
		boolean header = true;
		try {
			Thread.sleep(7000);
			WebElement selectDetailsHeader = LocatorReader.getInstance().getWebPageLocator().getSelectDetailsHeader();
			header = selectDetailsHeader.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return header;

	}

	public static boolean userValidatesTheDisplayOfThefeedbackLinkIsGettingDisplayedInTheExtensionm(String feedback)
			throws Throwable {
		boolean feedbackButton = true;
		try {
			Thread.sleep(5000);
			WebElement feedbackLink = LocatorReader.getInstance().getWebPageLocator().getFeedbackLink();
			String feedback1 = feedbackLink.getText();
			assertEquals(feedback1, feedback);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return feedbackButton;

	}

	public static boolean userValidatesTheDisplayOfTheNameAndEmailTextInTheExtensionPopup(String name, String emailid)
			throws Throwable {
		boolean value = true;
		try {
			WebElement mailId = LocatorReader.getInstance().getWebPageLocator().getMailIdComponent();
			assertEquals(mailId.isDisplayed(), true);
			WebElement nameComponent = LocatorReader.getInstance().getWebPageLocator().getNameComponent();
			assertEquals(nameComponent.isDisplayed(), true);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return value;

	}

	public static void userSelectsTheDetailsAndClicksOnTheFillButton() throws Throwable {
		Thread.sleep(5000);
		WebElement anonomyousMailId = LocatorReader.getInstance().getWebPageLocator().getAnonomyousMailId();
		anonomyousMailId.click();
//		WebElement anonymousName = LocatorReader.getInstance().getWebPageLocator().getAnonymousName();
//		anonymousName.click();
		LocatorReader.getInstance().getWebPageLocator().getFillButtonClick().click();

	}

	public static void userVerifiesTheEnteredDetailsAreGettingDisplayedAndEnteredInTheCorrectField() throws Throwable {
		try {
			Thread.sleep(4000);
			WebElement newsLetterEmailID = LocatorReader.getInstance().getWebPageLocator().getNewsLetterEmailID();
			WebElement newsLetterName = LocatorReader.getInstance().getWebPageLocator().getNewsLetterName();
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='content information']/XCUIElementTypeOther[8]/XCUIElementTypeTextField"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static boolean userVerifiestheCreateAccountAndSignUpAccountAndClicksonIt() throws Throwable {
		boolean value = true;
		try {
			WebElement coravinSignInOrSignUpLink = LocatorReader.getInstance().getWebPageLocator()
					.getCoravinSignInOrSignUpLink();
			value = coravinSignInOrSignUpLink.isDisplayed();
			coravinSignInOrSignUpLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnCreateAccountButtonInTheWebsite() throws Throwable {
		boolean value = true;
		try {
			WebElement coravinCreateAnAccount = LocatorReader.getInstance().getWebPageLocator()
					.getCoracinCreateAnAccount();
			value = coravinCreateAnAccount.isDisplayed();
			coravinCreateAnAccount.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnFirstProductInCoravin() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			WebElement field;
			WebElement link = LocatorReader.getInstance().getWebPageLocator().getCoravinFirstProduct();
			value = link.isDisplayed();
			link.click();
			Thread.sleep(2000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//*[@name='Add to cart']"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			field = IOMD_driver.driver.findElement(By.xpath("//*[@name='Add to cart']"));
			field.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnFirstProductInTedbaker() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement link = LocatorReader.getInstance().getWebPageLocator().getTedbakerFirstProduct();
			value = link.isDisplayed();
			link.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInCoravinWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = LocatorReader.getInstance().getWebPageLocator().getCoravinPassword();
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInEcoyaWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInGoodBatchWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInExpediaWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = driver.findElement(By.xpath(
					"(//XCUIElementTypeOther[@name='sCreate an account'])[1]/XCUIElementTypeOther[8]/XCUIElementTypeSecureTextField"));
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInEtsyWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@12345");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersPasswordInNYtimesWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement coravinCreateAnAccount = LocatorReader.getInstance().getWebPageLocator().getNytimesPassword();
			value = coravinCreateAnAccount.isDisplayed();
			coravinCreateAnAccount.click();
			coravinCreateAnAccount.sendKeys("Test@1234");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesThedetailsAreGettingAsExpectedInTheFieldBox() throws Throwable {
		boolean newValue = true;
		try {
			List<WebElement> nameFieldValues = LocatorReader.getInstance().getWebPageLocator().getNameFieldValues();
			for (int i = 0; i < nameFieldValues.size(); i++) {
				newValue = nameFieldValues.get(i).isDisplayed();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return newValue;

	}

	public static boolean validatesTheDisplayOfTheautofillDetailsAreGettingEnteredInTheFieldBox() throws Throwable {
		boolean value = true;
		try {

			WebElement signInAccountFields = LocatorReader.getInstance().getWebPageLocator().getSignInAccountFields();
			value = signInAccountFields.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;
	}

	public static boolean userClickOnTheSignInButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement signInButtonCoravin = LocatorReader.getInstance().getWebPageLocator().getSignInButtonCoravin();
			value = signInButtonCoravin.isDisplayed();
			signInButtonCoravin.click();
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static void userValidatesTheDisplayOfTheAutofillDetailsAreGettingDisplayedAsExpected() throws Throwable {
		Thread.sleep(3000);
		WebElement doneButtonCoravin = LocatorReader.getInstance().getWebPageLocator().getDoneButtonCoravin();
		doneButtonCoravin.click();

	}

	public static boolean userClicksOnTheSignInButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement signInButton = LocatorReader.getInstance().getWebPageLocator().getSignInButton();
			signInButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesTheCheckoutIconAndClicksOnIt() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			WebElement cartIcon = LocatorReader.getInstance().getWebPageLocator().getCartIcon();
			value = cartIcon.isDisplayed();
			cartIcon.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userClicksOnContinueToCheckoutButtonInTheCheckoutPage() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(2000);
			WebElement proceedToCheckout = LocatorReader.getInstance().getWebPageLocator().getProceedToCheckout();
			proceedToCheckout.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean userSelectsTheAddressAndPhoneNumberAndAddressFromTheExtension(String phonenumber)
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(7000);
			WebElement addressField = LocatorReader.getInstance().getWebPageLocator().getAddressField();
			addressField.click();
			Thread.sleep(3000);
			WebElement phoneField = LocatorReader.getInstance().getWebPageLocator().getPhoneField();
			phoneField.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static boolean validatesTheShippingOptionAvailableForTheUser(String getshippingoption) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);

			WebElement shippingOption = LocatorReader.getInstance().getWebPageLocator().getShippingOption();
			shippingOption.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static boolean userValidatedAndClicksToTheContinueToPaymentMethod(String continuetopayment)
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(6000);
			WebElement shippingOption1 = LocatorReader.getInstance().getWebPageLocator().getStdshippingOption();
			shippingOption1.click();
			Thread.sleep(19000);
			WebElement continueToPayment2 = LocatorReader.getInstance().getWebPageLocator().getContinueToPayment();
			continueToPayment2.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static void userClicksOnTheCreditCardDetailsAndClicksOnTheFillButton() throws Throwable {
		Thread.sleep(10000);
		LocatorReader.getInstance().getWebPageLocator().getCreditCardNumber().click();
		Thread.sleep(3000);
		LocatorReader.getInstance().getWebPageLocator().getFillButton().click();
		Thread.sleep(5000);
	}

	public static boolean userLaunchesThehindustanTimesAndVerifiesTheNewsLetterSignUp(String url) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnTheEmailSignUpButtonInTheNewsLetter(String newsletteremailsignnup)
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(15000);
			WebElement hindustanEmailSignUp = LocatorReader.getInstance().getWebPageLocator().getHindustanEmailSignUp();
			hindustanEmailSignUp.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userLaunchesTheNewYorkTimes(String url) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userLaunchesTheEmailButtonInTheNewYorkTimes(String signup) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(15000);
			WebElement newYorkTimesSignUpIcon = LocatorReader.getInstance().getWebPageLocator()
					.getNewYorkTimesSignUpIcon();
//			newYorkTimesSignUpIcon.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static void userEntersTheEmailFieldInTheDropDownBox() throws Throwable {
		Thread.sleep(5000);
		WebElement anonomyousMailId = LocatorReader.getInstance().getWebPageLocator().getAnonomyousMailId();
		Thread.sleep(5000);
		anonomyousMailId.click();
		WebElement fillButton = LocatorReader.getInstance().getWebPageLocator().getFillButton();
		Thread.sleep(5000);
		fillButton.click();
	}

	public static boolean userClicksonTheContinueButton() throws Throwable {
		boolean value = true;

		try {
			WebElement continueButton = LocatorReader.getInstance().getWebPageLocator().getContinueButton();
			continueButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean clicksOnLoginButtonOnNewYorkTimes() throws Throwable {
		boolean value = true;

		try {
			Thread.sleep(5000);
			WebElement loginButton = LocatorReader.getInstance().getWebPageLocator().getNewYorkLogInButton();
			loginButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClickSonTheButtonToEnableTheSignUpPage() throws Throwable {
		boolean value = true;

		try {
			Thread.sleep(5000);
			WebElement headerValue = LocatorReader.getInstance().getWebPageLocator().getHeaderValue();
			headerValue.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean user_launches_the_tedbaker_website_something(String url) throws Throwable {
		boolean value = true;

		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean user_clicks_on_the_go_to_site_button() throws Throwable {
		boolean value = true;

		try {
			Thread.sleep(4000);
			WebElement goToSitetedBaker = LocatorReader.getInstance().getWebPageLocator().getGoToSitetedBaker();
			goToSitetedBaker.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean user_accepts_the_accept_all_cookies_button() throws Throwable {
		boolean value = true;
		Thread.sleep(8000);
		try {
			int ele = IOMD_driver.driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Accept Cookies' or contains(@name,'Accept All Cookies') or contains(@name,'Accept')]"))
					.size();
			if (ele > 0) {
				WebElement fetch = IOMD_driver.driver
						.findElement(By.xpath("//XCUIElementTypeButton[@name='Accept Cookies' or contains(@name,'Accept All Cookies') or contains(@name,'Accept')]"));
				value = fetch.isEnabled();
				fetch.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean user_clicks_on_the_signup_button() throws Throwable {
		boolean value = true;

		try {
			Thread.sleep(4000);
			WebElement signUptedBaker = LocatorReader.getInstance().getWebPageLocator().getSignUptedBaker();
			signUptedBaker.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnTheEmailInputBox() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement curativeEmailBox = LocatorReader.getInstance().getWebPageLocator().getCurativeEmailBox();
			curativeEmailBox.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClickOnEnterUsingPasswordLink() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement enterUsingPassword = LocatorReader.getInstance().getWebPageLocator().getEnterUsingPassword();
			enterUsingPassword.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnTheCartButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement cartCurativeLifestyle = LocatorReader.getInstance().getWebPageLocator()
					.getCartCurativeLifestyle();
			cartCurativeLifestyle.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersThePasswordandClicksOnTheEnterButton(String password) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement curativeLifestylePassword = LocatorReader.getInstance().getWebPageLocator()
					.getCurativeLifestylePassword();
			curativeLifestylePassword.sendKeys(password);
			Thread.sleep(5000);
			LocatorReader.getInstance().getWebPageLocator().getEnterCurativeLifeStyle().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksOnTheCheckoutButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement checkoutCurativeLifeStyle = LocatorReader.getInstance().getWebPageLocator()
					.getCheckoutCurativeLifeStyle();
			checkoutCurativeLifeStyle.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksAndSelectsTheWine() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
//			WebElement wineLink = LocatorReader.getInstance().getWebPageLocator().getWineLink();
//			wineLink.click();
//			Thread.sleep(5000);
			WebElement productLink = LocatorReader.getInstance().getWebPageLocator().getProductLink();
			productLink.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnTheAddToCartButton() throws Throwable {

		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement addToCartButton = LocatorReader.getInstance().getWebPageLocator().getAddToCartButton();
			addToCartButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksOnThePaymentAndClickingonTheContinueButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement continueToPayment = LocatorReader.getInstance().getWebPageLocator().getContinueToShipping();
			continueToPayment.click();
			Thread.sleep(3000);
			commonUtilityMethods.ClicksOKBtninPopup();
			commonUtilityMethods.ClicksOKBtninPopup();
			Thread.sleep(3000);
			WebElement continueToPayment2 = LocatorReader.getInstance().getWebPageLocator()
					.getContinueToPaymentButton();
			continueToPayment2.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userValidatesAndSwitchesToTheContentAddProductToTheCart() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			Set<String> contextHandles = IOMD_driver.driver.getContextHandles();
			for (String contextName : contextHandles) {
				System.out.println(contextName);
			}
			IOMD_driver.driver.context(contextHandles.toString());
			WebElement searchTedBaker = LocatorReader.getInstance().getWebPageLocator().getSearchTedBaker();
			searchTedBaker.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClicksOnTheEnterButtonInTheWebPage() throws Throwable {
		boolean enterButton = true;
		try {
			Thread.sleep(3000);
			WebElement enterButton1 = LocatorReader.getInstance().getWebPageLocator().getSubscribeNewsExtension();
			enterButton = enterButton1.isEnabled();
			enterButton1.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return enterButton;
	}

	public static boolean userClicksThebuisnessAndVerifiesTheDetailsPresentInside() {
		boolean enterButton = true;
		try {
			Thread.sleep(3000);
			WebElement emailSelected = LocatorReader.getInstance().getApplocator().getEmailSelected();
			enterButton = emailSelected.isDisplayed();
			WebElement backbutton = LocatorReader.getInstance().getApplocator().getBackbutton();
			Thread.sleep(3000);
			backbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return enterButton;
	}

	public static boolean uservalidatesthesomethingandclicksonit() {
		boolean buisnessTab = true;
		try {
			Thread.sleep(4000);
			WebElement buisnessNameTab = LocatorReader.getInstance().getApplocator().getBuisnessNameTab();
			buisnessTab = buisnessNameTab.isDisplayed();
			buisnessNameTab.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buisnessTab;
	}

	public static boolean userVerifiesTheDisplayOfTheBuisnessNameAndClicksOnIt(String buisnessname) throws Throwable {
		boolean buisnessname1 = true;
		try {
			Thread.sleep(3000);
			WebElement buisnessName2 = LocatorReader.getInstance().getApplocator().getBuisnessName();
			buisnessname1 = buisnessName2.isDisplayed();
			Thread.sleep(3000);
			LocatorReader.getInstance().getApplocator().getRightArrowFirst().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buisnessname1;
	}

	public static boolean userValidatesAndVeriifesTheDisplayOfTheBuisnessNameCoravin() throws Throwable {
		boolean buisnessTab = true;
		try {
			Thread.sleep(4000);
			WebElement buisnessNameTab = LocatorReader.getInstance().getApplocator().getCoravinBuisnessNameTabValue();
			buisnessTab = buisnessNameTab.isDisplayed();
			buisnessNameTab.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buisnessTab;

	}

	public static boolean validatesTheDisplayOfTheEmailCount() throws Throwable {
		boolean emailCount = true;
		try {
			Thread.sleep(5000);
			WebElement emailCount2 = LocatorReader.getInstance().getApplocator().getEmailCount();
			emailCount = emailCount2.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emailCount;

	}

	public static boolean validatesAndClicksOnTheNotificationTab(String notification) throws Throwable {
		boolean notificationTab1 = true;
		try {
			WebElement notificationTab = LocatorReader.getInstance().getApplocator().getNotificationTab();
			notificationTab1 = notificationTab.isDisplayed();
			notificationTab.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notificationTab1;

	}

	public static boolean validatesTheDisplayOfTheNotificatinTab(String notification) throws Throwable {
		boolean notificationTab1 = true;
		try {
			WebElement notificationTab = LocatorReader.getInstance().getApplocator().getNotificationTab();
			notificationTab1 = notificationTab.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notificationTab1;

	}

	public static boolean validatesTheDisplayOfTheForgotPassswordLinkAndClicksOnIt(String forgotpassword)
			throws Throwable {
		boolean forgetPassword = true;
		try {
			Thread.sleep(3000);
			WebElement forgotPassword = LocatorReader.getInstance().getWebPageLocator().getForgotPassword();
			forgotPassword.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return forgetPassword;

	}

	public static boolean userEntersTheEmaiValueAndClicksOnTheSubmitButton(String emailid) throws Throwable {
		boolean mailId = true;
		try {
			Thread.sleep(3000);
			WebElement emailInputBox = LocatorReader.getInstance().getWebPageLocator().getEmailInputBox();
			emailInputBox.sendKeys(emailid);
			Thread.sleep(3000);
			WebElement submitButton = LocatorReader.getInstance().getWebPageLocator().getSubmitButton();
			submitButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mailId;

	}

	public static boolean validatesTheDisplayOfTheForgotPasswordLinAndClicsOnItandVerifiesTheDetailsPresentInsideTheTab()
			throws Throwable {
		boolean details = true;
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return details;

	}

	public static boolean validatesTheDisplayOfTheForgotEmailLink() throws Throwable {
		boolean forgotEmailLink = true;
		try {
			Thread.sleep(8000);
			WebElement rightArrow = LocatorReader.getInstance().getWebPageLocator().getRightArrow();
			rightArrow.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return forgotEmailLink;
	}

	public static boolean ValidatesTheDisplayOfTheOverallSummaryMessage(String overallsummary) throws Throwable {
		boolean overAllSummary = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return overAllSummary;

	}

	public static boolean ValidatesTheDisplayOfTheRealDataUsageText(String realdata) throws Throwable {
		boolean realData = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return realData;

	}

	public static boolean ValidatesTheDisplayOfTheLastSevenDaysText() throws Throwable {
		boolean sevenDaysText = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sevenDaysText;

	}

	public static boolean ValidatesTheDisplayOfEarlierTransactionTextHeader() throws Throwable {

		boolean EarlierTransactionHeader = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return EarlierTransactionHeader;

	}

	public static boolean ValidatesTheDisplayOfTheAnonymousDataHeader(String anonmyousdata) throws Throwable {

		boolean anonmyousData = true;
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

		return anonmyousData;

	}

	public static boolean validatesTheNumberOfTransactionWhichWasDoneOnLastSevenDays() throws Throwable {

		boolean noOfLastSevenDaysTransaction = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return noOfLastSevenDaysTransaction;

	}

	public static boolean user_verifies_the_number_of_transaction_happened_in_earier_transaction() throws Throwable {

		boolean noOfTransactionEarlier = true;
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return noOfTransactionEarlier;

	}

	public static boolean userEntersEmailAndClickOnTheFetchButton(String email) throws Throwable {

		boolean fetchButton = true;

		try {
			WebElement emailValue = LocatorReader.getInstance().getApplocator().getEmailValue();
			emailValue.sendKeys(email);
			WebElement fetch = LocatorReader.getInstance().getApplocator().getFetch();
			fetchButton = fetch.isDisplayed();
			fetch.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fetchButton;
	}

	/*
	 * =============================================================================
	 * === Five Marys Meats Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userLaunchesFiveMarysUrl(String url) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userclicksLoginbutton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement siteNavigationButton = LocatorReader.getInstance().getWebPageLocator().getSiteNavigationButton();
			value = siteNavigationButton.isDisplayed();
			siteNavigationButton.click();
			Thread.sleep(3000);
			WebElement fivemarysLoginButton = LocatorReader.getInstance().getWebPageLocator().getFivemarysLoginButton();
			value = fivemarysLoginButton.isEnabled();
			fivemarysLoginButton.click();

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userclicksForgotButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement fivemarysForgotButton = LocatorReader.getInstance().getWebPageLocator()
					.getFivemarysForgotButton();
			value = fivemarysForgotButton.isDisplayed();
			fivemarysForgotButton.click();

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userVerifiesThedetailsAreGettingAsExpectedInTheFiveMarysWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getEmailIdField();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesForgotPassworddetailsAreGettingAsExpectedInTheFiveMarysWebsite()
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator()
					.getFivemarysForgotEmailTextBox();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheCheckoutdetailsAreGettingAsExpectedInTheFiveMarysWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getContactTextbox();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);

			WebElement AddressDetails = LocatorReader.getInstance().getWebPageLocator().getShipToTextbox();
			assertEquals(AddressDetails.getAttribute("value"), iomd_TestData.FMaddressOne);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheCarddetailsAreGettingAsExpectedInTheFiveMarysWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement cardNo = LocatorReader.getInstance().getWebPageLocator().getFmCardno();
			assertEquals(cardNo.getAttribute("value"), iomd_TestData.anonymousCardNo);

			WebElement cardName = LocatorReader.getInstance().getWebPageLocator().getFmCardName();
			assertEquals(cardName.getAttribute("value"), iomd_TestData.anonymousCardName);

			WebElement cardCVV = LocatorReader.getInstance().getWebPageLocator().getFmCardCVV();
			assertEquals(cardCVV.getAttribute("value"), iomd_TestData.anonymousCVV);

			WebElement cardExpiryDate = LocatorReader.getInstance().getWebPageLocator().getFmCardExpirydate();
			assertEquals(cardExpiryDate.getAttribute("value"), iomd_TestData.anonymousExpiryDate);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userSelectsFirstProductCategory() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement siteNavigationButton = LocatorReader.getInstance().getWebPageLocator().getSiteNavigationButton();
			value = siteNavigationButton.isDisplayed();
			siteNavigationButton.click();
			Thread.sleep(3000);
			WebElement firstProdCategory = LocatorReader.getInstance().getWebPageLocator().getFirstCategoryOption();
			value = firstProdCategory.isDisplayed();
			firstProdCategory.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userSelectsFirstProduct() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			List<WebElement> productValues = LocatorReader.getInstance().getWebPageLocator().getFirstProduct();
			productValues.get(0).isDisplayed();
			productValues.get(0).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksAddToCartButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement AddToCartBtn = LocatorReader.getInstance().getWebPageLocator().getAddToCartBtn();
			value = AddToCartBtn.isEnabled();
			AddToCartBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksCheckoutButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement checkoutBtn = LocatorReader.getInstance().getWebPageLocator().getCheckoutBtn();
			value = checkoutBtn.isEnabled();
			checkoutBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userClicksContinueShippingButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement continueShippingBtn = LocatorReader.getInstance().getWebPageLocator().getContinueShippingBtn();
			value = continueShippingBtn.isEnabled();
			continueShippingBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userClicksContinuePaymentButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement continueShippingBtn = LocatorReader.getInstance().getWebPageLocator().getContinuePaymentBtn();
			value = continueShippingBtn.isEnabled();
			continueShippingBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userClicksPayNowButton() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement payNowBtn = LocatorReader.getInstance().getWebPageLocator().getPayNowBtn();
			value = payNowBtn.isEnabled();
			payNowBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsCardDetailsinFiveMarysWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement fmCardno = LocatorReader.getInstance().getWebPageLocator().getFmCardno();
			value = fmCardno.isEnabled();
			fmCardno.click();
			fmCardno.clear();
			fmCardno.sendKeys("4111111111111111");

			WebElement fmCardname = LocatorReader.getInstance().getWebPageLocator().getFmCardName();
			value = fmCardname.isEnabled();
			fmCardname.click();
			fmCardname.clear();
			fmCardname.sendKeys("Glider");

			WebElement fmCardexpirydate = LocatorReader.getInstance().getWebPageLocator().getFmCardExpirydate();
			value = fmCardexpirydate.isEnabled();
			fmCardexpirydate.click();
			fmCardexpirydate.clear();
			fmCardexpirydate.sendKeys("0523");

			WebElement fmCardcvv = LocatorReader.getInstance().getWebPageLocator().getFmCardCVV();
			value = fmCardcvv.isEnabled();
			fmCardcvv.click();
			fmCardcvv.clear();
			fmCardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === MylaporeExpress Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userLaunchesMylaporeExpressUrl(String url) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userclicksMyAccButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement meMyAccButton = LocatorReader.getInstance().getWebPageLocator().getMeMyAccBtn();
			value = meMyAccButton.isEnabled();
			meMyAccButton.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userclicksSignInButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement meMyAccButton = LocatorReader.getInstance().getWebPageLocator().getMeSignInBtn();
			value = meMyAccButton.isDisplayed();
			meMyAccButton.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userclicksForgotPwdButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement meForgetButton = LocatorReader.getInstance().getWebPageLocator().getMeForgetPwdBtn();
			value = meForgetButton.isEnabled();
			meForgetButton.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userclicksAddToCartButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement meButton = LocatorReader.getInstance().getWebPageLocator().getMeAddToCartBtn();
			value = meButton.isEnabled();
			meButton.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userclicksMondayAndFirstCustomBtninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
			String dayval = simpleDateFormat.format(date).toUpperCase();
			System.out.println("DAY " + simpleDateFormat.format(date).toUpperCase());
			if (dayval == "MONDAY") {
				WebElement meForgetButton = IOMD_driver.driver
						.findElement(By.xpath("//XCUIElementTypeLink[@name='TUESDAY']"));
				value = meForgetButton.isEnabled();
				meForgetButton.click();
				Thread.sleep(5000);
			} else {
				WebElement button = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeLink[@name='MONDAY']"));
				value = button.isEnabled();
				button.click();
				Thread.sleep(5000);
			}
			List<WebElement> menuValues = LocatorReader.getInstance().getWebPageLocator().getMeFirstCustomBtn();
			System.out.println(menuValues.size());
			menuValues.get(0).isEnabled();
			menuValues.get(0).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userAgreesTermsAndClicksCheckOutBtninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement meBtn1 = LocatorReader.getInstance().getWebPageLocator().getMeAcceptTermsBox();
			value = meBtn1.isEnabled();
			meBtn1.click();
			Thread.sleep(3000);
			WebElement meBtn2 = LocatorReader.getInstance().getWebPageLocator().getMeCheckoutBtn();
			value = meBtn2.isEnabled();
			meBtn2.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userVerifiesTheCheckoutdetailsAreGettingAsExpectedInMylaporeExpressWebsite()
			throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getMeContactTextBox();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);

			WebElement AddressDetails = LocatorReader.getInstance().getWebPageLocator().getMeShipToBox();
			assertEquals(AddressDetails.getAttribute("value"), iomd_TestData.FMaddressOne);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userClicksContinueButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement continueShippingBtn = LocatorReader.getInstance().getWebPageLocator().getMeContinueBtn();
			value = continueShippingBtn.isEnabled();
			continueShippingBtn.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userVerifiesThedetailsAreGettingAsExpectedInMylaporeExpressWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getMeEmailId();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesTheForgetPwddetailsAreGettingAsExpectedInMEWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getMeForgetEmailTxtBox();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userEntersZipCodeAndCheckForDeliveryInMEWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement meCheckButton = LocatorReader.getInstance().getWebPageLocator().getMeCheckBtn();
			value = meCheckButton.isDisplayed();
			meCheckButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userProvidesInputsForMenu() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			List<WebElement> menuValues = LocatorReader.getInstance().getWebPageLocator().getMeMenuBoxes();
			for (int i = 0; i <= 3; i++) {
				menuValues.get(i).isDisplayed();
				menuValues.get(i).click();
				menuValues.get(i).sendKeys("1");
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userFillsCardDetailsinMylaporeExpressWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement fmCardno = LocatorReader.getInstance().getWebPageLocator().getFmCardno();
			value = fmCardno.isEnabled();
			fmCardno.click();
			fmCardno.clear();
			fmCardno.sendKeys("4111111111111111");

			WebElement fmCardname = LocatorReader.getInstance().getWebPageLocator().getFmCardName();
			value = fmCardname.isEnabled();
			fmCardname.click();
			fmCardname.clear();
			fmCardname.sendKeys("Glider");

			WebElement fmCardexpirydate = LocatorReader.getInstance().getWebPageLocator().getFmCardExpirydate();
			value = fmCardexpirydate.isEnabled();
			fmCardexpirydate.click();
			fmCardexpirydate.clear();
			fmCardexpirydate.sendKeys("0523");

			WebElement fmCardcvv = LocatorReader.getInstance().getWebPageLocator().getFmCardCVV();
			value = fmCardcvv.isEnabled();
			fmCardcvv.click();
			fmCardcvv.clear();
			fmCardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userClicksContinuePaymentButtoninME() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement continueShippingBtn = LocatorReader.getInstance().getWebPageLocator()
					.getMeContinueToPaymentBtn();
			value = continueShippingBtn.isEnabled();
			continueShippingBtn.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === SVB CONNECT WEBSITE
	 * =============================================================================
	 * ===
	 */

	public static boolean userFillsCardDetailsinSVBConnectWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement fmCardno = LocatorReader.getInstance().getWebPageLocator().getSvbCardno();
			value = fmCardno.isEnabled();
			fmCardno.click();
			fmCardno.clear();
			fmCardno.sendKeys("4111111111111111111");

			WebElement fmCardexpirydate = LocatorReader.getInstance().getWebPageLocator().getSvbCardExpirydate();
			value = fmCardexpirydate.isEnabled();
			fmCardexpirydate.click();
			fmCardexpirydate.clear();
			fmCardexpirydate.sendKeys("0523");

			WebElement fmCardcvv = LocatorReader.getInstance().getWebPageLocator().getSvbCardCVV();
			value = fmCardcvv.isEnabled();
			fmCardcvv.click();
			fmCardcvv.clear();
			fmCardcvv.sendKeys("123");

			WebElement fmCardemail = LocatorReader.getInstance().getWebPageLocator().getSvbCardEmail();
			value = fmCardemail.isEnabled();
			fmCardemail.click();
			fmCardemail.clear();
			fmCardemail.sendKeys("test2.ideas2it@iomd.info");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === GoodEggs Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userLaunchesGoodEggsUrl(String url) throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			IOMD_driver.driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

//	 public static boolean userclicksSignInbuttoninGoodEggs() throws Throwable {
//			boolean value = true;
//			try {
//				Thread.sleep(3000);
//				WebElement getStartedButton = LocatorReader.getInstance().getWebPageLocator().getSiteNavigationButton();
//				value = getStartedButton.isDisplayed();
//				getStartedButton.click();
//
//				WebElement siteNavigationButton = LocatorReader.getInstance().getWebPageLocator().getSiteNavigationButton();
//				value = siteNavigationButton.isDisplayed();
//				siteNavigationButton.click();
//				Thread.sleep(3000);
//				WebElement loginButton = LocatorReader.getInstance().getWebPageLocator().getFivemarysLoginButton();
//				value = loginButton.isEnabled();
//				loginButton.click();
//
//				Thread.sleep(10000);
//			} catch (Exception e) {
//				e.printStackTrace();
//
//			}
//			return value;
//
//		}

	public static boolean userclicksForgotButtoninGoodEggs() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement forgotButton = LocatorReader.getInstance().getWebPageLocator().getGeForgotButton();
			value = forgotButton.isDisplayed();
			forgotButton.click();

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userVerifiesThedetailsAreGettingAsExpectedInTheGoodEggsWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeWebView[@name='WebView']"));
//				Set<String> allContext = IOMD_driver.driver.getContextHandles();
//				//Set<String> allContext = driver.getContextHandles();
//				System.out.println("ALL CONTENTS: "+allContext);
////			    for (String context1 : allContext) {
////			    	System.out.println("switched to webview: "+context1);
////			    	IOMD_driver.driver.context(context1);
////			    }
//			    IOMD_driver.driver.context("webView");
			// IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'test2.ideas2it@iomd.info')]"));
			System.out.println("Value of email: " + IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTextField[contains(@value,'test2.ideas2it@iomd.info')]"))
					.getAttribute("value"));
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getGeEmailIdField();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userVerifiesForgotPassworddetailsAreGettingAsExpectedInTheGoodEggsWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getGeEmailIdField();
			assertEquals(emailAddressDetails.getAttribute("value"), iomd_TestData.anonymousMailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static boolean userFillsCardDetailsingoodeggs() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement cardno = LocatorReader.getInstance().getWebPageLocator().getGeCardno();
			value = cardno.isEnabled();
			cardno.click();
			cardno.clear();
			cardno.sendKeys("4111111111111111");

			WebElement cardexpirydate = LocatorReader.getInstance().getWebPageLocator().getGeCardExpirydate();
			value = cardexpirydate.isEnabled();
			cardexpirydate.click();
			cardexpirydate.clear();
			cardexpirydate.sendKeys("0523");

			WebElement cardcvv = LocatorReader.getInstance().getWebPageLocator().getGeCardCVV();
			value = cardcvv.isEnabled();
			cardcvv.click();
			cardcvv.clear();
			cardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsAddressingoodeggs() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement address = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Change Address | Good Eggs']/XCUIElementTypeOther[11]/XCUIElementTypeOther"));
			value = address.isEnabled();
			address.click();
			address.clear();
			address.sendKeys("842 South Broadway");
			commonUtilityMethods.userClicksButtonByName("842 South Broadway, Los Angeles, CA, USA");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsCardDetailsinCoravin() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement cardno = LocatorReader.getInstance().getWebPageLocator().getcCardno();
			value = cardno.isEnabled();
			cardno.click();
			cardno.clear();
			cardno.sendKeys("4111111111111111");

			WebElement cardcvv = LocatorReader.getInstance().getWebPageLocator().getcCardCVV();
			value = cardcvv.isEnabled();
			cardcvv.click();
			cardcvv.clear();
			cardcvv.sendKeys("123");
			Thread.sleep(2000);
			WebElement cardexpirydate = LocatorReader.getInstance().getWebPageLocator().getcCardExpirydate();
			value = cardexpirydate.isEnabled();
			cardexpirydate.click();
			cardexpirydate.clear();
			cardexpirydate.sendKeys("0523");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsCardDetailsinTedBaker() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement cardno = LocatorReader.getInstance().getWebPageLocator().getTedCardno();
			value = cardno.isEnabled();
			cardno.click();
			cardno.clear();
			cardno.sendKeys("4111111111111111");

			WebElement cardexpirydate = LocatorReader.getInstance().getWebPageLocator().getTedCardExpirydate();
			value = cardexpirydate.isEnabled();
			cardexpirydate.click();
			cardexpirydate.clear();
			cardexpirydate.sendKeys("0523");

			WebElement cardcvv = LocatorReader.getInstance().getWebPageLocator().getTedCardCVV();
			value = cardcvv.isEnabled();
			cardcvv.click();
			cardcvv.clear();
			cardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userClosesPopupInEcoya() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(5000);
			WebElement forgotButton = LocatorReader.getInstance().getWebPageLocator().getEcoyaClosepopup();
			value = forgotButton.isEnabled();
			forgotButton.click();

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === PorterAndYork Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userclicksFirstProductinPorterAndYork() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement button = LocatorReader.getInstance().getWebPageLocator().getPyProductField();
			value = button.isDisplayed();
			button.click();

			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsCardDetailsinPorterAndYork() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement cardno = LocatorReader.getInstance().getWebPageLocator().getPyCardno();
			value = cardno.isEnabled();
			cardno.click();
			cardno.clear();
			cardno.sendKeys("4111111111111111");

			WebElement cardexpirydate = LocatorReader.getInstance().getWebPageLocator().getPyCardExpirydate();
			value = cardexpirydate.isEnabled();
			cardexpirydate.click();
			cardexpirydate.clear();
			cardexpirydate.sendKeys("0523");

			WebElement cardcvv = LocatorReader.getInstance().getWebPageLocator().getPyCardCVV();
			value = cardcvv.isEnabled();
			cardcvv.click();
			cardcvv.clear();
			cardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === SkullCandy Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userclicksFirstProductinSkullCandy() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement button = LocatorReader.getInstance().getWebPageLocator().getScProductField();
			value = button.isDisplayed();
			button.click();

			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsCardDetailsinSkullCandy() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement cardno = LocatorReader.getInstance().getWebPageLocator().getScCardno();
			value = cardno.isEnabled();
			cardno.click();
			cardno.clear();
			cardno.sendKeys("4111111111111111");

			WebElement cardexpirydate = LocatorReader.getInstance().getWebPageLocator().getScCardExpirydate();
			value = cardexpirydate.isEnabled();
			cardexpirydate.click();
			cardexpirydate.clear();
			cardexpirydate.sendKeys("0523");

			WebElement fmCardname = LocatorReader.getInstance().getWebPageLocator().getScCardName();
			value = fmCardname.isEnabled();
			fmCardname.click();
			fmCardname.clear();
			fmCardname.sendKeys("Glider");

			WebElement cardcvv = LocatorReader.getInstance().getWebPageLocator().getScCardCVV();
			value = cardcvv.isEnabled();
			cardcvv.click();
			cardcvv.clear();
			cardcvv.sendKeys("123");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === Alibaba Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userClosePopupinAlibaba() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='OK']")).click();
			WebElement button = LocatorReader.getInstance().getWebPageLocator().getaClosepopupField();
			value = button.isDisplayed();
			button.click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='OK']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	/*
	 * =============================================================================
	 * === SCHWAB Website Methods
	 * =============================================================================
	 * ===
	 */

	public static boolean userScrollsDownToContactField() throws Throwable {
		boolean value = false;
		try {
			Thread.sleep(4000);
			RemoteWebElement parent = (RemoteWebElement) IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Contact information']"));
			String parentId = parent.getId();
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("element", parentId);
			scrollObject.put("direction", "down");
			js.executeScript("mobile:scroll", scrollObject);
			value = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Contact information']"))
					.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInBookingWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getBookEmailIdField();
			emailAddressDetails.click();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.clear();
			emailAddressDetails.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userFillsAddressInSkullCandy() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;
//			IOMD_driver.driver.findElement(By.xpath(
//					"//XCUIElementTypeOther[@name='Guest Customer']/XCUIElementTypeOther[11]/XCUIElementTypeOther"))
//					.click();
//			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Denmark')]")).click();

			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='Guest Customer']/XCUIElementTypeTextField[4]"));
			field.click();
			field.clear();
			field.sendKeys("94025");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'94025 ')]")).click();
			Thread.sleep(5000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='Guest Customer']/XCUIElementTypeTextField[7]"));
			field.click();
			field.clear();
			field.sendKeys("766 Live");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'766 LIVE')]")).click();
//
//			field = IOMD_driver.driver.findElement(
//					By.xpath("//XCUIElementTypeOther[@name='Guest Customer']/XCUIElementTypeTextField[8]"));
//			field.click();
//			field.clear();
//			field.sendKeys("+14520163771");

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsPasswordInBooking() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Create a password for your new account | Booking.com']/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Create a password for your new account | Booking.com']/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userFillsEmailInACF() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='ACF | My Account']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='ACF | My Account']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;

	}

	public static boolean userEntersRandomEmaildetailsInAirbnbWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement emailAddressDetails = LocatorReader.getInstance().getWebPageLocator().getAirEmailIdField();
			emailAddressDetails.click();
			emailAddressDetails.clear();
			emailAddressDetails.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInAirNewzealandWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(7000);
			WebElement field;

			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='Air New Zealand Login']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='Air New Zealand Login']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInAmazonWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeTextField[@name='Mobile number or email']"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name='Create a password']"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return value;
	}
	
	public static boolean userEntersRandomEmaildetailsInElementorWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='Sign Up – My Account']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='Sign Up – My Account']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInBlueCoffeeWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Create Account – Blue Star Coffee Roasters']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='Create Account – Blue Star Coffee Roasters']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInClipperCardWebsite() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userClosePopupInDeadlyponies() throws Throwable {
		boolean email = false;
		try {
			int ele = IOMD_driver.driver.findElements(By.xpath(
					"//XCUIElementTypeOther[@name='Sign In | Deadly Ponies']/XCUIElementTypeLink[3]/XCUIElementTypeLink"))
					.size();
			if (ele > 0) {
				System.out.println("Element is present");
				WebElement field = IOMD_driver.driver.findElement(By.xpath(
						"//XCUIElementTypeOther[@name='Sign In | Deadly Ponies']/XCUIElementTypeLink[3]/XCUIElementTypeLink"));
				field.click();
			} else {
				System.out.println("Element not present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	public static boolean userEntersRandomEmaildetailsInDeadlyponies() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By
					.xpath("//XCUIElementTypeOther[@name='article']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='article']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInEcoya() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInUnitedHealth() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInTravelers() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInAllState() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By.xpath(
					"(//XCUIElementTypeOther[@name='navigation'])[1]/XCUIElementTypeOther/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.clear();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomEmaildetailsInNationwide() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;
			commonUtilityMethods.userClicksButtonByValue("Select");
			Thread.sleep(2000);
			IOMD_driver.driver.findElement(By.xpath("//*[@name='Insurance']")).click();
			Thread.sleep(2000);
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeTextField[@name'Username']"));
			field.click();
			field.clear();
			field.sendKeys(getAlphaNumericString(7) + "@gmail.com");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("Test@12345");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Log in']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersSignupdetailsInNationwide() throws Throwable {
		boolean value = true;
		try {
			commonUtilityMethods.userClicksButtonByOnlyStaticText("Personal/Individual insurance and financial products");
			commonUtilityMethods.userClicksButtonByOnlyName("Continue");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userEntersRandomdataInFidelity() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			WebElement field;

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[22]/XCUIElementTypeOther[11]/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.sendKeys(getAlphaNumericString(7));
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[22]/XCUIElementTypeOther[14]/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("2323456");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();

			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[22]/XCUIElementTypeOther[17]/XCUIElementTypeSecureTextField"));
			field.click();
			field.clear();
			field.sendKeys("2323456");
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
			field = IOMD_driver.driver.findElement(By.xpath(
					"//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[22]/XCUIElementTypeOther[20]/XCUIElementTypeTextField"));
			field.click();
			field.clear();
			field.sendKeys(getAlphaNumericString(7));
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@name,'Done')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userVerifiesBusinessDetailsForCoravin() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(3000);
			WebElement element;

			element = IOMD_driver.driver
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='interactions'])[2]"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Payment']"));
			assertTrue(element.isDisplayed());

			element = IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='Checkout'])[1]"));
			assertTrue(element.isDisplayed());

			IOMD_driver.driver
					.findElement(By.xpath("//XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeButton"))
					.click();
			Thread.sleep(2000);
			element = IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='No new messages']"));
			assertTrue(element.isDisplayed());

			IOMD_driver.driver.findElement(By.xpath("(//XCUIElementTypeOther/XCUIElementTypeButton)[2]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static boolean userScrollsDownToNewsletterTedbaker() throws Throwable {
		boolean value = true;
		try {
			Thread.sleep(4000);
			int ele;
			JavascriptExecutor js = (JavascriptExecutor) IOMD_driver.driver;
			HashMap<String, String> scrollObject = new HashMap<>();
			scrollObject.put("xpath", "//XCUIElementTypeStaticText[@name='Sign Up To Our Newsletter']");
			scrollObject.put("direction", "down");
			scrollObject.put("predicateString", "value == 'Sign Up To Our Newsletter'");
			scrollObject.put("toVisible", "true");
			js.executeScript("mobile:scroll", scrollObject);
			ele = IOMD_driver.driver
					.findElements(By.xpath(
							"//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousCardNo + "')]"))
					.size();
			for (int i = 0; i <= 7; i++) {
				if (ele > 0) {

					value = IOMD_driver.driver
							.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Sign Up To Our Newsletter']"))
							.isEnabled();
					

				} else {
					js.executeScript("mobile:scroll", scrollObject);
					int ele1 = IOMD_driver.driver
							.findElements(By.xpath("//XCUIElementTypeButton[@name='Accept Cookies']")).size();
					if (ele1 > 0) {
						WebElement fetch = IOMD_driver.driver
								.findElement(By.xpath("//XCUIElementTypeButton[@name='Accept Cookies']"));
						value = fetch.isEnabled();
						fetch.click();
						Thread.sleep(2000);
					}
				}
			}
			IOMD_driver.driver.findElement(By.xpath("//*[contains(@value,'tedbaker.com')]")).click();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;
	}

	public static boolean userselectAddressinTedbaker() throws Throwable {
		boolean value = true;
		Thread.sleep(3000);
		try {
			int ele = IOMD_driver.driver.findElements(By.xpath("//*[contains(@value,'4856')]"))
					.size();
			if (ele > 0) {
				WebElement fetch = IOMD_driver.driver
						.findElement(By.xpath("//*[contains(@value,'4856')]"));
				value = fetch.isEnabled();
				fetch.click();
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	
}
