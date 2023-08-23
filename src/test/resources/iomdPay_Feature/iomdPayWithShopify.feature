Feature: I2i_Validates IOMD Pay feature for Shopify

  @iomd_Pay @all
  Scenario Outline: TC_01 User Pay using IOMD_Pay option from cart page and validate in Node
    When user completes onboarding flow with card data
    When user launches the website "<iomdpayurl>"
    And user clicks "<product>" button by name with "<pindex>" in the Website
    And user clicks Node button for payment in Shopify site
    When user validates data inside IOMD Pay Extension
    And user clicks "<reviewOrder>" button by only name in the Website
    And user clicks "<shippingBtn>" button by name with "<sindex>" in the Website
    And user clicks "<submit>" button by only name in the Website
    And user verifies auto-filled card data in Payment page
    And user verifies the amount with shipping cost for Shopify
    And user clicks "<placeOrder>" button by only name in the Website
    When user switches back to the IOMD application
    And user verifies and clicks on the message tab
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies Checkout from interaction tab
    And user clicks "<purchase>" button by only Staictext in the Website
    Then user verifies the recent record under purchase tab

    Examples: 
      | iomdpayurl                              | business          | submit | purchase  | reviewOrder | placeOrder  | shippingBtn | product        | pindex | sindex |
      | https://curativelifestyle.myshopify.com | Curativelifestyle | Submit | purchases | Next        | Place Order | Economy     | 2018 Cakebread |      1 |      2 |

  @iomd_Pay @all
  Scenario Outline: TC_01 User Pay using IOMD_Pay option from cart page and validate in Node along with purchase again option with discount
    When user completes onboarding flow with card data
    When user launches the website "<iomdpayurl>"
    And user clicks "<product>" button by name with "<pindex>" in the Website
    And user clicks "<increase>" button by name in the Website
    And user clicks "<addCartBtn>" button by only name in the Website
    When user launches the website "<iomdpayurl>"
    And user clicks "<product2>" button by name with "<sindex>" in the Website
    And user clicks "<increase>" button by name in the Website
    And user clicks "<addCartBtn>" button by only name in the Website
    And user clicks "<viewCart>" button by name with "<pindex>" in the Website
    And user clicks Node button for payment in Shopify site from Cart page
    When user validates data inside IOMD Pay Extension
    And user clicks "<reviewOrder>" button by only name in the Website
    And user clicks "<shippingBtn>" button by name with "<sindex>" in the Website
    And user verifies the amount with shipping cost for Shopify
    And user clicks "<placeOrder>" button by only name in the Website
    When user switches back to the IOMD application
    And user verifies and clicks on the message tab
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user clicks "<purchase>" button by only Staictext in the Website
    And user verifies the recent record under purchase tab
    And user verifies the offer "<offerselected>" for buy again option
    And user clicks "<buyagain>" button by name with "<pindex>" in the Website
    And user clicks Node button for payment in Shopify site from Cart page
    When user validates data inside IOMD Pay Extension
    And user clicks "<reviewOrder>" button by only name in the Website
    And user clicks "<shippingBtn>" button by name with "<sindex>" in the Website
    And user verifies the amount with shipping cost for Shopify with discount
    And user clicks "<placeOrder>" button by only name in the Website
    When user switches back to the IOMD application
    And user verifies and clicks on the message tab
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies Checkout from interaction tab
    And user clicks "<purchase>" button by only Staictext in the Website
    Then user verifies the recent record under purchase tab

    Examples: 
      | iomdpayurl                              | offerselected | buyagain  | increase | viewCart  | addCartBtn  | business          | purchase  | reviewOrder | placeOrder  | shippingBtn | product        | product2          | pindex | sindex |
      | https://curativelifestyle.myshopify.com |             5 | buy again | Increase | View cart | Add to cart | Curativelifestyle | purchases | Next        | Place Order | Economy     | 2018 Cakebread | Exquisite Italian |      1 |      2 |
