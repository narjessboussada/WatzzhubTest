Feature: Cars
  Background:
    Given arriver à la page d'accueil
    When saisir adresse correctement
    And saisir mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

    @cars
    Scenario: Chercher une voiture
      Given cliquer sur cars
      When se navigue à la page cars
      And cliquer sur Car Makers
     # And chocher un modele
     # And Cliquer Ok