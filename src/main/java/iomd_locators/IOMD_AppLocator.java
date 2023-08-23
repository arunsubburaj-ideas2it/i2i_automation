package iomd_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iomd_driver.IOMD_driver;

public class IOMD_AppLocator {

	public IOMD_AppLocator() {
		PageFactory.initElements(IOMD_driver.driver, this);
	}

	@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField")
	private WebElement emailValue;

	
	@FindBy(xpath = "(//XCUIElementTypeSecureTextField[@name='Passcode field'])[2]")
	private WebElement phPasswordValue;

	public WebElement getEmailValue() {
		return emailValue;
	}


	public WebElement getPhPasswordValue() {
		return phPasswordValue;
	}

	public void setPhPasswordValue(WebElement phPasswordValue) {
		this.phPasswordValue = phPasswordValue;
	}

	public void setEmailValue(WebElement emailValue) {
		this.emailValue = emailValue;
	}

	public WebElement getFetch() {
		return Fetch;
	}

	public void setFetch(WebElement fetch) {
		Fetch = fetch;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Fetch Profile']")
	private WebElement Fetch;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Check your message']")
	private WebElement checkYourMessageBtn;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'interact online')]")
	private WebElement headerText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Welcome')]")
	private WebElement welcomeText;

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public void setWelcomeText(WebElement welcomeText) {
		this.welcomeText = welcomeText;
	}

	@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton")
	private WebElement iomdBackBtn;

	public WebElement getIomdBackBtn() {
		return iomdBackBtn;
	}

	public void setIomdBackBtn(WebElement iomdBackBtn) {
		this.iomdBackBtn = iomdBackBtn;
	}

	public WebElement getPersonalFieldText() {
		return personalFieldText;
	}

	public void setPersonalFieldText(WebElement personalFieldText) {
		this.personalFieldText = personalFieldText;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'personal')]")
	private WebElement personalFieldText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'tokenized email')]")
	private WebElement emailFieldText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Welcome to IOMD')]")
	private WebElement welcomeSubjectText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Welcome to the online revolution')]")
	private WebElement welcomeEmailContentText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'what you can do now with the tokenized email')]")
	private WebElement welcomeEmailContentPoint1Text;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Forward to your personal email')]")
	private WebElement welcomeEmailContentAText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Use it anywhere')]")
	private WebElement welcomeEmailContentBText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'End email clutter by organizing')]")
	private WebElement welcomeEmailContentCText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'All this cool stuff just by choosing to tokenize your email')]")
	private WebElement welcomeEmailContentPoint2Text;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Now to finish up')]")
	private WebElement welcomeEmailFinishText;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Show Me The Magic']")
	private WebElement showMeMagicBtn;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Ok! Got it!']")
	private WebElement okGotitBtn;

	public WebElement getOkGotitBtn() {
		return okGotitBtn;
	}

	public void setOkGotitBtn(WebElement okGotitBtn) {
		this.okGotitBtn = okGotitBtn;
	}
				
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='OK']")
	private WebElement okBtn;

	public WebElement getOkBtn() {
		return okBtn;
	}

	public void setOkBtn(WebElement okBtn) {
		this.okBtn = okBtn;
	}
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Here is the personal and tokenized information')]")
	private WebElement personalTokenisedText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Tokenized personal information:')]")
	private WebElement tokenisedPersonalInfoText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'have the choice to tokenize it')]")
	private WebElement tokenisedPersonalInfoData;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Use this to stop spam, phishing, hacking & end email clutter')]")
	private WebElement tokenisedEmailData;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'need a text or a call back')]")
	private WebElement tokenisedPhData;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'want eco-unfriendly junk mail')]")
	private WebElement tokenisedAddressData;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter the name of your choice')]")
	private WebElement tokenisedUsernameData;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Personal information:')]")
	private WebElement personalInfoText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can use IOMD anywhere online immediately')]")
	private WebElement personalInfoData;

	@FindBy(xpath = "(//XCUIElementTypeOther[4]/XCUIElementTypeTextField)[1]")
	private WebElement tokenisedFirstName;

	@FindBy(xpath = "(//XCUIElementTypeOther[4]/XCUIElementTypeTextField)[2]")
	private WebElement tokenisedLastName;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	private WebElement personalEmailId;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
	private WebElement personalPhoneNo;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
	private WebElement personalStreetAdd1;

	@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
	private WebElement tokenStreetAdd1;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
	private WebElement personalCity;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
	private WebElement personalState;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[4]")
	private WebElement personalCountry;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[5]")
	private WebElement personalZipCode;

	@FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField[5]")
	private WebElement tokenZipCode;

	public WebElement getTokenStreetAdd1() {
		return tokenStreetAdd1;
	}

	public void setTokenStreetAdd1(WebElement tokenStreetAdd1) {
		this.tokenStreetAdd1 = tokenStreetAdd1;
	}

	public WebElement getTokenZipCode() {
		return tokenZipCode;
	}

	public void setTokenZipCode(WebElement tokenZipCode) {
		this.tokenZipCode = tokenZipCode;
	}

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	private WebElement personalFirstName;

	@FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]")
	private WebElement personalLastName;

	public WebElement getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(WebElement personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public WebElement getPersonalPhoneNo() {
		return personalPhoneNo;
	}

	public void setPersonalPhoneNo(WebElement personalPhoneNo) {
		this.personalPhoneNo = personalPhoneNo;
	}

	public WebElement getPersonalStreetAdd1() {
		return personalStreetAdd1;
	}

	public void setPersonalStreetAdd1(WebElement personalStreetAdd1) {
		this.personalStreetAdd1 = personalStreetAdd1;
	}

	public WebElement getPersonalCity() {
		return personalCity;
	}

	public void setPersonalCity(WebElement personalCity) {
		this.personalCity = personalCity;
	}

	public WebElement getPersonalState() {
		return personalState;
	}

	public void setPersonalState(WebElement personalState) {
		this.personalState = personalState;
	}

	public WebElement getPersonalCountry() {
		return personalCountry;
	}

	public void setPersonalCountry(WebElement personalCountry) {
		this.personalCountry = personalCountry;
	}

	public WebElement getPersonalZipCode() {
		return personalZipCode;
	}

	public void setPersonalZipCode(WebElement personalZipCode) {
		this.personalZipCode = personalZipCode;
	}

	public WebElement getPersonalFirstName() {
		return personalFirstName;
	}

	public void setPersonalFirstName(WebElement personalFirstName) {
		this.personalFirstName = personalFirstName;
	}

	public WebElement getPersonalLastName() {
		return personalLastName;
	}

	public void setPersonalLastName(WebElement personalLastName) {
		this.personalLastName = personalLastName;
	}

	public WebElement getPersonalTokenisedText() {
		return personalTokenisedText;
	}

	public WebElement getTokenisedFirstName() {
		return tokenisedFirstName;
	}

	public void setTokenisedFirstName(WebElement tokenisedFirstName) {
		this.tokenisedFirstName = tokenisedFirstName;
	}

	public WebElement getTokenisedLastName() {
		return tokenisedLastName;
	}

	public void setTokenisedLastName(WebElement tokenisedLastName) {
		this.tokenisedLastName = tokenisedLastName;
	}

	public void setPersonalTokenisedText(WebElement personalTokenisedText) {
		this.personalTokenisedText = personalTokenisedText;
	}

	public WebElement getTokenisedPersonalInfoText() {
		return tokenisedPersonalInfoText;
	}

	public void setTokenisedPersonalInfoText(WebElement tokenisedPersonalInfoText) {
		this.tokenisedPersonalInfoText = tokenisedPersonalInfoText;
	}

	public WebElement getTokenisedPersonalInfoData() {
		return tokenisedPersonalInfoData;
	}

	public void setTokenisedPersonalInfoData(WebElement tokenisedPersonalInfoData) {
		this.tokenisedPersonalInfoData = tokenisedPersonalInfoData;
	}

	public WebElement getTokenisedEmailData() {
		return tokenisedEmailData;
	}

	public void setTokenisedEmailData(WebElement tokenisedEmailData) {
		this.tokenisedEmailData = tokenisedEmailData;
	}

	public WebElement getTokenisedPhData() {
		return tokenisedPhData;
	}

	public void setTokenisedPhData(WebElement tokenisedPhData) {
		this.tokenisedPhData = tokenisedPhData;
	}

	public WebElement getTokenisedAddressData() {
		return tokenisedAddressData;
	}

	public void setTokenisedAddressData(WebElement tokenisedAddressData) {
		this.tokenisedAddressData = tokenisedAddressData;
	}

	public WebElement getTokenisedUsernameData() {
		return tokenisedUsernameData;
	}

	public void setTokenisedUsernameData(WebElement tokenisedUsernameData) {
		this.tokenisedUsernameData = tokenisedUsernameData;
	}

	public WebElement getPersonalInfoText() {
		return personalInfoText;
	}

	public void setPersonalInfoText(WebElement personalInfoText) {
		this.personalInfoText = personalInfoText;
	}

	public WebElement getPersonalInfoData() {
		return personalInfoData;
	}

	public void setPersonalInfoData(WebElement personalInfoData) {
		this.personalInfoData = personalInfoData;
	}

	public WebElement getSaveAndshowMeMagicBtn() {
		return saveAndshowMeMagicBtn;
	}

	public void setSaveAndshowMeMagicBtn(WebElement saveAndshowMeMagicBtn) {
		this.saveAndshowMeMagicBtn = saveAndshowMeMagicBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name='Save & Show me the magic']")
	private WebElement saveAndshowMeMagicBtn;

	public WebElement getWelcomeSubjectText() {
		return welcomeSubjectText;
	}

	public void setWelcomeSubjectText(WebElement welcomeSubjectText) {
		this.welcomeSubjectText = welcomeSubjectText;
	}

	public WebElement getWelcomeEmailContentText() {
		return welcomeEmailContentText;
	}

	public void setWelcomeEmailContentText(WebElement welcomeEmailContentText) {
		this.welcomeEmailContentText = welcomeEmailContentText;
	}

	public WebElement getWelcomeEmailContentPoint1Text() {
		return welcomeEmailContentPoint1Text;
	}

	public void setWelcomeEmailContentPoint1Text(WebElement welcomeEmailContentPoint1Text) {
		this.welcomeEmailContentPoint1Text = welcomeEmailContentPoint1Text;
	}

	public WebElement getWelcomeEmailContentAText() {
		return welcomeEmailContentAText;
	}

	public void setWelcomeEmailContentAText(WebElement welcomeEmailContentAText) {
		this.welcomeEmailContentAText = welcomeEmailContentAText;
	}

	public WebElement getWelcomeEmailContentBText() {
		return welcomeEmailContentBText;
	}

	public void setWelcomeEmailContentBText(WebElement welcomeEmailContentBText) {
		this.welcomeEmailContentBText = welcomeEmailContentBText;
	}

	public WebElement getWelcomeEmailContentCText() {
		return welcomeEmailContentCText;
	}

	public void setWelcomeEmailContentCText(WebElement welcomeEmailContentCText) {
		this.welcomeEmailContentCText = welcomeEmailContentCText;
	}

	public WebElement getWelcomeEmailContentPoint2Text() {
		return welcomeEmailContentPoint2Text;
	}

	public void setWelcomeEmailContentPoint2Text(WebElement welcomeEmailContentPoint2Text) {
		this.welcomeEmailContentPoint2Text = welcomeEmailContentPoint2Text;
	}

	public WebElement getWelcomeEmailFinishText() {
		return welcomeEmailFinishText;
	}

	public void setWelcomeEmailFinishText(WebElement welcomeEmailFinishText) {
		this.welcomeEmailFinishText = welcomeEmailFinishText;
	}

	public WebElement getShowMeMagicBtn() {
		return showMeMagicBtn;
	}

	public void setShowMeMagicBtn(WebElement showMeMagicBtn) {
		this.showMeMagicBtn = showMeMagicBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Congratulations')]")
	private WebElement congratsEmailText;

	public WebElement getCheckYourMessageBtn() {
		return checkYourMessageBtn;
	}

	public void setCheckYourMessageBtn(WebElement checkYourMessageBtn) {
		this.checkYourMessageBtn = checkYourMessageBtn;
	}

	public WebElement getCongratsEmailText() {
		return congratsEmailText;
	}

	public void setCongratsEmailText(WebElement congratsEmailText) {
		this.congratsEmailText = congratsEmailText;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'@iomd.info')]")
	private WebElement emailDomainText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can now use this anywhere:')]")
	private WebElement keyHeaderText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'phishing, & hacking')]")
	private WebElement keyItemsText;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='See how it works']")
	private WebElement saveTokenizedEmailBtn;

	public WebElement getHeaderText() {
		return headerText;
	}

	public void setHeaderText(WebElement headerText) {
		this.headerText = headerText;
	}

	public WebElement getEmailFieldText() {
		return emailFieldText;
	}

	public void setEmailFieldText(WebElement emailFieldText) {
		this.emailFieldText = emailFieldText;
	}

	public WebElement getEmailDomainText() {
		return emailDomainText;
	}

	public void setEmailDomainText(WebElement emailDomainText) {
		this.emailDomainText = emailDomainText;
	}

	public WebElement getKeyHeaderText() {
		return keyHeaderText;
	}

	public void setKeyHeaderText(WebElement keyHeaderText) {
		this.keyHeaderText = keyHeaderText;
	}

	public WebElement getKeyItemsText() {
		return keyItemsText;
	}

	public void setKeyItemsText(WebElement keyItemsText) {
		this.keyItemsText = keyItemsText;
	}

	public WebElement getSaveTokenizedEmailBtn() {
		return saveTokenizedEmailBtn;
	}

	public void setSaveTokenizedEmailBtn(WebElement saveTokenizedEmailBtn) {
		this.saveTokenizedEmailBtn = saveTokenizedEmailBtn;
	}

