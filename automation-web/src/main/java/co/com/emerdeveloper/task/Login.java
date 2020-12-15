package co.com.emerdeveloper.task;

import co.com.emerdeveloper.interactions.Wait;
import co.com.emerdeveloper.userinterface.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.emerdeveloper.userinterface.AuthenticationPage.*;


public class Login implements Task {

    private String documentType;
    private String documentNumber;
    private String password;

    public Login(List<List<String>> data) {
        this.documentType = data.get(1).get(0);
        this.documentNumber = data.get(1).get(1);
        this.password = data.get(1).get(2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIELD_DOCUMENT_TYPE),
                Click.on(LIST_DOCUMENT_TYPE.of(documentType)),
                Enter.theValue(documentNumber).into(FIELD_DOCUMENT_NUMBER),
                Click.on(BUTTON_CONTINUE),
                Enter.theValue(password).into(FIELD_PASSWORD),
                Click.on(BUTTON_VALIDATE_PASSWORD),
                WaitUntil.the(TITTLE_PRODUCTS_IN_HOME,
                        WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }

    public static Login inWebSite(List<List<String>> data) {
        return Tasks.instrumented(Login.class, data);
    }
}
