package co.com.emerdeveloper.stepdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.is;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.emerdeveloper.questions.ValidateExistingElement;
import co.com.emerdeveloper.task.EnterUserData;
import co.com.emerdeveloper.userinterface.AuthenticationPage;

public class AuthenticationStepDefinitions {

    @Given("^(.*) open APP$")
    public void emerOpenAPP(String actor) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actor).can(BrowseTheWeb.with(Hook.getThePhone()));
    }

    @When("^(.*) type number (.*) and type document (.*)$")
    public void emerTypeNumberCcAndTypeDocument(String documentNumber, String documentType) {
        theActorInTheSpotlight().attemptsTo(EnterUserData.enterData(documentNumber, documentType));
    }

    @Then("^Display the token screen$")
    public void displayTheTokenScreen() {
        theActorInTheSpotlight().should(seeThat(ValidateExistingElement.validateElement(AuthenticationPage.SCREEN_TOKEN), is(true)));
    }

    @Then("^Display a message error$")
    public void displayAMessageError() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
