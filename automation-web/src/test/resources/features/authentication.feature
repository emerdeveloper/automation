@Autentication
Feature: Autentication in EDIN Channel
  El usuario se podrá autenticar en la SVI EDIN

  @AutenticationSuccessful
  Scenario Outline: Validate users data is correct
    Given Emer open SVI web site
    When Emer type number <documentType> and type document <documentNumber>
    Then Display the product list in home

    Examples:
      | documentType  | documentNumber |
      | cc            | 32323232332    |

  @AutenticationFailed
  Scenario Outline: Validate users data is incorrect
    Given Emer open APP
    When Emer type number <documentType> and type document <documentNumber>
    Then Display a message error

    Examples:
      | documentType  | documentNumber |
      | cc            | 32323232332    |
