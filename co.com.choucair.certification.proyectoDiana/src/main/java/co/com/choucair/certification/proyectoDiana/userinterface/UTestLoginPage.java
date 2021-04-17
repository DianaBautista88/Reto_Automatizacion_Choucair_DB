package co.com.choucair.certification.proyectoDiana.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage  {
    public static final Target JOIN_BUTTON = Target.the("Button that shows us the form to signup").
            located(By.xpath("//a[@href='/signup/personal']"));

    public static final Target INPUT_FIRST_NAME = Target.the("Where the user writes the first name").
            located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Where the user writes the last name").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Where the user writes the email").
            located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Where the user writes the Month of his birthday").
            located(By.name("birthMonth"));

    public static final Target INPUT_DAY= Target.the("Where the user writes the Day of his birthday").
            located(By.name("birthDay"));

    public static final Target INPUT_YEAR = Target.the("Where the user writes the Year of his birthday").
            located(By.name("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to continue").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
