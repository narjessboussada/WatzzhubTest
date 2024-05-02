package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPageObject;

import static StepDefinitions.CucumberRunner.test;

public class LoginStepDefinitions {

    private LoginPageObject loginPageObject;

        public LoginStepDefinitions() {
        this.loginPageObject = new LoginPageObject(CucumberRunner.getDriver());
    }

    @Given("arriver à la page d'accueil")
    public void arriver_à_la_page_d_accueil() {
        try {
            CucumberRunner.getDriver().navigate().to(CucumberRunner.TEST_SITE_URL);
            test.log(Status.PASS, "arriver à la page d'accueil");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible d'arriver à la page d'accueil. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible d'arriver à la page d'accueil.", e);
        }
    }

    @When("saisir l'adresse correctement")
    public void saisir_l_adresse_correctement() {
        try {
            loginPageObject.saisirEmail("rania.tritar@continuousnet.com");
            test.log(Status.PASS, "saisir adresse correctement");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de saisir adresse correctement. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir adresse correctement.", e);
        }
    }

    @When("saisir le mot de passe correctement")
    public void saisir_le_mot_de_passe_correctement() {
        try {
            loginPageObject.saisirPassword("Rania.tritar123");
            test.log(Status.PASS, "saisir mot de passe correctement");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible desaisir mot de passe correctement. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de saisir mot de passe correctement.", e);
        }
        }


    @When("cocher sur la case des conditions générales d'utilisateur")
    public void cocher_sur_la_case_des_conditions_générales_d_utilisateur() {
        try {
            loginPageObject.cocher();
            test.log(Status.PASS, "cocher sur la case des conditions générales d'utilisateur");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible desaisir mot de passe correctement. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cocher sur la case des conditions générales d'utilisateur.", e);
        }
    }
    @When("cliquer sur le boutton connexion")
    public void cliquer_sur_le_boutton_connexion() {
        try {
            loginPageObject.se_connecter();
            test.log(Status.PASS, "cliquer sur le boutton connexion");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de cliquer sur le boutton connexion. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur le boutton connexion.", e);
        }
    }

    @Then("se naviguer à la page Home")
    public void se_naviguer_à_la_page_home() {
        try {
            Assert.assertTrue("Unexpected redirection URL", loginPageObject.isHomePage());
            test.log(Status.PASS, "se naviguer à la page Home");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de se naviguer à la page Home. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de se naviguer à la page Home.", e);
        }
    }
}
