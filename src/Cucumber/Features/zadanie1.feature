Feature: Sing in

  Scenario Outline: Sing In

    Given user logged on account, add new address
    When user fill form "<address>", "<city>", "<postcode>", "<phone>"
    And user clicks save
    Then user added a valid address


    Examples:
      |address       |city   | postcode | phone     |
      |Testowa 1     |Krakow |30-111    |123-123-123|
