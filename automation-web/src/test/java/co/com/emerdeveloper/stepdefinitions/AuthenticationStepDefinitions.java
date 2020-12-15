package co.com.emerdeveloper.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.emerdeveloper.questions.ValidateLogin;
import co.com.emerdeveloper.task.Login;
import co.com.emerdeveloper.task.OpenWebSite;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AuthenticationStepDefinitions {

    @Given("^(.*) open SVI web site$")
    public void emerOpenSVIWebSite(String actor) {
        theActorCalled(actor).attemptsTo(OpenWebSite.inNavigator());
    }


    @When("^he enter document type cc and enter document (\\d+) and later enter the a(\\d+)$")
    public void heEnterDocumentTypeCcAndEnterDocumentAndLaterEnterThePassword(String arg1, String arg2, DataTable table) {
        theActorInTheSpotlight().attemptsTo(Login.inWebSite(convertData(table)));
    }

    @Then("^he can see the date and time in home$")
    public void heCanSeeTheDateAndTimeInHome(DataTable table) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateLogin.inWenSite(convertData(table)))
        );
    }

    private List<List<String>> convertData(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        return data;
    }
}
