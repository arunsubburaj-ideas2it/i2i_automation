Feature: I2i_38_Validates the autofill operation in the coravin website after enabling the extension and verifies the transaction view

  @all 
  Scenario Outline: TC01_Validates the user is able to fill user name and email id in the coravin website for the newsletter and its transaction view
    When user completes onboarding flow
    When user launches the website "<url>"
    And user clicks "<acceptCookies>" button by only name in the Website
    When user enables the Extension
    And user selects tokenised Email from Extension
    And user selects personal Username from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for personal FirstName are filled as expected for the Website
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website
    And user clicks "<submitbutton>" button by only name in the Website
    Then user accepts the popup
    Then user accepts the popup
    When user switches back to the IOMD application
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies Others from interaction tab

    Examples: 
      | url                     | business | submitbutton | acceptCookies      |
      | https://www.coravin.com | Coravin  | Submit       | Accept All Cookies |

  @coravinSignIntransactionview @all @coravin
  Scenario Outline: TC02_Validates user can able to sign up using coravin by using the autofill extension
    When user completes onboarding flow
    When user launches the website "<url>"
    Then user clicks on the signInOrSignUpButton in the coravin website
    When user clicks create account button
    When user enables the Extension
    And user selects tokenised Email from Extension
    And user selects personal Username from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for personal FirstName are filled as expected for the Website
    Then user verifies the auto fill details for personal LastName are filled as expected for the Website
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website

    Examples: 
      | url                     | acceptCookies      |
      | https://www.coravin.com | Accept All Cookies |

  @coravinSignIntransactionview @all @Ex1 @coravin
  Scenario Outline: TC03_Validates user can able to access sign in and forget password using coravin by using the autofill extension
    When user completes onboarding flow
    When user launches the website "<url>"
    Then user clicks on the signInOrSignUpButton in the coravin website
    Then user clicks on the signIn button
    When user enables the Extension
    And user selects personal Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for personal Email are filled as expected for the Website
    And user clicks "<forgetPassword>" button by only Staictext in the Website
    When user enables the Extension
    And user selects tokenised Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website
    And user clicks "<Submitbtn>" button by name with "<index>" in the Website
    Then user accepts the popup
    Then user accepts the popup
    When user switches back to the IOMD application
    Then user verifies and clicks on the Interactions tab
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies Others from interaction tab

    Examples: 
      | url                     | business | forgetPassword   | Submitbtn | index | acceptCookies      |
      | https://www.coravin.com | Coravin  | Forgot Password? | Submit    |     1 | Accept All Cookies |

  @endToendFlowtransaction @all
  Scenario Outline: TC04_Validates the product in the cart and user tries to checkout the items andf verifies the given details are present in transaction tab
    When user completes onboarding flow with card data
    When user launches the website "<url>"
    When user launches the website "<producturl>"
    When user selects the first product in coravin for checking out
    When user clicks on the checkout Icon and verifies the product
    Then user clicks on the continue to checkout button in checkout page
    And user clicks "<guestcheckout>" button by only name in the Website
    When user enables the Extension
    And user selects tokenised Email from Extension
    And user selects personal Username from Extension
    And user selects personal Address from Extension
    And user selects personal Phonenumber from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website
    Then user verifies the auto fill details for personal FirstName are filled as expected for the Website
    Then user verifies the auto fill details for personal LastName are filled as expected for the Website
    Then user verifies the auto fill details for personal Zipcode are filled as expected for the Website
    Then user verifies the auto fill details for personal Phonenumber are filled as expected for the Website
    When user clicks on the get shipping option "<GetShippingOption>"
    When user clicks on the continue to payment button "<continueToPayment>"
    When user enables the Extension
    And user selects card details
    Then user clicks Fill button from Extension
    #When user Fills the card details in Coravin website
    And user clicks "<ReviewOrderbtn>" button by name with "<index>" in the Website
    Then user accepts the popup
    Then user accepts the popup
    When user switches back to the IOMD application
    And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies Checkout from interaction tab
    And user clicks "<purchase>" button by only Staictext in the Website
    And user verifies the recent record under purchase tab

    Examples: 
      | url                     | purchase  | acceptCookies      | producturl                                                | guestcheckout     | PlaceOrderbtn | ReviewOrderbtn | index | addToCartBtn | GetShippingOption | continueToPayment | business |
      | https://www.coravin.com | purchases | Accept All Cookies | https://www.coravin.com/shop/category/coravin-accessories | Continue as Guest | Place Order   | Review Order   |     3 | Add to cart  | GetShippingOption | paymentmode       | Coravin  |
