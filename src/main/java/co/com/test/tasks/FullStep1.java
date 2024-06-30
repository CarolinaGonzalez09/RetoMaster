package co.com.test.tasks;

import co.com.test.models.DataFirstStep;
import co.com.test.userinterfaces.FirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FullStep1 implements Task {

private DataFirstStep dataFirstStep;

    public FullStep1(DataFirstStep dataFirstStep) {
        this.dataFirstStep = dataFirstStep;
    }

    public static FullStep1 complete(DataFirstStep dataFirstStep) {
        return Tasks.instrumented(FullStep1.class, dataFirstStep);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FirstStepPage.ACCEPT_COOKIES, isVisible()).forNoMoreThan(30).seconds().then(Click.on(FirstStepPage.ACCEPT_COOKIES)),
                WaitUntil.the(FirstStepPage.JOIN_TODAY_BUTTON, isVisible()).forNoMoreThan(30).seconds().then(Click.on(FirstStepPage.JOIN_TODAY_BUTTON)),
                Enter.theValue(dataFirstStep.getFirstName()).into(FirstStepPage.INPUT_FIRSTNAME),
                Enter.theValue(dataFirstStep.getLastName()).into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue(dataFirstStep.getEmailAddress()).into(FirstStepPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(dataFirstStep.getBirthMonth()).from(FirstStepPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(dataFirstStep.getBirthDay()).from(FirstStepPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(dataFirstStep.getBirthYear()).from(FirstStepPage.SELECT_BIRTH_YEAR),
                Scroll.to(FirstStepPage.SUBMIT_BUTTON).then(Click.on(FirstStepPage.SUBMIT_BUTTON))
        );
    }
}
