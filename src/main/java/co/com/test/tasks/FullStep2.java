package co.com.test.tasks;

import co.com.test.models.DataSecondStep;
import co.com.test.userinterfaces.SecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FullStep2 implements Task {

    private DataSecondStep dataSecondStep;

    public FullStep2(DataSecondStep dataSecondStep) {
        this.dataSecondStep = dataSecondStep;
    }

    public static FullStep2 complete(DataSecondStep dataSecondStep) {
        return Tasks.instrumented(FullStep2.class, dataSecondStep);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/ngf-autocomplete/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/button/mat-icon"),
                    WaitUntil.the(SecondStepPage.INPUT_CITY, isClickable()).forNoMoreThan(30).seconds(),
                    Enter.theValue(dataSecondStep.getCity()).into(SecondStepPage.INPUT_CITY),
                    WaitUntil.the(SecondStepPage.FIRST_ELEMENT, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(SecondStepPage.FIRST_ELEMENT),
                    Enter.theValue(dataSecondStep.getZip()).into(SecondStepPage.INPUT_ZIP),
                    Click.on(SecondStepPage.DIV_COUNTRY),
                    Enter.theValue(dataSecondStep.getCountry()).into(SecondStepPage.INPUT_COUNTRY),
                    Hit.the(Keys.ENTER).into(SecondStepPage.INPUT_COUNTRY),
                    Click.on(SecondStepPage.BUTTON_SUBMIT)
            );
        }
    }
