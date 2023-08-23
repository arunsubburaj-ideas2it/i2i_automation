package iomd_stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iomd_driver.IOMD_driver;
import iomd_pages.HomePage;
import iomd_pages.commonUtilityMethods;
import iomd_testdata.iomd_TestData;
import iomd_util.LocatorReader;

public class commonUtilitySteps {
	private HomePage homePage = new HomePage();
	// private commonUtilityMethods commonPage = new commonUtilityMethods();
	/*
	 * =============================================================================
	 * ==== Common Utility Steps subject to Extension and Fill options
	 * =============================================================================
	 * ===
	 */

	@Given("^user launches the application$")
	public void userlaunchestheapplication() throws Throwable {
		homePage.getAutomationName();
	}

	@When("^user enables the Extension$")
	public void user_enables_the_extension() throws Throwable {
		boolean addressAndPhoneNumber = commonUtilityMethods.userEnablesTheExtension();
		assertEquals(addressAndPhoneNumber, true, "Fields are getting displayed as expected");
	}

	@When("^user select Address from Extension$")
	public void user_select_address_from_extension() throws Throwable {
		boolean address = commonUtilityMethods.userSelectsTheAddressFromTheExtension();
		assertEquals(address, true, "Fields are getting displayed as expected");
	}

	@When("^user select Other Address from Extension$")
	public void user_select_other_address_from_extension() throws Throwable {
		boolean address = commonUtilityMethods.userSelectsTheOtherAddressFromTheExtension();
		assertEquals(address, true, "Fields are getting displayed as expected");
	}

