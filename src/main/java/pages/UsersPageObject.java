package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public UsersPageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
    }
    public void sendText(WebElement field, String text) {
        field.clear();  // Nettoie le champ avant d'entrer du texte
        field.sendKeys(text);  // Envoie le texte au champ spécifi
    }

    public void CliquerUser() {
        WebElement create = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]/a/p")));
        create.click();
    }

    public void CreateUser() {
        WebElement createUser = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-content-0-0 > div > app-users-list > app-table > div > div.mat-toolbar.ng-star-inserted > div.left-actions.d-flex.flex-wrap.flex-row.mat-toolbar-row > div:nth-child(1) > button")));
        createUser.click();
    }

    public void SaisirNom(String Nom){
        WebElement NameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-3\"]")));
        sendText(NameField, Nom);
    }
    public void SaisirPrenom(String Prenom) {
        WebElement FirstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-4\"]")));
        sendText(FirstNameField, Prenom);
    }

    public void SaisirEmail(String Email) {
        WebElement EmailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-5\"]")));
        sendText(EmailElement, Email);

    }

    public void ChoisirLangue() {
        WebElement selectLangue = wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-11")));
        selectLangue.click();
        WebElement optionLangue = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-option-13 > .mat-option-text")));
        optionLangue.click();
    }

    public void ChoisirStatut() {
        WebElement selectStatut = wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-select-value-13")));
        selectStatut.click();
        WebElement optionStatut = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-option-20 > .mat-option-text")));
        optionStatut.click();
    }

    public void ChoisirRole() {
        WebElement optionRole = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-option-text")));
        optionRole.click();
    }

    public void SaisirNumeroTelephone(String NumTel) {
        WebElement NumTelElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-6\"]")));
        sendText(NumTelElement, NumTel);
    }

    public void enregistrer() {
        WebElement Field = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-3\"]")));
        Field.click();
        Field.sendKeys(Keys.ENTER);
    }

    //supp un user
    public void email(String name){
        WebElement email= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-0\"]")));
        email.clear();
        email.sendKeys(name);
    }
    public void Cliquer(){

        WebElement points = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"0\"]/td[1]/div/button")));
        points.click();
    }

    public void Cliquer_Supprimer(){
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-menu-panel-0 > div > div > button")));
        delete.click();
    }
}
