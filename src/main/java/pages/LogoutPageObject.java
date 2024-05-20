package pages;

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
        WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "body > app-root > app-layout > div > div.sidebar > app-sidebar-cmp > div.sidebar-wrapper > div > div.user-info > a")));
        user.click();
    }

    public void Se_deconnecter() {
        WebElement signout = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#collapseDetails > ul > li:nth-child(2) > a > span.sidebar-normal")));
        signout.click();
    }

    public boolean utilisateurEstDéconnecté() {
        return wait.until(ExpectedConditions.urlToBe("https://cpo.beta.wattzhub.com/auth/login"));
    }
}
