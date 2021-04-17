package co.com.choucair.certification.proyectoDiana.stepdefinitions;

import co.com.choucair.certification.proyectoDiana.model.UtestData;
import co.com.choucair.certification.proyectoDiana.task.Devices;
import co.com.choucair.certification.proyectoDiana.task.Login;
import co.com.choucair.certification.proyectoDiana.task.OpenUp;
import co.com.choucair.certification.proyectoDiana.task.Adresss;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
@Before
public void setStage() {

    OnStage.setTheStage(new OnlineCast());
}

    @Given("^than Diana wants to create a new user in Utest webpage$")
    public void than_Diana_wants_to_create_a_new_user_in_Utest_webpage(List<UtestData> utestDataList) {
        OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.ThePage(),(Login.onThePage(utestDataList.get(0).getStrFirstName(), utestDataList.get(0).getStrLastName(),utestDataList.get(0).getStrEmail(),utestDataList.get(0).getStrMonth(),utestDataList.get(0).getStrDay(),utestDataList.get(0).getStrYear())));

    }
    @When("^she tell about herself she add the address$")
    public void sheTellAboutHerselfSheAddTheAddress(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Adresss.the(utestDataList.get(0).getStrCity()));
    }



    @When("^she tell about her devices$")
    public void she_tell_about_her_devices(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Devices.the(utestDataList.get(0).getStrMobile(),utestDataList.get(0).getStrModel(),utestDataList.get(0).getStrOS()));
    }
/*
    @When("^she create a password$")
    public void she_create_a_password(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(utestDataList.get(0).getStrCourse()));
    }

    @Then("^she enter to the platform$")
    public void she_enter_to_the_platform(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestDataList.get(0).getStrCourse())));
    }
*/

}
