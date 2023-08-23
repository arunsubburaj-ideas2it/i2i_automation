Feature: To Validate the autofill option and interaction are getting captured correctly in the fivemarys application

  @all @dyn_Exe
  Scenario Outline: TC_01- To validate the login functionality in the MylaporeExpress application
    When user completes onboarding flow
    When user navigates to the settings application and enables the extension
    Then user navigates to the safari application
    When user launches the website "<url>"
    Then user clicks on the MyAccount icon in the MylaporeExpress website
    When user enables the Extension
    And user selects tokenised Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website

    Examples: 
      | url                         |
      | https://mylaporeexpress.com |

  @all @dyn_Exe
  Scenario Outline: TC_02- To validate the forget password functionality in the MylaporeExpress application
    When user completes onboarding flow
    When user navigates to the settings application and enables the extension
    Then user navigates to the safari application
    When user launches the website "<url>"
    Then user clicks on the MyAccount icon in the MylaporeExpress website
    Then user clicks Forget Password button in the MylaporeExpress website
    When user enables the Extension
    And user selects tokenised Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website

    Examples: 
      | url                         |
      | https://mylaporeexpress.com |

  @all @dyn_Exe
  Scenario Outline: TC_03- To validate products in the cart and Checkout functionality in the MylaporeExpress application as a Logged in user
    When user completes onboarding flow
    When user navigates to the settings application and enables the extension
    Then user navigates to the safari application
    When user launches the website "<url>"
    When user enables the Extension
    And user selects personal Address from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for personal Zipcode are filled as expected for the Website
    When user enters ZipCode and Check for delivery
    When user selects Monday and selects the first custom option
    And user enters Qty in first four dishes
    Then user clicks Add To Cart button
    Then user agrees shipping terms and clicks Checkout button
    When user enables the Extension
    And user selects tokenised Email from Extension
    And user selects personal Username from Extension
    And user selects personal Address from Extension
    And user selects personal Phonenumber from Extension
    Then user clicks Fill button from Extension
    Then user clicks Continue button in Mylapore express
    Then user verifies the auto fill details for personal FirstName are filled as expected for the Website
    Then user verifies the auto fill details for personal LastName are filled as expected for the Website
    Then user verifies the auto fill details for personal Zipcode are filled as expected for the Website
    Then user verifies the auto fill details for personal Phonenumber with format are filled as expected for the Website
    Then user verifies the auto fill details for Country are filled as expected for the Website
    Then user clicks Continue to Payment button in Mylapore express
    When user Fills the card details in Mylapore website
    And user clicks Paynow button in Mylapore website
    When user switches back to the IOMD application
     And user verifies and clicks on the business tab
    And user clicks "<business>" business by only name in the IOMD Transactions
    And user verifies and clicks on Checkout from interaction tab
    And user clicks "<purchase>" button by only Staictext in the Website
    And user verifies the recent record under purchase tab

    Examples: 
      | business        | url                         |purchase  |
      | Mylaporeexpress | https://mylaporeexpress.com |purchases |
