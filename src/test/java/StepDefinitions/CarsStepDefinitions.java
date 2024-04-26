package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CarsPageObject;

import static StepDefinitions.CucumberRunner.test;

public class CarsStepDefinitions {

    private CarsPageObject carsPageObject;

    public CarsStepDefinitions() {
        this.carsPageObject = new CarsPageObject(CucumberRunner.getDriver());
    }

    @Given("cliquer sur cars")
    public void cliquer_sur_cars() {
        carsPageObject.Cars();
    }

    @When("se navigue à la page cars")
    public void se_navigue_à_la_page_cars() {
        try {
            CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/cars#cars");
            Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page des voitures: " + e.getMessage());
        }

    }

    @When("cliquer sur Car Makers")
    public void cliquer_sur_car_makers() {
        try {
            carsPageObject.CarMakers();
            test.log(Status.PASS, "cliquer sur Car Makers");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de cliquer sur Car Makers. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur Car Makers.", e);
        }
    }

    @When("chocher un modele")
    public void chocher_un_modele() {
        try {
            carsPageObject.ChoisirModele();
            test.log(Status.PASS, "chocher un modele");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de chocher un modele. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de chocher un modele.", e);
        }
    }

    @When("Cliquer Ok")
    public void cliquer_ok() {
        try {
            carsPageObject.CliquerOk();
            test.log(Status.PASS, "Cliquer Ok");}
            catch(Exception e){
                test.log(Status.FAIL,
                        "Impossible deCliquer Ok. Détails des exceptions: " + e.getMessage());
                throw new RuntimeException("Impossible de Cliquer Ok.", e);
            }
        }
    }



