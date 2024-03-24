package testcases;

import base.TestBase;
import io.cucumber.java.Before;
import pages.CreateUser;


public class CreateUserTest extends TestBase {
    private CreateUser create_user;

    @Before
    public void beforeScenario() {
        // This method is executed before each scenario
        CreateUser CreateUser = new CreateUser(driver);
    }


}
