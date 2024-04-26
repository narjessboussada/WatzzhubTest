package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPageObject;
import pages.LogoutPageObject;

import static StepDefinitions.CucumberRunner.test;

public class LogoutStepDefinitions {

    private LogoutPageObject logoutPageObject;

    public LogoutStepDefinitions() {
        this.logoutPageObject = new LogoutPageObject(CucumberRunner.getDriver());
    }

    @When("Cliquer sur userName")
    public void cliquer_sur_user_name() {
         try {
        logoutPageObject.CliquerUser();
        test.log(Status.PASS, "Cliquer sur userName");
        }catch(Exception e) {
          test.log(Status.FAIL,
          "Impossible de Cliquer sur userName. Détails des exceptions: " + e.getMessage());
        throw new RuntimeException("Impossible de Cliquer sur userName.", e);
         }
    }

    @When("cliquer sur signout")
    public void cliquer_sur_signout() {
        try {
            logoutPageObject.Se_deconnecter();
            test.log(Status.PASS, "cliquer sur signout");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de cliquer sur signout. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur signout.", e);
        }
    }

    @When("se naviguer vers page d'accueil")
    public void se_naviguer_vers_page_d_accueil() {

        try {
            Assert.assertTrue("Unexpected redirection URL", logoutPageObject.utilisateurEstDéconnecté());
            test.log(Status.PASS, "se naviguer vers page d'accueil");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de se naviguer vers page d'accueil. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de se naviguer vers page d'accueil.", e);
        }
    }
}
