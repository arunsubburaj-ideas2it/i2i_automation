Feature: I2i_36_Validates the auofill operation in the hindustan times website after enabling the extension.

  @hindustanNewsLetterSignUp @all @hind
  Scenario Outline: 12I_36_TC01- Validates the display of the news letter sign up in the hindhusthan extension
    When user completes onboarding flow
    When user launches the website "<url>"
    When user enables the Extension
    And user selects tokenised Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website

    Examples:  
      | url                            |
      | https://www.hindustantimes.com |

  @signInHindustanTimes @all  @hind1
  Scenario Outline: 12I_36_TC02- Validates the display of the news letter sign up in the hindhusthan extension
    When user completes onboarding flow
    When user launches the website "<url>"
    And user clicks "<subscribebtn>" button by only Staictext in the Website
    When user enables the Extension
    And user selects tokenised Email from Extension
    Then user clicks Fill button from Extension
    Then user verifies the auto fill details for tokenised Email are filled as expected for the Website
   

    Examples: 
      | url                                              | continue | business       | subscribebtn  |
      | https://accounts.hindustantimes.com/ht/userplan? | Continue | Hindustantimes | Subscribe now |
