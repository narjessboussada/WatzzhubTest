Feature: Utilisateurs

    @utilisateur
    Scenario Outline: creer un utilisateur
        Given arriver a la page d'accueil
        When saisir "<Email>" et "<Password>"
        And cocher sur la case des conditions générales d'utilisateur
        And cliquer sur le boutton connexion
        Then se naviguer à la page Home

        When cliquer sur user
        When se navigue à la page user
        When cliquer sur Create
        When saisir Nom "<Nom>" et Prenom "<Prenom>"
        When saisir Email1 "<Email1>" et Numero "<Numero>"
        When choisir langue
        Then cliquer enregistrer
        Examples:

            | Email                          | Password        | Nom       | Prenom   | Email1              | Numero     |
            | rania.tritar@continuousnet.com | Rania.tritar123 | Teeeessst | Teessttt | tesss133t@gmail.com | 0689899557 |


    @supprimer_utilisateur
    Scenario: supprimer un utilisateur
        When cliquer sur user
        When se navigue à la page user
        #When chercher utilisateur
        And cliquer sur modifier
        #And cliquer sur l'icone supprimer
        #Then l'utilisateur doit supprimer avec succès


