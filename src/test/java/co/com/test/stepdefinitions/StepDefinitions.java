package co.com.test.stepdefinitions;

import co.com.test.models.*;
import co.com.test.questions.Answer;
import co.com.test.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitions {
    
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    
    @Given("That I want to register myself on the website")
    public void thatIWantToRegisterMyselfOnTheWebsite() {
        OnStage.theActorCalled("Carolina").wasAbleTo(OpenUp.thePage());
    }

    @When("She complete the first part of the registry")
    public void sheCompleteTheFirstPartOfTheRegistry(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep1.complete(DataFirstStep.setData(dataTable).get(0)));
    }
    @When("She complete the second part")
    public void sheCompleteTheSecondPart(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep2.complete(DataSecondStep.setData(dataTable).get(0)));
    }
    @When("She complete the third part")
    public void sheCompleteTheThirdPart(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep3.complete(DataThirdStep.setData(dataTable).get(0)));
    }
    @When("She complete the fourth part")
    public void sheCompleteTheFourthPart(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep4.complete(DataFourthStep.setData(dataTable).get(0)));
    }
    @Then("She can see the welcome message on the website")
    public void sheCanSeeTheWelcomeMessageOnTheWebsite(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(ResponseModel.setData(dataTable).get(0))));

    }

}
