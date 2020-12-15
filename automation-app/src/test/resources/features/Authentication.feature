@Autentication
  Feature: Autentication in EDIN Channel
    El usuario se podrá autenticar en la APP EDIN

  @AutenticationSuccessful
  Scenario Outline: Validate users data is correct
    Given Emer open APP
    When Emer type number <documentType> and type document <documentNumber>
    Then Display the token screen

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
