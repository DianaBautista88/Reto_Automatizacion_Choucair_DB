package co.com.choucair.certification.proyectoDiana.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdressPage {

       public static final Target INPUT_COUNTRY = Target.the("Input to write the Country").
               located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

       public static final Target BUTTON_NEXT_DEVICES = Target.the("Button to continue").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));


}
