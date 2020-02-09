Feature: Need to get the boking id in adactin hotel

  Scenario Outline: Need to get the boking id
    Given user need to get the booking id
    When user need to enter the "<login>" and "<password>" click the login button
    And user need to select the hotel availablity "<Location>", "<hotel>", "<Roomtypes>", "<roomno>","<adultroom>","<childroom>" and click the search
    And User Can Select the Hotel On click the radio Button
    And User now Book A Hotel With "<FirstName>" and "<LastName>" and "<Address>" and "<CardNumber>" and "<CardType>" and "<Month>" and "<Year>" and "<Cvv>" Payment
    Then after got the booking id user need to click the logout

    Examples: 
      | login         | password   | Location | hotel          | Roomtypes | roomno | adultroom | childroom | FirstName | LastName | Address | CardNumber       |  | CardType | Month | Year | Cvv |
      | Rajkarthick09 | 9894917024 | London   | Hotel Sunshine | Deluxe    |      2 |         2 |         1 | Raj       | Karthick | no 75   | 9890987657651234 |  | VISA     |     7 | 2022 | 344 |
