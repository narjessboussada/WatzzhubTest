package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.SQLException;

public class CarsPageObject {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriverWait waitMore;

    public CarsPageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
        this.waitMore = new WebDriverWait(driver, 120);
    }

    public void naviguer() throws InterruptedException, SQLException {
        /// CucumberRunner.getDriver("https://cpo.beta.wattzhub.com/cars#cars");
        // Thread.sleep(5000); // Attendre quelques secondes (juste pour l'exemple)
    }

    public void Cars() {
        WebElement cars = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "body > app-root > app-layout > div > div.sidebar > app-sidebar-cmp > div.sidebar-wrapper > ul > li:nth-child(2) > a > p")));
        cars.click();
    }

    public void CarMakers() {
        WebElement Makers = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#mat-tab-content-0-0 > div > app-car-catalogs-list > app-table > div > div.mat-toolbar.ng-star-inserted > div.d-flex.flex-row.me-auto.flex-wrap.mat-toolbar-row.filter-row.ng-star-inserted > div.col-lg-3.col-md-6.col-xl-2.ng-star-inserted > mat-form-field > div > div.mat-form-field-flex.ng-tns-c107-2 > div.mat-form-field-infix.ng-tns-c107-2")));
        Makers.click();
    }

    public void ChoisirModele() {
        WebElement Modele = wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("#mat-checkbox-4 .mat-checkbox-inner-container")));
        Modele.click();
    }

    public void CliquerOk() {
        WebElement enregistrer = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#mat-dialog-0 > ng-component > div > div > div > button:nth-child(1) > span.mat-button-wrapper > mat-icon")));
        enregistrer.click();
    }

    // detail voiture
    public void cliquer_icone() {
        WebElement oeil = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#\\30  > td.action-cell.text-center.align-middle.ng-star-inserted > div > button")));
        oeil.click();
    }

    public Boolean verifier() {
        WebElement imageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='"
                + " https://beta.cpo.server.wattzhub.com:443/v1/util/car-catalogs/1261/image?LastChangedOn=2023-01-05T10:47:16.363Z"
                + "']")));
        return imageElement.isDisplayed();
    }

    public void batterie() {
        WebElement batterie = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-label-1-1")));
        batterie.click();
    }

    public void image() {
        WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-label-1-2")));
        image.click();
    }

    public void miscellaneous() {
        WebElement image = waitMore.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-label-1-3")));
        image.click();
    }

    public void fermer() {
        WebElement fermer = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#mat-dialog-0 > ng-component > app-car-catalog > div > div > div > button")));
        fermer.click();
    }

    // Chercher voiture en saissant le modele

    public void Marque(String marque) {
        WebElement Voiture = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-input-0")));
        Voiture.clear();
        Voiture.sendKeys(marque);
    }

    public void reset() {
        WebElement reset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//*[@id=\"mat-tab-content-0-0\"]/div/app-car-catalogs-list/app-table/div/div[1]/div[1]/div[2]/button")));
        reset.click();
    }
}
