package altoromutual.stepdefinitions;

import altoromutual.tasks.navigation.Navigate;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;

public class TransferFundsStepDefinitions {

    @And("{actor} user is on the Bank Page")
    public void UserIsOnTheBankPage(Actor actor) {
        actor.attemptsTo(
                Navigate.IsOnTheBankPage()
        );
    }


}
