package co.com.emerdeveloper.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Maximize implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ThucydidesWebDriverSupport.getProxiedDriver().manage().window().maximize();
    }

    public static Maximize navigator() {
        return Tasks.instrumented(Maximize.class);
    }
}