	@Then("^user clicks Fill button from Extension$")
	public void user_clicks_fill_button_from_extension() throws Throwable {
		boolean addressAndPhoneNumber = commonUtilityMethods.userClicksFillButton();
		assertEquals(addressAndPhoneNumber, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects Phonenumber from Extension$")
	public void user_selects_phonenumber_from_extension() throws Throwable {
		boolean phoneNumber = commonUtilityMethods.userSelectsPhoneNumberFromTheExtension();
		assertEquals(phoneNumber, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects Anonymous Email from Extension$")
	public void user_selects_anonymous_email_from_extension() throws Throwable {
		boolean emailId = commonUtilityMethods.userSelectsAnonymousMailId();
		assertEquals(emailId, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects Anonymous name from Extension$")
	public void user_selects_anonymous_name_from_extension() throws Throwable {
		boolean name = commonUtilityMethods.userSelectsAnonymousName();
		assertEquals(name, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects User name from Extension$")
	public void user_selects_user_name_from_extension() throws Throwable {
		boolean name = commonUtilityMethods.userSelectsUserName();
		assertEquals(name, true, "Fields are not getting displayed as expected");
	}

	@When("^user selects card details$")
	public void user_selects_card_details_and_clicks_fill_button() throws Throwable {
		boolean field = commonUtilityMethods.userClicksOnTheCreditCardDetailsAndClicksOnTheFillButton();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user accepts the update popup for saving cards in IOMD Profile$")
	public void user_accepts_the_update_popup_for_saving_cards_in_iomd_profile() throws Throwable {
		boolean field = commonUtilityMethods.ClickAndValidateSavedCardPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user accepts the update popup for existing cards in IOMD Profile$")
	public void user_accepts_the_update_popup_for_existing_cards_in_iomd_profile() throws Throwable {
		boolean field = commonUtilityMethods.ClickAndValidateSavedCardPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user accepts the popup$")
	public void user_accepts_the_popup() throws Throwable {
		boolean field = commonUtilityMethods.ClicksOKBtninPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user accepts the save credential popup for autologin in IOMD Profile$")
	public void user_accepts_the_save_credential_popup_for_autologin_in_iomd_profile() throws Throwable {
		boolean field = commonUtilityMethods.ClickAndValidateSavedCredentialsPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	// <input= name, value>
	@Then("^user accepts the save Signup credential popup for autologin in IOMD Profile$")
	public void user_accepts_the_save_signup_credential_popup_for_autologin_in_iomd_profile() throws Throwable {
		boolean field = commonUtilityMethods.ClickAndValidateSaveSignupCredentialsPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the card details is saved in IOMD Application$")
	public void user_verifies_the_card_details_is_saved_in_iomd_application() throws Throwable {
		boolean field = commonUtilityMethods.userValidatesTheSavedCardDetails();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@When("^user switches back to the IOMD application$")
	public void UserSwitchBacksToTheIomdApplication() throws Throwable {
		boolean switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
	}

	@Then("^user switches to IOMD Admin application and delete the created tokenised data$")
	public void user_switches_to_iomd_admin_application_and_delete_the_created_tokenised_data() throws Throwable {
		boolean iOMDAdminApp = IOMD_driver.switchIomdAdminApp();
		assertEquals(iOMDAdminApp, true, "User switches back to the application");
		boolean btn = commonUtilityMethods.userClicksButtonByNameAndIndex("Delete All", "1");
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@When("^user navigates to the settings application and enables the extension$")
	public void user_navigates_to_the_settings_application() throws Throwable {
		HomePage.userNaviagtesToTheSettingsApplication();
	}

	@Then("^user navigates to the safari application$")
	public void user_navigates_to_the_safari_application() throws Throwable {
		IOMD_driver.safariApplicationLaunching();
	}

	@When("^user enters the \"([^\"]*)\" in the inputbox$")
	public void user_enters_the_something_in_the_inputbox(String emailid) throws Throwable {
		boolean userEnterTheValueInTheInputBox = commonUtilityMethods.userEnterTheValueInTheInputBox(emailid);
		assertEquals(userEnterTheValueInTheInputBox, true, "unable to enter the emailId");
	}

	@When("^user completes onboarding flow$")
	public void user_completes_onboarding_flow() throws Throwable {
		boolean val;
		boolean switchIOMDApplication;
		val = commonUtilityMethods.userNavigatesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");
		val = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(val, true, "unable to enter the emailId");
		val = commonUtilityMethods.userClicksBeginButton();
		assertEquals(val, true, "unable to click the Begin button");
		Thread.sleep(5000);
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("DO IT LATER", "1");
		assertEquals(val, true, "unable to click the Do it later button");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Enable Safari Browser Extension", "1");
		assertEquals(val, true, "unable to click the button");
		
		HomePage.userNaviagtesToTheSettingsApplication();
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Taking you to the dashboard...", "1");
		assertEquals(val, true, "unable to click the button");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open a Safari browser", "3");
		assertEquals(val, true, "unable to click the button");
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Import Passwords", "2");
		assertEquals(val, true, "unable to click the button");
		IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open a Safari browser", "2");
		assertEquals(val, true, "unable to click the button");
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Dismiss", "1");
		assertEquals(val, true, "unable to click the button");
		
//		boolean homePageData = commonUtilityMethods.userEntersPersonalisedData();
//		assertEquals(homePageData, true, "Details are entered as expected in the Page");
//		val = commonUtilityMethods.userClicksEnableExtension();
//		assertEquals(val, true, "unable to click the EnableExtension button");
//		boolean userClicksButton = commonUtilityMethods.userClicksOkGotItButton();
//		assertEquals(userClicksButton, true, "unable to click the OK Got It button");
//		HomePage.userNaviagtesToTheSettingsApplication();
//		IOMD_driver.safariApplicationLaunching();
	}

	@When("^user skips onboarding flow$")
	public void user_skips_onboarding_flow() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userClicksAllowBtn();
		assertEquals(val, true, "unable to click the Allow button");	
		IOMD_driver.deleteIOMDApplication();
	}
	
	@When("^user deletes node application$")
	public void user_deletes_node_application() throws Throwable {
		IOMD_driver.deleteIOMDApplication();
	}

	@When("^user completes onboarding flow with card data$")
	public void user_completes_onboarding_flow_with_card_data() throws Throwable {
		boolean val;
		boolean switchIOMDApplication;
		val = commonUtilityMethods.userNavigatesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");
		val = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(val, true, "unable to enter the emailId");
		val = commonUtilityMethods.userClicksBeginButton();
		assertEquals(val, true, "unable to click the Begin button");

		Thread.sleep(5000);
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("DO IT LATER", "1");
		assertEquals(val, true, "unable to click the Do it later button");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Enable Safari Browser Extension", "1");
		assertEquals(val, true, "unable to click the button");
		
		HomePage.userNaviagtesToTheSettingsApplication();
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Take me to the dashboard...", "1");
		assertEquals(val, true, "unable to click the button");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open Safari to try this", "3");
		assertEquals(val, true, "unable to click the button");
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Import Passwords", "2");
		assertEquals(val, true, "unable to click the button");
		
		IOMD_driver.driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("Open Safari to try this", "2");
		assertEquals(val, true, "unable to click the button");
		switchIOMDApplication = IOMD_driver.switchIOMDApplication();
		assertEquals(switchIOMDApplication, true, "User switches back to the application");
		
		val = commonUtilityMethods.userClicksButtonByNameAndIndex("DISMISS", "1");
		assertEquals(val, true, "unable to click the button");
		
//		boolean homePageData = commonUtilityMethods.userEntersPersonalisedData();
//		assertEquals(homePageData, true, "Details are entered as expected in the Page");
//		val = commonUtilityMethods.userClicksEnableExtension();
//		assertEquals(val, true, "unable to click the EnableExtension button");
//		boolean userClicksButton = commonUtilityMethods.userClicksOkGotItButton();
//		assertEquals(userClicksButton, true, "unable to click the OK Got It button");
		HomePage.userNaviagtesToTheSettingsApplication();
		IOMD_driver.safariApplicationLaunching();
		val = commonUtilityMethods.userAddCardDetails();
		assertEquals(val, true, "unable to validate data");
	}

	@When("^user contiunes onboarding flow from deeplink$")
	public void user_continues_onboarding_flow_from_deeplink() throws Throwable {
		boolean val;

		val = commonUtilityMethods.userContinuesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("NEXT");
		assertEquals(val, true, "unable to click button");

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Enable now");
		assertEquals(val, true, "unable to click button");
		Thread.sleep(5000);

		HomePage.userNaviagtesToTheSettingsApplication();
		IOMD_driver.switchIOMDApplication();

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Next");
		assertEquals(val, true, "unable to click button");

		val = commonUtilityMethods.userEntersEmailInOnboardingFlow();
		assertEquals(val, true, "unable to enter the emailId");

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("Create");
		assertEquals(val, true, "unable to click button");
		Thread.sleep(15000);

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("View My Information");
		assertEquals(val, true, "unable to click button");

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("NEXT");
		assertEquals(val, true, "unable to click button");

		val = commonUtilityMethods.userClicksButtonByOnlyStaticText("WILL DO");
		assertEquals(val, true, "unable to click button");
	}

	@When("^user completes onboarding flow with card data and Validation$")
	public void user_completes_onboarding_flow_with_card_data_validation() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userNavigatesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");
		val = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(val, true, "unable to enter the emailId");
		val = commonUtilityMethods.userClicksBeginButton();
		assertEquals(val, true, "unable to click the Begin button");
		boolean homePageData = commonUtilityMethods.userEntersPersonalisedData();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
		val = commonUtilityMethods.userClicksEnableExtension();
		assertEquals(val, true, "unable to click the EnableExtension button");
		boolean userClicksButton = commonUtilityMethods.userClicksOkGotItButton();
		assertEquals(userClicksButton, true, "unable to click the OK Got It button");
		HomePage.userNaviagtesToTheSettingsApplication();
		IOMD_driver.safariApplicationLaunching();
		val = commonUtilityMethods.userAddCardDetailsWithValidation();
		assertEquals(val, true, "unable to validate data");
	}

	@When("^user completes onboarding flow with invalid address$")
	public void user_completes_onboarding_flow_with_invalid_address() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userNavigatesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");
		val = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(val, true, "unable to enter the emailId");
		val = commonUtilityMethods.userClicksBeginButton();
		assertEquals(val, true, "unable to click the Begin button");
		boolean homePageData = commonUtilityMethods.userEntersPersonalisedDataWithInvalidAddress();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
		val = commonUtilityMethods.userEntersPersonalisedData();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
		val = commonUtilityMethods.userClicksEnableExtension();
		assertEquals(val, true, "unable to click the EnableExtension button");
		boolean userClicksButton = commonUtilityMethods.userClicksOkGotItButton();
		assertEquals(userClicksButton, true, "unable to click the OK Got It button");
	}

	@When("^user completes onboarding flow with validation$")
	public void user_completes_onboarding_flow_with_validation() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userValidatesFirstScreenInOnboarding();
		assertEquals(val, true, "unable to validate data");
		val = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(val, true, "unable to enter the emailId");
		val = commonUtilityMethods.userClicksBeginButton();
		assertEquals(val, true, "unable to click the Begin button");
		val = commonUtilityMethods.userValidatesTokenPesonalInfoPage();
		assertEquals(val, true, "unable to click the Begin button");
	}

	@When("^user validates Enable extension page$")
	public void user_validates_enable_extension_page() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userValidatesEnableExtensionPage();
		assertEquals(val, true, "unable to validate data");
	}

	@Then("^user validates ShowMeMagic Page$")
	public void user_validates_showmemagic_page() throws Throwable {
		boolean val;
		val = commonUtilityMethods.userValidatesShowMeMagicPage();
		assertEquals(val, true, "unable to validate data");
	}

	@When("^user enters tokenised Email$")
	public void user_enters_tokenised_email() throws Throwable {
		boolean userEnterTheValueInTheInputBox = commonUtilityMethods.userEnterTokenisedEmail();
		assertEquals(userEnterTheValueInTheInputBox, true, "unable to enter the emailId");
	}

	@Then("^user clicks on the fetch button$")
	public void user_clicks_on_the_fetch_button() throws Throwable {
		boolean userClicksOnTheFetchButton = commonUtilityMethods.userClicksOnTheFetchButton();
		assertEquals(userClicksOnTheFetchButton, true, "unable to click the fetch button");
	}

	@Then("^user clicks on the save tokenized email button$")
	public void user_clicks_on_the_save_tokenized_email_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksBeginButton();
		assertEquals(userClicksButton, true, "unable to click the SaveTokenizedEmail button");
	}

	@Then("^user clicks on the check your message button$")
	public void user_clicks_on_the_check_your_message_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksCheckYourMessageButton();
		assertEquals(userClicksButton, true, "unable to click the CheckYourMessage button");
	}

	@When("^user handles Save Password Popup from IOMD Application$")
	public void user_handles_save_password_popup_from_iomd_application() throws Throwable {
		boolean field = commonUtilityMethods.ClickAndValidateSavePasswordPopup();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies and clicks on the business tab$")
	public void userValidatesAndClicksOnTheBusinessTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheBusinessTab();
		assertEquals(transactionTab, true, "User switches to the business tab");
	}

	@Then("^user verifies and clicks on the message tab$")
	public void userValidatesAndClicksOnTheMessageTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheMessagesTab();
		assertEquals(transactionTab, true, "User switches to the message tab");
	}

	@Then("^user verifies and clicks on the Interactions tab$")
	public void userValidatesAndClicksOnTheTransactionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheInteractionsTab();
		assertEquals(transactionTab, true, "User switches to the Interaction tab");
	}

	@Then("^user clicks on the profile tab$")
	public void userClicksOnTheProfileTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheProfileTab();
		assertEquals(transactionTab, true, "User switches to the Profile tab");
	}
	
	@Then("^user clicks on the settings tab$")
	public void userClicksOnTheSettingsTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheSettingsTab();
		assertEquals(transactionTab, true, "User switches to the Profile tab");
	}
	
	@Then("^user clicks on the home tab$")
	public void userClicksOnTheHomeTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheHomeTab();
		assertEquals(transactionTab, true, "User switches to the Home tab");
	}
	

	@Then("^user verifies Login from interaction tab$")
	public void userValidatesAndClicksOnLoginFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheLoginFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Login tab");
	}

	@Then("^user verifies PwdChange from interaction tab$")
	public void userValidatesAndClicksOnPwdChangeFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnThePwdChangeFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Login tab");
	}

	@Then("^user verifies Others from interaction tab$")
	public void userValidatesAndClicksOnOthersFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheOthersFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Others tab");
	}

	@Then("^user verifies Register from interaction tab$")
	public void userValidatesAndClicksOnRegisterFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheRegisterFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Register tab");
	}

