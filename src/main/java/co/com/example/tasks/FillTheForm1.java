package co.com.example.tasks;

import co.com.example.userinterfaces.RegisterPage1;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTheForm1 implements Task {


    private final List<Map<String, String>> datatable;

    public FillTheForm1(DataTable datatable) {
        this.datatable = datatable.asMaps(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datatable.get(0).get("name")).into(RegisterPage1.FirstName),
                Enter.theValue(datatable.get(0).get("lastname")).into(RegisterPage1.LastName),
                Enter.theValue(datatable.get(0).get("email")).into(RegisterPage1.Email),
                SelectFromOptions.byVisibleText(datatable.get(0).get("month")).from(RegisterPage1.MonthButton),
                SelectFromOptions.byVisibleText(datatable.get(0).get("day")).from(RegisterPage1.Day),
                SelectFromOptions.byVisibleText(datatable.get(0).get("year")).from(RegisterPage1.Year),
                Click.on(RegisterPage1.Input),
                Enter.theValue(datatable.get(0).get("language")).into(RegisterPage1.Input).thenHit(Keys.ENTER),
                Scroll.to(RegisterPage1.NextStep).andAlignToTop(),
                Click.on(RegisterPage1.NextStep)
        );
    }
    public static FillTheForm1 info(DataTable datatable){
        return instrumented(FillTheForm1.class, datatable);
    }
}
