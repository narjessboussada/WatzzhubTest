package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.CucumberRunner;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    private WebDriver driver;

    @Before
    public void setUp() {
        initializeWebDriver();
        navigateToTestSite();
        maximizeWindow();

    }

    private void initializeWebDriver() {
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }
    
    private void navigateToTestSite() {
        driver.get(CucumberRunner.TEST_SITE_URL);
    }

    private void maximizeWindow() {
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
      //  if (driver != null) {
            //driver.quit();
        }
    }
