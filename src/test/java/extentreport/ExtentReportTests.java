package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class ExtentReportTests {
    private static ExtentSparkReporter sparkReporter ;
    private static ExtentReports extent ;
    private static WebDriver driver ;
    private static ExtentTest extentTest ;





    @Test
    public void config() throws IOException {
        // directory where output is to be printed
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");
        spark.config().setReportName("Extent Report wtz");
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);


        ExtentTest test = extent.createTest("Login Test"); //create a test node in the report
        test.pass("Login Test started successfully");//create a test node in the report
        test.info("URL is loaded");
        test.info("Value entered");
        test.fail("Login test completed successfully");
        //Remove debug , fatal error --> To match junit




        extent.flush(); //Unless you call this method , your report will not be written with logs
        Desktop.getDesktop().browse(new File("index.html").toURI());
    }

   /* public void findElementbyCompleteTextMatch(){
        //create test in report html
        extentTest = extent.createTest("find element by complete text match", "text finding element by complete text match");
        driver.get("https://cpo.beta.wattzhub.com");

        WebElement checkBoxDemoPage = driver.findElement(By.xpath());

    }*/
    @BeforeAll
    public static void beforeAll() {
        //WebDriverManager.chromedriver().setup();
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "C:\\Users\\USER\\Desktop\\watzzhubPro\\Projet\\index.html");
        extent.attachReporter(sparkReporter);
    }


        public void findElementByCompleteTextMatch(){
            extentTest = extent.createTest(" ")
            ;
            driver.get("https://cpo.beta.wattzhub.com/auth/login?returnUrl=%2Fstatisticsa");

        }






    }

