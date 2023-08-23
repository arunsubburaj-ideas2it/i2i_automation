package iomd_locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iomd_driver.IOMD_driver;
import iomd_testdata.iomd_TestData;
import iomd_util.LocatorReader;

public class webPageLocators {

	public webPageLocators() {
		PageFactory.initElements(IOMD_driver.driver, this);
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='PageFormatMenuButton']")
	private WebElement autoFillExtension;

	@FindBy(name = "node.")
	private WebElement IomdExtension;

	@FindBy(xpath = "//*[contains(@label,'Translate to English')]")
	private WebElement translateToEnglish;

	public WebElement getTranslateToEnglish() {
		return translateToEnglish;
	}

	public void setTranslateToEnglish(WebElement translateToEnglish) {
		this.translateToEnglish = translateToEnglish;
	}

	// *[contains(@label,'Enable Translation')]
	public WebElement getIomdExtension() {
		return IomdExtension;
	}

	public void setIomdExtension(WebElement iomdExtension) {
		IomdExtension = iomdExtension;
	}

//	public WebElement getAcceptAllcookies() {
//		return autoFillExtension;
//	}
//
//	public void setAcceptAllcookies(WebElement acceptAllcookies) {
//		this.autoFillExtension = acceptAllcookies;
//	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Accept All Cookies']")
	private WebElement acceptCookies;

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	public List<WebElement> getNameFieldValues() {
		return nameFieldValues;
	}

	public void setNameFieldValues(List<WebElement> nameFieldValues) {
		this.nameFieldValues = nameFieldValues;
	}

