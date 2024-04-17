package testcases;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateUser;

public class UserTest extends TestBase {
    private CreateUser createUser;

    public UserTest(CreateUser createUser) {
        this.createUser = createUser;
    }

    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        setUp();
    }

    @Given("cliquer sur Create")
    public void cliquer_sur_create() {
        try {
            createUser.CreateUser();
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de l'utilisateur : " + e.getMessage());
        }
    }

    @When("saisir nom")
    public void saisir_nom() {
        try {
            createUser.SaisirName("test");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du nom : " + e.getMessage());
        }
    }

    @When("saisir prenom")
    public void saisir_prenom() {
        try {
            createUser.SaisirFirstName("tesst");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du prénom : " + e.getMessage());
        }
    }

    @When("saisir email")
    public void saisir_email() {
        try {
            createUser.SaisirEmail("test@gmail.com");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie de l'email : " + e.getMessage());
        }
    }

    @When("choisir langue")
    public void choisir_langue() {
        try {
            createUser.ChoisirLangue();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix de la langue : " + e.getMessage());
        }
    }

    @When("choisir statut")
    public void choisir_statut() {
        try {
            createUser.ChoisirStatut();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix du statut : " + e.getMessage());
        }
    }

    @When("choisir role")
    public void choisir_role() {
        try {
            createUser.ChoisirRole();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix du rôle : " + e.getMessage());
        }
    }

    @When("saisir numero de téléphone")
    public void saisir_numero_de_téléphone() {
        try {
            createUser.SaisirNumeroTelephone("0689899557");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du numéro de téléphone : " + e.getMessage());
        }
    }

    /*@When("saisir numero mobile")
    public void saisir_numero_mobile() {
        try {
            createUser.SaisirMobile("0689899557");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du numéro mobile : " + e.getMessage());
        }
    }

    @When("cliquer enregistrer")
    public void cliquer_enregistrer() {
        try {
            createUser.Enregistrer();
        } catch (Exception e) {
            System.out.println("Erreur lors de l'enregistrement : " + e.getMessage());
        }
    }

    /* @Then("le nouvel utilisateur est ajouté avec succès dans la liste des utilisateurs")
     public void le_nouvel_utilisateur_est_ajouté_avec_succès_dans_la_liste_des_utilisateurs() {
         try {
             createUser.Verifier();
         } catch (Exception e) {
             System.out.println("Erreur lors de la vérification de l'utilisateur : " + e.getMessage());
         }
     }
 */
    @After
    public void afterScenario() {
        tearDown();
    }
}
