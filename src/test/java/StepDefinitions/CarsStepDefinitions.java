package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarsPageObject;

public class CarsStepDefinitions extends TestBase {

    private CarsPageObject carsPageObject;
    private WebDriver driver;

    public CarsStepDefinitions() {
        driver = TestBase.getDriver();
        this.carsPageObject = new CarsPageObject(driver);
    }

    @Given("cliquer sur le bouton cars")
    public void cliquer_sur_le_bouton_cars() {
        try {
            carsPageObject.Cars();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur le bouton cars", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur le bouton cars", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("se navigue à la page cars")
    public void se_navigue_à_la_page_cars() {
        try {
            // methode okhra
            TestBase.getDriver().get("https://cpo.beta.wattzhub.com/cars#cars");
            // carsPageObject.naviguer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Se navigue à la page cars", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Se navigue à la page cars", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur le bouton Car Makers")
    public void cliquer_sur_le_bouton_car_makers() {
        try {
            carsPageObject.CarMakers();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur le bouton Car Makers", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur le bouton Car Makers", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cocher un modele")
    public void cocher_un_modele() {
        try {
            carsPageObject.ChoisirModele();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cocher un modele", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cocher un modele", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @Then("cliquer sur le bouton ok")
    public void cliquer_sur_le_bouton_ok() {
        try {
            carsPageObject.CliquerOk();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur le bouton ok", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur le bouton ok", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    // detail voiture
    @Given("cliquer sur l'icone oeil")
    public void cliquer_sur_l_icone_oeil() {
        try {
            carsPageObject.cliquer_icone();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur l'icone oeil", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur l'icone oeil", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @Then("afficher les détails du voiture")
    public void afficher_les_détails_du_voiture() {
        try {
            carsPageObject.verifier();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("afficher les détails du voiture", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("afficher les détails du voiture", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur l'icone batterie")
    public void cliquer_sur_l_icone_batterie() {
        try {
            carsPageObject.batterie();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur l'icone batterie", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur l'icone batterie", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur l'icone pictures")
    public void cliquer_sur_l_icone_pictures() {
        try {
            carsPageObject.image();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur l'icone pictures", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur l'icone pictures", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur l'icone miscellaneous")
    public void cliquer_sur_l_icone_miscellaneous() {
        try {
            carsPageObject.miscellaneous();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur l'icone miscellaneous", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur l'icone miscellaneous", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur l'icone fermer")
    public void cliquer_sur_l_icone_fermer() {
        try {
            carsPageObject.fermer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur l'icone fermer", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur l'icone fermer", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    // chercher voiture

    @When("saisir une marque de voiture")
    public void saisir_une_marque_de_voiture() throws InterruptedException {
        try {
            carsPageObject.Marque("BMW");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur l'icone fermer", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur l'icone fermer", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur le bouton reset")
    public void cliquer_sur_le_bouton_reset() throws InterruptedException {
        try {
            carsPageObject.reset();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur le bouton reset", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur le bouton reset", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }
}
