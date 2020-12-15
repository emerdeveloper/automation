package co.com.emerdeveloper.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidateExistingElement implements Question<Boolean> {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ValidateExistingElement.class);

    private Target element;

    public ValidateExistingElement(Target element) {
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(WaitUntil.the(element, isPresent()).forNoMoreThan(10).seconds());
        } catch (Exception ex){
            log.error(ex.toString());
        }
        return  element.resolveFor(actor).isVisible();
    }

    public static ValidateExistingElement validateElement(Target element) {
        return new ValidateExistingElement(element);
    }
}
