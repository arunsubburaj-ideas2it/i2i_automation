package iomd_stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iomd_driver.IOMD_driver;
import iomd_pages.HomePage;

import iomd_util.LocatorReader;

public class Steps_IOMDHomepage {

	private HomePage homePage = new HomePage();
	
	@When("^user verifies the display of the \"([^\"]*)\" in the list$")
	public void userVerifiesDisplayOfThe(String username) throws Throwable {

		boolean userName = HomePage.userVerifiesDisplayOfThe(username);
		assertEquals(userName, true, "validated the display of the userName");
	}

	
	@Then("^user veriifes the dispay of the \"([^\"]*)\" in the page$")
	public void user_veriifes_the_dispay_of_the_something_in_the_page(String usertype) throws Throwable {

		boolean userVeriifesTheDisplayOfTheUserTypeAccount = HomePage
				.userVeriifesTheDisplayOfTheUserTypeAccount(usertype);	
		assertEquals(userVeriifesTheDisplayOfTheUserTypeAccount, true, "To validate the display of the user Type");
	}

	@When("^user verifies the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" in the page$")
	public void userVerifiesTheDisplayofAddressPhonenumberAddressDetails(String mailid, String phonenumber,
			String addressdetails) throws Throwable {
		HomePage.userVerifiestheDisplayOfThemailaddressandphonenumberinTheApplicationPage(mailid, phonenumber,
				addressdetails);

	}

	@When("^user verifies the  anonomyous \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" in the user profile page$")
	public void user_verifies_the_anonomyous_something_and_something_and_something_in_the_user_profile_page(
			String anonomyousmailid, String anonomyousphonenumber, String anonomyousaddressdetail) throws Throwable {
		HomePage.userVerifiesTheDisplayOfTheAnonymousMailIDNumberAndAddressDetails(anonomyousmailid,
				anonomyousphonenumber, anonomyousaddressdetail);

	}

	@Then("^user veriifes the anonomyous dispay of the \"([^\"]*)\" in the user profile page$")
	public void user_veriifes_the_anonomyous_dispay_of_the_something_in_the_user_profile_page(String anonomyoususertype)
			throws Throwable {

		boolean userVerifiesTheDisplayOfTheDisplayofTheAnonymousUser = HomePage
				.userVerifiesTheDisplayOfTheDisplayofTheAnonymousUser(anonomyoususertype);
		assertEquals(userVerifiesTheDisplayOfTheDisplayofTheAnonymousUser, true,
				"validates the display of the user profile page");

	}

	@When("^User verifies the display of the no profile found message after entering invalid details in the user page$")
	public void ValidaytesthedisplayofthemessageAlertAsUserIsNotDisplaying() throws Throwable {

		boolean validaytesthedisplayofthemessageAlertAsUserIsNotDisplaying = HomePage
				.ValidaytesthedisplayofthemessageAlertAsUserIsNotDisplaying();
		assertEquals(validaytesthedisplayofthemessageAlertAsUserIsNotDisplaying, true,
				"User verifies the display of the message alert");

	}

	@When("^User verifies the display of the enter valid email id alert message popup after entering mail id in incorrect format$")
	public void userValidatesTheDisplayOfIncorrectMailIdErrorMessageAfterEnteringTheincorrectDetails()
			throws Throwable {
		boolean userValidatesTheDisplayOfIncorrectMailIdErrorMessageAfterEnteringTheincorrectDetails = HomePage
				.userValidatesTheDisplayOfIncorrectMailIdErrorMessageAfterEnteringTheincorrectDetails();
		assertEquals(userValidatesTheDisplayOfIncorrectMailIdErrorMessageAfterEnteringTheincorrectDetails, true,
				"Message is getting displayed as expected");

	}

	
	@When("^user launches the coravin website \"([^\"]*)\"$")
	public void validatesTheDisplayOfTheURL(String url) throws Throwable {
		HomePage.userNavigatestoTheUrl(url);
		Thread.sleep(3000);

	}

	 @When("^user fills address for skullcandy$")
	    public void user_fills_address_for_skullcandy() throws Throwable {
		 boolean pageDetails = HomePage.userFillsAddressInSkullCandy();
			assertEquals(pageDetails, true, "Entered details is not getting displayed as expected");
	    }
	 
	@When("^user enables the extension and verifies the expected details are present for the page$")
	public void userVerifiesTheExtensionIsGettingEnabledAndVerifesRequiredDetailsIsGettingDisplayedForThePage()
			throws Throwable {
		boolean pageDetails = HomePage.userVerifiesTheExtensionIsGettingEnabledAndVerifesRequiredDetails();
		assertEquals(pageDetails, true, "Entered details is not getting displayed as expected");
	}

	@When("^user verifies the details are getting entered in the correct field as expected$")
	public void userVerifiesTheEnteredDetailsAreGettingDisplayedAndEnteredInTheCorrectField() throws Throwable {
		HomePage.userVerifiesTheEnteredDetailsAreGettingDisplayedAndEnteredInTheCorrectField();
	}

	@Then("^user selects the value from the extension and clicks on the fill button$")
	public void userSelectsTheDetailsAndClicksOnTheFillButton() throws Throwable {
		HomePage.userSelectsTheDetailsAndClicksOnTheFillButton();
	}

	@When("^user verifies the verifies the display of the feedback linkn \"([^\"]*)\"$")
	public void user_verifies_the_verifies_the_display_of_the_feedback_linkn_something(String feedback)
			throws Throwable {
		boolean feedbacklink = HomePage
				.userValidatesTheDisplayOfThefeedbackLinkIsGettingDisplayedInTheExtensionm(feedback);
		assertEquals(feedbacklink, true, "Feedback link is getting displayed as expected");

		
	}

	@When("^User verifies the display of the name \"([^\"]*)\" and email \"([^\"]*)\" headers present in the extension$")
	public void user_verifies_the_display_of_the_name_something_and_email_something_headers_present_in_the_extension(
			String name, String emailid) throws Throwable {

		boolean nameAndMailId = HomePage.userValidatesTheDisplayOfTheNameAndEmailTextInTheExtensionPopup(name, emailid);
		assertEquals(nameAndMailId, true, "Name and mail are getting displayed as expected");
	}

	@Then("^user verifies the display of the header \"([^\"]*)\"$")
	public void user_verifies_the_display_of_the_header_something(String headervalue) throws Throwable {
		boolean userValidatesTheDisplahyOfTheHeaderValue = HomePage
				.userValidatesTheDisplahyOfTheHeaderValue(headervalue);
		assertEquals(userValidatesTheDisplahyOfTheHeaderValue, true, "Header is getting displayed as expected");
	}

	@When("^user clicks create account button$")
	public void user_clicks_create_account_button() throws Throwable {

		boolean createAnAccount = HomePage.userClicksOnCreateAccountButtonInTheWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
	}
	
	@And("^user enters password in the signup page of coravin$")
    public void user_enters_password_in_the_signup_page_of_coravin() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInCoravinWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }
	
	@And("^user enters password in the signup page of Ecoya$")
    public void user_enters_password_in_the_signup_page_of_ecoya() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInEcoyaWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }
	
