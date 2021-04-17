package co.com.choucair.certification.proyectoDiana.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage  {
    public static final Target INPUT_MOBILE = Target.the("Button that shows us the form to signup").
            located(By.xpath("//div[@class='ui-select-box' and contains(text(),'Select Brand')]"));
  /*  located(By.xpath("//input[@placeholder='Select Brand']"));
    located(By.xpath("//input[@placeholder='uid']"));
    located(By.xpath("//div[@class='ui-select-match' and contains(text(),'Select Brand')]"));
    located(By.xpath("//div[@class='ui-select-box' and contains(text(),'Select Brand')]"));
*/



    public static final Target INPUT_LISTA = Target.the("Where the user writes the first name").
            located(By.xpath("//*[@id=\"ui-select-choices-row-35-0\"]/span/div"));

    public static final Target INPUT_MODEL = Target.the("Where the user writes the first name").
            located(By.id("firstName"));

    public static final Target INPUT_OS = Target.the("Where the user writes the last name").
            located(By.id("lastName"));


    public static final Target BUTTON_LAST = Target.the("Button to continue").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
