package co.com.emerdeveloper.stepdefinitions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Managed(driver = "appium")
    private static WebDriver thePhone;
    private boolean beforeAll = true;

    @Before
    public void setUp() {
        if(beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    thePhone.quit();
                    thePhone = null;
                }
            });
        }

        OnStage.setTheStage(new OnlineCast());
    }

    public static WebDriver getThePhone() {
        return thePhone;
    }

    @After
    public void logOut() {
        WebDriver facade = getProxiedDriver();
        ((AppiumDriver<?>) facade).closeApp();
        ((AppiumDriver<?>) facade).launchApp();
    }


}
