Feature: user select the hotel

  Scenario Outline: 
    Given user should perform login with "<username>" and "<password>"
    When user click the login button
    Given user search the hotel following depends "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<Checkin>","<Checkout>","<AdultsperRoom>","<ChilderPerRoom>"
    When user click the Search Button
    Then select the hotel
    And click the continue button

    Examples: 
      | username   | password | Location | Hotels         | RoomType | NoOfRooms | Checkin    | Checkout   | AdultsperRoom | ChilderPerRoom |
      | adminhotel | Admin123 | London   | Hotel Sunshine | Double   | 2 - Two   | 18/09/2023 | 19/09/2023 | 2 - Two       | 2 - Two        |
