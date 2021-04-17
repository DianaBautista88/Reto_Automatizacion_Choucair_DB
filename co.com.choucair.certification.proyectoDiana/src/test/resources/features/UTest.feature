#Autor Diana BAUTISTA
@stories
Feature: Diana As a user, want to create a user in Utest

  @scenario1
  Scenario Outline: Join in Utest
    Given than Diana wants to create a new user in Utest webpage
    | strFirstName    |  strLastName   | strEmail | strMonth | strDay | strYear |
    | <strFirstName>    |  <strLastName>   | <strEmail> | <strMonth> | <strDay> | <strYear> |
    When she tell about herself she add the address
      | strCity    |
      | <strCity>  |

    When she tell about her devices
      | strMobile    |  strModel   | strOS |
      | <strMobile>    |  <strModel>   | <strOS> |

    When she create a password
      | strPassword    |  strConfPassword   |
      | <strPassword>    |  <strConfPassword>   |


    Then she enter to the platform
      | strWelcome |
      | <strWelcome>  |

    Examples:
      | strFirstName    |  strLastName   | strEmail             | strMonth | strDay | strYear  |  strCity  |strMobile    |  strModel    | strOS       | strPassword             |  strConfPassword   |
      | Diana           |  Bautista     | dibahe.09@gmail.com  | April      | 6     | 1988      | Colombia    | Apple      |iPhone       | iOS 2.0      | PruebaChoucair2021.     |  PruebaChoucair2021.   |




