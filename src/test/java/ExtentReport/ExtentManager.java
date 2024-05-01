package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import java.io.IOException;


public class ExtentManager {

    private static ExtentReports extent;
    private static WebDriver driver ;

    public static synchronized ExtentReports getInstance() throws InterruptedException, IOException {
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
}