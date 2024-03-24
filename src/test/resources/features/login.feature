Feature: page de connexion de watzzhub

  Scenario: vérifier si la connexion est réussie avec des crédits valides
    Given arriver à la page d'accueil
    When saisir adresse correctement
    When saisir mot de passe correctement
    When cocher sur la case des conditions générales d'utilisateur
    When cliquer sur le boutton connexion
    Then  se naviguer à la page Home


