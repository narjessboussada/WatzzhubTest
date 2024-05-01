package StepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarsPageObject;

import static StepDefinitions.CucumberRunner.test;

public class CarsStepDefinitions {

    private CarsPageObject carsPageObject;

    public CarsStepDefinitions() {
        this.carsPageObject = new CarsPageObject(CucumberRunner.getDriver());
    }

    @Given("cliquer sur le bouton cars")
    public void cliquer_sur_le_bouton_cars() {
        carsPageObject.Cars();
    }

    @When("Se navigue à la page cars")
    public void se_navigue_à_la_page_cars() {
        try {
            //methode okhra
            CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/cars#cars");
            Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
        } catch (Exception e) {
            System.out.println("Impossible d'atteindre la page des voitures: " + e.getMessage());
        }

    }

    @When("Cliquer sur le bouton Car Makers")
    public void cliquer_sur_le_bouton_car_makers() {
        try {
            carsPageObject.CarMakers();
            test.log(Status.PASS, "cliquer sur Car Makers");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de cliquer sur Car Makers. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur Car Makers.", e);
        }
    }

    @When("Cocher un modele")
    public void cocher_un_modele() {
        try {
            carsPageObject.ChoisirModele();
            test.log(Status.PASS, "chocher un modele");
        } catch (Exception e) {
            test.log(Status.FAIL,
                    "Impossible de chocher un modele. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de chocher un modele.", e);
        }
    }

    @Then("Cliquer sur le bouton ok")
    public void cliquer_sur_le_bouton_ok() {
        try {
            carsPageObject.CliquerOk();
            test.log(Status.PASS, "Cliquer Ok");}
            catch(Exception e){
                test.log(Status.FAIL,
                        "Impossible deCliquer Ok. Détails des exceptions: " + e.getMessage());
                throw new RuntimeException("Impossible de Cliquer Ok.", e);
            }
        }


 //detail voiture
         @Given("cliquer sur l'icone oeil")
         public void cliquer_sur_l_icone_oeil() {
             try {
            carsPageObject.cliquer_icone();
                 test.log(Status.PASS, "cliquer sur l'icone oeil");}
             catch(Exception e){
                 test.log(Status.FAIL,
                         "Impossible de cliquer sur l'icone oeil. Détails des exceptions: " + e.getMessage());
                 throw new RuntimeException("Impossible de cliquer sur l'icone oeil.", e);
             }
         }

            @Then("afficher les détails du voiture")
            public void afficher_les_détails_du_voiture() {
                try {
               carsPageObject.verifier();
                }
                catch(Exception e){
                    test.log(Status.FAIL,
                            "Impossible d'afficher les détails du voiture. Détails des exceptions: " + e.getMessage());
                    throw new RuntimeException("Impossible d'afficher les détails du voiture.", e);
                }
            }

    @When("Cliquer sur l'icone batterie")
    public void cliquer_sur_l_icone_batterie() {
        try {
            carsPageObject.batterie();
        }
                catch(Exception e){
        test.log(Status.FAIL,
                "Impossible de cliquer sur l'icone batterie. Détails des exceptions: " + e.getMessage());
        throw new RuntimeException("Impossible de cliquer sur l'icone batterie.", e);
    }
    }

         @When("Cliquer sur l'icone pictures")
        public void cliquer_sur_l_icone_pictures(){
             try {

             }
             catch(Exception e){
                 test.log(Status.FAIL,
                         "Impossible de cliquer sur l'icone pictures. Détails des exceptions: " + e.getMessage());
                 throw new RuntimeException("Impossible de cliquer sur l'icone pictures.", e);
             }


    }
        @When("cliquer sur l'icone fermer")
        public void cliquer_sur_l_icone_fermer() {
        try{
            Thread.sleep(3000);
            carsPageObject.fermer();
        }catch(Exception e){
            test.log(Status.FAIL,
                    "Impossible de cliquer sur l'icone fermer. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur l'icone fermer.", e);
        }
    }


}



