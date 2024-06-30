package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ThirdStepPage extends PageObject {

    public static final Target DIV_OS = Target.the("Place to select and write the Operative System")
            .located(By.xpath("//div[@placeholder='Select OS']"));

    public static final Target INPUT_OS = Target.the("Place to select and write the Operative System")
            .located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target DIV_VERSION = Target.the("Place to select and write the version for the Operative System")
            .located(By.xpath("//div[@placeholder='Select a Version']"));

    public static final Target INPUT_VERSION = Target.the("Place to select and write the version for the Operative System")
            .located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final Target DIV_LANGUAGE = Target.the("Place to select and write the language for the Operative System")
            .located(By.xpath("//div[@placeholder='Select OS language']"));

    public static final Target INPUT_LANGUAGE = Target.the("Place to select and write the language of the movil device")
            .located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target DIV_BRAND = Target.the("Place to select and write the brand of the movil device")
            .located(By.xpath("//div[@placeholder='Select Brand']"));

    public static final Target INPUT_BRAND = Target.the("Place to select and write the brand of the movil device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target DIV_MODEL = Target.the("Place to select and write the model of the movil device")
            .located(By.xpath("//div[@placeholder='Select a Model']"));

    public static final Target INPUT_MODEL = Target.the("Place to select and write the model of the movil device")
            .located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target DIV_OS_MOBILE = Target.the("Place to select and write the version for the Operative System of the movil device")
            .located(By.xpath("//label[contains(text(),'Operating System:')]//following::div[@placeholder='Select OS']"));

    public static final Target INPUT_OS_MOBILE = Target.the("Place to select and write the version for the Operative System of the movil device")
            .located(By.xpath("//label[contains(text(),'Operating System:')]//following::input[@placeholder='Select OS']"));

    public static final Target BUTTON_SUBMIT = Target.the("Button to go to the final step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
