package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UsersPageObject;

import static StepDefinitions.CucumberRunner.test;


public class UsersStepDefinitions {
    private UsersPageObject usersPageObject;

    public UsersStepDefinitions() {
        this.usersPageObject = new UsersPageObject(CucumberRunner.getDriver());
    }

    @When("cliquer sur user")
    public void cliquer_sur_user() {
        try {
            usersPageObject.CliquerUser();
        } catch (Exception e) {
            System.out.println("Impossible de cliquer sur user: " + e.getMessage());
        }
    }

    @When("se navigue à la page user")
    public void se_navigue_à_la_page_user() {
        try {
            CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/users#all");
            Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page des utilisateurs: " + e.getMessage());
        }
    }

    @When("cliquer sur Create")
    public void cliquer_sur_create() {
        try {
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
        try {
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
        try {
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
        try {
            usersPageObject.SaisirEmail("testttttt1@gmail.com");
            test.log(Status.PASS, " saisir email");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir email. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir email.", e);
        }
    }

    @When("choisir langue")
    public void choisir_langue() {
        try {
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
        try {
            usersPageObject.ChoisirStatut();
            test.log(Status.PASS, "Choisir statut");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de Choisir statut. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de Choisir statut.", e);        }
    }

    @When("choisir role")
    public void choisir_role() {
        try {
            usersPageObject.ChoisirRole();
            test.log(Status.PASS, "Choisir role");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de choisir un role. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de choisir un role.", e);        }
        }


    @When("saisir numero de téléphone")
    public void saisir_numero_de_téléphone() {
        try {
            usersPageObject.SaisirNumeroTelephone("0689899557");
            test.log(Status.PASS, "Saisir le numéro de téléphone");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir le numéro de telephone. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible saisir le numéro de telephone.", e);        }
    }
    @Then("cliquer enregistrer")
    public void cliquer_enregistrer() {
        try {
            usersPageObject.enregistrer();
            test.log(Status.PASS, "Appuyez Entrée dans le champ du nom de l'utilisateur pour l'enregistrer");

        } catch(Exception e){
            test.log(Status.FAIL,
                    "Impossible d'appuyer sur Entrée dans le champ du nom de l'utilisateur. Détails des exceptions: " + e.getMessage());

            throw new RuntimeException("Impossible d'appuyer sur Entrée dans le champ du nom de l'utilisateur.", e);
        }
    }
    //supp user

    @Given("cliquer user")
    public void cliquer_user() {
        try {
            usersPageObject.CliquerUser();
        } catch (Exception e) {
            System.out.println("Echec lors de clique sur l'utilisateur: " + e.getMessage());
        }
    }
    @When("arriver à la page user")
    public void arriver_à_la_page_user() {
        try {
            CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/users#all");
            Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page des utilisateurs: " + e.getMessage());
        }
    }

    @When("chercher le user")
    public void chercher_le_user (String username) {
          usersPageObject.iClickOnTheDeleteButtonForTheUser("tesst");
        }


    @When("cliquer sur les trois boutons")
    public void cliquer_sur_les_trois_boutons() {
        usersPageObject.Cliquer();
    }
    @When("cliquer sur supprimer")
    public void cliquer_sur_supprimer() {
        usersPageObject.Cliquer_Supprimer();
    }
    @Then("l'utilisateur doit supprimer avec succès")
    public void l_utilisateur_doit_supprimer_avec_succès() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}