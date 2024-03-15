Feature: page de connexion de watzzhub

  Scenario: vérifier si la connexion est réussie avec des crédits valides
    Given l'utilisateur est à la page de connexion
    When l'utilisateur saisit adresse et mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur et cliquer sur le boutton connexion
    Then l'utlisateur se navigue à la page Home


