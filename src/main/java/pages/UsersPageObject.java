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

    public void CliquerUser() {
        WebElement create = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]/a/p")));
        create.click();
    }

    public void CreateUser() {
        WebElement createUser = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-content-0-0 > div > app-users-list > app-table > div > div.mat-toolbar.ng-star-inserted > div.left-actions.d-flex.flex-wrap.flex-row.mat-toolbar-row > div:nth-child(1) > button")));
        createUser.click();
    }

    public void SaisirName(String name) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-3\"]")));
        element.clear();
        element.sendKeys(name);
    }

    public void SaisirFirstName(String firstname) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-4\"]")));
        element.clear();
        element.sendKeys(firstname);
    }

    public void SaisirEmail(String email) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-5\"]")));
        element.clear();
        element.sendKeys(email);
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

    public void SaisirNumeroTelephone(String phoneNumber) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-6\"]")));
        element.clear();
        element.sendKeys(phoneNumber);
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