////
	public WebElement getUserOneFullName() {
		return userOneFullName;
	}

	public void setUserOneFullName(WebElement userOneFullName) {
		this.userOneFullName = userOneFullName;
	}

	@FindBy(name = "Rohan Mahadevan")
	private WebElement userOneFullName;

	public WebElement getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(WebElement userEmailId) {
		this.userEmailId = userEmailId;
	}

	public WebElement getUserOneAddressDetails() {
		return userOneAddressDetails;
	}

	public void setUserOneAddressDetails(WebElement userOneAddressDetails) {
		this.userOneAddressDetails = userOneAddressDetails;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public WebElement getUserOneType() {
		return userOneType;
	}

	public void setUserOneType(WebElement userOneType) {
		this.userOneType = userOneType;
	}

	@FindBy(name = "hiring@iomd.info")
	private WebElement userEmailId;

	@FindBy(name = "361 Linfield drive Palmolive, Menlo Park, California, United States, 94025")
	private WebElement userOneAddressDetails;

	@FindBy(name = "4085551212")
	private WebElement phoneNumber;

	@FindBy(name = "Primary")
	private WebElement userOneType;

	@FindBy(name = "test2.ideas2it@iomd.info")
	private WebElement anonymousMailId;

	@FindBy(name = "842 S Broadway Colgate-Palmolive, Los Angeles, California, United States, 90014")
	private WebElement anonomyousAddress;

	@FindBy(name = "4081113232")
	private WebElement anonomyousPhoneNumber;

	@FindBy(name = "Anonmyous")
	private WebElement anonmyousUserType;

	public WebElement getAnonymousMailId() {
		return anonymousMailId;
	}

	public void setAnonymousMailId(WebElement anonymousMailId) {
		this.anonymousMailId = anonymousMailId;
	}

	public WebElement getAnonomyousAddress() {
		return anonomyousAddress;
	}

	public void setAnonomyousAddress(WebElement anonomyousAddress) {
		this.anonomyousAddress = anonomyousAddress;
	}

	public WebElement getAnonomyousPhoneNumber() {
		return anonomyousPhoneNumber;
	}

	public void setAnonomyousPhoneNumber(WebElement anonomyousPhoneNumber) {
		this.anonomyousPhoneNumber = anonomyousPhoneNumber;
	}

	public WebElement getAnonmyousUserType() {
		return anonmyousUserType;
	}

	public void setAnonmyousUserType(WebElement anonmyousUserType) {
		this.anonmyousUserType = anonmyousUserType;

	}

	@FindBy(name = "No profiles found")
	private WebElement messageAlert;

	@FindBy(name = "Save this card on your device & never type it again.")
	private WebElement saveCardmessageAlert;

	@FindBy(name = "Update this card on your device & never type it again.")
	private WebElement updateCardmessageAlert;

	public WebElement getUpdateCardmessageAlert() {
		return updateCardmessageAlert;
	}

	public void setUpdateCardmessageAlert(WebElement updateCardmessageAlert) {
		this.updateCardmessageAlert = updateCardmessageAlert;
	}

	@FindBy(xpath = "//XCUIElementTypeTextView[@name='Save your login credentials to never type again.']")
	private WebElement saveCredentialsmessageAlert;

	@FindBy(xpath = "//XCUIElementTypeTextView[contains(@name,'Save your personal profile and login credentials to never type again.')]")
	private WebElement saveSignupCredentialsmessageAlert;

	public WebElement getSaveSignupCredentialsmessageAlert() {
		return saveSignupCredentialsmessageAlert;
	}

	public void setSaveSignupCredentialsmessageAlert(WebElement saveSignupCredentialsmessageAlert) {
		this.saveSignupCredentialsmessageAlert = saveSignupCredentialsmessageAlert;
	}

	@FindBy(xpath = "//XCUIElementTypeTextView[@name='Is this the right password to save for future use in IOMD?']")
	private WebElement savePwd;

	@FindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private WebElement savePwdOKBtn;
	@FindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
	private WebElement saveCredentialOKBtn;

	public WebElement getSaveCredentialsmessageAlert() {
		return saveCredentialsmessageAlert;
	}

	public void setSaveCredentialsmessageAlert(WebElement saveCredentialsmessageAlert) {
		this.saveCredentialsmessageAlert = saveCredentialsmessageAlert;
	}

	public WebElement getSaveCredentialOKBtn() {
		return saveCredentialOKBtn;
	}

	public void setSaveCredentialOKBtn(WebElement saveCredentialOKBtn) {
		this.saveCredentialOKBtn = saveCredentialOKBtn;
	}

	public WebElement getSavePwdAlert() {
		return savePwd;
	}

	public void setSavePwd(WebElement savePwd) {
		this.savePwd = savePwd;
	}

	public WebElement getsavePwdOKBtn() {
		return savePwdOKBtn;
	}

	public void setsavePwdOKBtn(WebElement okBtn) {
		this.savePwdOKBtn = okBtn;
	}

	public WebElement getSaveCardmessageAlert() {
		return saveCardmessageAlert;
	}

	public void setSaveCardmessageAlert(WebElement saveCardmessageAlert) {
		this.saveCardmessageAlert = saveCardmessageAlert;
	}

	public WebElement getMessageAlert() {
		return messageAlert;
	}

	public void setMessageAlert(WebElement messageAlert) {
		this.messageAlert = messageAlert;
	}

	@FindBy(name = "Message")
	private WebElement validMail;

	public WebElement getValidMail() {
		return validMail;
	}

	public void setValidMail(WebElement validMail) {
		this.validMail = validMail;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Interactions']")
	private WebElement interactionsTab;
	
	@FindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[3]")
	private WebElement profilesTab;

	@FindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[1]")
	private WebElement settingsTab;

	public WebElement getSettingsTab() {
		return settingsTab;
	}


	public void setSettingsTab(WebElement settingsTab) {
		this.settingsTab = settingsTab;
	}

	@FindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[2]")
	private WebElement homeTab;

	public WebElement getHomeTab() {
		return homeTab;
	}


	public void setHomeTab(WebElement homeTab) {
		this.homeTab = homeTab;
	}


	public WebElement getProfilesTab() {
		return profilesTab;
	}


	public void setProfilesTab(WebElement profilesTab) {
		this.profilesTab = profilesTab;
	}


	public WebElement getRegisterInteraction() {
		return registerInteraction;
	}

	public void setRegisterInteraction(WebElement registerInteraction) {
		this.registerInteraction = registerInteraction;
	}

	public WebElement getInteractionsTab() {
		return interactionsTab;
	}

	public void setInteractionsTab(WebElement interactionsTab) {
		this.interactionsTab = interactionsTab;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Curativelifestyle']")
	private WebElement buisnessName;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Login'])[1]")
	private WebElement loginInteraction;
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Passwordchange'])[1]")
	private WebElement pwdInteraction;

	public WebElement getPwdInteraction() {
		return pwdInteraction;
	}


	public void setPwdInteraction(WebElement pwdInteraction) {
		this.pwdInteraction = pwdInteraction;
	}

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Register'])[1]")
	private WebElement registerInteraction;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Checkout Fill'])[1]")
	private WebElement checkoutInteraction;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='payment'])[1]")
	private WebElement PaymentInteraction;

	public WebElement getPaymentInteraction() {
		return PaymentInteraction;
	}

	public void setPaymentInteraction(WebElement paymentInteraction) {
		PaymentInteraction = paymentInteraction;
	}

	public WebElement getCheckoutInteraction() {
		return checkoutInteraction;
	}

	public void setCheckoutInteraction(WebElement checkoutInteraction) {
		this.checkoutInteraction = checkoutInteraction;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Others']")
	private WebElement othersInteraction;

	public WebElement getOthersInteraction() {
		return othersInteraction;
	}

	public void setOthersInteraction(WebElement othersInteraction) {
		this.othersInteraction = othersInteraction;
	}

	public WebElement getLoginInteraction() {
		return loginInteraction;
	}

	public void setLoginInteraction(WebElement loginInteraction) {
		this.loginInteraction = loginInteraction;
	}

	@FindBy(xpath = "(//XCUIElementTypeImage[@name='rightArrow'])[1]")
	private WebElement rightArrowFirst;

	public WebElement getBuisnessName() {
		return buisnessName;
	}

	public void setBuisnessName(WebElement buisnessName) {
		this.buisnessName = buisnessName;
	}

	public WebElement getRightArrowFirst() {
		return rightArrowFirst;
	}

	public void setRightArrowFirst(WebElement rightArrowFirst) {
		this.rightArrowFirst = rightArrowFirst;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='test2.ideas2it@iomd.info']")
	private WebElement emailSelected;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='hiring@iomd.info']")
	private WebElement otheremailSelected;

	public WebElement getOtheremailSelected() {
		return otheremailSelected;
	}

	public void setOtheremailSelected(WebElement otheremailSelected) {
		this.otheremailSelected = otheremailSelected;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='4081113232']")
	private WebElement phoneSelected;

	public WebElement getPhoneSelected() {
		return phoneSelected;
	}

	public void setPhoneSelected(WebElement phoneSelected) {
		this.phoneSelected = phoneSelected;
	}

	@FindBy(xpath = "/XCUIElementTypeApplication[@name='IOMDAutofill']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	private WebElement backbutton;

	public WebElement getEmailSelected() {
		return emailSelected;
	}

	public void setEmailSelected(WebElement emailSelected) {
		this.emailSelected = emailSelected;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public void setBackbutton(WebElement backbutton) {
		this.backbutton = backbutton;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Businesses']")
	private WebElement buisnessNameTab;

	public WebElement getBusinessNameTab() {
		return businessNameTab;
	}

	public void setBusinessNameTab(WebElement businessNameTab) {
		this.businessNameTab = businessNameTab;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Businesses']")
	private WebElement businessNameTab;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Messages']")
	private WebElement messageTab;

	public WebElement getMessageTab() {
		return messageTab;
	}


	public void setMessageTab(WebElement messageTab) {
		this.messageTab = messageTab;
	}


	public WebElement getBuisnessNameTab() {
		return buisnessNameTab;
	}

	public void setBuisnessNameTab(WebElement buisnessNameTab) {
		this.buisnessNameTab = buisnessNameTab;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Coravin']")
	private WebElement coravinBuisnessNameTabValue;

	public WebElement getCoravinBuisnessNameTabValue() {
		return coravinBuisnessNameTabValue;
	}

	public void setCoravinBuisnessNameTabValue(WebElement coravinBuisnessNameTabValue) {
		this.coravinBuisnessNameTabValue = coravinBuisnessNameTabValue;
	}

	// iOs - IOSElement
	// andrios - Andriodelement
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Notifications']")
	private WebElement notificationTab;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='0 EMAILS']")
	private WebElement emailCount;

	public WebElement getNotificationTab() {
		return notificationTab;
	}

	public void setNotificationTab(WebElement notificationTab) {
		this.notificationTab = notificationTab;
	}

	public WebElement getEmailCount() {
		return emailCount;
	}

	public void setEmailCount(WebElement emailCount) {
		this.emailCount = emailCount;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='OK']")
	public WebElement saveCardsOKBtn;

	public WebElement getSaveCardsOKBtn() {
		return saveCardsOKBtn;
	}

	public void setSaveCardsOKBtn(WebElement saveCardsOKBtn) {
		this.saveCardsOKBtn = saveCardsOKBtn;
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='OVERALL SUMMARY']")
	public WebElement OverallSummary;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Real info used'])[1]")
	public WebElement realInfoUsed;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='Anonmyous info used'])[1]")
	public WebElement anonymousInfoUsed;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='LAST 7 DAYS']")
	public WebElement last7Days;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='No interaction found on last 7 days']")
	public WebElement noInteractionFoundFor7Days;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='EARLIER TRANSACTIONS']")
	public WebElement earlierTransaction;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='No interaction found']")
	public WebElement noInteraction;

	@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	private List<WebElement> savedCardDetails;

	public List<WebElement> getSavedCardDetails() {
		return savedCardDetails;
	}

	public void setSavedCardDetails(List<WebElement> savedCardDetails) {
		this.savedCardDetails = savedCardDetails;
	}
//////
}
