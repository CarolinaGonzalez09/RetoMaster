package co.com.test.tasks;

import co.com.test.models.DataThirdStep;
import co.com.test.userinterfaces.ThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FullStep3 implements Task {

    private DataThirdStep dataThirdStep;

    public FullStep3(DataThirdStep dataThirdStep) {
        this.dataThirdStep = dataThirdStep;
    }

    public static FullStep3 complete(DataThirdStep dataThirdStep) {
        return Tasks.instrumented(FullStep3.class, dataThirdStep);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThirdStepPage.DIV_OS),
                Enter.theValue(dataThirdStep.getoSComputer()).into(ThirdStepPage.INPUT_OS),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS),
                Click.on(ThirdStepPage.DIV_VERSION),
                Enter.theValue(dataThirdStep.getVersionOSComputer()).into(ThirdStepPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_VERSION),
                Click.on(ThirdStepPage.DIV_LANGUAGE),
                Enter.theValue(dataThirdStep.getLanguageOSComputer()).into(ThirdStepPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_LANGUAGE),
                Click.on(ThirdStepPage.DIV_BRAND),
                Enter.theValue(dataThirdStep.getBrandMobile()).into(ThirdStepPage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_BRAND),
                Click.on(ThirdStepPage.DIV_MODEL),
                Enter.theValue(dataThirdStep.getModelMobile()).into(ThirdStepPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_MODEL),
                Click.on(ThirdStepPage.DIV_OS_MOBILE),
                Enter.theValue(dataThirdStep.getoSMobile()).into(ThirdStepPage.INPUT_OS_MOBILE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS_MOBILE),
                Click.on(ThirdStepPage.BUTTON_SUBMIT)
        );
    }
}