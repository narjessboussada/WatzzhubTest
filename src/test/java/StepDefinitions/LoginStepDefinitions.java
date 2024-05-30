package StepDefinitions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.LoginPageObject;

public class LoginStepDefinitions extends TestBase {

    private LoginPageObject loginPageObject;
    private WebDriver driver;

    public LoginStepDefinitions() {
        driver = TestBase.getDriver();
        this.loginPageObject = new LoginPageObject(driver);
    }

    @Given("arriver a la page d'accueil")
    public void arriver_a_la_page_d_accueil() {
        try {
            driver.navigate().to(TestBase.TEST_SITE_URL);
            loginPageObject.logoIsDisplayed();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("arriver à la page d'accueil", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("arriver à la page d'accueil", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir {string} et {string}")
    public void saisir_Email_and_Password(String Email, String Password) {
        try {
            loginPageObject.saisirEmail(Email);
            loginPageObject.saisirPassword(Password);
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("saisir l'email correctement", ExtentColor.GREEN));
            MarkupHelper.createLabel("saisir l'adresse correctement", ExtentColor.GREEN);

        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Erreur lors de la saisie de l'email", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel("saisir le mot de passe correctement", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }



    @When("cocher sur la case des conditions générales d'utilisateur")
    public void cocher_sur_la_case_des_conditions_générales_d_utilisateur() {
        try {
            loginPageObject.cocher();
            Hooks._scenario.log(Status.PASS, MarkupHelper
                    .createLabel("cocher sur la case des conditions générales d'utilisateur", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cocher sur la case des conditions générales d'utilisateur",
                    ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur le boutton connexion")
    public void cliquer_sur_le_boutton_connexion() {
        try {
            loginPageObject.se_connecter();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur le boutton connexion", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur le boutton connexion", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @Then("se naviguer à la page Home")
    public void se_naviguer_à_la_page_home() {
        try {
            Assert.assertTrue(loginPageObject.isHomePage());
            Hooks._scenario.log(Status.PASS, MarkupHelper.createLabel("se naviguer à la page Home", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("se naviguer à la page Home", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }
}
