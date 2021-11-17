package altoromutual.tasks.authentication;

import altoromutual.model.altoromutualuser;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Login {
    public static Performable asA(altoromutualuser admin) {
        return Task.where("{0} logs in as"+admin,
                Enter.theValue(admin.username).into(By.id("uid")),
                Enter.theValue(admin.password).into(By.id("passw")),
                Click.on(new By.ByName("btnSubmit")));
    }
}
