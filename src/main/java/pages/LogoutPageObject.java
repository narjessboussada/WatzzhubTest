package pages;

import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public LogoutPageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void CliquerUser() {
        WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-layout > div > div.sidebar > app-sidebar-cmp > div.sidebar-wrapper > div > div.user-info > a")));
        user.click();
    }

    public void Se_deconnecter() {
        WebElement signout = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#collapseDetails > ul > li:nth-child(2) > a > span.sidebar-normal")));
        signout.click();
    }


        public void utilisateurEstDéconnecté() {
            WebElement loginForm = driver.findElement(By.cssSelector("body > app-root > app-layout > app-authentication-login > div > div > div > div > div.col-md-9.col-xs-12.col-sm-12.auth_form.p-3 > div.container-fluid.p-3 > div:nth-child(1) > h2")); // Supposons que votre formulaire de connexion ait l'ID "loginForm"
            if (loginForm.isDisplayed()) {
                System.out.println("L'utilisateur est déconnecté avec succès.");
            } else {
                System.out.println("Échec de la déconnexion de l'utilisateur.");
            }
            driver.quit();

        }
    }

