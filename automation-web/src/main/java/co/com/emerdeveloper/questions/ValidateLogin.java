package co.com.emerdeveloper.questions;

import co.com.emerdeveloper.exceptions.AuthenticationException;
import co.com.emerdeveloper.interactions.Wait;
import co.com.emerdeveloper.userinterface.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matchers;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ValidateLogin implements Question<Boolean> {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Wait.class);

    private String expectedValue;

    public ValidateLogin(List<List<String>> data) {
        this.expectedValue = data.get(1).get(0);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.should(
                    GivenWhenThen.seeThat(
                            ValidateText.inWebSite(AuthenticationPage.LABEL_DATE_AND_TIME),
                                    Matchers.containsString(expectedValue))
            );
            actor.attemptsTo(Wait.seconds(5));
            return true;
        } catch (Exception e) {
            log.error(AuthenticationException.LOGIN, e);
            return false;
        }
    }

    public static ValidateLogin inWenSite(List<List<String>> data) {
        return new ValidateLogin(data);
    }
}
