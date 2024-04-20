Feature: Users

Background:
Given arriver à la page d'accueil
When saisir adresse correctement
And saisir mot de passe correctement
And cocher sur la case des conditions générales d'utilisateur
And cliquer sur le boutton connexion
Then se naviguer à la page Home

  @user
Scenario: creer un utilisateur
Given cliquer sur user
When se navigue à la page user

    Given cliquer sur Create
    When saisir nom
    When saisir prenom
    When saisir email
    When choisir langue
    When saisir numero de téléphone
    Then cliquer enregistrer

    @delete_user
    Scenario: supprimer un utilisateur
        When cliquer sur les trois points


