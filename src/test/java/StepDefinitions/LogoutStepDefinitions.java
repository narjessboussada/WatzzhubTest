package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import pages.LogoutPageObject;

public class LogoutStepDefinitions extends TestBase{

    private LogoutPageObject logoutPageObject;
    private WebDriver driver;

    public LogoutStepDefinitions() {
        driver = TestBase.getDriver();
        this.logoutPageObject = new LogoutPageObject(driver);
    }

    @When("cliquer sur userName")
    public void cliquer_sur_user_name() {
        try {
            logoutPageObject.CliquerUser();
                        Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur userName", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur userName", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur le bouton signout")
    public void cliquer_sur_le_bouton_signout() {
        try {
            logoutPageObject.Se_deconnecter();
            Hooks._scenario.log(Status.PASS,
            MarkupHelper.createLabel("cliquer sur le bouton signout", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur le bouton signout", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("se naviguer vers page d'accueil")
    public void se_naviguer_vers_page_d_accueil() {

        try {
            Assert.assertTrue(logoutPageObject.utilisateurEstDéconnecté());
            Hooks._scenario.log(Status.PASS,
            MarkupHelper.createLabel("se naviguer vers page d'accueil", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("se naviguer vers page d'accueil", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }
}
