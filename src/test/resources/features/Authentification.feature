Feature:En tant qu'utilisateur,
  Je veux pouvoir me connecter
  Pour que je puisse accéder à mon compte

  @se_connecter
<<<<<<< HEAD
  Scenario Outline: se connecter
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
=======
  Scenario: se connecter
    Given arriver à la page d'accueil
    When saisir l'adresse correctement
    And saisir le mot de passe correctement
>>>>>>> 1d042e6676dc356f77acc6eec5d0a37db9e334da
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

    Examples:
      | Email                          | Password         |
      | rania.tritar@continuousnet.com | Rania.tritar123  |

  @se_deconnecter
  Scenario Outline: se deconnecter
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home
    When cliquer sur userName
    When cliquer sur le bouton signout
    Then se naviguer vers page d'accueil
    Examples:
      | Email                          | Password         |
      | rania.tritar@continuousnet.com | Rania.tritar123  |
