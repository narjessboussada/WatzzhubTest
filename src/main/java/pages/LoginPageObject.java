package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void logoIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("company__logo")));
    }

    public void saisirEmail(String username) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-field")));
        emailField.clear();
        emailField.sendKeys(username);
    }

    public void saisirPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-field")));
        passwordField.clear();
        passwordField.sendKeys(password);
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
