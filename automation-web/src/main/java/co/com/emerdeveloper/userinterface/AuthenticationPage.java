package co.com.emerdeveloper.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthenticationPage {

    public static final Target FIELD_DOCUMENT_TYPE = Target.the("campo de ingreso de tipo de documento").located(By.id("slct-tipoDocumento"));
    public static final Target LIST_DOCUMENT_TYPE = Target.the("seleccionar tipo documento").locatedBy("//span[@class='mat-option-text' and contains(text(), '{0}')]");
    public static final Target FIELD_DOCUMENT_NUMBER = Target.the("campo de ingreso de numero de documento").located(By.id("input-numeroDocumento"));
    public static final Target BUTTON_CONTINUE = Target.the("Botón continuar").located(By.id("btn-continuar"));
    public static final Target FIELD_PASSWORD = Target.the("campo de ingreso de contraseña").located(By.id("inputPassword"));
    public static final Target BUTTON_VALIDATE_PASSWORD = Target.the("Botón para validar la contraseña").located(By.id("btnValidarPassword"));
    public static final Target TITTLE_PRODUCTS_IN_HOME = Target.the("Titulo mis productos en Home").locatedBy("//div[contains(text(),'Mis productos')]");
    public static final Target LABEL_DATE_AND_TIME = Target.the("texto fecha y hora").locatedBy("//div[contains(text(),'Fecha y hora actual')]");

    private AuthenticationPage() {
    }
}
