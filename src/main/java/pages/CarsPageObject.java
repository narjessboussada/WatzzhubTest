package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarsPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public CarsPageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void Cars() {
        WebElement cars = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-layout > div > div.sidebar > app-sidebar-cmp > div.sidebar-wrapper > ul > li:nth-child(2) > a > p")));
        cars.click();
    }

    public void CarMakers(){
        WebElement Makers = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-tab-content-0-0 > div > app-car-catalogs-list > app-table > div > div.mat-toolbar.ng-star-inserted > div.d-flex.flex-row.me-auto.flex-wrap.mat-toolbar-row.filter-row.ng-star-inserted > div.col-lg-3.col-md-6.col-xl-2.ng-star-inserted > mat-form-field > div > div.mat-form-field-flex.ng-tns-c107-2 > div.mat-form-field-infix.ng-tns-c107-2")));
        Makers.click();

    }

}
