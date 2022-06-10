package co.com.example.stepdefinitions;

import co.com.example.tasks.FillTheForm1;
import co.com.example.tasks.FillTheForm2;
import co.com.example.userinterfaces.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.example.userinterfaces.HomePage.RegisterButton;
import static co.com.example.userinterfaces.RegisterPage4.FullyRegisterButton;
import static co.com.example.userinterfaces.SuccessfullRegister.Welcome;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RegisterSteps {

    private HomePage homePage = new HomePage();

    @Given("^I want to register on the page$")
    public void HomePage() {
        theActorCalled("Actor").wasAbleTo(Open.browserOn(homePage));
        getDriver().manage().window().maximize();
    }
    @Then("^I go to register page$")
    public void RegisterPage() {
        theActorInTheSpotlight().wasAbleTo(Click.on(RegisterButton));
    }

    @When("^I fill the 1st form with valid data$")
    public void Register(DataTable datatable) {
        theActorInTheSpotlight().wasAbleTo(
                FillTheForm1.info(datatable)
        );
    }
    @When ("^I fill the 2nd form with valid data$")
    public void Register2(DataTable datatable) {
        theActorInTheSpotlight().wasAbleTo(
                FillTheForm2.info(datatable)
        );
    }
    @When ("^I fill the 3rd form with valid data$")
    public void Register3(DataTable datatable) {
        theActorInTheSpotlight().wasAbleTo(
                FillTheForm3.info(datatable)
        );
    }
    @When ("^I fill the last form with valid data$")
    public void Register4(DataTable datatable) {
        theActorInTheSpotlight().wasAbleTo(
                FillTheForm4.info(datatable)
        );
    }
    @And("^I click on the register button$")
    public void ClickRegister() {
        theActorInTheSpotlight().attemptsTo(Click.on(FullyRegisterButton));
    }
    @Then("^I should see the message that I have registered successfully$")
    public void SuccessfulRegister() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(Welcome, isVisible()));
    }
}