Feature: Payment Method Selection
  As a user
  I want to select a payment method
  so that I can complete my purchase

  Scenario: Selecting a payment method for checkout
    Given I have products in my cart
    When I proceed to checkout
    And I select a payment method
    Then I should be able to confirm my order with the selected payment method

  Scenario: Selecting payment method "Gopay" for purchasing pulsa
    Given I am on the payment method selection page
    When I enter my phone number
    Then I should see the available pulsa packages
    And I choose a specific pulsa denomination
    And I proceed to the payment page
    Then I should see options to select a payment method
    And I choose "Gopay" as the payment method

  Scenario: Selecting other payment method in payment page
    Given I am on the payment page
    When I review my payment options
    Then I should see various payment methods available
    And I choose "Bank Transfer" as the payment method





