package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SecondStepPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("Place to write the city")
            .located(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid']"));

    public static final Target INPUT_ZIP = Target.the("Place to write the Zip or Postal Code")
            .located(By.id("zip"));

    public static final Target DIV_COUNTRY = Target.the("Place to click to write the Country")
            .located(By.xpath("//div[@placeholder='Select a country']"));

    public static final Target INPUT_COUNTRY = Target.the("Place to write the Country")
            .located(By.xpath("//input[@placeholder='Select a country']"));

    public static final Target BUTTON_SUBMIT = Target.the("Button to go to the third step")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target FIRST_ELEMENT = Target.the("First option").located(By.xpath("//div[@id='cdk-overlay-0']/ngf-options-container/ngf-option/div"));
}
