Feature: Login

  @login
  Scenario: s'authentifier en tant qu'un utilisateur normal
    Given arriver à la page d'accueil
    When saisir adresse correctement
    And saisir mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

