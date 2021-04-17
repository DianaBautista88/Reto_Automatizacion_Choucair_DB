package co.com.choucair.certification.proyectoDiana.task;

import co.com.choucair.certification.proyectoDiana.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public Login(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }


    public static Login  onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(Login.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UTestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestLoginPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestLoginPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestLoginPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestLoginPage.INPUT_YEAR),
                /*Enter.theValue(strMonth).into(UTestLoginPage.INPUT_MONTH),
                Enter.theValue(strDay).into(UTestLoginPage.INPUT_DAY),
                Enter.theValue(strYear).into(UTestLoginPage.INPUT_YEAR),*/
                Click.on(UTestLoginPage.BUTTON_NEXT_LOCATION));
    }
}
