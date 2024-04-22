package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UsersPageObject;


public class UsersStepDefinitions {
    private UsersPageObject usersPageObject;

    public UsersStepDefinitions() {
        this.usersPageObject = new UsersPageObject(CucumberRunner.getDriver());
    }

    @Given("cliquer sur user")
    public void cliquer_sur_user() {
        try {
            usersPageObject.CliquerUser();
        } catch (Exception e) {
            System.out.println("Echec lors de clique sur l'utilisateur: " + e.getMessage());
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

    @Given("cliquer sur Create")
    public void cliquer_sur_create() {
        try {
            usersPageObject.CreateUser();
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de l'utilisateur: " + e.getMessage());
        }
    }

    @When("saisir nom")
    public void saisir_nom() {
        try {
            usersPageObject.SaisirName("test");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du nom : " + e.getMessage());
        }
    }

    @When("saisir prenom")
    public void saisir_prenom() {
        try {
            usersPageObject.SaisirFirstName("tesst");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du prénom : " + e.getMessage());
        }
    }

    @When("saisir email")
    public void saisir_email() {
        try {
            usersPageObject.SaisirEmail("test@gmail.com");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie de l'email : " + e.getMessage());
        }
    }

    @When("choisir langue")
    public void choisir_langue() {
        try {
            usersPageObject.ChoisirLangue();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix de la langue : " + e.getMessage());
        }
    }

    @When("choisir statut")
    public void choisir_statut() {
        try {
            usersPageObject.ChoisirStatut();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix du statut : " + e.getMessage());
        }
    }

    @When("choisir role")
    public void choisir_role() {
        try {
            usersPageObject.ChoisirRole();
        } catch (Exception e) {
            System.out.println("Erreur lors du choix du rôle : " + e.getMessage());
        }
    }

    @When("saisir numero de téléphone")
    public void saisir_numero_de_téléphone() {
        try {
            usersPageObject.SaisirNumeroTelephone("0689899557");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie du numéro de téléphone : " + e.getMessage());
        }
    }
    @Then("cliquer enregistrer")
    public void cliquer_enregistrer() {

        usersPageObject.enregistrer();
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