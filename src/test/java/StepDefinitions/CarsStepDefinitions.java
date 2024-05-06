package StepDefinitions;


import com.aventstack.extentreports.Status;
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
        try{
            carsPageObject.Cars();
        test.log(Status.PASS, "cliquer sur le bouton cars");
    } catch (Exception e) {
        test.log(Status.FAIL,
                "Impossible de cliquer sur le bouton cars. Détails des exceptions: " + e.getMessage());
        throw new RuntimeException("Impossible de cliquer sur le bouton cars.", e);
    }
    }

    @When("Se navigue à la page cars")
    public void se_navigue_à_la_page_cars() {
        try {
            //methode okhra
           CucumberRunner.getDriver().get("https://cpo.beta.wattzhub.com/cars#cars");
            carsPageObject.naviguer();
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
        try { Thread.sleep(3000);
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
        try { Thread.sleep(3000);
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
                 Thread.sleep(3000);
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

                try {Thread.sleep(3000);
               carsPageObject.verifier();
                    test.log(Status.PASS, "afficher les détails du voiture");}
                catch(Exception e){
                    test.log(Status.FAIL,
                            "Impossible d'afficher les détails du voiture. Détails des exceptions: " + e.getMessage());
                    throw new RuntimeException("Impossible d'afficher les détails du voiture.", e);
                }
            }

    @When("Cliquer sur l'icone batterie")
    public void cliquer_sur_l_icone_batterie() {
        try {Thread.sleep(3000);
            carsPageObject.batterie();
            test.log(Status.PASS, "Cliquer sur l'icone batterie");}
        catch(Exception e){
            test.log(Status.FAIL,
                    "Impossible de cliquer sur l'icone batterie. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible cliquer sur l'icone batterie.", e);
        }
    }

         @When("Cliquer sur l'icone pictures")
        public void cliquer_sur_l_icone_pictures(){
             try {Thread.sleep(3000);
                 carsPageObject.image();
                 test.log(Status.PASS, "Cliquer sur l'icone pictures");}
             catch(Exception e){
                 test.log(Status.FAIL,
                         "Impossible de cliquer sur l'icone pictures. Détails des exceptions: " + e.getMessage());
                 throw new RuntimeException("Impossible de cliquer sur l'icone pictures.",e);
         }}

        @When("Cliquer sur l'icone miscellaneous")
        public void cliquer_sur_l_icone_miscellaneous(){
            try {
                Thread.sleep(3000);
                carsPageObject.miscellaneous();
                test.log(Status.PASS, "Cliquer sur l'icone miscellaneous");
            } catch (Exception e) {
                test.log(Status.FAIL,
                        "Impossible de cliquer sur l'icone miscellaneous. Détails des exceptions: " + e.getMessage());
                throw new RuntimeException("Impossible de cliquer sur l'icone miscellaneous.", e);
            }
        }
        @When("cliquer sur l'icone fermer")
        public void cliquer_sur_l_icone_fermer() {
        try{
            Thread.sleep(3000);
            carsPageObject.fermer();
            test.log(Status.PASS, "cliquer sur l'icone fermer");}
        catch(Exception e){
            test.log(Status.FAIL,
                    "Impossible de cliquer sur l'icone fermer. Détails des exceptions: " + e.getMessage());
            throw new RuntimeException("Impossible de cliquer sur l'icone fermer.",e);
        }}


    //chercher voiture

    @When("saisir une marque de voiture")
    public void saisir_une_marque_de_voiture() throws InterruptedException {
        Thread.sleep(3000);
        carsPageObject.Marque("BMW");
    }

    @When("Cliquer sur le bouton reset")
    public void cliquer_sur_le_bouton_reset() throws InterruptedException {
        Thread.sleep(3000);
    carsPageObject.reset();
    }
}







