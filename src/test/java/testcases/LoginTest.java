package testcases;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import pages.LoginPage;

public class LoginTest extends TestBase {

    private LoginPage loginPage;

    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        setUp();
        loginPage = new LoginPage(driver);
    }


    @Given("l'utilisateur est à la page de connexion")
    public void l_utilisateur_est_à_la_page_de_connexion() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("l'utilisateur saisit adresse et mot de passe correctement")
    public void l_utilisateur_saisit_adresse_et_mot_de_passe_correctement() {
       loginPage.email("rania.tritar@continuousnet.com");
       loginPage.password("Rania.tritar123");
    }

    @When("cocher sur la case des conditions générales d'utilisateur et cliquer sur le boutton connexion")
    public void cocher_sur_la_case_des_conditions_générales_d_utilisateur_et_cliquer_sur_le_boutton_connexion() {
       loginPage.login();
    }


    @Then("l'utlisateur se navigue à la page Home")
    public void l_utlisateur_se_navigue_à_la_page_home() {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Wait for the URL to contain the expected value
        wait.until(ExpectedConditions.urlContains("tenants"));

        // Get the actual URL after waiting
        String actualUrl = loginPage.getCurrentUrl();

        // Print the actual URL for debugging
        System.out.println("Actual URL: " + actualUrl);

        // Assert that the URL matches the expected value
        Assert.assertTrue("Unexpected redirection URL", actualUrl.contains("tenants"));
    }

    @After
    public void afterScenario() {
        // This method is executed after each scenario
        tearDown();
    }
}