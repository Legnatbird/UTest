package co.com.example.tasks;

import co.com.example.userinterfaces.RegisterPage4;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheForm4 implements Task {


    private final List<Map<String, String>> datatable;

    public FillTheForm4(DataTable datatable) {
        this.datatable = datatable.asMaps(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(datatable.get(0).get("password")).into(RegisterPage4.Password),
            Enter.theValue(datatable.get(0).get("password")).into(RegisterPage4.ConfirmPassword),
            Scroll.to(RegisterPage4.FullyRegisterButton).andAlignToTop(),
            Click.on(RegisterPage4.CheckMark1),
            Click.on(RegisterPage4.CheckMark2),
            Click.on(RegisterPage4.FullyRegisterButton)
        );
    }
    public static FillTheForm4 info(DataTable datatable){
        return instrumented(FillTheForm4.class, datatable);
    }
}
