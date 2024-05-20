package StepDefinitions;

import java.util.Collection;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import ExtentReport.ExtentManager;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    protected static WebDriver driver;
    private ExtentReports extentReport = ExtentManager.getInstance();
    public static ExtentTest _scenario;
    public static ExtentTest _feature;

    @Before
    public void beforeScenario(Scenario scenario) {
        Collection<String> tags = scenario.getSourceTagNames();
       _scenario = extentReport.createTest(scenario.getName(), tags.toString());
    }

    @After
    public void afterScenario(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                String screenshotPath = TestBase.captureScreenshot(scenario.getName());
                _scenario.fail(MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            }
            extentReport.flush();
        } catch (Exception e) {
            throw e;
        }
    }
}
