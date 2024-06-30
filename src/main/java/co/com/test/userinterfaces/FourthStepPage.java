package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FourthStepPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Place to write the user password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("Place to confirm the previous password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("Place is a desire of the user to stay informed")
            .located(By.name("newsletterOptIn"));

    public static final Target CHECK_TERMS_OF_USE = Target.the("Place to read and accept the terms of use")
            .located(By.name("termOfUse"));

    public static final Target CHECK_PRIVACY_POLICY = Target.the("Place to read and accept the privacy & security policy")
            .located(By.name("privacySetting"));

    public static final Target SUBMIT_BUTTON = Target.the("Place that must be accepted to finish the registry process")
            .located(By.id("laddaBtn"));

    public static final Target WELCOME_MESSAGE = Target.the("This is the message of UTest.com")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));





}
