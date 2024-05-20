Feature:En tant qu'utilisateur,
  Je veux pouvoir me connecter
  Pour que je puisse accéder à mon compte

  @se_connecter
  Scenario: se connecter
    Given arriver à la page d'accueil
    When saisir l'adresse correctement
    And saisir le mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

  @logout
  Scenario: se deconnecter
    Given arriver à la page d'accueil
    When saisir l'adresse correctement
    And saisir le mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home
    When Cliquer sur userName
    When cliquer sur le bouton signout
    Then se naviguer vers page d'accueil
