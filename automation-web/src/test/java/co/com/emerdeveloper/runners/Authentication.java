package co.com.emerdeveloper.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/authentication.feature",
        glue = "co.com.emerdeveloper.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        //tags = "@AutenticationSuccessful"
)
public class Authentication {
}
