package co.com.emerdeveloper.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.emerdeveloper.interactions.SelectDocumentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.emerdeveloper.userinterface.AuthenticationPage;

public class EnterUserData implements Task {
    private String documentNumber;
    private String documentType;

    public EnterUserData(String documentNumber, String documentType) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public static EnterUserData enterData(String documentNumber, String documentType) {
        return instrumented(EnterUserData.class, documentNumber, documentType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AuthenticationPage.FIELD_DOCUMENT_TYPE),
                SelectDocumentType.selectDocumentType(documentType),
                Enter.keyValues(documentNumber).into(AuthenticationPage.FIELD_DOCUMENT_NUMBER),
                Click.on(AuthenticationPage.BUTTON_CONTINUE)
        );
    }
}
