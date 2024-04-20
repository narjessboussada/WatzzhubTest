package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageObject;
import pages.LogoutPageObject;

public class LogoutStepDefinitions {

    private LogoutPageObject  logoutPageObject ;
    public LogoutStepDefinitions() {
        this.logoutPageObject = new LogoutPageObject(CucumberRunner.getDriver());
    }

    @Given("Cliquer sur userName")
    public void cliquer_sur_user_name() {
        try {
            logoutPageObject.CliquerUser();
        }catch(Exception e) {
            System.out.println("Erreur lorsde clique sur le bouton de user: " + e.getMessage());
        }
    }
    @When("cliquer sur signout")
    public void cliquer_sur_signout() {
        logoutPageObject.Se_deconnecter();
    }
    @Then("se naviguer vers page d'accueil")
    public void se_naviguer_vers_page_d_accueil() {
        logoutPageObject.utilisateurEstDéconnecté();
    }
}
