package iomd_stepdef;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iomd_pages.HomePage;
import iomd_pages.commonUtilityMethods;
import iomd_pages.iomdPayMethods;
public class iomdPaySteps {

	/*
	 * =============================================================================
	 * ==== Common Utility Steps subject to IOMDPay Admin and IOMDPay Extensionxpath
	 * =============================================================================
	 * ===
	 */


    @And("^user verifies the placed order is displayed in IOMDPay Admin$")
    public void user_verifies_the_placed_order_is_displayed_in_iomdpay_admin() throws Throwable {
    	boolean field;
		String orderno = iomdPayMethods.userFetchesOrderNumber();
		field = commonUtilityMethods.userLaunchesUrl("https://iomdshop.iomd.info/iomddevadmin");
		assertEquals(field, true, "URL is not getting loaded as expected");
		field = iomdPayMethods.userEntersCredentialsInIOMDAdminAndNavigateToOrders();
		assertEquals(field, true, "Unable to Login into IOMD Pay admin");
		field = iomdPayMethods.userVerifiesOrderNumberInAdmin(orderno);
		assertEquals(field, true, "Buttons are not getting clicked as expected");
    }

    
    @When("^user validates data inside IOMD Pay Extension$")
    public void user_validates_data_inside_iomd_pay_extension() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesDataInIOMDPayExt();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }

    @When("^user select invalid address from list$")
    public void user_select_invalid_address_from_list() throws Throwable {
    	boolean field = iomdPayMethods.userSelectInvalidAddressInIOMDPayExt();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    @And("^user verifies the amount with shipping cost$")
    public void user_veifies_the_amount_with_shipping_cost() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesTotalWithShippingCost();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
		
    }
    @And("^user verifies the amount with shipping cost for Woocommerce$")
    public void user_veifies_the_amount_with_shipping_cost_for_woo() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesTotalWithShippingCostForWoo();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    
    @And("^user verifies the amount with shipping cost for Woocommerce with discount$")
    public void user_veifies_the_amount_with_shipping_cost_for_woo_with_discount() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesTotalWithShippingCostForWooWithDiscount();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    
    
    @And("^user verifies the amount with shipping cost for Shopify$")
    public void user_veifies_the_amount_with_shipping_cost_for_Shopify() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesTotalWithShippingCostForShopify();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    @And("^user verifies the amount with shipping cost for Shopify with discount$")
    public void user_veifies_the_amount_with_shipping_cost_for_Shopify_with_discount() throws Throwable {
    	boolean field = iomdPayMethods.userVerifiesTotalWithShippingCostForShopifyWithDiscount();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    
    @And("^user verifies the offer \"([^\"]*)\" for buy again option$")
    public void user_verifies_the_offer_something_for_buy_again_option(String discount) throws Throwable {
    	boolean field = iomdPayMethods.userValidatesDiscountsForBuyAgain(discount);
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }

    @And("^user verifies auto-filled card data in Payment page$")
    public void user_verifies_auto_filled_Card_data_in_Payment_page() throws Throwable {
    	boolean field = iomdPayMethods.userValidatesAutofilledDataInPayment();
		assertEquals(field, true, "Unable to validate IOMD Pay details");
    }
    @Then("^user enters the password and clicks on the enter button to proceed further$")
	public void userEntersThePasswordandClicksOnTheEnterButton() throws Throwable {
		boolean enterUsingPassword = iomdPayMethods.userEntersThePasswordandClicksOnTheEnterButton();
		assertEquals(enterUsingPassword, true, "password is getting entered as expected");
	}
    @Then("^user fills data in checkout page for NodenextGen$")
   	public void userfillsdataincheckoutpageforNodenextGen() throws Throwable {
   		boolean enterUsingPassword = iomdPayMethods.userfillsdataincheckoutpageforNodenextGen();
   		assertEquals(enterUsingPassword, true, "password is getting entered as expected");
   	}
    
    @Then("^user verifies deeplink content and clicks on it$")
   	public void userverifiesdeeplinkcontentandclicksonit() throws Throwable {
   		boolean enterUsingPassword = iomdPayMethods.userverifiesdeeplinkcontentandclicksonit();
   		assertEquals(enterUsingPassword, true, "password is getting entered as expected");
   	}

    

}
