package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void saisirEmail(String username) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-field")));
        emailField.click();
        emailField.clear();
        emailField.sendKeys(username);
    }
    public void saisirPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-field")));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void cocher() {
        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-checkbox-inner-container")));
        checkBox.click();
    }

    public void se_connecter() {
        //btn de connexion
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();
    }




    // Méthode pour obtenir l'URL actuelle
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }



}
