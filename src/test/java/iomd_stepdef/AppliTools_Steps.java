package iomd_stepdef;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iomd_pages.AppliTools_Methods;
import iomd_pages.HomePage;

public class AppliTools_Steps {
	private HomePage homePage = new HomePage();

	@Given("^I initiate applitools eyes to proceed validation for \"([^\"]*)\"$")
	public void userStartEyestoValidate(String testcase) throws Throwable {
		boolean val;
		val = AppliTools_Methods.userStartEyestoValidate(testcase);
		assertEquals(val, true, "unable to validate data");
	}

	@Then("user closes applitools eyes after validation")
	public void userCloseEyestoValidate() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userCloseEyestoValidate();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates Allow popup screen on launching the application")
	public void userChecksAllowPopupScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userChecksAllowPopupScreen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates splash screen of the application")
	public void userChecksSplashScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userChecksSplashScreen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates checkbox screen")
	public void userChecksCheckboxScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userChecksCheckboxScreen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates BeginSetup screen")
	public void userChecksBeginSetupScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesBeginSetupScreen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates Setup step1 screen")
	public void userChecksSetupstep1Screen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesSetupstep1Screen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates tell your friends screen")
	public void userChecksTellyourFriendsScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userChecksTellyourFriendsScreen();
		assertEquals(val, true, "unable to validate data");
	}

	@When("user validates Setup step2 screen")
	public void userChecksSetupstep2Screen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesSetupstep2Screen();
		assertEquals(val, true, "unable to validate data");
	}
	@When("user enables extension and switch back to the app")
	public void userEnablesExtandSwitchtoApp() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userEnablesExtandSwitchtoApp();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Enables extension screen")
	public void userValidatesExtensionEnabledScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesExtensionEnabledScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates animated cards in the homepage")
	public void userValidatesAnimatedCardsInTheHomepage() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesAnimatedCardsInTheHomepage();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates forward email screen on welcome email")
	public void userValidatesForwardEmailScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesForwardEmailScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Business Tab screen")
	public void userValidatesBusinessTabScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesBusinessTabScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Interaction Tab screen")
	public void userValidatesInteractionTabScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesInteractionTabScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Messages Tab screen")
	public void userValidatesMessagesTabScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesMessagesTabScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Profile Information screen")
	public void userValidatesProfileTabScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesProfileScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Settings screen")
	public void userValidatesSettingsScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesSettingsScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates ShowMeMagic in Settings screen")
	public void userValidatesShowMeMagicInSettingsScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesShowMeMagicInSettingsScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
	@When("user validates Credentials in Settings screen")
	public void userValidatesSavedCredentialsInSettingsScreen() throws Throwable {
		boolean val;
		val = AppliTools_Methods.userValidatesCredentialsInSettingsScreen();
		assertEquals(val, true, "unable to validate data");
	}
	
}
