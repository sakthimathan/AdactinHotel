Feature: CancleBooking Hotel

  Scenario Outline: 
    Given user should perform login with "<username>" and "<password>"
    When user click the login button
    Given user search the hotel following depends "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<Checkin>","<Checkout>","<AdultsperRoom>","<ChilderPerRoom>"
    When user click the Search Button
    Then select the hotel
    And click the continue button
    And user enter the following depends "<Firstname>","<Lastname>","<BillingAddress>","<CcardNumber>","<CcardType>","<ExpiryDateM>","<ExpiryDateY>","<cvv>"
    Then user click the BookNow button
    And click mylitenary button and select the order id click the cancel button
    Then click ok confirmation alert and click logout button

    Examples: 
      | username    | password | Location | Hotels         | RoomType | NoOfRooms | Checkin    | Checkout   | AdultsperRoom | ChilderPerRoom | Firstname | Lastname | BillingAddress | CcardNumber      | CcardType | ExpiryDateM | ExpiryDateY | cvv |
      | sakthibalan | T6X05B   | London   | Hotel Sunshine | Double   | 2 - Two   | 18/09/2023 | 19/09/2023 | 2 - Two       | 2 - Two        | Sakthi    | Balan    | f2ESkayHomes   | 4567123409781234 | VISA      | January     |        2024 | 777 |
