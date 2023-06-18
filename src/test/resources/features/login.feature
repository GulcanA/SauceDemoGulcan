Feature: Login and E2E Test


  Scenario: E2E Test
    Given The user is on the login page
    When the user enters "standard_user" username and "secret_sauce"
    Then The user should be able to login and able to see "Products" header
    And The user able to sort the products "Price (high to low)"
    And The user clicks cheapest as "7.99" and clicks second as "29.99" products
    And  The user opens basket
    And  The user clicks checkout
    And  The user enters details "Mike" "Smith" "HA67NU" and finish the purchase
    Then The user verify that "Total: $41.02"
    And  The user clicks finish button
    Then The user able to see  confirmation message as "Thank you for your order!"





