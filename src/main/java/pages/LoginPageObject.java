package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.nio.file.Files.getAttribute;

public class LoginPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Initialisation de l'attente avec un délai de 10 secondes
    }
    public void sendText(WebElement field, String text) {
        field.clear();  // Nettoie le champ avant d'entrer du texte
        field.sendKeys(text);  // Envoie le texte au champ spécifi
    }
    public void logoIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("company__logo")));
    }

    public void saisirEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-field")));

        sendText(emailField, email);
    }
    public void saisirPassword(String Password) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-field")));

        sendText(emailField, Password);
    }


    public void cocher() {
        WebElement checkBox = wait
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-checkbox-inner-container")));
        checkBox.click();
    }

    public void se_connecter() {
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();
    }

    public boolean isHomePage() {
        return wait.until(ExpectedConditions.urlContains("tenants"));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
