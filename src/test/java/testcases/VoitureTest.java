package testcases;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChercherVoiture;

public class VoitureTest extends TestBase {

    private ChercherVoiture cars;

    @Before
    public void beforeScenario() {
        // Cette méthode est exécutée avant chaque scénario
        cars = new ChercherVoiture(driver);
    }

    @Given("cliquer sur cars")
    public void cliquer_sur_cars() throws InterruptedException {
        Thread.sleep(5000);
        cars.CliquerCars();
    }
}
