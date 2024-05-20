package StepDefinitions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UsersPageObject;

import org.openqa.selenium.WebDriver;

public class UsersStepDefinitions {
    private UsersPageObject usersPageObject;
    private WebDriver driver;

    public UsersStepDefinitions() {
        driver = TestBase.getDriver();
        this.usersPageObject = new UsersPageObject(driver);
    }

    @When("cliquer sur user")
    public void cliquer_sur_user() {
        try {
            usersPageObject.CliquerUser();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur user", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur user", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("se navigue à la page user")
    public void se_navigue_à_la_page_user() {
        try {
            TestBase.getDriver().get("https://cpo.beta.wattzhub.com/users#all");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("se navigue à la page user", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("se navigue à la page user", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur Create")
    public void cliquer_sur_create() {
        try {
            usersPageObject.CreateUser();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur Create", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur Create", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir nom")
    public void saisir_nom() {
        try {
            usersPageObject.SaisirName("test");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("saisir nom", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("saisir nom", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir prenom")
    public void saisir_prenom() {
        try {
            usersPageObject.SaisirFirstName("tesst");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("saisir prenom", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("saisir prenom", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir email")
    public void saisir_email() {
        try {
            usersPageObject.SaisirEmail("testttttt12@gmail.com");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("saisir email", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("saisir email", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("choisir langue")
    public void choisir_langue() {
        try {
            usersPageObject.ChoisirLangue();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("choisir langue", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("choisir langue", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("choisir statut")
    public void choisir_statut() {
        try {
            usersPageObject.ChoisirStatut();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("choisir statut", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("choisir statut", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("choisir role")
    public void choisir_role() {
        try {
            usersPageObject.ChoisirRole();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("choisir role", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("choisir role", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir numero de téléphone")
    public void saisir_numero_de_téléphone() {
        try {
            usersPageObject.SaisirNumeroTelephone("0689899557");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("saisir numero de téléphone", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("saisir numero de téléphone", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @Then("cliquer enregistrer")
    public void cliquer_enregistrer() {
        try {
            usersPageObject.enregistrer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer enregistrer", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer enregistrer", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    // supp user
    @When("chercher utilisateur")
    public void chercher_utilisateur() {
        try {
            usersPageObject.email("testttt@gmail.com");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("chercher utilisateur", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("chercher utilisateur", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur modifier")
    public void cliquer_sur_modifier() {
        try {
            usersPageObject.Cliquer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("chercher utilisateur", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("chercher utilisateur", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur l'icone supprimer")
    public void cliquer_sur_l_icone_supprimer() {
        try {
            usersPageObject.Cliquer_Supprimer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("chercher utilisateur", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("chercher utilisateur", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }
}
