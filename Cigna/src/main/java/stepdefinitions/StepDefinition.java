package stepdefinitions;

import common.WebAPI;
import home.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.cigna.com/");
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }
    static Homepage homepage;
    public static void getInitElements(){homepage= PageFactory.initElements(driver,Homepage.class);}

    @Given("I am at Cigna Home Page")
    public void i_am_at_Cigna_Home_Page() {
        getInitElements();
    }

    @When("I click on Individual and Family Plans")
    public void i_click_on_Individual_and_Family_Plans() {
        getInitElements();
        homepage.CignaIndividualFamily();
    }

    @Then("I should see All Health Insurance for Individuals and Family")
    public void i_should_see_All_Health_Insurance_for_Individuals_and_Family() {
       getInitElements();
       homepage.validateIndividualNFamily("Shopping for Insurance");
    }


}
