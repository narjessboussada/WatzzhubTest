package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CarsPageObject;

public class CarsStepDefinitions {

    private CarsPageObject carsPageObject ;

    public CarsStepDefinitions(){
        this.carsPageObject= new CarsPageObject(CucumberRunner.getDriver());
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
       carsPageObject.CarMakers();
    }
    @When("chocher un modele")
    public void chocher_un_modele() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Cliquer Ok")
    public void cliquer_ok() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}


