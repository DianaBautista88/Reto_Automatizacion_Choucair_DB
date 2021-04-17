package co.com.choucair.certification.proyectoDiana.task;

import co.com.choucair.certification.proyectoDiana.userinterface.DevicesPage;
import co.com.choucair.certification.proyectoDiana.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Devices implements Task {

    private String strMobile;
    private String strModel;
    private String strOS;

    public Devices(String strMobile, String strModel, String strOS) {
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOS = strOS;
    }


    public static Devices the(String strMobile, String strModel, String strOS) {
        return Tasks.instrumented(Devices.class,strMobile,strModel,strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(DevicesPage.INPUT_MOBILE));
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strMobile).into(DevicesPage.INPUT_MOBILE),
                Click.on(DevicesPage.INPUT_LISTA),
               // SelectFromOptions.byVisibleText(strMobile).from(DevicesPage.INPUT_MOBILE),
                SelectFromOptions.byVisibleText(strModel).from(DevicesPage.INPUT_MODEL),
                SelectFromOptions.byVisibleText(strOS).from(DevicesPage.INPUT_OS),
                Click.on(DevicesPage.BUTTON_LAST));

    }
}
