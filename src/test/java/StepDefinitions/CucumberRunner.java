package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@cars"
)
public class CucumberRunner {
        public static final String TEST_SITE_URL = "https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Ftenants";
        private static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe";
        private static WebDriver driver;
        private static WebDriverWait wait;

        @BeforeClass
        public static void setup(){
                System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, 60);
                driver.manage().window().maximize();
        }

        @AfterClass
        public static void tearDown(){
           //     if(driver != null){
                  //      driver.quit();
           //     }
        }

        public static WebDriver getDriver() {
            return driver;
        }

        public static WebDriverWait getWait() {
            return wait;
        }
}
