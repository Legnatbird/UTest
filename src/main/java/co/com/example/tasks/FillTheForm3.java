package co.com.example.tasks;

import co.com.example.userinterfaces.RegisterPage3;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheForm3 implements Task {


    private final List<Map<String, String>> datatable;

    public FillTheForm3(DataTable datatable) {
        this.datatable = datatable.asMaps(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage3.Computer),
                WaitUntil.the(RegisterPage3.ComputerInput, isVisible()),
                Enter.theValue(datatable.get(0).get("computer")).into(RegisterPage3.ComputerInput).thenHit(Keys.ENTER),
                Click.on(RegisterPage3.Version),
                WaitUntil.the(RegisterPage3.VersionInput,isVisible()),
                Enter.theValue(datatable.get(0).get("version")).into(RegisterPage3.VersionInput).thenHit(Keys.ENTER),
                Click.on(RegisterPage3.Language),
                WaitUntil.the(RegisterPage3.LanguageInput,isVisible()),
                Enter.theValue(datatable.get(0).get("language")).into(RegisterPage3.LanguageInput).thenHit(Keys.ENTER),
                Click.on(RegisterPage3.NextStep)
        );
    }
    public static FillTheForm3 info(DataTable datatable){
        return instrumented(FillTheForm3.class, datatable);
    }
}
