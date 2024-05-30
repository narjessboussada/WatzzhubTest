Feature: Voiture
    Background:
      Given arriver à la page d'accueil
      When saisir l'adresse correctement
      And saisir le mot de passe correctement
      And cocher sur la case des conditions générales d'utilisateur
      And cliquer sur le boutton connexion
      Then se naviguer à la page Home

    @voiture
    Scenario: filtrer une voiture
      Given cliquer sur le bouton cars
      Then se navigue à la page cars
      When cliquer sur le bouton Car Makers
      When cocher un modele
      Then cliquer sur le bouton ok

    @détail_voiture
    Scenario: Voir les détails d'une voiture
      Given cliquer sur le bouton cars
      When se navigue à la page cars

      Given cliquer sur l'icone oeil
      #Then afficher les détails du voiture
      When cliquer sur l'icone batterie
      And cliquer sur l'icone pictures
      And cliquer sur l'icone miscellaneous
      And cliquer sur l'icone fermer

    @réinitialiser
    Scenario: chercher une voiture
      Given cliquer sur le bouton cars
      Then se navigue à la page cars

      When saisir une marque de voiture
      #Then Afficher la liste filtrée
      When cliquer sur le bouton reset
      #Then Afficher l'ancienne liste