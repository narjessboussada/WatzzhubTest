Feature: Cars
    Background:
      Given arriver à la page d'accueil
      When saisir l'adresse correctement
      And saisir le mot de passe correctement
      And cocher sur la case des conditions générales d'utilisateur
      And cliquer sur le boutton connexion
      Then se naviguer à la page Home

    @cars
    Scenario: filtrer une voiture
      Given cliquer sur le bouton cars
      Then Se navigue à la page cars
      When Cliquer sur le bouton Car Makers
      When Cocher un modele
      Then Cliquer sur le bouton ok


    @carsDetails
    Scenario: Voir les détails d'une voiture
      Given cliquer sur le bouton cars
      When Se navigue à la page cars

      Given cliquer sur l'icone oeil
      #Then afficher les détails du voiture
      When Cliquer sur l'icone batterie
      And Cliquer sur l'icone pictures
      And Cliquer sur l'icone miscellaneous
      And cliquer sur l'icone fermer

@reset
    Scenario: chercher une voiture
      Given cliquer sur le bouton cars
      Then Se navigue à la page cars

      When saisir une marque de voiture
      #Then Afficher la liste filtrée
      When Cliquer sur le bouton reset
      #Then Afficher l'ancienne liste