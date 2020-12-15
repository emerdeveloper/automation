package co.com.emerdeveloper.task;

import co.com.emerdeveloper.interactions.Maximize;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWebSite implements Task {

    private static final String WEB_SITE = "https://testsucursalvirtualinversiones.mybluemix.net/#/auth";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(WEB_SITE),
                Maximize.navigator()
        );
    }

    public static OpenWebSite inNavigator() {
        return Tasks.instrumented(OpenWebSite.class);
    }
}
