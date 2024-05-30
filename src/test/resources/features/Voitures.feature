Feature: Cars

  @cars
  Scenario Outline: filtrer une voiture
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home


    Given cliquer sur le bouton cars
    When se navigue à la page cars
    When cliquer sur le bouton Car Makers
    When cocher un modele
    Then cliquer sur le bouton ok
    Examples:
      | Email                          | Password        |
      | rania.tritar@continuousnet.com | Rania.tritar123 |

  @carsDetails
  Scenario Outline: Voir les détails d'une voiture
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

    Given cliquer sur le bouton cars
    When se navigue à la page cars

    Given cliquer sur l'icone oeil
      #Then afficher les détails du voiture
    When cliquer sur l'icone batterie
    And cliquer sur l'icone pictures
    And cliquer sur l'icone miscellaneous
    And cliquer sur l'icone fermer
    Examples:
      | Email                          | Password        |
      | rania.tritar@continuousnet.com | Rania.tritar123 |

  @reset
  Scenario Outline: chercher une voiture
    Given arriver a la page d'accueil
    When saisir "<Email>" et "<Password>"
    And cocher sur la case des conditions générales d'utilisateur
    And cliquer sur le boutton connexion
    Then se naviguer à la page Home

    Given cliquer sur le bouton cars
    Then se navigue à la page cars

    When saisir une marque de voiture
      #Then Afficher la liste filtrée
    When cliquer sur le bouton reset
      #Then Afficher l'ancienne liste
    Examples:
      | Email                          | Password        |
      | rania.tritar@continuousnet.com | Rania.tritar123 |
