package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganization {

    private WebDriver driver;
    private WebDriverWait wait;

    public CreateOrganization(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);

    }

        public void createOrg(){
            WebElement Createorg = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-layout > div > div.main-panel.d-flex.flex-column > div > app-tenants-cmp > div > app-table > div > div.mat-toolbar.ng-star-inserted > div.left-actions.d-flex.flex-wrap.flex-row.mat-toolbar-row > div.action-container.ng-star-inserted > button")));
            Createorg.click();
        }

    public String getCurrentUrll() {
        return driver.getCurrentUrl();
    }

}
