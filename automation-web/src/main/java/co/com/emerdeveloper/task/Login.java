package co.com.emerdeveloper.task;

import co.com.emerdeveloper.userinterface.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AuthenticationPage.FIELD_DOCUMENT_TYPE),
                Click.on(AuthenticationPage.LIST_DOCUMENT_TYPE.of("CC")),
                Enter.theValue("32323232332").into(AuthenticationPage.FIELD_DOCUMENT_NUMBER),
                Click.on(AuthenticationPage.BUTTON_CONTINUE)
        );
    }

    public static Login inWebSite() {
        return Tasks.instrumented(Login.class);
    }
}
