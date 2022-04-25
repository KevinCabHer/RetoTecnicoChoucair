package co.com.automation.stepdefinitions;

import co.com.automation.model.Date_Register;
import co.com.automation.tasks.OpenPageAutomation;
import co.com.automation.tasks.PageRegisterDate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast()); //Preparar escenario actor
    }

    @Given("^Kevin wants to register on the automation page$")
    public void kevinWantsToRegisterOnTheAutomationPage() {
        theActorCalled("Kevin").wasAbleTo(OpenPageAutomation.thepage());

    }


    @When("^Enter all the required information$")
    public void enterAllTheRequiredInformation(List<Date_Register> Date) {
        theActorInTheSpotlight().attemptsTo(PageRegisterDate.thepage(Date));
    }

    @Then("^registration is completed successfully$")
    public void registrationIsCompletedSuccessfully() {

    }
}
