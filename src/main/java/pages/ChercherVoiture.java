package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChercherVoiture {

    private WebDriver driver;
    private WebDriverWait wait;

    public ChercherVoiture(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
    }

    public void CliquerCars(){
        WebElement cars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("body > app-root > app-layout > div > div.sidebar > app-sidebar-cmp > div.sidebar-wrapper > ul > li.nav-item.ng-star-inserted.active > a > p")));
        cars.click();

    }


    public String getCurrentUrll() {
        return driver.getCurrentUrl();
    }

}
