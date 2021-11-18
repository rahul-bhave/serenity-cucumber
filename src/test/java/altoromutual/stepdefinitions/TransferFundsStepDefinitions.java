package altoromutual.stepdefinitions;

import altoromutual.tasks.navigation.Navigate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class TransferFundsStepDefinitions {

    @And("{actor} user is on the Bank Page")
    public void UserIsOnTheBankPage(Actor actor) {
        actor.attemptsTo(
                Navigate.IsOnTheBankPage()
        );
    }


    @When("{actor} user clicks on Transfer Fund link")
    public void adminUserClicksOnTransferFundLink(Actor actor) {
        Click.on(new By.ById("MenuHyperLink3"));
    }

    @And("{actor} user is on the Transfer Fund Page")
    public void UserIsOnTheTransferFundPage(Actor actor) {
        actor.attemptsTo(
                Navigate.IsOnTransferFundPage()
        );
    }
}
