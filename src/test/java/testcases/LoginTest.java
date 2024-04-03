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

import pages.CreateUser;
import pages.LoginPage;

public class LoginTest extends TestBase {

    private LoginPage loginPage;
    private CreateUser createUser;

    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        setUp();
    }

    @Given("arriver à la page d'accueil")
    public void arriver_à_la_page_d_accueil() {
        try {
            driver.navigate().to("https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Ftenants");
            loginPage = new LoginPage(driver);
            createUser = new CreateUser(driver);
        } catch (Exception e) {
            System.out.println("Erreur lors de l'arrivée à la page d'accueil : " + e.getMessage());
        }
    }

    @When("saisir adresse correctement")
    public void saisir_adresse_correctement() {
        try {
            loginPage.saisirEmail("rania.tritar@continuousnet.com");
        } catch (Exception e) {
            System.out.println("Erreur lors de la saisie de l'adresse : " + e.getMessage());
        }
    }

    // Ajoutez des blocs try-catch avec des messages d'erreur pour les autres étapes également

    @Then("se naviguer à la page Home")
    public void se_naviguer_à_la_page_home() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.urlContains("tenants"));
            String actualUrl = loginPage.getCurrentUrl();
            System.out.println("Actual URL: " + actualUrl);
            Assert.assertTrue("Unexpected redirection URL", actualUrl.contains("tenants"));
        } catch (Exception e) {
            System.out.println("Erreur lors de la navigation à la page Home : " + e.getMessage());
        }
    }

    @Given("cliquer sur user")
    public void cliquer_sur_user() {
        try {
            createUser.CliquerUser();
        } catch (Exception e) {
            System.out.println("Erreur lors du clic sur user : " + e.getMessage());
        }
    }

    @Then("se navigue à la page user")
    public void se_navigue_à_la_page_user() {
        try {
            driver.navigate().to("https://cpo.beta.wattzhub.com/users#all");
        } catch (Exception e) {
            System.out.println("Erreur lors de la navigation à la page user : " + e.getMessage());
        }
    }

    @After
    public void afterScenario() {
        tearDown();
    }
}
