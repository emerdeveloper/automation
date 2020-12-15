package co.com.emerdeveloper.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import co.com.emerdeveloper.userinterface.AuthenticationPage;

import java.util.List;
import java.util.Optional;

public class SelectDocumentType implements Interaction {

    private String optionSelected;

    public SelectDocumentType(String documentType) {
        optionSelected = documentType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> options = AuthenticationPage.LIST_DOCUMENT_TYPE.resolveAllFor(actor);
        Optional<WebElementFacade> result = options.stream().filter(webElementFacade -> webElementFacade.getText().contains(optionSelected)).findFirst();

        result.ifPresent(WebElementFacade::click);

        /*options.forEach(webElementFacade -> {
            if (webElementFacade.getText().contains(optionSelected)){
                webElementFacade.click();
                return;
            }
        });*/
    }

    public static SelectDocumentType selectDocumentType(String documentType) {
        return new SelectDocumentType(documentType);
    }
}
