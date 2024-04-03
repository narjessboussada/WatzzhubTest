package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class CreateUser {
    private WebDriver driver;
    private WebDriverWait wait;

    public CreateUser(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }
    public void CliquerUser() {
        try {
            WebElement create = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cdk-focused .mat-icon")));
            create.click();
        } catch (Exception e) {
            System.out.println("Erreur lors du clic sur l'élément : " + e.getMessage());
        }
    }



    public void CreateUser () {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body[@id='mat-tab-content-0-0']/div/app-users-list/app-table/div/div/div/div/button/span/mat-icon"))).click();

    }
    public void SaisirName (String name){

            WebDriverWait wait = new WebDriverWait(driver, 60);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
            element.sendKeys(name);
    }

    public void SaisirFirstName (String firstname){
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(firstname);
    }

    public void SaisirEmail (String email){
        driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(email);
    }

    public void ChoisirLangue () {
        driver.findElement(By.id("mat-select-value-11")).click();
        driver.findElement(By.cssSelector("#mat-option-13 > .mat-option-text")).click();
    }

    public void ChoisirStatut () {
        driver.findElement(By.id("mat-select-value-13")).click();
        driver.findElement(By.cssSelector("#mat-option-20 > .mat-option-text")).click();
    }

    public void ChoisirRole () {
                driver.findElement(By.cssSelector(".mat-option-text")).click();
    }

    public void SaisirNumeroTelephone(String phoneNumber) {
        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(phoneNumber);


    }
    public void SaisirMobile (String mobileNumber) {
        driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys(mobileNumber);

    }

     /*   public void CocherApi(){
            WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-checkbox-inner-container")));
            checkBox.click();
        }
*/
    /*public void saveUser() {
        try {
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("cdk-focused .mat-icon")));
            saveButton.click();
        } catch (Exception e) {
            // Log exception
            System.out.println("Exception occurred while trying to save user: " + e.getMessage());

        }
    }*/
    public void Enregistrer(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/ng-component/app-user/div/div/form/div/button[1]/span[1]/mat-icon"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

    }

    public void Verifier(){
        List<WebElement> listeUtilisateurs = driver.findElements(By.cssSelector("table#liste-utilisateurs tbody tr"));

    // Définir les détails de l'utilisateur nouvellement ajouté
        String nouveauNomUtilisateur = "Nom de l'utilisateur ajouté";
        String nouveauEmailUtilisateur = "email@example.com";

    // Parcourir la liste des utilisateurs pour vérifier la présence du nouvel utilisateur
        boolean nouvelUtilisateurTrouvé = false;
        for (WebElement utilisateur : listeUtilisateurs) {
            String nomUtilisateur = utilisateur.findElement(By.cssSelector("td.nom-utilisateur")).getText();
            String emailUtilisateur = utilisateur.findElement(By.cssSelector("td.email-utilisateur")).getText();
            if (nomUtilisateur.equals(nouveauNomUtilisateur) && emailUtilisateur.equals(nouveauEmailUtilisateur)) {
                nouvelUtilisateurTrouvé = true;
                break;
            }
        }

    // Vérifier si le nouvel utilisateur est présent dans la liste
        if (nouvelUtilisateurTrouvé) {
            System.out.println("Le nouvel utilisateur est ajouté avec succès dans la liste des utilisateurs.");
        } else {
            System.out.println("Le nouvel utilisateur n'est pas trouvé dans la liste des utilisateurs.");
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}