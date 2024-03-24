Feature: page home de Watzzhub

  Scenario: le validation de la creation des nouvelles utilisateurs
    Given arriver à la page Home

    When cliquer sur le 'Users'
    When cliquer sur le bouton'Create'
    When saisir Name
    When saisir First Name
    When saisir Email
    When choisir la langue
    When choisir le statut
    When choisir le role (par defaut Super Admin)
    When saisir le numero de telephone
    When cliquer sur le boutton enregistrer (icone)

    Then  le nouveau user est ajouté avec succès dans la liste des users



