package testcases;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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



    @Given("arriver à la page d'accueil")
    public void arriver_à_la_page_d_accueil() {
        driver.navigate().to("https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Ftenants");

    }

    @When("saisir adresse correctement")
    public void saisir_adresse_correctement() {
        loginPage.saisirEmail("rania.tritar@continuousnet.com");
    }

    @When("saisir mot de passe correctement")
    public void saisir_mot_de_passe_correctement() {
        loginPage.saisirPassword("Rania.tritar123");
    }

    @When("cocher sur la case des conditions générales d'utilisateur")
    public void cocher_sur_la_case_des_conditions_générales_d_utilisateur() {

        loginPage.cocher();
    }

    @When("cliquer sur le boutton connexion")
    public void cliquer_sur_le_boutton_connexion() {

        loginPage.se_connecter();
    }


    @Then("se naviguer à la page Home")
    public void se_naviguer_à_la_page_home() {
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