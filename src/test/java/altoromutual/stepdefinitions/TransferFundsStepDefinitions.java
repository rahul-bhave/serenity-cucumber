package altoromutual.stepdefinitions;

import altoromutual.tasks.navigation.Navigate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
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

    @And("{actor} user selects account Corporate in the From account")
    public void SelectsAccountCorporateInTheFromAccount(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("800000 Corporate").into(By.id("fromAccount")));
    }

    @And("{actor} user selects account Checking in the To account")
    public void SelectsAccountCheckingInTheToAccount(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("800001 Checking").into(By.id("toAccount")));
    }

    @And("{actor} user adds amount")
    public void UserAddsAmount(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("200").into(By.id("transferAmount")));
    }

    @And("{actor} user clicks on Transfer")
    public void UserClicksOnTransfer(Actor actor) {
        Click.on(new By.ById("transfer"));
    }

    @Then("{actor}user should be presented with Transfer successful screen")
    public void adminUserShouldBePresentedWithTransferSuccessfulScreen(Actor actor) {
        actor.attemptsTo(Navigate.IsFundTransferSuccessful());
    }
}
