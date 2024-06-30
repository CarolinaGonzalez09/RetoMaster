package co.com.test.questions;

import co.com.test.models.ResponseModel;
import co.com.test.userinterfaces.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private ResponseModel response;

    public Answer(ResponseModel response) {
        this.response = response;
    }

    public static Answer toThe(ResponseModel responseModel) {
        return new Answer(responseModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeMessage = Text.of(FourthStepPage.WELCOME_MESSAGE).answeredBy(actor).toString();
        return response.getResponseMessage().equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
