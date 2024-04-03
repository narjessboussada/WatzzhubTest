package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    // Set configuration values directly in the class
    private String browser = "chrome";
    private String testsiteurl = "https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Ftenants";


    @Before
    public void setUp()  {
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\\\src\\\\test\\\\resources\\\\executables\\chromedriver.exe");
            System.out.println(System.getProperty("user.dir") + "/src/test/resources/features");
            driver = new ChromeDriver();
        }

        driver.get(testsiteurl);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);  // Set the timeout for WebDriverWait as needed



    }





    @After
    //nettoyer et fermer les ressources apres l'éxecution des tests
    //arrêter et fermer le navigateur une fois que tous les tests ont été exécutés.
    public void tearDown() {
        //if (driver != null) {
            // Add any additional cleanup code if needed
            // driver.quit();
        }
    }