	@And("^user enters password in the signup page of GoodBatch$")
    public void user_enters_password_in_the_signup_page_of_goodbatch() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInEcoyaWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }
	
	@And("^user enters password in the signup page of Expedia$")
    public void user_enters_password_in_the_signup_page_of_expedia() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInExpediaWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }
	
	@And("^user enters password in the signup page of Etsy$")
    public void user_enters_password_in_the_signup_page_of_etsy() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInEtsyWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }
	
	@And("^user enters password in the signup page of nytimes$")
    public void user_enters_password_in_the_signup_page_of_nytimes() throws Throwable {
		boolean createAnAccount = HomePage.userEntersPasswordInNYtimesWebsite();
		assertEquals(createAnAccount, true, "Account details are getting clicked as expected");
    }

	@Then("^user clicks on the signInOrSignUpButton in the coravin website$")
	public void user_clicks_on_the_signinorsignupbutton_in_the_coravin_website() throws Throwable {
		boolean signInSignUpButton = HomePage.userVerifiestheCreateAccountAndSignUpAccountAndClicksonIt();
		assertEquals(signInSignUpButton, true, "Sign In Or sign up button is getting clicked");
	}

	@When("^user verifies the details are getting entered as expected in the field box$")
	public void userVerifiesThedetailsAreGettingAsExpectedInTheFieldBox() throws Throwable {
		boolean fieldValues = HomePage.userVerifiesThedetailsAreGettingAsExpectedInTheFieldBox();
		assertEquals(fieldValues, true, "Details are getting displayed as expected");

	}

	@And("^user selects the first product in coravin for checking out$")
    public void when_user_selects_the_first_product_in_coravin_for_checking_out() throws Throwable {
		boolean createAnAccount = HomePage.userClicksOnFirstProductInCoravin();
		assertEquals(createAnAccount, true, "User clicks first product in coravin for checking out");
    }
	
	@And("^user selects the first product in tedbaker for checking out$")
    public void when_user_selects_the_first_product_in_tedbaker_for_checking_out() throws Throwable {
		boolean createAnAccount = HomePage.userClicksOnFirstProductInTedbaker();
		assertEquals(createAnAccount, true, "User clicks first product in coravin for checking out");
    }
	
	@When("^user verifies the display of the autofill det ails are entered as expected$")
	public void user_verifies_the_display_of_the_autofill_details_are_entered_as_expected() throws Throwable {
		boolean fieldBoXValue = HomePage.validatesTheDisplayOfTheautofillDetailsAreGettingEnteredInTheFieldBox();
		assertEquals(fieldBoXValue, true, "Details are getting displayed as expected");
	}

	@When("^user clicks on the sign in button$")
	public void user_clicks_on_the_sign_in_button() throws Throwable {
		boolean userClickOnTheSignInButton = HomePage.userClickOnTheSignInButton();
		assertEquals(userClickOnTheSignInButton, true, "validates the display of sign in button");
	}

	@Then("^user verifies the autofill extension and verifies no details is getting displayed$")
	public void userValidatesTheDisplayOfTheAutofillDetailsAreGettingDisplayedAsExpected() throws Throwable {
		HomePage.userValidatesTheDisplayOfTheAutofillDetailsAreGettingDisplayedAsExpected();
	}

	@Then("^user clicks on the signIn button$")
	public void userClicksOnTheSignInButton() throws Throwable {
		boolean userClicksOnTheSignInButton = HomePage.userClicksOnTheSignInButton();
		assertEquals(userClicksOnTheSignInButton, true, "value is getting displayed as expected");
	}

	@When("^user clicks on the checkout Icon and verifies the product$")
	public void userVerifiesTheCheckoutIconAndClicksOnIt() throws Throwable {
		boolean userVerifiesTheCheckoutIconAndClicksOnIt = HomePage.userVerifiesTheCheckoutIconAndClicksOnIt();
		assertEquals(userVerifiesTheCheckoutIconAndClicksOnIt, true, "validated the cart and clicks on it");
	}

	@Then("^user clicks on the continue to checkout button in checkout page$")
	public void userClicksOnContinueToCheckoutButtonInTheCheckoutPage() throws Throwable {
		boolean checkoutPage = HomePage.userClicksOnContinueToCheckoutButtonInTheCheckoutPage();
		assertEquals(checkoutPage, true, "Button is got clicked as expected");
	}

	@When("^user selects the address and phone number \"([^\"]*)\" in the autofill option$")
	public void userSelectsTheAddressAndPhoneNumberAndAddressFromTheExtension(String phonenumber) throws Throwable {
		boolean addressAndPhoneNumber = HomePage
				.userSelectsTheAddressAndPhoneNumberAndAddressFromTheExtension(phonenumber);
		assertEquals(addressAndPhoneNumber, true, "Fields are getting displayed as expected");
	}

	@When("^user clicks on the get shipping option \"([^\"]*)\"$")
	public void validatesTheShippingOptionAvailableForTheUser(String getshippingoption) throws Throwable {
		boolean shippingOptions = HomePage.validatesTheShippingOptionAvailableForTheUser(getshippingoption);
		assertEquals(shippingOptions, true, "shippingOptionsIsGettingDisplayedAsexpected");

	}

	@When("^user clicks on the continue to payment button \"([^\"]*)\"$")
	public void userValidatedAndClicksToTheContinueToPaymentMethod(String continuetopayment) throws Throwable {
		boolean continueToPayment = HomePage.userValidatedAndClicksToTheContinueToPaymentMethod(continuetopayment);
		assertEquals(continueToPayment, true, "continue to payment is getting displayed as expected");
	}

	
	@When("^user launches the hindusthan website \"([^\"]*)\"$")
	public void userLaunchesThehindustanTimesAndVerifiesTheNewsLetterSignUp(String url) throws Throwable {
		boolean hindustanUrl = HomePage.userLaunchesThehindustanTimesAndVerifiesTheNewsLetterSignUp(url);
		assertEquals(hindustanUrl, true, "URL is getting displayed as expected");
	}

	@Then("^user clicks on the news letter email sign up \"([^\"]*)\"$")
	public void userClicksOnTheEmailSignUpButtonInTheNewsLetter(String newsletteremailsignnup) throws Throwable {
		boolean hindustanEmail = HomePage.userClicksOnTheEmailSignUpButtonInTheNewsLetter(newsletteremailsignnup);
		assertEquals(hindustanEmail, true, "Email Field is gettinng displayed as expected");
	}

	
	@When("^user launches the new york times website \"([^\"]*)\"$")
	public void userLaunchesTheNewYorkTimes(String url) throws Throwable {
		boolean userLaunchesTheNewYorkTimes = HomePage.userLaunchesTheNewYorkTimes(url);
		assertEquals(userLaunchesTheNewYorkTimes, true, "URL is gettinng displayed as expected");

	}

	@Then("^user clicks on the new york times email sign up \"([^\"]*)\"$")
	public void userLaunchesTheEmailButtonInTheNewYorkTimes(String signup) throws Throwable {
		boolean userLaunchesTheEmailButtonInTheNewYorkTimes = HomePage
				.userLaunchesTheEmailButtonInTheNewYorkTimes(signup);
		assertEquals(userLaunchesTheEmailButtonInTheNewYorkTimes, true,
				"Email Field is gettinng displayed as expected");

	}

	@Then("^user enters the email in the dropdown box in email field$")
	public void userEntersTheEmailFieldInTheDropDownBox() throws Throwable {
		HomePage.userEntersTheEmailFieldInTheDropDownBox();
	}

	@Then("^user clicks on the continue button$")
	public void userClicksonTheContinueButton() throws Throwable {

		boolean userClicksonTheContinueButton = HomePage.userClicksonTheContinueButton();
		assertEquals(userClicksonTheContinueButton, true, "continue button is getting clicked as expeced");

	}

	@When("^user clicks on the login button in the new york times$")
	public void clicksOnLoginButtonOnNewYorkTimes() throws Throwable {
		boolean clicksOnLoginButtonOnNewYorkTimes = HomePage.clicksOnLoginButtonOnNewYorkTimes();
		assertEquals(clicksOnLoginButtonOnNewYorkTimes, true, "sign in button is getting clicked as expected");

	}

	@When("^user clicks on the login extension button$")
	public void userClickSonTheButtonToEnableTheSignUpPage() throws Throwable {
		boolean enableButton = HomePage.userClickSonTheButtonToEnableTheSignUpPage();
		assertEquals(enableButton, true, "Enable button is getting clicked as expected");
	}

	@When("^user launches the tedbaker website \"([^\"]*)\"$")
	public void user_launches_the_tedbaker_website_something(String url) throws Throwable {
		boolean urlLaunches = HomePage.user_launches_the_tedbaker_website_something(url);
		assertEquals(urlLaunches, true, "URL is getting displayed as expected");
	}

	@When("^user clicks on the go to site button$")
	public void user_clicks_on_the_go_to_site_button() throws Throwable {
		boolean goToSiteButton = HomePage.user_clicks_on_the_go_to_site_button();
		assertEquals(goToSiteButton, true, "Go to site button getting displayed as expected");

	}

	@Then("^user accepts the accept all cookies button$")
	public void user_accepts_the_accept_all_cookies_button() throws Throwable {
		boolean acceptCookies = HomePage.user_accepts_the_accept_all_cookies_button();
		assertEquals(acceptCookies, true, "Accept button getting displayed as expected");

	}

	@Then("^User clicks on the signup button$")
	public void user_clicks_on_the_signup_button() throws Throwable {
		boolean signUpButton = HomePage.user_clicks_on_the_signup_button();
		assertEquals(signUpButton, true, "sign up button getting displayed as expected");

	}

	@Then("^user clicks on the email input box$")
	public void userClicksOnTheEmailInputBox() throws Throwable {
		boolean emailInputBox = HomePage.userClicksOnTheEmailInputBox();
		assertEquals(emailInputBox, true, "sign up button getting displayed as expected");

	}

	@When("^user clicks on the enter using password link$")
	public void userClickOnEnterUsingPasswordLink() throws Throwable {
		boolean passwordLink = HomePage.userClickOnEnterUsingPasswordLink();
		assertEquals(passwordLink, true, "password is getting entered as expected");
	}

	@When("^user clicks on the cart button$")
	public void userClicksOnTheCartButton() throws Throwable {
		boolean userClicksOnTheCartButton = HomePage.userClicksOnTheCartButton();
		assertEquals(userClicksOnTheCartButton, true, "cart button is getting entered as expected");
	}

	@Then("^user enters the password \"([^\"]*)\" and clicks on the enter button to proceed further$")
	public void userEntersThePasswordandClicksOnTheEnterButton(String password) throws Throwable {
		boolean enterUsingPassword = HomePage.userEntersThePasswordandClicksOnTheEnterButton(password);
		assertEquals(enterUsingPassword, true, "password is getting entered as expected");
	}

	@Then("^user clicks on the checkout button in the website$")
	public void userClicksOnTheCheckoutButton() throws Throwable {
		boolean userClicksOnTheCheckoutButton = HomePage.userClicksOnTheCheckoutButton();
		assertEquals(userClicksOnTheCheckoutButton, true, "checkout button is getting entered as expected");
	}

	@When("^user selects the product in Curative Lifestyle$")
	public void userClicksAndSelectsTheWine() throws Throwable {
		boolean userClicksAndSelectsTheWine = HomePage.userClicksAndSelectsTheWine();
		assertEquals(userClicksAndSelectsTheWine, true, "checkout button is getting entered as expected");
	}

	@Then("^User clicks on the add to cart button$")
	public void userClicksOnTheAddToCartButton() throws Throwable {
		boolean userClicksOnTheAddToCartButton = HomePage.userClicksOnTheAddToCartButton();
		assertEquals(userClicksOnTheAddToCartButton, true, "cart button is getting entered as expected");
	}

	@When("^user clicks on the continue and payment to the product button$")
	public void userClicksOnThePaymentAndClickingonTheContinueButton() throws Throwable {
		boolean continueToPaymentButton = HomePage.userClicksOnThePaymentAndClickingonTheContinueButton();
		assertEquals(continueToPaymentButton, true, "payment details is getting entered as expected");
	}

	@Then("^user switches to webview content and verifies the element and add the product to the cart$")
	public void userValidatesAndSwitchesToTheContentAddProductToTheCart() throws Throwable {
		HomePage.userValidatesAndSwitchesToTheContentAddProductToTheCart();

	}

	
	@When("^user verifies the display of the \"([^\"]*)\" in the interaction tab$")
	public void userVerifiesTheDisplayOfTheBuisnessNameAndClicksOnIt(String buisnessname) throws Throwable {
		boolean buisnessName = HomePage.userVerifiesTheDisplayOfTheBuisnessNameAndClicksOnIt(buisnessname);
		assertEquals(buisnessName, true, "Buisness name is getting displayed in the application");
	}

	@When("^user verifies the display of buisnessname and clicks on it$")
	public void userVerifiersTheDisplayOfTheBuisnessNameAndClicksOnIt() throws Throwable {

	}
	

	@Then("^user clicks inside the buisness and verifies the given extension details are present$")
	public void userClicksThebuisnessAndVerifiesTheDetailsPresentInside() throws Throwable {
		boolean detailsPresent = HomePage.userClicksThebuisnessAndVerifiesTheDetailsPresentInside();
		assertEquals(detailsPresent, true, "Details are present as expected");
	}

	@Then("^user validates the \"([^\"]*)\" and clicks on it$")
	public void uservalidatesthesomethingandclicksonit(String buisnessname) throws Throwable {
		boolean buisnessName = HomePage.uservalidatesthesomethingandclicksonit();
		assertEquals(buisnessName, true, "BuisnessName is getting displayed as expected");
	}

	@Then("^user verifies the given extension details are present for the extension$")
	public void userverifiesthegivenextensiondetailsarepresentfortheextension() throws Throwable {

	}

	@Then("^user clicks on the enter button in the application$")
	public void userClicksOnTheEnterButtonInTheWebPage() throws Throwable {
		boolean enterButtonInTheWebPage = HomePage.userClicksOnTheEnterButtonInTheWebPage();
		assertEquals(enterButtonInTheWebPage, true, "Enter button is present and clicked");
	}

	@When("^user verifies the display of the \"([^\"]*)\" in the interaction tab for coravin$")
	public void user_verifies_the_display_of_the_something_in_the_interaction_tab_for_coravin(String buisnessname)
			throws Throwable {
		boolean coravinBuisness = HomePage.userValidatesAndVeriifesTheDisplayOfTheBuisnessNameCoravin();
		assertEquals(coravinBuisness, true, "coravin is  getting present and clicked");
	}

	@When("^user verifies the \"([^\"]*)\" tab$")
	public void validatesTheDisplayOfTheNotificatinTab(String notification) throws Throwable {
		boolean notificationTab = HomePage.validatesTheDisplayOfTheNotificatinTab(notification);
		assertEquals(notificationTab, true, "Notification is getting displayed as expected");
	}

	@When("^user verifies the display of the email count text$")
	public void userValidatesTheDispayOfTheEmailCountValues() throws Throwable {
		boolean emailCount = HomePage.validatesTheDisplayOfTheEmailCount();
		assertEquals(emailCount, true, "Email count is getting displayed as expected");
	}

	@Then("^user clicks on the \"([^\"]*)\" tab$")
	public void validatesAndClicksOnTheEmailTab(String notification) throws Throwable {
		boolean notificaionTab = HomePage.validatesAndClicksOnTheNotificationTab(notification);
		assertEquals(notificaionTab, true, "Notification is updated as per click");

	}

	@When("^user clicks on the forgot password link \"([^\"]*)\"$")
	public void validatesTheDisplayOfTheForgotPassswordLinkAndClicksOnIt(String forgotpassword) throws Throwable {
		boolean forgotEmailLink = HomePage.validatesTheDisplayOfTheForgotPassswordLinkAndClicksOnIt(forgotpassword);
		assertEquals(forgotEmailLink, true, "Forgot password link is clicked and got updated");
	}

	@Then("^user enters the \"([^\"]*)\" in the inputbox and clicks on the submit button$")
	public void userEntersTheEmaiValueAndClicksOnTheSubmitButton(String emailid) throws Throwable {
		boolean emailIdAndSubmitbutton = HomePage.userEntersTheEmaiValueAndClicksOnTheSubmitButton(emailid);
		assertEquals(emailIdAndSubmitbutton, true, "Enter email and clicks onSubmit button");
	}

	@When("^user clicks the mail and verifies the details present inside the tab$")
	public void validatesTheDisplayOfTheForgotPasswordLinAndClicsOnItandVerifiesTheDetailsPresentInsideTheTab()
			throws Throwable {
		boolean detailsPresent = HomePage.validatesTheDisplayOfTheForgotPasswordLinAndClicsOnItandVerifiesTheDetailsPresentInsideTheTab();
		assertEquals(detailsPresent, true, "Details are getting displayed as expected");
	}

	@Then("^user verifies the display of the forgot email$")
	public void validatesTheDisplayOfTheForgotEmailLink() throws Throwable {
         boolean forgotEmailLink = HomePage.validatesTheDisplayOfTheForgotEmailLink();
         assertEquals(forgotEmailLink, true, "password mail got updated");
	}
	
	@When("^user validates the display of the \"([^\"]*)\" text$")
	public void user_validates_the_display_of_the_something_text(String overallsummary) throws Throwable {
        
    }

    @When("^user verifies the display of the real \"([^\"]*)\" usage summary$")
    public void user_verifies_the_display_of_the_real_something_usage_summary(String realdata) throws Throwable {
        
    }

    @When("^user verifes the display of the last seven days transaction header$")
    public void user_verifes_the_display_of_the_last_seven_days_transaction_header() throws Throwable {
        
    }

    @When("^user verifies the display of earlier transaction header$")
    public void user_verifies_the_display_of_earlier_transaction_header() throws Throwable {
      
    }

    @Then("^user verifies the display of the Anonymous \"([^\"]*)\" usage summary$")
    
    public void user_verifies_the_display_of_the_anonymous_something_usage_summary(String anonmyousdata) throws Throwable {
       
    }

    @Then("^user verifies the number of transaction in the last seven days$")
    public void user_verifies_the_number_of_transaction_in_the_last_seven_days() throws Throwable {
        
    }

    @Then("^user verifies the number of transaction happened in earier transaction$")
    public void user_verifies_the_number_of_transaction_happened_in_earier_transaction() throws Throwable {
      
    }
   
    @When("^user enters the email id and clicks on the fetch profile button \"([^\"]*)\"$")
    public void userEntersEmailAndClickOnTheFetchButton(String email) throws Throwable {
        boolean userEntersEmailAndClickOnTheFetchButton = HomePage.userEntersEmailAndClickOnTheFetchButton(email);
        assertEquals(userEntersEmailAndClickOnTheFetchButton, true, "Unable to enter the user name and click the fetch button");
    }


    /*====================================================================================
     * Five marys meats website Step definitions
     * ====================================================================================
     */
    
    @When("^user launches the fivemarys website \"([^\"]*)\"$")
    public void user_launches_the_fivemarys_website_something(String url) throws Throwable {
    	boolean fievMarysUrl = HomePage.userLaunchesFiveMarysUrl(url);
		assertEquals(fievMarysUrl, true, "URL is not getting displayed as expected"); 
    }
    
    @Then("^user clicks on the loginButton in the fivemarys website$")
    public void user_clicks_on_the_loginbutton_in_the_fivemarys_website() throws Throwable {
    	boolean loginBtn = HomePage.userclicksLoginbutton();
		assertEquals(loginBtn, true, "Login button is getting displayed as expected");    
    }
       
    @Then("^user verifies the autofill details are entered as expected in the fivemarys website$")
    public void user_verifies_the_autofill_details_are_entered_as_expected_in_the_fivemarys_website() throws Throwable {
    		boolean fieldValues = HomePage.userVerifiesThedetailsAreGettingAsExpectedInTheFiveMarysWebsite();
    		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }
   
    @Then("^user verifies the autofill details are entered in forgetpassword textbox as expected in the fivemarys website$")
    public void user_verifies_the_autofill_details_are_entered_in_forgetpassword_textbox_as_expected_in_the_fivemarys_website() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesForgotPassworddetailsAreGettingAsExpectedInTheFiveMarysWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");

    }
        
    @When("^user selects first category from product category section$")
    public void user_selects_first_category_from_product_category_section() throws Throwable {
    	boolean categoryBtn = HomePage.userSelectsFirstProductCategory();
		assertEquals(categoryBtn, true, "Product Category is not displayed");
    }

    @And("^user clicks the first product to checkout$")
    public void user_clicks_the_first_product_to_checkout() throws Throwable {
    	boolean productBtn = HomePage.userSelectsFirstProduct();
		assertEquals(productBtn, true, "Product Category is not displayed");
    }  

    @Then("^user verifies the autofill details for checkout are entered as expected in fivemarys website$")
    public void user_verifies_the_autofill_details_for_checkout_are_entered_as_expected_in_fivemarys_website() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesTheCheckoutdetailsAreGettingAsExpectedInTheFiveMarysWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }
    
    @And("^user clicks checkout option in fivemarys website$")
    public void user_clicks_checkout_option_in_fivemarys_website() throws Throwable {
    	boolean checkoutbtn = HomePage.userClicksCheckoutButton();
		assertEquals(checkoutbtn, true, "Checkout Button is not displayed");
    }

    @Then("^user clicks Forget Password  button in the fivemarys website$")
    public void user_clicks_forget_password_button_in_the_fivemarys_website() throws Throwable {
    	boolean loginBtn = HomePage.userclicksForgotButton();
		assertEquals(loginBtn, true, "Forgot button is getting displayed as expected");    
    }

    @Then("^user clicks Add to cart button in fivemarys website$")
    public void user_clicks_add_to_cart_button_in_fivemarys_website() throws Throwable {
    	boolean addtocartBtn = HomePage.userClicksAddToCartButton();
		assertEquals(addtocartBtn, true, "Add To Cart Button is not displayed");
   
    }
    
    @And("^user clicks Continue to Shipping button in fivemarys website$")
    public void user_clicks_continue_to_shipping_button_in_fivemarys_website() throws Throwable {
    	boolean continueShippingBtn = HomePage.userClicksContinueShippingButton();
		assertEquals(continueShippingBtn, true, "Continue Shpping Button is not displayed");
    }

    @And("^user clicks Continue to Payment button in fivemarys website$")
    public void user_clicks_continue_to_payment_button_in_fivemarys_website() throws Throwable {
    	boolean continuePaymentBtn = HomePage.userClicksContinuePaymentButton();
		assertEquals(continuePaymentBtn, true, "Continue Payment Button is not displayed");
    }

    @When("^user Fills the card details in Fivemarys website$")
    public void user_fills_the_card_details_in_fivemarys_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinFiveMarysWebsite();
		assertEquals(field, true, "Card details are not filled as expected");
    }

    @And("^user clicks Paynow button in Fivemarys website$")
    public void user_clicks_paynow_button_in_fivemarys_website() throws Throwable {
    	boolean payNowBtn = HomePage.userClicksPayNowButton();
		assertEquals(payNowBtn, true, "Pay now Button is not displayed");
    }
    
   
    /*====================================================================================
     * MylaporeExpress website Step definitions
     * ====================================================================================
     */

    
    @When("^user launches the MylaporeExpress website \"([^\"]*)\"$")
    public void user_launches_the_mylaporeexpress_website_something(String url) throws Throwable {
    	boolean mylaporeExpressURL = HomePage.userLaunchesMylaporeExpressUrl(url);
		assertEquals(mylaporeExpressURL, true, "URL is not getting displayed as expected"); 
    }

    @Then("^user clicks on the MyAccount icon in the MylaporeExpress website$")
    public void user_clicks_on_the_myaccount_icon_in_the_mylaporeexpress_website() throws Throwable {
    	boolean mylaporeExpressURL = HomePage.userclicksMyAccButtoninME();
		assertEquals(mylaporeExpressURL, true, "Login button is getting displayed as expected"); 
    }

    @Then("^user verifies the auto fill details are filled as expected for Mylapore express$")
    public void user_verifies_the_auto_fill_details_are_filled_as_expected_for_mylapore_express() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesThedetailsAreGettingAsExpectedInMylaporeExpressWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }

    @And("^user clicks Login button in Mylapore express$")
    public void user_clicks_login_button_in_mylapore_express() throws Throwable {
    	boolean btn = HomePage.userclicksSignInButtoninME();
		assertEquals(btn, true, "Login button is getting displayed as expected"); 
    }
      
    @Then("^user clicks Forget Password button in the MylaporeExpress website$")
    public void user_clicks_forget_password_button_in_the_mylaporeexpress_website() throws Throwable {
    	boolean btn = HomePage.userclicksForgotPwdButtoninME();
		assertEquals(btn, true, "Forget button is getting displayed as expected"); 
    }

    @Then("^user verifies the autofill details are entered in forgetpassword textbox as expected in the MylaporeExpress website$")
    public void user_verifies_the_autofill_details_are_entered_in_forgetpassword_textbox_as_expected_in_the_mylaporeexpress_website() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesTheForgetPwddetailsAreGettingAsExpectedInMEWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }
    
    @When("^user enters ZipCode and Check for delivery$")
    public void user_enters_zipcode_and_check_for_delivery() throws Throwable {
    	boolean fieldValues = HomePage.userEntersZipCodeAndCheckForDeliveryInMEWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");  
    }
    
    @When("^user selects Monday and selects the first custom option$")
    public void user_selects_monday_and_selects_the_first_custom_option() throws Throwable {
    	boolean fieldValues = HomePage.userclicksMondayAndFirstCustomBtninME();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");  
    }

    @Then("^user clicks Add To Cart button$")
    public void user_clicks_add_to_cart_button() throws Throwable {
    	boolean fieldValues = HomePage.userclicksAddToCartButtoninME();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");  
    }

    @Then("^user agrees shipping terms and clicks Checkout button$")
    public void user_agrees_shipping_terms_and_clicks_checkout_button() throws Throwable {
    	boolean fieldValues = HomePage.userAgreesTermsAndClicksCheckOutBtninME();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");  
    }

    @And("^user enters Qty in first four dishes$")
    public void user_enters_qty_in_first_four_dishes() throws Throwable {
    	boolean fieldValues = HomePage.userProvidesInputsForMenu();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");  

    }

    @When("^user Fills the card details in Mylapore website$")
    public void user_fills_the_card_details_in_mylapore_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinFiveMarysWebsite();
		assertEquals(field, true, "Card details are not filled as expected");
    }
    
    @When("^user Fills the card details in CurativeLifestyle website$")
    public void user_fills_the_card_details_in_CurativeLifestyle_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinFiveMarysWebsite();
		assertEquals(field, true, "Card details are not filled as expected");
    }
    @When("^user Fills the card details in Coravin website$")
    public void user_fills_the_card_details_in_coravin_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinCoravin();
		assertEquals(field, true, "Card details are not filled as expected");
    }

    @When("^user Fills the card details in TedBaker website$")
    public void user_fills_the_card_details_in_tedbaker_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinTedBaker();
		assertEquals(field, true, "Card details are not filled as expected");
    }

    
    @Then("^user clicks Continue button in Mylapore express$")
    public void user_clicks_continue_button_in_mylapore_express() throws Throwable {
    	boolean payNowBtn = HomePage.userClicksContinueButtoninME();
		assertEquals(payNowBtn, true, "Pay now Button is not displayed");
    }

    @Then("^user clicks Continue to Payment button in Mylapore express$")
    public void user_clicks_continue_to_payment_button_in_mylapore_express() throws Throwable {
    	boolean payNowBtn = HomePage.userClicksContinuePaymentButtoninME();
		assertEquals(payNowBtn, true, "Pay now Button is not displayed");
    }

    @And("^user verifies the auto fill details are filled as expected in the checkout page for Mylapore express$")
    public void user_verifies_the_auto_fill_details_are_filled_as_expected_in_the_checkout_page_for_mylapore_express() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesTheCheckoutdetailsAreGettingAsExpectedInMylaporeExpressWebsite();
		assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }

    @And("^user clicks Paynow button in Mylapore website$")
    public void user_clicks_paynow_button_in_mylapore_website() throws Throwable {
    	boolean payNowBtn = HomePage.userClicksPayNowButton();
		assertEquals(payNowBtn, true, "Pay now Button is not displayed");
    }

    /*====================================================================================
     * SVB CONNECT WEBSITE Step definitions
     * ====================================================================================
     */
    
    
    @When("^user Fills the card details in SVBConnect website$")
    public void user_fills_the_card_details_in_SVBConnect_website() throws Throwable {
    	boolean field = HomePage.userFillsCardDetailsinSVBConnectWebsite();
		assertEquals(field, true, "Card details are not filled as expected");
    }
    
    /*====================================================================================
     * GoodEggs website Step definitions
     * ====================================================================================
     */
    
  
       
    @When("^user launches the GoodEggs website \"([^\"]*)\"$")
    public void user_launches_the_goodeggs_website_something(String url) throws Throwable {
    	boolean fievMarysUrl = HomePage.userLaunchesGoodEggsUrl(url);
		assertEquals(fievMarysUrl, true, "URL is not getting displayed as expected"); 
    }
    
    @And("^I fill Address for Goodeggs$")
    public void i_fill_address_for_goodeggs() throws Throwable {
    	boolean btn = HomePage.userFillsAddressingoodeggs();
    	assertEquals(btn, true, "Button is getting displayed as expected");
    }
    
    @When("^user Fills the card details in GoodEggs website$")
    public void user_fills_the_card_details_in_goodeggs_website() throws Throwable {
    	boolean btn = HomePage.userFillsCardDetailsingoodeggs();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }
    
     
    @Then("^user verifies the auto fill details are filled as expected for GoodEggs$")
    public void user_verifies_the_auto_fill_details_are_filled_as_expected_for_goodeggs() throws Throwable {
    	boolean fieldValues = HomePage.userVerifiesThedetailsAreGettingAsExpectedInTheGoodEggsWebsite();
    	assertEquals(fieldValues, true, "Details are not getting displayed as expected");
    }
    
    @Then("^user clicks Forget Password button in the GoodEggs website$")
    public void user_clicks_forget_password_button_in_the_goodeggs_website() throws Throwable {
    	boolean loginBtn = HomePage.userclicksForgotButtoninGoodEggs();
    	assertEquals(loginBtn, true, "Forgot button is getting displayed as expected"); 
    }
    
    @When("^user launches the GoodEggs Product URL$")
    public void user_launches_the_goodeggs_product_url() throws Throwable {
    	boolean url = HomePage.userLaunchesGoodEggsUrl("https://www.goodeggs.com/produce#produce-fruit");
		assertEquals(url, true, "URL is not getting displayed as expected"); 
    }
    

    /*====================================================================================
     * ECOYA WEBSITE Step definitions
     * ====================================================================================
     */
    
    
    @And("^user close the popup in Ecoya Website$")
    public void user_close_the_popup_in_ecoya_website() throws Throwable {
    	boolean loginBtn = HomePage.userClosesPopupInEcoya();
    	assertEquals(loginBtn, true, "Button is getting displayed as expected"); 
    }

    
    /*====================================================================================
     * PorterAndYork WEBSITE Step definitions
     * ====================================================================================
     */
    
    
    @And("^user selects first product from PorterAndYork application$")
    public void user_selects_first_product_from_porterandyork_application() throws Throwable {
    	boolean btn = HomePage.userclicksFirstProductinPorterAndYork();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }

    @When("^user Fills the card details in PorterAndYork website$")
    public void user_fills_the_card_details_in_porterandyork_website() throws Throwable {
    	boolean btn = HomePage.userFillsCardDetailsinPorterAndYork();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }

    /*====================================================================================
     * SkullCandy WEBSITE Step definitions
     * ====================================================================================
     */
    
    
    @And("^user selects first product from SkullCandy application$")
    public void user_selects_first_product_from_skullcandy_application() throws Throwable {
    	boolean btn = HomePage.userclicksFirstProductinPorterAndYork();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }

    @When("^user Fills the card details in SkullCandy website$")
    public void user_fills_the_card_details_in_skullcandy_website() throws Throwable {
    	boolean btn = HomePage.userFillsCardDetailsinSkullCandy();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }
    
    /*====================================================================================
     * Alibaba WEBSITE Step definitions
     * ====================================================================================
     */
    
    
    @And("^user close the popup in Alibaba website$")
    public void user_close_the_popup_in_alibaba_website() throws Throwable {
    	boolean btn = HomePage.userClosePopupinAlibaba();
    	assertEquals(btn, true, "Button is getting displayed as expected"); 
    }

    /*====================================================================================
     * SCHWAB WEBSITE Step definitions
     * ====================================================================================
     */
    @And("^user scroll to contact info in schwab application$")
    public void user_scroll_to_contact_info_in_schwab_application() throws Throwable {
    	boolean btn = HomePage.userScrollsDownToContactField();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }

    
    @When("^user enters random email in Email Id textbox for booking website$")
    public void user_enters_random_email_in_email_id_textbox_for_booking_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInBookingWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters random email in Email Id textbox for airbnb website$")
    public void user_enters_random_email_in_email_id_textbox_for_airbnb_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInAirbnbWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user fills password for booking website$")
    public void user_fills_password_for_booking_website() throws Throwable {
    	boolean btn = HomePage.userFillsPasswordInBooking();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user fills Email for ACF website$")
    public void user_fills_email_for_acf_website() throws Throwable {
    	boolean btn = HomePage.userFillsEmailInACF();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }

    @When("^user enters data in login page for airnewzealand website$")
    public void user_enters_random_email_in_email_id_textbox_for_airnewzealand_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInAirNewzealandWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signup page for amazon website$")
    public void user_enters_random_email_in_email_id_textbox_for_amazon_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInAmazonWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    @When("^user enters data in signup page for elementor website$")
    public void user_enters_random_email_in_email_id_textbox_for_elementor_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInElementorWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signup page for BlueStarCoffee website$")
    public void user_enters_random_email_in_email_id_textbox_for_BlueStarCoffee_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInBlueCoffeeWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in Login page for ClipperCard website$")
    public void user_enters_random_email_in_email_id_textbox_for_ClipperCard_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInClipperCardWebsite();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @Then("^user clicks close pop in deadlyponies$")
    public void user_clicks_close_pop_in_deadlyponies() throws Throwable {
    	boolean btn = HomePage.userClosePopupInDeadlyponies();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }

    @When("^user enters data in signin page for deadlyponies website$")
    public void user_enters_random_email_in_email_id_textbox_for_deadlyponies_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInDeadlyponies();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
   
    @When("^user enters data in signin page for Ecoya website$")
    public void user_enters_random_email_in_email_id_textbox_for_ecoya_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInEcoya();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signin page for Travelers website$")
    public void user_enters_random_email_in_email_id_textbox_for_travelers_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInTravelers();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signin page for AllState website$")
    public void user_enters_random_email_in_email_id_textbox_for_AllState_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInAllState();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signin page for Nationwide website$")
    public void user_enters_random_email_in_email_id_textbox_for_Nationwide_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInNationwide();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signup page for Nationwide website$")
    public void user_enters_data_for_signup_in_Nationwide_website() throws Throwable {
    	boolean btn = HomePage.userEntersSignupdetailsInNationwide();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }

    @When("^user enters the data for guest fidelity signup$")
    public void user_enters_the_data_for_guest_fidelity_signup() throws Throwable {
    	boolean btn = HomePage.userEntersRandomdataInFidelity();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }
    
    @When("^user enters data in signin page for UnitedHealth website$")
    public void user_enters_random_email_in_email_id_textbox_for_UnitedHealth_website() throws Throwable {
    	boolean btn = HomePage.userEntersRandomEmaildetailsInUnitedHealth();
    	assertEquals(btn, true, "field is getting displayed as expected"); 
    }

    @Then("^user verifies the business detail page for coravin$")
    public void user_verifies_the_business_detail_page_for_coravin() throws Throwable {
    	boolean btn = HomePage.userVerifiesBusinessDetailsForCoravin();
    	assertEquals(btn, true, "Business details are not getting displayed as expected"); 
    }  
    
    @When("^user scroll to newsletter signup form$")
    public void user_scroll_to_newsletter_signup_form() throws Throwable {
    	boolean btn = HomePage.userScrollsDownToNewsletterTedbaker();
    	assertEquals(btn, true, "Newsletter form is not getting displayed as expected"); 
    }
    
    @When("^user selects address from dropdown in Tedbaker$")
    public void user_selects_address_from_dropdown_in_tedbaker() throws Throwable {
    	boolean btn = HomePage.userselectAddressinTedbaker();
    	assertEquals(btn, true, "Address is not getting displayed as expected"); 
    }
}
