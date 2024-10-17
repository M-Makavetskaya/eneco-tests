Feature: Registration - sales flow

  Scenario: Register new contract
    Given Home page is opened
    When User fills in post code and house number
      | Postal_code  | 9713RD |
      | House_number | 63     |
    Then Correct address is found Irislaan 63, 9713RD GRONINGEN
    And User selects energy type: ELECTRICITY_AND_GAS
    And User selects usage: I_FILL_IN_MY_USAGE
    And User fills in usage value:
      | Normal_electricity_usage   | 2 |
      | Off_peak_electricity_usage | 1 |
      | Gas_usage                  | 3 |

    And User selects solar panel option: I_DONT_GENERATE_ELECTRICITY
    And User selects move out option: I_DONT_MOVE_OUT

    And User selects contract type: FIXED
    Then Offer is correct:
      | Green_electricity | € -8,08 |
      | Gas               | € 27,89 |
      | Total             | € 19,81 |
    When User goes on Personal data step
    And User fills in Personal data and goes to Final page
      | Gender      | DHR          |
      | First_Name  | John         |
      | Initials    | JY           |
      | Last_Name   | Smith        |
      | Date_of_brh | 09-09-1992   |
      | Telephone   | 0698765432   |
      | Email       | js@email.com |

    Then Personal data is correct on final offer
      | Naam: John Smith        |
      | Geboortedatum: 9-9-1992 |
      | Telefoon: 0698765432    |
      | E-mail: js@email.com    |
    And Address data is correct on final offer
      | Irislaan 63      |
      | 9713RD GRONINGEN |
    And Offer is correct:
      | Green_electricity | € -8,08 |
      | Gas               | € 27,89 |
      | Total             | € 19,81 |

