package altoromutual.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;


public class Navigate {

    public static Performable IsOnTheBankPage() {
        return Open.url("http://altoromutual.com/bank/main.jsp");
    }

    public static Performable IsOnTransferFundPage() {
        return Open.url("http://altoromutual.com/bank/transfer.jsp");
    }

    public static Performable IsFundTransferSuccessful() {
        return Open.url("http://altoromutual.com/bank/doTransfer");
    }
}
