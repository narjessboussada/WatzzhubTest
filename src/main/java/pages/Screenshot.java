package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Screenshot {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium jars and drivers\\drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Fstatisticsa");
        driver.manage().window().maximize();

        // Attendez que le bouton de connexion soit visible
        WebDriverWait wait = new WebDriverWait(driver, 20); // Attendre jusqu'à 40 secondes au maximum
        // Attendre que le conteneur principal de l'interface utilisateur soit visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title-auth")));


        // Prendre la capture d'écran
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(screenshot.toPath(), new File("C:\\Users\\USER\\Desktop\\watzzhubPro\\Projet\\screenshots\\test1.jpg").toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Fermer le navigateur
        //driver.quit();
    }
}
