package co.com.emerdeveloper.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.emerdeveloper.task.Login;
import co.com.emerdeveloper.task.OpenWebSite;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinitions {

    @Given("^(.*) open SVI web site$")
    public void emerOpenSVIWebSite(String actor) {
        theActorCalled(actor).attemptsTo(OpenWebSite.inNavigator());
    }

    @When("^Emer type number cc and type document (\\d+)$")
    public void emerTypeNumberCcAndTypeDocument(int arg1) {
        theActorInTheSpotlight().attemptsTo(Login.inWebSite());
    }

    @Then("^Display the product list in home$")
    public void displayTheProductListInHome() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Emer open APP$")
    public void emerOpenAPP() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Display a message error$")
    public void displayAMessageError() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
