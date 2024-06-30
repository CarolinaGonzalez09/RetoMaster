package co.com.test.tasks;

import co.com.test.models.DataFourthStep;
import co.com.test.userinterfaces.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class FullStep4 implements Task {

private DataFourthStep dataFourthStep;

    public FullStep4(DataFourthStep dataFourthStep) {
        this.dataFourthStep = dataFourthStep;
    }

    public static FullStep4 complete(DataFourthStep dataFourthStep) {
        return Tasks.instrumented(FullStep4.class, dataFourthStep);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataFourthStep.getPassword()).into(FourthStepPage.INPUT_PASSWORD),
                Enter.theValue(dataFourthStep.getConfirmPassword()).into(FourthStepPage.INPUT_CONFIRMED_PASSWORD),
                Click.on(FourthStepPage.CHECK_STAY_INFORMED),
                Click.on(FourthStepPage.CHECK_TERMS_OF_USE),
                Click.on(FourthStepPage.CHECK_PRIVACY_POLICY),
                Scroll.to(FourthStepPage.SUBMIT_BUTTON),
                Click.on(FourthStepPage.SUBMIT_BUTTON)
        );
    }
}
