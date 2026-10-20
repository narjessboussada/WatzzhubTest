# WatzzhubTest — Suite de tests automatisés pour Watzzhub

WatzzhubTest est un projet d'**automatisation de tests BDD** pour l'application **Watzzhub**. Il est construit avec **Java + Maven**, pilote le navigateur avec **Selenium WebDriver**, décrit les scénarios avec **Cucumber (Gherkin)** et produit des rapports **Extent Reports** et **Allure** après chaque exécution.

> **Remarque :** la branche `Narjess` est la branche active de ce dépôt.

---

## Structure du dépôt

```
├── .idea/                  # Paramètres de l'IDE (IntelliJ)
├── lib/                    # Jar local (commons-io-2.15.1.jar)
├── src/                    # Code source : step definitions, page objects, runners, features
├── watzzhub_test           # Point d'entrée / ressources de test
├── extentconfig.xml        # Configuration d'Extent Reports
├── pom.xml                 # Dépendances et build Maven
└── .gitignore
```

| Chemin             | Rôle                                                              |
| ------------------ | ----------------------------------------------------------------- |
| `src/`             | Code de test et scénarios Gherkin                                 |
| `lib/`             | Dépendance locale référencée dans `pom.xml` (portée system)      |
| `extentconfig.xml` | Titre, thème et sortie du rapport                                 |
| `pom.xml`          | Dépendances (Selenium, Cucumber, JUnit, TestNG, rapports)         |

---

## Stack technique

### Framework de test

- **Java 8** (`maven.compiler.source/target = 1.8`)
- **Maven** — build et gestion des dépendances
- **Selenium Java 3.141.59** — automatisation du navigateur
- **WebDriverManager 5.7.0** — gestion automatique des drivers
- **Cucumber 6.10.4** (`cucumber-java`, `cucumber-junit`) — scénarios BDD
- **JUnit 4.13.2** / **JUnit Jupiter 5.8.1** et **TestNG** — exécuteurs de tests

### Rapports et utilitaires

- **ExtentReports 5.0.6** + **extentreports-cucumber6-adapter 2.0.0** — rapports HTML
- **Allure Cucumber 2.17.0** — résultats Allure
- **aShot 1.5.4** — captures d'écran
- **Apache Commons IO 2.15.1** — utilitaires de fichiers

---

## Prérequis

- **JDK 8** ou supérieur
- **Maven 3.6+**
- **Google Chrome** (ou un autre navigateur pris en charge par Selenium)
- Accès réseau à l'environnement Watzzhub à tester

Vérifier l'installation :

```
java -version
mvn -version
```

---

## Démarrage

```
git clone https://github.com/narjessboussada/WatzzhubTest.git
cd WatzzhubTest
git checkout Narjess
mvn clean install -DskipTests
```

---

## Exécution des tests

### Tous les tests

```
mvn clean test
```

### Un tag Cucumber précis

```
mvn clean test -Dcucumber.filter.tags="@smoke"
```

> Adaptez le nom du tag à ceux utilisés dans vos fichiers `.feature`.

---

## Rapports de test

| Rapport           | Génération / consultation                                                |
| ----------------- | ------------------------------------------------------------------------ |
| **Extent Report** | Généré après l'exécution, selon `extentconfig.xml`                       |
| **Allure**        | `allure serve target/allure-results` (nécessite le CLI Allure)           |
| **Captures**      | Prises avec aShot lorsqu'un scénario nécessite une preuve visuelle       |

---

## Écrire un nouveau test

1. Ajouter un scénario dans un fichier `.feature` (Gherkin : `Given / When / Then`).
2. Implémenter les étapes correspondantes dans une classe de step definitions.
3. Réutiliser ou créer un page object pour l'écran testé.
4. Lancer le scénario et vérifier le rapport généré.

---

## Bonnes pratiques

- Garder des scénarios courts et lisibles par des non-développeurs.
- Préférer des locators stables (id, attributs data) aux XPath fragiles.
- Ne jamais versionner d'identifiants : utiliser des variables d'environnement ou un fichier de configuration local ignoré par Git.
- Ne pas versionner les rapports générés ni `target/`.

---

## Rôles de l'équipe

- **QA / Automatisation :** scénarios, step definitions, page objects, rapports
- **Dev (Watzzhub) :** application testable, identifiants stables, environnement de test

---

## Licence

Développé dans le cadre d'un projet de fin d'étude.
