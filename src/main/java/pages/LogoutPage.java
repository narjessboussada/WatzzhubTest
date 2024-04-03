package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {


    private WebDriver driver;
    private WebDriverWait wait;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void se_deconnecter(){
        //btn de connexion
        WebElement signoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-layout")));
        signoutButton.click();

    }
}
