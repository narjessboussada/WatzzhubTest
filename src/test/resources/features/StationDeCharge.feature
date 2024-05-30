Feature: Station de charge

<<<<<<< HEAD
  @charge
  Scenario Outline: Creer des templates de station de charge
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home
=======
  Background:
    Given arriver à la page d'accueil

>>>>>>> 1d042e6676dc356f77acc6eec5d0a37db9e334da


    When cliquer sur le bouton Chargin Station Templates
    And se navigue à la page Chargin Station Templates
    And cliquer sur le bouton create
    And saisir JSON template
    Then cliquer sur l'icone enregistrer

    Examples:
      | Email                          | Password        |
      | rania.tritar@continuousnet.com | Rania.tritar123 |
