package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extentReport;
        public static synchronized ExtentReports getInstance() {
        if (extentReport == null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
            String timestamp = dateFormat.format(new Date());
            String reportPath = System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\WatzzhubCpo_"
                    + timestamp + ".html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            extentReport = new ExtentReports();
            extentReport.attachReporter(sparkReporter);
            extentReport.setSystemInfo("User", "SAID Med Bechir");
            extentReport.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
            extentReport.setSystemInfo("selenium-java", "3.141.59");
            extentReport.setSystemInfo("io.cucumber", "6.10.4");
            extentReport.setSystemInfo("extentreport", "5.0.6");
            extentReport.setSystemInfo("junit", "4.13.2");
            sparkReporter.config().setDocumentTitle("WatzzhubCpo");
            sparkReporter.config().setReportName("Testing WatzzhubCpo");
            sparkReporter.config().setTheme(Theme.DARK);
            
        }
        return extentReport;
    }
}