package extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsClass {

    public static WebDriver driver;
    public static ExtentSparkReporter spark;
    public static ExtentReports extent;
    public static ExtentTest logger;

    @BeforeClass
    public static void startReport() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/STMExtentReport.html");
        extent.attachReporter(spark);
        extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
        extent.setSystemInfo("Environment", "Production");
        extent.setSystemInfo("User Name", "Rajkumar SM");
        spark.config().setDocumentTitle("Title of the Report Comes here ");
        spark.config().setReportName("Name of the Report Comes here ");
        spark.config().setTheme(Theme.STANDARD);
    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void verifyTitle() {
        logger = extent.createTest("To verify Google Title");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void verifyLogo() {
        logger = extent.createTest("To verify Google Logo");
        boolean img = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
        if (img)
            logger.log(Status.PASS, "Image is Present");
        else
            logger.log(Status.FAIL, "Image is not Present");
        Assert.assertTrue(img);
    }

    @After

    public void getResult() throws Exception {
        logger = extent.createTest("getResult");
        // Code pour obtenir le résultat du test
        // Exemple de capture de screenshot en cas d'échec
        String screenshotPath = "";
        if (logger.getStatus() == Status.FAIL) {
            screenshotPath = getScreenShot(driver, logger.getModel().getName());
            logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
        }
    }


    @AfterClass
    public static void endReport() {
        extent.flush();
        driver.quit();
    }

    public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }
}
