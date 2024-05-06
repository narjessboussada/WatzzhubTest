package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UsersPageObject;

import static StepDefinitions.CucumberRunner.test;


public class UsersStepDefinitions {
    private UsersPageObject usersPageObject;

    public UsersStepDefinitions() {
        this.usersPageObject = new UsersPageObject(CucumberRunner.getDriver());
    }

    @When("cliquer sur user")
    public void cliquer_sur_user() {

            usersPageObject.CliquerUser();

    }

    @When("se navigue à la page user")
    public void se_navigue_à_la_page_user() {
        try {
            CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/users#all");
            Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
            test.log(Status.PASS, "se navigue à la page user");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de se navigue à la page user. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible se navigue à la page user.", e);
        }
    }

    @When("cliquer sur Create")
    public void cliquer_sur_create() {
        try {Thread.sleep(3000);
            usersPageObject.CreateUser();
            test.log(Status.PASS, "cliquer sur Create");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de cliquer sur Create. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur Create.", e);
        }
    }

    @When("saisir nom")
    public void saisir_nom() {
        try {Thread.sleep(3000);
            usersPageObject.SaisirName("test");
            test.log(Status.PASS, " saisir nom");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir nom. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir nom.", e);
        }
    }



    @When("saisir prenom")
    public void saisir_prenom() {
        try {Thread.sleep(3000);
            usersPageObject.SaisirFirstName("tesst");
            test.log(Status.PASS, " saisir prenom");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir prenom. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir prenom.", e);
        }
    }

    @When("saisir email")
    public void saisir_email() {
        try {Thread.sleep(3000);
            usersPageObject.SaisirEmail("testttttt12@gmail.com");
            test.log(Status.PASS, " saisir email");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir email. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir email.", e);
        }
    }

    @When("choisir langue")
    public void choisir_langue() {
        try {Thread.sleep(3000);
            usersPageObject.ChoisirLangue();
            test.log(Status.PASS, " choisir langue");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de choisir langue. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de choisir langue.", e);
        }
    }

    @When("choisir statut")
    public void choisir_statut() {
        try {Thread.sleep(3000);
            usersPageObject.ChoisirStatut();
            test.log(Status.PASS, "Choisir statut");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de Choisir statut. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de Choisir statut.", e);        }
    }

    @When("choisir role")
    public void choisir_role() {
        try {Thread.sleep(3000);
            usersPageObject.ChoisirRole();
            test.log(Status.PASS, "Choisir role");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de choisir un role. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de choisir un role.", e);        }
        }


    @When("saisir numero de téléphone")
    public void saisir_numero_de_téléphone() {
        try {Thread.sleep(3000);
            usersPageObject.SaisirNumeroTelephone("0689899557");
            test.log(Status.PASS, "Saisir le numéro de téléphone");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir le numéro de telephone. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible saisir le numéro de telephone.", e);        }
    }
    @Then("cliquer enregistrer")
    public void cliquer_enregistrer() {
        try {Thread.sleep(3000);
            usersPageObject.enregistrer();
            test.log(Status.PASS, "Appuyez Entrée dans le champ du nom de l'utilisateur pour l'enregistrer");
        } catch(Exception e){
            test.log(Status.FAIL,
                    "Impossible d'appuyer sur Entrée dans le champ du nom de l'utilisateur. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible d'appuyer sur Entrée dans le champ du nom de l'utilisateur.", e);
        }
    }
    //supp user
    @When("chercher utilisateur")
    public void  chercher_utilisateur() {
        usersPageObject.email("testttt@gmail.com");
        }

        @When("cliquer sur modifier")
    public void cliquer_sur_modifier(){
        usersPageObject.Cliquer();

        }
        @When("cliquer sur l'icone supprimer")
    public void cliquer_sur_l_icone_supprimer(){
        usersPageObject.Cliquer_Supprimer();
        }
    }