	@Then("^user verifies Checkout from interaction tab$")
	public void userValidatesAndClicksOnCheckoutFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheCheckoutFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Checkout tab");
	}

	@Then("^user verifies and clicks on Payment from interaction tab$")
	public void userValidatesAndClicksOnPaymentFromInteractionTab() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userValidatesAndClicksOnTheCheckoutFromInteractionTab();
		assertEquals(transactionTab, true, "User switches to the Checkout tab");
	}

	@And("^user clicks \"([^\"]*)\" business by only name in the IOMD Transactions$")
	public void user_clicks_something_business_by_only_name_in_the_iomd_transactions(String business) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksBusinessWithOnlyNameAndStaticText(business);
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user verifies the Anonymous email data is captured in the IOMD Transactions$")
	public void user_verifies_the_anonymous_email_data_is_captured_in_the_iomd_transactions() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userClicksThebuisnessAndVerifiesTheEmailDetailsPresentInside();
		assertEquals(transactionTab, true, "Details are present as expected in the transaction tab");
	}

	@And("^user verifies the Anonymous phone data is captured in the IOMD Transactions$")
	public void user_verifies_the_anonymous_phone_data_is_captured_in_the_iomd_transactions() throws Throwable {
		boolean transactionTab = commonUtilityMethods.userClicksThebuisnessAndVerifiesThePhoneDetailsPresentInside();
		assertEquals(transactionTab, true, "Details are present as expected in the transaction tab");
	}

	@When("^user validates the homescreen data of IOMD$")
	public void user_validates_the_homescreen_data_of_iomd() throws Throwable {
		boolean homePageData = commonUtilityMethods.userValidatesHomePageData();
		assertEquals(homePageData, true, "Details are present as expected in the HomePage");
	}

	@When("^user validates the data after logging in with tokenized email of IOMD$")
	public void user_validates_the_data_after_logging_in_with_tokenized_email_of_iomd() throws Throwable {
		boolean homePageData = commonUtilityMethods.userValidatesOnSuccessfullLoginWithTokenizedEmail();
		assertEquals(homePageData, true, "Details are present as expected in the HomePage");
	}

	@When("^user validates the Email data from IOMD support$")
	public void user_validates_the_email_data_from_iomd_support() throws Throwable {
		boolean homePageData = commonUtilityMethods.userValidatesWelcomeEmailData();
		assertEquals(homePageData, true, "Details are present as expected in the HomePage");
	}

	@Then("^user clicks on the show me the magic button$")
	public void user_clicks_on_the_show_me_the_magic_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksShowMeMagicButton();
		assertEquals(userClicksButton, true, "unable to click the ShowMeMagic button");
	}

	@Then("^user clicks on the OK Got It button$")
	public void user_clicks_on_the_OKGotIt_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksOkGotItButton();
		assertEquals(userClicksButton, true, "unable to click the OK Got It button");
	}

	@Then("^user clicks IOMD back button$")
	public void user_clicks_on_iomd_back_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksIOMDBackButton();
		assertEquals(userClicksButton, true, "unable to click the ShowMeMagic button");
	}

	@When("^user verifies data in Tokenised and Personal info page of IOMD$")
	public void user_verifies_data_in_tokenised_and_personal_info_page_of_iomd() throws Throwable {
		boolean homePageData = commonUtilityMethods.userValidatesDatainTokenisedAndPersonalInfoPage();
		assertEquals(homePageData, true, "Details are present as expected in the HomePage");
	}

	@Then("^user clicks on the save and show me the magic button$")
	public void user_clicks_on_the_save_and_show_me_the_magic_button() throws Throwable {
		boolean userClicksButton = commonUtilityMethods.userClicksSaveAndShowMeMagicButton();
		assertEquals(userClicksButton, true, "unable to click the ShowMeMagic button");
	}

	@When("^user fills tokenised First and Last name$")
	public void user_fills_tokenised_first_and_last_name() throws Throwable {
		boolean homePageData = commonUtilityMethods.userEntersTokenisedFirstAndLastname();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
	}

	@When("^user fills tokenised personal information$")
	public void user_fills_tokenised_personal_information() throws Throwable {
		boolean homePageData = commonUtilityMethods.userEntersPersonalisedData();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
	}

	@When("^user fills tokenised personal information with invalid address$")
	public void user_fills_tokenised_personal_information_with_invalid_address() throws Throwable {
		boolean homePageData = commonUtilityMethods.userEntersPersonalisedDataWithInvalidAddress();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
	}

	@Then("^user validates personal information in IOMD Homepage$")
	public void user_validates_personal_information_in_iomd_homepage() throws Throwable {
		boolean homePageData = commonUtilityMethods.userVerifiesPersonalDataInIOMD();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
	}

	@Then("^user validates tokenised information in IOMD Homepage$")
	public void user_validates_tokenised_information_in_iomd_homepage_for_something() throws Throwable {
		boolean homePageData = commonUtilityMethods.userVerifiesTokenisedDataInIOMD();
		assertEquals(homePageData, true, "Details are entered as expected in the Page");
	}

	/*
	 * =============================================================================
	 * ======= Tokenised and Personal data Step definitions
	 * =============================================================================
	 * =======
	 */
	@And("^user selects tokenised Email from Extension$")
	public void user_selects_tokenised_email_from_extension() throws Throwable {
		boolean emailId = commonUtilityMethods.userSelectsTokenisedMailId();
		assertEquals(emailId, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects tokenised Username from Extension$")
	public void user_selects_tokenised_username_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsTokenisedUserName();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects tokenised Address from Extension$")
	public void user_selects_tokenised_address_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsTokenisedAddress();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects tokenised Phonenumber from Extension$")
	public void user_selects_tokenised_phonenumber_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsTokenisedPhoneNumber();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects personal Email from Extension$")
	public void user_selects_personal_email_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsPersonalMailId();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects personal Username from Extension$")
	public void user_selects_personal_username_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsPersonalUserName();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects personal Address from Extension$")
	public void user_selects_personal_address_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsPersonalAddress();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@And("^user selects personal Phonenumber from Extension$")
	public void user_selects_personal_phonenumber_from_extension() throws Throwable {
		boolean field = commonUtilityMethods.userSelectsPersonalPhoneNumber();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised Email are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_mail_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean emailId = commonUtilityMethods.userVerifiesTheTokenisedEmaildetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(emailId, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised Username are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_username_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheTokenisedUserNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised Zipcode are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_zipcode_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheTokenisedZipCodeAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised Phonenumber are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_phonenumber_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods
				.userVerifiesTheTokenisedPhoneNumberdetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised Phonenumber with format are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_phonenumber_with_format_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheTokenisedPhoneNumberWithFormatIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised FirstName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_firstname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheTokenisedFirstNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for tokenised LastName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_tokenised_lastname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheTokenisedLastNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Email are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_email_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalEmaildetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Username are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_username_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalUserNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Zipcode are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_zipcode_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalZipCodeAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Address1 are filled as expected for the website$")
	public void user_verifies_the_auto_fill_details_for_personal_address1_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalAddrress1AreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Phonenumber are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_phonenumber_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods
				.userVerifiesThePersonalPhoneNumberdetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for card number are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_card_number_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesTheCardNumberdetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal Phonenumber with format are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_phonenumber_with_format_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalPhoneNumberWithFormatIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal FirstName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_firstname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalFirstNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for personal LastName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_personal_lastname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean field = commonUtilityMethods.userVerifiesThePersonalLastNameIsDisplayedInTheWebsite();
		assertEquals(field, true, "Fields are not getting displayed as expected");
	}

	/*
	 * =============================================================================
	 * ======= Optimisation Step definitions
	 * =============================================================================
	 * =======
	 */

	@Then("^user verifies the auto fill details for Email are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_email_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheEmaildetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for FirstName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_firstname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheFirstNamedetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for LastName are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_lastname_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheLastNamedetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for PhoneNumber are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_PhoneNumber_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods
				.userVerifiesTheAnonymousPhoneNumberdetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for PhoneNumber with format in the Website$")
	public void user_verifies_the_auto_fill_details_for_PhoneNumber_with_format_in_the_website() throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheAnonymousPhoneNumberdetailsWithFormatInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for Other PhoneNumber are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_Other_PhoneNumber_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods
				.userVerifiesTheOtherPhoneNumberdetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for ZipCode are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_zipcode_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheZipCodedetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for Country are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_country_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheCountrydetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for City are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_city_are_filled_as_expected_for_the_website() throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheCitydetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@Then("^user verifies the auto fill details for State are filled as expected for the Website$")
	public void user_verifies_the_auto_fill_details_for_state_are_filled_as_expected_for_the_website()
			throws Throwable {
		boolean fieldValues = commonUtilityMethods.userVerifiesTheStatedetailsAreGettingAsExpectedInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@When("^user launches the website \"([^\"]*)\"$")
	public void user_launches_the_website_something(String url) throws Throwable {
		boolean weburl = commonUtilityMethods.userLaunchesUrl(url);
		assertEquals(weburl, true, "URL is not getting displayed as expected");

	}

	@And("^user clicks \"([^\"]*)\" button by name in the Website$")
	public void user_clicks_something_button_by_name_in_the_website(String button) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByName(button);
		assertEquals(btn, true, "Button is not getting displayed as expected");

	}

	@And("^user clicks \"([^\"]*)\" link by value in the Website$")
	public void user_clicks_something_link_by_value_in_the_website(String linkname) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByValue(linkname);
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user clicks \"([^\"]*)\" button by only name in the Website$")
	public void user_clicks_something_button_by_only_name_in_the_website(String button) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByOnlyName(button);
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user clicks \"([^\"]*)\" button by only Staictext in the Website$")
	public void user_clicks_something_button_by_only_Staictext_in_the_website(String button) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByOnlyStaticText(button);
		assertEquals(btn, true, "Button is not getting displayed as expected");

	}

	@And("^user clicks \"([^\"]*)\" button by StaticText with \"([^\"]*)\" in the Website$")
	public void user_clicks_something_button_by_statictext_with_something_in_the_website(String button, String index)
			throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByOnlyStaticTextAndIndex(button, index);
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user clicks \"([^\"]*)\" button by name with \"([^\"]*)\" in the Website$")
	public void user_clicks_something_button_by_name_with_something_in_the_website(String button, String index)
			throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByNameAndIndex(button, index);
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@When("^user enters random email in Email Id textbox$")
	public void user_enters_random_email_in_email_id_textbox() throws Throwable {
		boolean fieldValues = commonUtilityMethods.userEntersRandomEmaildetailsInTheWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

	@When("^user refresh the page$")
	public void user_refresh_the_page() throws Throwable {
		boolean fieldValues = commonUtilityMethods.userRefreshThePage();
		assertEquals(fieldValues, true, "Page is not refreshed");
	}

	@When("^user clicks a button \"([^\"]*)\"by text name in the Website$")
	public void user_clicks_a_button_somethingby_text_name_in_the_website(String button) throws Throwable {
		boolean btn = commonUtilityMethods.userClicksButtonByOnlyVisibleText(button);
		assertEquals(btn, true, "Button is not getting displayed as expected");

	}

	@Then("^user verifies the recent record under purchase tab$")
	public void user_verifies_the_recent_record_under_purchase_tab() throws Throwable {
		boolean btn = commonUtilityMethods.userVerifiesRecentRecordInPurchaseColumn();
		assertEquals(btn, true, "Record is not getting displayed as expected");
	}

	@And("^user clicks Node button for payment in Woocommerce site$")
	public void user_clicks_node_button_for_payment_in_woocommerce_site() throws Throwable {
		boolean btn = commonUtilityMethods.userclicksNodeButtonInWoo();
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user clicks Node button for payment in Shopify site$")
	public void user_clicks_node_button_for_payment_in_shopify_site() throws Throwable {
		boolean btn = commonUtilityMethods.userclicksNodeButtonInShopify();
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@And("^user clicks Node button for payment in Shopify site from Cart page$")
	public void user_clicks_node_button_for_payment_in_shopify_site_from_cart_page() throws Throwable {
		boolean btn = commonUtilityMethods.userclicksNodeButtonInShopifyFromCartPage();
		assertEquals(btn, true, "Button is not getting displayed as expected");
	}

	@When("^user enters password in the form$")
	public void user_enters_password_in_the_form() throws Throwable {
		boolean btn = commonUtilityMethods.userEntersPasswordInCoravinWebsite();
		assertEquals(btn, true, "Details are not getting filled as expected");
	}

	@When("^user enters valid email in Nytimes$")
	public void user_enters_random_email_in_nytimes() throws Throwable {
		boolean fieldValues = commonUtilityMethods.userEntersValidEmaildetailsForNyTimes();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
	}

}