	public void setAcceptCookies(WebElement acceptCookies) {
		this.acceptCookies = acceptCookies;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Select the data you want from each section']")
	private WebElement selectDetailsHeader;

	public WebElement getSelectDetailsHeader() {
		return selectDetailsHeader;
	}

	public void setSelectDetailsHeader(WebElement selectDetailsHeader) {
		this.selectDetailsHeader = selectDetailsHeader;
	}

	public WebElement getFeedbackLink() {
		return feedbackLink;
	}

	public void setFeedbackLink(WebElement feedbackLink) {
		this.feedbackLink = feedbackLink;
	}

	public WebElement getNameComponent() {
		return nameComponent;
	}

	public void setNameComponent(WebElement nameComponent) {
		this.nameComponent = nameComponent;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getAnonymousName() {
		return anonymousName;
	}

	public void setAnonymousName(WebElement anonymousName) {
		this.anonymousName = anonymousName;
	}

	public WebElement getMailIdComponent() {
		return mailIdComponent;
	}

	public void setMailIdComponent(WebElement mailIdComponent) {
		this.mailIdComponent = mailIdComponent;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public void setMailId(WebElement mailId) {
		this.mailId = mailId;
	}

	public WebElement getAnonomyousMailId() {
		return anonomyousMailId;
	}

	public void setAnonomyousMailId(WebElement anonomyousMailId) {
		this.anonomyousMailId = anonomyousMailId;
	}

	public WebElement getFillButtonClick() {
		return fillButtonClick;
	}

	public void setFillButtonClick(WebElement fillButtonClick) {
		this.fillButtonClick = fillButtonClick;
	}

	public WebElement getNewsLetterEmailID() {
		return newsLetterEmailID;
	}

	public void setNewsLetterEmailID(WebElement newsLetterEmailID) {
		this.newsLetterEmailID = newsLetterEmailID;
	}

	public WebElement getNewsLetterName() {
		return newsLetterName;
	}

	public void setNewsLetterName(WebElement newsLetterName) {
		this.newsLetterName = newsLetterName;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Feedback']")
	private WebElement feedbackLink;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='NAME']")
	private WebElement nameComponent;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='" + iomd_TestData.userName + "']")
	private WebElement userName;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Rohan Anonomyous']")
	private WebElement anonymousName;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='EMAIL']")
	private WebElement mailIdComponent;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='hiring@iomd.info']")
	private WebElement mailId;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='test2.ideas2it@iomd.info']")
	private WebElement anonomyousMailId;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Fill']")
	private WebElement fillButtonClick;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='content information']/XCUIElementTypeOther[8]/XCUIElementTypeTextField")
	private WebElement newsLetterEmailID;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='content information']/XCUIElementTypeOther[9]/XCUIElementTypeTextField")
	private WebElement newsLetterName;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Shop Argon Capsules']")
	private WebElement shopValue;

	public WebElement getShopValue() {
		return shopValue;
	}

	public void setShopValue(WebElement shopValue) {
		this.shopValue = shopValue;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Click here to sign in or create an account']")
	private WebElement coravinSignInOrSignUpLink;

	public WebElement getCoravinSignInOrSignUpLink() {
		return coravinSignInOrSignUpLink;
	}

	public void setCoravinSignInOrSignUpLink(WebElement coravinSignInOrSignUpLink) {
		this.coravinSignInOrSignUpLink = coravinSignInOrSignUpLink;
	}

	public WebElement getCoracinCreateAnAccount() {
		return coracinCreateAnAccount;
	}

	public void setCoracinCreateAnAccount(WebElement coracinCreateAnAccount) {
		this.coracinCreateAnAccount = coracinCreateAnAccount;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Create an Account']")
	private WebElement coracinCreateAnAccount;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeLink")
	private WebElement coravinFirstProduct;

	public WebElement getCoravinFirstProduct() {
		return coravinFirstProduct;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='main']/XCUIElementTypeLink)[3]")
	private WebElement tedbakerFirstProduct;
	
	public WebElement getTedbakerFirstProduct() {
		return tedbakerFirstProduct;
	}

	public void setTedbakerFirstProduct(WebElement tedbakerFirstProduct) {
		this.tedbakerFirstProduct = tedbakerFirstProduct;
	}

	public void setCoravinFirstProduct(WebElement coravinFirstProduct) {
		this.coravinFirstProduct = coravinFirstProduct;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField")
	private WebElement coravinPassword;
	@FindBy(xpath = "//XCUIElementTypeSecureTextField")
	private WebElement nytimesPassword;

	public WebElement getNytimesPassword() {
		return nytimesPassword;
	}

	public void setNytimesPassword(WebElement nytimesPassword) {
		this.nytimesPassword = nytimesPassword;
	}

	public WebElement getCoravinPassword() {
		return coravinPassword;
	}

	public void setCoravinPassword(WebElement coravinPassword) {
		this.coravinPassword = coravinPassword;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField")
	private List<WebElement> nameFieldValues;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Sign in']")
	private WebElement signInButtonCoravin;

	public WebElement getSignInButtonCoravin() {
		return signInButtonCoravin;
	}

	public void setSignInButtonCoravin(WebElement signInButtonCoravin) {
		this.signInButtonCoravin = signInButtonCoravin;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	private WebElement signInAccountFields;

	public WebElement getSignInAccountFields() {
		return signInAccountFields;
	}

	public WebElement getSiteNavigationButton() {
		return siteNavigationButton;
	}

	public void setSiteNavigationButton(WebElement siteNavigationButton) {
		this.siteNavigationButton = siteNavigationButton;
	}

	public void setSignInAccountFields(WebElement signInAccountFields) {
		this.signInAccountFields = signInAccountFields;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private WebElement doneButtonCoravin;

	public WebElement getDoneButtonCoravin() {
		return doneButtonCoravin;
	}

	public void setDoneButtonCoravin(WebElement doneButtonCoravin) {
		this.doneButtonCoravin = doneButtonCoravin;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Sign in']")
	private WebElement signInButton;

	public WebElement getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='My Bag']")
	private WebElement cartIcon;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public void setCartIcon(WebElement cartIcon) {
		this.cartIcon = cartIcon;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to checkout']")
	private WebElement proceedToCheckout;

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public void setProceedToCheckout(WebElement proceedToCheckout) {
		this.proceedToCheckout = proceedToCheckout;
	}

	@FindBy(name = "842 S Broadway, Colgate-Palmolive, Los Angeles, California, United States, 90014")
	private WebElement addressField;

	@FindBy(name = "361 Linfield drive, Palmolive, Menlo Park, California, United States, 94025")
	private WebElement address2Field;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='4085551213']")
	private WebElement phoneField;

	public WebElement getAddress2Field() {
		return address2Field;
	}

	public void setAddress2Field(WebElement address2Field) {
		this.address2Field = address2Field;
	}

	public WebElement getAutoFillExtension() {
		return autoFillExtension;
	}
 
	public void setAutoFillExtension(WebElement autoFillExtension) {
		this.autoFillExtension = autoFillExtension;
	}

	public WebElement getPhoneField() {
		return phoneField;
	}

	public void setPhoneField(WebElement phoneField) {
		this.phoneField = phoneField;
	}

	public WebElement getAddressField() {
		return addressField;
	}

	public void setAddressField(WebElement addressField) {
		this.addressField = addressField;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Get Shipping Options']")
	private WebElement shippingOption;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Standard (4-6 Business Days)']")
	private WebElement stdshippingOption;

	public WebElement getStdshippingOption() {
		return stdshippingOption;
	}

	public void setStdshippingOption(WebElement stdshippingOption) {
		this.stdshippingOption = stdshippingOption;
	}

	public WebElement getShippingOption() {
		return shippingOption;
	}

	public void setShippingOption(WebElement shippingOption) {
		this.shippingOption = shippingOption;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to Payment']")
	private WebElement continueToPayment;

	public WebElement getContinueToPayment() {
		return continueToPayment;
	}

	public void setContinueToPayment(WebElement continueToPayment) {
		this.continueToPayment = continueToPayment;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='4111 1111 1111 1111']")
	private WebElement creditCardNumber;

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(WebElement creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Fill']")
	private WebElement fillButton;

	public WebElement getFillButton() {
		return fillButton;
	}

	public void setFillButton(WebElement fillButton) {
		this.fillButton = fillButton;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='FirstExtensionButton'])[2]")
	private WebElement tabAutoFillExtension;

	public WebElement getTabAutoFillExtension() {
		return tabAutoFillExtension;
	}

	public void setTabAutoFillExtension(WebElement tabAutoFillExtension) {
		this.tabAutoFillExtension = tabAutoFillExtension;
	}

	@FindBy(xpath = "//input[@id='user_email_footer']")
	private WebElement hindustanEmailSignUp;

	public WebElement getHindustanEmailSignUp() {
		return hindustanEmailSignUp;
	}

	public void setHindustanEmailSignUp(WebElement hindustanEmailSignUp) {
		this.hindustanEmailSignUp = hindustanEmailSignUp;
	}

	@FindBy(xpath = "//div[@id='app']/div[1]/div/header/section[1]/div[4]/a[2]/span")
	private WebElement newYorkTimesSignUpIcon;

	public WebElement getNewYorkTimesSignUpIcon() {
		return newYorkTimesSignUpIcon;
	}

	public void setNewYorkTimesSignUpIcon(WebElement newYorkTimesSignUpIcon) {
		this.newYorkTimesSignUpIcon = newYorkTimesSignUpIcon;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	private WebElement newYorkLogInButton;

	public WebElement getNewYorkLogInButton() {
		return newYorkLogInButton;
	}

	public void setNewYorkLogInButton(WebElement newYorkLogInButton) {
		this.newYorkLogInButton = newYorkLogInButton;
	}

	@FindBy(xpath = "//header[@id='header']/div/div[1]/div[1]/div[1]")
	private WebElement headerValue;

	public WebElement getHeaderValue() {
		return headerValue;
	}

	public void setHeaderValue(WebElement headerValue) {
		this.headerValue = headerValue;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Accept Cookies']")
	private WebElement acceptCookiestedBaker;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Go To Site']")
	private WebElement goToSitetedBaker;

	public WebElement getAcceptCookiestedBaker() {
		return acceptCookiestedBaker;
	}

	public void setAcceptCookiestedBaker(WebElement acceptCookiestedBaker) {
		this.acceptCookiestedBaker = acceptCookiestedBaker;
	}

	public WebElement getGoToSitetedBaker() {
		return goToSitetedBaker;
	}

	public void setGoToSitetedBaker(WebElement goToSitetedBaker) {
		this.goToSitetedBaker = goToSitetedBaker;
	}

	public WebElement getSignUptedBaker() {
		return signUptedBaker;
	}

	public void setSignUptedBaker(WebElement signUptedBaker) {
		this.signUptedBaker = signUptedBaker;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Sign Up']")
	private WebElement signUptedBaker;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement curativeEmailBox;

	public WebElement getCurativeEmailBox() {
		return curativeEmailBox;
	}

	public void setCurativeEmailBox(WebElement curativeEmailBox) {
		this.curativeEmailBox = curativeEmailBox;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Enter using password']")
	private WebElement enterUsingPassword;

	public WebElement getEnterUsingPassword() {
		return enterUsingPassword;
	}

	public void setEnterUsingPassword(WebElement enterUsingPassword) {
		this.enterUsingPassword = enterUsingPassword;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Your password']")
	private WebElement curativeLifestylePassword;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Enter']")
	private WebElement enterCurativeLifeStyle;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Check out']")
	private WebElement cartCurativeLifestyle;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=‘Check out’]")
	private WebElement checkoutCurativeLifeStyle;

	public WebElement getCurativeLifestylePassword() {
		return curativeLifestylePassword;
	}

	public void setCurativeLifestylePassword(WebElement curativeLifestylePassword) {
		this.curativeLifestylePassword = curativeLifestylePassword;
	}

	public WebElement getEnterCurativeLifeStyle() {
		return enterCurativeLifeStyle;
	}

	public void setEnterCurativeLifeStyle(WebElement enterCurativeLifeStyle) {
		this.enterCurativeLifeStyle = enterCurativeLifeStyle;
	}

	public WebElement getCartCurativeLifestyle() {
		return cartCurativeLifestyle;
	}

	public void setCartCurativeLifestyle(WebElement cartCurativeLifestyle) {
		this.cartCurativeLifestyle = cartCurativeLifestyle;
	}

	public WebElement getCheckoutCurativeLifeStyle() {
		return checkoutCurativeLifeStyle;
	}

	public void setCheckoutCurativeLifeStyle(WebElement checkoutCurativeLifeStyle) {
		this.checkoutCurativeLifeStyle = checkoutCurativeLifeStyle;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Wines']")
	private WebElement wineLink;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'2018 Cakebread')]")
	private WebElement productLink;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Add to cart']")
	private WebElement addToCartButton;

	public WebElement getWineLink() {
		return wineLink;
	}

	public void setWineLink(WebElement wineLink) {
		this.wineLink = wineLink;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public void setProductLink(WebElement productLink) {
		this.productLink = productLink;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to shipping']")
	private WebElement continueToShipping;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to payment']")
	private WebElement continueToPaymentButton;

	public WebElement getContinueToShipping() {
		return continueToShipping;
	}

	public void setContinueToShipping(WebElement continueToShipping) {
		this.continueToShipping = continueToShipping;
	}

	public WebElement getContinueToPaymentButton() {
		return continueToPaymentButton;
	}

	public void setContinueToPaymentButton(WebElement continueToPaymentButton) {
		this.continueToPaymentButton = continueToPaymentButton;
	}

	@FindBy(xpath = "//img[@title='Search']")
	private WebElement searchTedBaker;

	public WebElement getSearchTedBaker() {
		return searchTedBaker;
	}

	public void setSearchTedBaker(WebElement searchTedBaker) {
		this.searchTedBaker = searchTedBaker;
	}
						
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Subscribe']")
	private WebElement subscribeNewsExtension;

	public WebElement getSubscribeNewsExtension() {
		return subscribeNewsExtension;
	}

	public void setSubscribeNewsExtension(WebElement subscribeNewsExtension) {
		this.subscribeNewsExtension = subscribeNewsExtension;
	}

	@FindBy(xpath = "//XCUIElementTypeLink[@name='Forgot Password?']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[5]/XCUIElementTypeTextField")
	private WebElement emailInputBox;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name='Submit'])[1]")
	private WebElement submitButton;

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public void setForgotPassword(WebElement forgotPassword) {
		this.forgotPassword = forgotPassword;
	}

	public WebElement getEmailInputBox() {
		return emailInputBox;
	}

	public void setEmailInputBox(WebElement emailInputBox) {
		this.emailInputBox = emailInputBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	public WebElement getRightArrow() {
		return rightArrow;
	}

	public void setRightArrow(WebElement rightArrow) {
		this.rightArrow = rightArrow;
	}

	@FindBy(xpath = "(//XCUIElementTypeImage[@name='rightArrow'])[1]")
	private WebElement rightArrow;

	/*
	 * =============================================================================
	 * === FiveMarysMeats Website Locators
	 * =============================================================================
	 * ===
	 */

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Site navigation']")
	private WebElement siteNavigationButton;

	public WebElement getFivemarysLoginButton() {
		return fivemarysLoginButton;
	}

	public void setFivemarysLoginButton(WebElement fivemarysLoginButton) {
		this.fivemarysLoginButton = fivemarysLoginButton;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Log in']")
	private WebElement fivemarysLoginButton;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Forgot?']")
	private WebElement fivemarysForgotButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField")
	private WebElement fivemarysForgotEmailTextBox;

	public WebElement getFivemarysForgotEmailTextBox() {
		return fivemarysForgotEmailTextBox;
	}

	public void setFivemarysForgotEmailTextBox(WebElement fivemarysForgotEmailTextBox) {
		this.fivemarysForgotEmailTextBox = fivemarysForgotEmailTextBox;
	}

	public WebElement getFivemarysForgotButton() {
		return fivemarysForgotButton;
	}

	public void setFivemarysForgotButton(WebElement fivemarysForgotButton) {
		this.fivemarysForgotButton = fivemarysForgotButton;
	}

	public WebElement getEmailIdField() {
		return emailIdField;
	}

	public void setEmailIdField(WebElement emailIdField) {
		this.emailIdField = emailIdField;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField")
	private WebElement emailIdField;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Primary, navigation']/XCUIElementTypeOther[1]")
	private WebElement firstCategoryOption;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Add to cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Check out']")
	private WebElement checkoutBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getContinueShippingBtn() {
		return continueShippingBtn;
	}

	public void setContinueShippingBtn(WebElement continueShippingBtn) {
		this.continueShippingBtn = continueShippingBtn;
	}

	public void setAddToCartBtn(WebElement addToCartBtn) {
		this.addToCartBtn = addToCartBtn;
	}

	public WebElement getFirstCategoryOption() {
		return firstCategoryOption;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public void setCheckoutBtn(WebElement checkoutBtn) {
		this.checkoutBtn = checkoutBtn;
	}

	public void setFirstCategoryOption(WebElement firstCategoryOption) {
		this.firstCategoryOption = firstCategoryOption;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeLink")
	private List<WebElement> firstProduct;

	public List<WebElement> getFirstProduct() {
		return firstProduct;
	}

	public void setFirstProduct(List<WebElement> firstProduct) {
		this.firstProduct = firstProduct;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to shipping']")
	private WebElement continueShippingBtn;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Review your information']/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	private WebElement contactTextbox;

	public WebElement getContactTextbox() {
		return contactTextbox;
	}

	public void setContactTextbox(WebElement contactTextbox) {
		this.contactTextbox = contactTextbox;
	}

	public WebElement getShipToTextbox() {
		return shipToTextbox;
	}

	public void setShipToTextbox(WebElement shipToTextbox) {
		this.shipToTextbox = shipToTextbox;
	}

	public WebElement getContinuePaymentBtn() {
		return continuePaymentBtn;
	}

	public void setContinuePaymentBtn(WebElement continuePaymentBtn) {
		this.continuePaymentBtn = continuePaymentBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Review your information']/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	private WebElement shipToTextbox;
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to payment']")
	private WebElement continuePaymentBtn;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Field container for: Card number'])[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement fmCardno;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Field container for: Cardholder name'])[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement fmCardName;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Field container for: Expiration date (MM / YY)'])[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement fmCardExpirydate;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Field container for: Security code'])[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement fmCardCVV;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Pay now']")
	private WebElement payNowBtn;

	public WebElement getPayNowBtn() {
		return payNowBtn;
	}

	public void setPayNowBtn(WebElement payNowBtn) {
		this.payNowBtn = payNowBtn;
	}

	public WebElement getFmCardno() {
		return fmCardno;
	}

	public void setFmCardno(WebElement fmCardno) {
		this.fmCardno = fmCardno;
	}

	public WebElement getFmCardName() {
		return fmCardName;
	}

	public void setFmCardName(WebElement fmCardName) {
		this.fmCardName = fmCardName;
	}

	public WebElement getFmCardExpirydate() {
		return fmCardExpirydate;
	}

	public void setFmCardExpirydate(WebElement fmCardExpirydate) {
		this.fmCardExpirydate = fmCardExpirydate;
	}

	public WebElement getFmCardCVV() {
		return fmCardCVV;
	}

	public void setFmCardCVV(WebElement fmCardCVV) {
		this.fmCardCVV = fmCardCVV;
	}

	/*
	 * =============================================================================
	 * === MylaporeExpress Website Locators
	 * =============================================================================
	 * ===
	 */

	@FindBy(xpath = "(//XCUIElementTypeLink[@name='Log in'])[1]")
	private WebElement meMyAccBtn;

	public WebElement getMeMyAccBtn() {
		return meMyAccBtn;
	}

	public void setMeMyAccBtn(WebElement meMyAccBtn) {
		this.meMyAccBtn = meMyAccBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField")
	private WebElement meEmailId;

	public WebElement getMeEmailId() {
		return meEmailId;
	}

	public void setMeEmailId(WebElement meEmailId) {
		this.meEmailId = meEmailId;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Sign In']")
	private WebElement meSignInBtn;

	public WebElement getMeSignInBtn() {
		return meSignInBtn;
	}

	public void setMeSignInBtn(WebElement meSignInBtn) {
		this.meSignInBtn = meSignInBtn;
	}

	public WebElement getMeForgetEmailTxtBox() {
		return meForgetEmailTxtBox;
	}

	public void setMeForgetEmailTxtBox(WebElement meForgetEmailTxtBox) {
		this.meForgetEmailTxtBox = meForgetEmailTxtBox;
	}

	@FindBy(xpath = "//XCUIElementTypeLink[@name='Forgot your password?']")
	private WebElement meForgetPwdBtn;

	public WebElement getMeForgetPwdBtn() {
		return meForgetPwdBtn;
	}

	public void setMeForgetPwdBtn(WebElement meForgetPwdBtn) {
		this.meForgetPwdBtn = meForgetPwdBtn;
	}

	public WebElement getMeZipCodeTextBox() {
		return meZipCodeTextBox;
	}

	public void setMeZipCodeTextBox(WebElement meZipCodeTextBox) {
		this.meZipCodeTextBox = meZipCodeTextBox;
	}

	public WebElement getMeCheckBtn() {
		return meCheckBtn;
	}

	public void setMeCheckBtn(WebElement meCheckBtn) {
		this.meCheckBtn = meCheckBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField")
	private WebElement meForgetEmailTxtBox;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[6]/XCUIElementTypeTextField")
	private WebElement meZipCodeTextBox;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='CHECK']")
	private WebElement meCheckBtn;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='ADD TO CART']")
	private WebElement meAddToCartBtn;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Check out']")
	private WebElement meCheckoutBtn;

	public WebElement getMeContinueBtn() {
		return meContinueBtn;
	}

	public void setMeContinueBtn(WebElement meContinueBtn) {
		this.meContinueBtn = meContinueBtn;
	}

	public WebElement getMeContinueToPaymentBtn() {
		return meContinueToPaymentBtn;
	}

	public void setMeContinueToPaymentBtn(WebElement meContinueToPaymentBtn) {
		this.meContinueToPaymentBtn = meContinueToPaymentBtn;
	}

	public WebElement getMeContactTextBox() {
		return meContactTextBox;
	}

	public void setMeContactTextBox(WebElement meContactTextBox) {
		this.meContactTextBox = meContactTextBox;
	}

	public WebElement getMeShipToBox() {
		return meShipToBox;
	}

	public void setMeShipToBox(WebElement meShipToBox) {
		this.meShipToBox = meShipToBox;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	private WebElement meContinueBtn;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Continue to payment']")
	private WebElement meContinueToPaymentBtn;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[7]/XCUIElementTypeSwitch")
	private WebElement meAcceptTermsBox;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Review your information']/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	private WebElement meContactTextBox;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Review your information']/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	private WebElement meShipToBox;

	public WebElement getMeAddToCartBtn() {
		return meAddToCartBtn;
	}

	public void setMeAddToCartBtn(WebElement meAddToCartBtn) {
		this.meAddToCartBtn = meAddToCartBtn;
	}

	public WebElement getMeCheckoutBtn() {
		return meCheckoutBtn;
	}

	public void setMeCheckoutBtn(WebElement meCheckoutBtn) {
		this.meCheckoutBtn = meCheckoutBtn;
	}

	public WebElement getMeAcceptTermsBox() {
		return meAcceptTermsBox;
	}

	public void setMeAcceptTermsBox(WebElement meAcceptTermsBox) {
		this.meAcceptTermsBox = meAcceptTermsBox;
	}

	public WebElement getMeMondayBtn() {
		return meMondayBtn;
	}

	public void setMeMondayBtn(WebElement meMondayBtn) {
		this.meMondayBtn = meMondayBtn;
	}

	public List<WebElement> getMeFirstCustomBtn() {
		return meFirstCustomBtn;
	}

	public void setMeFirstCustomBtn(List<WebElement> meFirstCustomBtn) {
		this.meFirstCustomBtn = meFirstCustomBtn;
	}

	public List<WebElement> getMeMenuBoxes() {
		return meMenuBoxes;
	}

	public void setMeMenuBoxes(List<WebElement> meMenuBoxes) {
		this.meMenuBoxes = meMenuBoxes;
	}

	@FindBy(xpath = "//XCUIElementTypeLink[@name='MONDAY']")
	private WebElement meMondayBtn;

	@FindBy(xpath = "//*[contains(@name,'Custom Medium')]")
	private List<WebElement> meFirstCustomBtn;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	private List<WebElement> meMenuBoxes;

	/*
	 * =============================================================================
	 * === GoodEggs Website Locators
	 * =============================================================================
	 * ===
	 */

	@FindBy(xpath = "(//XCUIElementTypeLink[@name='Get Started'])[1]")
	private WebElement geGetStartedButton;

	@FindBy(name = "Sign In")
	private WebElement geSignInButton;

	@FindBy(name = "Sign Up")
	private WebElement geSignUpButton;

	public WebElement getGeGetStartedButton() {
		return geGetStartedButton;
	}

	public void setGeGetStartedButton(WebElement geGetStartedButton) {
		this.geGetStartedButton = geGetStartedButton;
	}

	public WebElement getGeSignInButton() {
		return geSignInButton;
	}

	public void setGeSignInButton(WebElement geSignInButton) {
		this.geSignInButton = geSignInButton;
	}

	public WebElement getGeSignUpButton() {
		return geSignUpButton;
	}

	public void setGeSignUpButton(WebElement geSignUpButton) {
		this.geSignUpButton = geSignUpButton;
	}

	public WebElement getGeForgotButton() {
		return geForgotButton;
	}

	public void setGeForgotButton(WebElement geForgotButton) {
		this.geForgotButton = geForgotButton;
	}

	public WebElement getEmailIdFieldValue() {
		return emailIdFieldValue;
	}

	public void setEmailIdFieldValue(WebElement emailIdFieldValue) {
		this.emailIdFieldValue = emailIdFieldValue;
	}

	public WebElement getFirstNameFieldValue() {
		return firstNameFieldValue;
	}

	public void setFirstNameFieldValue(WebElement firstNameFieldValue) {
		this.firstNameFieldValue = firstNameFieldValue;
	}

	public WebElement getZipCodeFieldValue() {
		return zipCodeFieldValue;
	}

	public void setZipCodeFieldValue(WebElement zipCodeFieldValue) {
		this.zipCodeFieldValue = zipCodeFieldValue;
	}

	public WebElement getLastNameFieldValue() {
		return lastNameFieldValue;
	}

	public void setLastNameFieldValue(WebElement lastNameFieldValue) {
		this.lastNameFieldValue = lastNameFieldValue;
	}

	public WebElement getGeEmailIdField() {
		return geEmailIdField;
	}

	public void setGeEmailIdField(WebElement geEmailIdField) {
		this.geEmailIdField = geEmailIdField;
	}

	@FindBy(name = "Forgot password?")
	private WebElement geForgotButton;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'test2.ideas2it@iomd.info')]")
	private WebElement geEmailIdField;
	@FindBy(xpath = "//XCUIElementTypeOther[@name='Booking.com']/XCUIElementTypeTextField")
	private WebElement bookEmailIdField;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Log in or sign up'])[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	private WebElement airEmailIdField;

	public WebElement getAirEmailIdField() {
		return airEmailIdField;
	}

	public void setAirEmailIdField(WebElement airEmailIdField) {
		this.airEmailIdField = airEmailIdField;
	}

	public WebElement getBookEmailIdField() {
		return bookEmailIdField;
	}

	public void setBookEmailIdField(WebElement bookEmailIdField) {
		this.bookEmailIdField = bookEmailIdField;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.iomdEmail + "')]")
	private WebElement emailIdFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.firstName + "')]")
	private WebElement firstNameFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.lastName + "')]")
	private WebElement lastNameFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousPhoneNumber + "')]")
	private WebElement phoneNumberFieldValue;
	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.anonymousPhWithFormat + "')]")
	private WebElement phoneNumberWithFormatFieldValue;
	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.otherPhoneNumber + "')]")
	private WebElement otherPhoneNumberFieldValue;

	public WebElement getPhoneNumberFieldValue() {
		return phoneNumberFieldValue;
	}

	public void setPhoneNumberFieldValue(WebElement phoneNumberFieldValue) {
		this.phoneNumberFieldValue = phoneNumberFieldValue;
	}

	public WebElement getPhoneNumberWithFormatFieldValue() {
		return phoneNumberWithFormatFieldValue;
	}

	public void setPhoneNumberWithFormatFieldValue(WebElement phoneNumberWithFormatFieldValue) {
		this.phoneNumberWithFormatFieldValue = phoneNumberWithFormatFieldValue;
	}

	public WebElement getSvbCardno() {
		return svbCardno;
	}

	public void setSvbCardno(WebElement svbCardno) {
		this.svbCardno = svbCardno;
	}

	public WebElement getOtherPhoneNumberFieldValue() {
		return otherPhoneNumberFieldValue;
	}

	public void setOtherPhoneNumberFieldValue(WebElement otherPhoneNumberFieldValue) {
		this.otherPhoneNumberFieldValue = otherPhoneNumberFieldValue;
	}

	public WebElement getSvbCardExpirydate() {
		return svbCardExpirydate;
	}

	public void setSvbCardExpirydate(WebElement svbCardExpirydate) {
		this.svbCardExpirydate = svbCardExpirydate;
	}

	public WebElement getSvbCardCVV() {
		return svbCardCVV;
	}

	public void setSvbCardCVV(WebElement svbCardCVV) {
		this.svbCardCVV = svbCardCVV;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.zipCode + "')]")
	private WebElement zipCodeFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCountry + "')]")
	private WebElement countryFieldValue;
	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCountryShort + "')]")
	private WebElement countrySFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCity + "')]")
	private WebElement cityFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalCityShort + "')]")
	private WebElement citySFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalState + "')]")
	private WebElement stateFieldValue;

	@FindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'" + iomd_TestData.personalStateShort + "')]")
	private WebElement stateSFieldValue;

	public WebElement getCountrySFieldValue() {
		return countrySFieldValue;
	}

	public void setCountrySFieldValue(WebElement countrySFieldValue) {
		this.countrySFieldValue = countrySFieldValue;
	}

	public WebElement getCityFieldValue() {
		return cityFieldValue;
	}

	public WebElement getStateFieldValue() {
		return stateFieldValue;
	}

	public void setStateFieldValue(WebElement stateFieldValue) {
		this.stateFieldValue = stateFieldValue;
	}

	public WebElement getStateSFieldValue() {
		return stateSFieldValue;
	}

	public void setStateSFieldValue(WebElement stateSFieldValue) {
		this.stateSFieldValue = stateSFieldValue;
	}

	public void setCityFieldValue(WebElement cityFieldValue) {
		this.cityFieldValue = cityFieldValue;
	}

	public WebElement getCitySFieldValue() {
		return citySFieldValue;
	}

	public void setCitySFieldValue(WebElement citySFieldValue) {
		this.citySFieldValue = citySFieldValue;
	}

	public WebElement getCommonButtonByName() {
		return commonButtonByName;
	}

	public WebElement getCountryFieldValue() {
		return countryFieldValue;
	}

	public void setCountryFieldValue(WebElement countryFieldValue) {
		this.countryFieldValue = countryFieldValue;
	}

	public void setCommonButtonByName(WebElement commonButtonByName) {
		this.commonButtonByName = commonButtonByName;
	}

	@FindBy(xpath = "//*[contains(@name,'$')]")
	private WebElement commonButtonByName;

	public WebElement getSvbCardEmail() {
		return svbCardEmail;
	}

	public WebElement getEcoyaClosepopup() {
		return ecoyaClosepopup;
	}

	public void setEcoyaClosepopup(WebElement ecoyaClosepopup) {
		this.ecoyaClosepopup = ecoyaClosepopup;
	}

	public void setSvbCardEmail(WebElement svbCardEmail) {
		this.svbCardEmail = svbCardEmail;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Online Banking']/XCUIElementTypeOther[12]/XCUIElementTypeTextField")
	private WebElement svbCardno;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Online Banking']/XCUIElementTypeOther[16]/XCUIElementTypeTextField")
	private WebElement svbCardExpirydate;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Online Banking']/XCUIElementTypeOther[14]/XCUIElementTypeTextField")
	private WebElement svbCardCVV;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='Online Banking']/XCUIElementTypeOther[19]/XCUIElementTypeTextField")
	private WebElement svbCardEmail;
	@FindBy(xpath = "//XCUIElementTypeOther[contains(@name,'ECOYA')]/XCUIElementTypeButton[1]")
	private WebElement ecoyaClosepopup;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card number']")
	private WebElement geCardno;

	public WebElement getGeCardno() {
		return geCardno;
	}

	public void setGeCardno(WebElement geCardno) {
		this.geCardno = geCardno;
	}

	public WebElement getGeCardExpirydate() {
		return geCardExpirydate;
	}

	public void setGeCardExpirydate(WebElement geCardExpirydate) {
		this.geCardExpirydate = geCardExpirydate;
	}

	public WebElement getGeCardCVV() {
		return geCardCVV;
	}

	public void setGeCardCVV(WebElement geCardCVV) {
		this.geCardCVV = geCardCVV;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card expiration date']")
	private WebElement geCardExpirydate;

	public WebElement getcCardno() {
		return cCardno;
	}

	public void setcCardno(WebElement cCardno) {
		this.cCardno = cCardno;
	}

	public WebElement getcCardExpirydate() {
		return cCardExpirydate;
	}

	public void setcCardExpirydate(WebElement cCardExpirydate) {
		this.cCardExpirydate = cCardExpirydate;
	}

	public WebElement getcCardCVV() {
		return cCardCVV;
	}

	public void setcCardCVV(WebElement cCardCVV) {
		this.cCardCVV = cCardCVV;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card CVC/CVV']")
	private WebElement geCardCVV;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Secure Credit Card Frame - Credit Card Number'])[2]/XCUIElementTypeTextField")
	private WebElement cCardno;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Secure Credit Card Frame - Expiration Date'])[2]/XCUIElementTypeTextField")
	private WebElement cCardExpirydate;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Secure Credit Card Frame - CVV'])[1]")
	private WebElement cCardCVV;
	/*
	 * =============================================================================
	 * === MylaporeExpress Website Locators
	 * =============================================================================
	 * ===
	 */
					 //XCUIElementTypeOther[@name="main"]/XCUIElementTypeOther[6]/XCUIElementTypeOther[1]
	@FindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[6]/XCUIElementTypeOther[1]")
	private WebElement pyProductField;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='article'])[1]")
	private WebElement scProductField;

	public WebElement getScProductField() {
		return scProductField;
	}

	public void setScProductField(WebElement scProductField) {
		this.scProductField = scProductField;
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card number']")
	private WebElement pyCardno;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card expiration date']")
	private WebElement pyCardExpirydate;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Credit or debit card CVC/CVV']")
	private WebElement pyCardCVV;

	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Card number']")
	private WebElement tedCardno;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Expiry date']")
	private WebElement tedCardExpirydate;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name='Security code']")
	private WebElement tedCardCVV;

	
	
	public WebElement getTedCardno() {
		return tedCardno;
	}

	public void setTedCardno(WebElement tedCardno) {
		this.tedCardno = tedCardno;
	}

	public WebElement getTedCardExpirydate() {
		return tedCardExpirydate;
	}

	public void setTedCardExpirydate(WebElement tedCardExpirydate) {
		this.tedCardExpirydate = tedCardExpirydate;
	}

	public WebElement getTedCardCVV() {
		return tedCardCVV;
	}

	public void setTedCardCVV(WebElement tedCardCVV) {
		this.tedCardCVV = tedCardCVV;
	}

	public WebElement getPyCardno() {
		return pyCardno;
	}

	public void setPyCardno(WebElement pyCardno) {
		this.pyCardno = pyCardno;
	}

	public WebElement getPyCardExpirydate() {
		return pyCardExpirydate;
	}

	public void setPyCardExpirydate(WebElement pyCardExpirydate) {
		this.pyCardExpirydate = pyCardExpirydate;
	}

	public WebElement getPyCardCVV() {
		return pyCardCVV;
	}

	public void setPyCardCVV(WebElement pyCardCVV) {
		this.pyCardCVV = pyCardCVV;
	}

	public WebElement getPyProductField() {
		return pyProductField;
	}

	public void setPyProductField(WebElement pyProductField) {
		this.pyProductField = pyProductField;
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Payment'])[2]/XCUIElementTypeTextField[1]")
	private WebElement scCardno;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Payment'])[2]/XCUIElementTypeTextField[2]")
	private WebElement scCardName;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Payment'])[2]/XCUIElementTypeTextField[3]")
	private WebElement scCardExpirydate;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Payment'])[2]/XCUIElementTypeTextField[4]")
	private WebElement scCardCVV;

	public WebElement getScCardno() {
		return scCardno;
	}

	public void setScCardno(WebElement scCardno) {
		this.scCardno = scCardno;
	}

	public WebElement getScCardName() {
		return scCardName;
	}

	public void setScCardName(WebElement scCardName) {
		this.scCardName = scCardName;
	}

	public WebElement getScCardExpirydate() {
		return scCardExpirydate;
	}

	public void setScCardExpirydate(WebElement scCardExpirydate) {
		this.scCardExpirydate = scCardExpirydate;
	}

	public WebElement getScCardCVV() {
		return scCardCVV;
	}

	public void setScCardCVV(WebElement scCardCVV) {
		this.scCardCVV = scCardCVV;
	}

	@FindBy(xpath = "(//*[contains(@name,'Button')])[2]")
	private WebElement aClosepopupField;

	public WebElement getaClosepopupField() {
		return aClosepopupField;
	}

	public void setaClosepopupField(WebElement aClosepopupField) {
		this.aClosepopupField = aClosepopupField;
	}
}