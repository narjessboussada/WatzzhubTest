package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageObject;
import pages.LogoutPageObject;

import static StepDefinitions.CucumberRunner.test;

public class LogoutStepDefinitions {

    private LogoutPageObject  logoutPageObject ;
    public LogoutStepDefinitions() {
        this.logoutPageObject = new LogoutPageObject(CucumberRunner.getDriver());
    }

    @Given("Cliquer sur userName")
    public void cliquer_sur_user_name() {
      //  try {
            logoutPageObject.CliquerUser();
            //test.log(Status.PASS, "Cliquer sur userName");
        //}catch(Exception e) {
          //  test.log(Status.FAIL,
                 //   "Impossible de Cliquer sur userName. Détails des exceptions: " + e.getMessage());
           // throw new RuntimeException("Impossible de Cliquer sur userName.", e);
       // }
    }
    @When("cliquer sur signout")
    public void cliquer_sur_signout() {
       try{ logoutPageObject.Se_deconnecter();
        test.log(Status.PASS, "cliquer sur signout");
    }catch(Exception e) {
           test.log(Status.FAIL,
                   "Impossible de cliquer sur signout. Détails des exceptions: " + e.getMessage());
           throw new RuntimeException("Impossible de cliquer sur signout.", e);
       }
    }
    @Then("se naviguer vers page d'accueil")
    public void se_naviguer_vers_page_d_accueil() {
        logoutPageObject.utilisateurEstDéconnecté();
    }
}
