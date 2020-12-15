package co.com.emerdeveloper.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void openNavigator() {
        OnStage.setTheStage(new OnlineCast());
    }
}
