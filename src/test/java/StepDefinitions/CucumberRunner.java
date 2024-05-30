package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import base.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
<<<<<<< HEAD
        tags = "@reset"
=======
        tags = "@logout"
>>>>>>> 1d042e6676dc356f77acc6eec5d0a37db9e334da
)
public class CucumberRunner extends TestBase  {

}