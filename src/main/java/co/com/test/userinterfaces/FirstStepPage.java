package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirstStepPage extends PageObject {

    public static final Target ACCEPT_COOKIES = Target.the("Accept all cookies")
            .located(By.xpath("//*[@id='onetrust-accept-btn-handler']"));

    public static final Target JOIN_TODAY_BUTTON = Target.the("Link to go to the login form")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRSTNAME = Target.the("Place to write the user´s first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Place to write the user´s last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Place to write the user´s email address")
            .located(By.id("email"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("Place to select the user´s birth month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_BIRTH_DAY = Target.the("Place to select the user´s birth day")
            .located(By.id("birthDay"));

    public static final Target SELECT_BIRTH_YEAR = Target.the("Place to select the user´s birth year")
            .located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGES = Target.the("Place to write the languages (spoken)")
            .located(By.xpath("//div[@aria-label='Add languages']//following::input"));

    public static final Target SUBMIT_BUTTON = Target.the("Button to go to the second step")
            .located(By.xpath("//button//*[contains(text(), 'Next: Location')]"));


}
