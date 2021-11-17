package altoromutual.stepdefinitions;

import altoromutual.model.altoromutualuser;
import altoromutual.tasks.authentication.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class AuthenticationStepDefinitions {
    @Given("{actor} is on the login page")
    public void on_the_login_page(Actor actor) {
        actor.attemptsTo(Open.url("http://altoromutual.com/login.jsp"));
    }
    @When("{actor} log in with valid credentials")
    public void log_in_with_valid_credentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(altoromutualuser.ADMIN));

    }
    @Then("{actor} should be presented with welcome screen")
    public void should_be_presented_with_welcome_screen(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of("/html/body/table[2]/tbody/tr/td[2]/div/h1")).isEqualTo("Hello Admin User"));
    }
}
