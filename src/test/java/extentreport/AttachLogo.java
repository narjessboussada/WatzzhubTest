package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AttachLogo {
    //attach the company logo to the extent report

 @Test
    public void attachLogoTest() throws IOException {
     ExtentReports extent = new ExtentReports();
     ExtentSparkReporter spark = new ExtentSparkReporter("index.html");

     spark.loadXMLConfig(new File("extentconfig.xml"));
     extent.attachReporter(spark);

     ExtentTest test=extent.createTest("first test");
     test.pass("Test started");
     test.pass("test finished");

     extent.flush();
     Desktop.getDesktop().browse(new File("index.html").toURI());
 }

}
