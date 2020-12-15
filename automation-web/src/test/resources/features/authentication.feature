@Autentication
Feature: Autentication in EDIN Channel
  El usuario se podrá autenticar en la SVI EDIN

  @AutenticationSuccessful
  Scenario Outline: Validate users data is correct
    Given Emer open SVI web site
    When he enter document type <documentType> and enter document <documentNumber> and later enter the <password>
      |   documentType  |   documentNumber  |   password   |
      |   CC            |   32323232332     |   a1234567   |
    Then he can see the date and time in home
      |   expectedValue       |
      |   Fecha y hora actual |

    Examples:
      | documentType  | documentNumber  | password  |
      | cc            | 32323232332     | a1234567  |