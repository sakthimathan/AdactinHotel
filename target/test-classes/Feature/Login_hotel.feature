
Feature: user booking room in hotel

  Scenario Outline: user booking room
    
    Given user should perform login with "<username>" and "<password>"
    When user click the login button

    Examples: 
      | username   | password |
      | adminhotel | Admin123 |
