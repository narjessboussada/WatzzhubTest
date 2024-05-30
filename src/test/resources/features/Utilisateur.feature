Feature: Utilisateurs

    Background:
        Given arriver à la page d'accueil
        When saisir l'adresse correctement
        And saisir le mot de passe correctement
        And cocher sur la case des conditions générales d'utilisateur
        And cliquer sur le boutton connexion
        Then se naviguer à la page Home

    @utilisateur
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

    @supprimer_utilisateur
    Scenario: supprimer un utilisateur
        When cliquer sur user
        When se navigue à la page user
        #When chercher utilisateur
        And cliquer sur modifier
        #And cliquer sur l'icone supprimer
        #Then l'utilisateur doit supprimer avec succès


