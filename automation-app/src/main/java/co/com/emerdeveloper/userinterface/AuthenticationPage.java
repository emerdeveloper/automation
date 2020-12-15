package co.com.emerdeveloper.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthenticationPage {

    public static final Target FIELD_DOCUMENT_TYPE = Target.the("campo de ingreso de tipo de documento").located(By.id("DocumentTypeCombobox"));
    public static final Target LIST_DOCUMENT_TYPE = Target.the("Lista de opciones de tipos de documentos").located(By.id("Identificador"));
    public static final Target FIELD_DOCUMENT_NUMBER = Target.the("campo de ingreso de numerp de documento").located(By.id("EditTextCustom"));
    public static final Target BUTTON_CONTINUE = Target.the("Botón continuar").located(By.id("EditTextCustom"));
    public static final Target SCREEN_TOKEN = Target.the("pantalla siguinete, ingreso de token").located(By.id("Identificador"));

    private AuthenticationPage() {
        throw new IllegalStateException("user interface class");
    }

}
