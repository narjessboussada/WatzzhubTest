package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SparkTagTest {
    private static final String PATH = "target/spark.html";
    private static final String TAG = "TAG#1234";

    private ExtentReports extent;

    @Before
    public void before() {
        extent = new ExtentReports();
        extent.attachReporter(new ExtentSparkReporter(PATH));
    }

    @Test
    public void testTag() throws IOException {
        extent.createTest("Test").assignCategory(TAG);
        extent.flush();
        Assert.assertTrue(Files.readAllLines(new File(PATH).toPath()).stream()
                .anyMatch(x -> x.contains(TAG)));
    }

    @Test
    public void nodeTag() throws IOException {
        extent.createTest("Test").createNode("Node").assignCategory(TAG);
        extent.flush();
        Assert.assertTrue(Files.readAllLines(new File(PATH).toPath()).stream()
                .anyMatch(x -> x.contains(TAG)));
    }
}