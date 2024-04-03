package testcases;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogoutPage;

public class LogoutTest extends TestBase {

    private LogoutPage logoutpage;

    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        setUp();
    }

    @Given("cliquer sur userName")
    public void cliquer_sur_userName() {

    }

    @When("cliquer sur signout")
    public void signout() {
        logoutpage.se_deconnecter();
    }
    @Then("se naviguer vers page d'accueil")
    public void se_naviguer_vers_page_d_accueil() {

    }
}