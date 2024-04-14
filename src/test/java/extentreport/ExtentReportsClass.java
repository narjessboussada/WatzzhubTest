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
    private static ExtentReports extent;

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



    public static synchronized ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            sparkReporter.config().setDocumentTitle("WatzzhubCpo");
            sparkReporter.config().setReportName("Testing WatzzhubCpo");
            sparkReporter.config().setTheme(Theme.DARK);
        }
        return extent;
    }




    @AfterClass
    public static void endReport() {
        extent.flush();
        driver.quit();
    }

}