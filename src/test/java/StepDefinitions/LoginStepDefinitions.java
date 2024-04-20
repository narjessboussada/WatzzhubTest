package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPageObject;

public class LoginStepDefinitions {

    private LoginPageObject loginPageObject;

        public LoginStepDefinitions() {
        this.loginPageObject = new LoginPageObject(CucumberRunner.getDriver());
    }

    @Given("arriver à la page d'accueil")
    public void arriver_à_la_page_d_accueil() {
        try {
            CucumberRunner.getDriver().navigate().to(CucumberRunner.TEST_SITE_URL);

        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page d'accueil: " + e.getMessage());
        }
    }

    @When("saisir adresse correctement")
    public void saisir_adresse_correctement() {
        try {
            loginPageObject.saisirEmail("rania.tritar@continuousnet.com");
        } catch (Exception e) {
            System.out.println("Erreur lors du saisie de l'adresse mail: " + e.getMessage());
        }
    }

    @When("saisir mot de passe correctement")
    public void saisir_mot_de_passe_correctement() {
        try {
            loginPageObject.saisirPassword("Rania.tritar123");
        } catch (Exception e) {
            System.out.println("Erreur lors du saisie de mot de passe: " + e.getMessage());
        }
    }

    @When("cocher sur la case des conditions générales d'utilisateur")
    public void cocher_sur_la_case_des_conditions_générales_d_utilisateur() {
        try {
            loginPageObject.cocher();
        } catch (Exception e) {
            System.out.println("Erreur lors de clique sur la case des conditions générales: " + e.getMessage());
        }
    }

    @When("cliquer sur le boutton connexion")
    public void cliquer_sur_le_boutton_connexion() {
        try {
            loginPageObject.se_connecter();
        } catch (Exception e) {
            System.out.println("Erreur lors de clique sur le bouton de connexion: " + e.getMessage());
        }
    }

    @Then("se naviguer à la page Home")
    public void se_naviguer_à_la_page_home() {
        try {
            Assert.assertTrue("Unexpected redirection URL", loginPageObject.isHomePage());
        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page d'accueil: " + e.getMessage());
        }
    }
}
