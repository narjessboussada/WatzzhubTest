Feature: Station de charge

  Background:
    Given arriver à la page d'accueil
    When saisir l'adresse correctement
    And saisir le mot de passe correctement
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

    @charge
    Scenario: Creer des templates de station de charge
      When cliquer sur le bouton Chargin Station Templates
      And se navigue à la page Chargin Station Templates
      And cliquer sur le bouton create
      And Saisir JSON template
      #Then Cliquer sur l'icone enregistrer