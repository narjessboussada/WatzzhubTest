package testcases;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateOrganization;
import pages.LoginPage;

public class OrganizationTest extends TestBase {

    private CreateOrganization orgTest ;


    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        setUp();
    }


    @Given("Arriver a la page des organizations")
    public void arriver_a_la_page_des_organizations() {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Wait for the URL to contain the expected value
        wait.until(ExpectedConditions.urlContains("tenants"));

        // Get the actual URL after waiting
         String actualUrl = orgTest.getCurrentUrll();

        // Print the actual URL for debugging
        System.out.println("Actual URL: " + actualUrl);

        // Assert that the URL matches the expected value
        Assert.assertTrue("Unexpected redirection URL", actualUrl.contains("tenants"));
    }

    @When("Cliquer sur Create")
    public void cliquer_sur_create() {
        orgTest.createOrg();
    }

    @When("Saisir name")
    public void saisir_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Saisir Email")
    public void saisir_email() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Saisir Subdomain")
    public void saisir_subdomain() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Choisir type")
    public void choisir_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
