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
When cliquer sur user
When se navigue à la page user

    When cliquer sur Create
    When saisir nom
    When saisir prenom
    When saisir email
    When choisir langue
    When saisir numero de téléphone
    Then cliquer enregistrer

    @delete_user
    Scenario: supprimer un utilisateur
        Given cliquer user
        When arriver à la page user
      #  When chercher le user
       # And cliquer sur les trois boutons
        #And cliquer sur supprimer
        #Then l'utilisateur doit supprimer avec succès


