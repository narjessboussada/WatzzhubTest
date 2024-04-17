Feature: gestion des utilisateurs

  Background:
    Given arriver à la page d'accueil
    When saisir adresse correctement
    And saisir mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

  Scenario: creer un utilisateur
   Given cliquer sur user
    When se navigue à la page user
    Then cliquer sur Create

    When saisir nom
    When saisir prenom
    When saisir email
    When choisir langue
    When saisir numero de téléphone



  Scenario: Chercher voiture
    Given cliquer sur cars


  Scenario: Se deconnecter
    Given Cliquer sur userName
