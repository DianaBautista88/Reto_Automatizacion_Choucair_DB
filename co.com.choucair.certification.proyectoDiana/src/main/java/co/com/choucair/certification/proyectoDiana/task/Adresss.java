package co.com.choucair.certification.proyectoDiana.task;

import co.com.choucair.certification.proyectoDiana.userinterface.AdressPage;
import co.com.choucair.certification.proyectoDiana.userinterface.DevicesPage;
import co.com.choucair.certification.proyectoDiana.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Adresss implements Task {


    private String strCity;

    public Adresss(String course) {
        this.strCity = strCity;
    }

    public static Adresss the(String strCity) {
        return Tasks.instrumented(Adresss.class,strCity);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//SelectFromOptions.byVisibleText(strCity).from(AdressPage.INPUT_COUNTRY),
                //Enter.theValue(strCity).into(AdressPage.INPUT_COUNTRY),
                Click.on(AdressPage.BUTTON_NEXT_DEVICES));
    }


}
