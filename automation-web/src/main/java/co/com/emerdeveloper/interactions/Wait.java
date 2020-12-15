package co.com.emerdeveloper.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.slf4j.LoggerFactory;

public class Wait implements Interaction {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Wait.class);

    private int time;

    public Wait(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

    public static Wait miliseconds(int miliseconds) {
        return Tasks.instrumented(Wait.class, miliseconds);
    }

    public static Wait seconds(int seconds) {
        return Tasks.instrumented(Wait.class, seconds * 1000);
    }

    public static Wait minutes(int minutes) {
        return Tasks.instrumented(Wait.class, minutes * 1000 * 60);
    }
}
