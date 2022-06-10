package co.com.example.tasks;

import co.com.example.userinterfaces.RegisterPage2;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheForm2 implements Task {


    private final List<Map<String, String>> datatable;

    public FillTheForm2(DataTable datatable) {
        this.datatable = datatable.asMaps(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datatable.get(0).get("city")).into(RegisterPage2.City),
                WaitUntil.the(RegisterPage2.CityList, isPresent()),
                Hit.the(Keys.ARROW_DOWN).keyIn(RegisterPage2.City),
                Hit.the(Keys.ENTER).keyIn(RegisterPage2.City),
                Enter.theValue(datatable.get(0).get("zip")).into(RegisterPage2.Zip).thenHit(Keys.TAB).thenHit(Keys.ENTER),
                WaitUntil.the(RegisterPage2.Input, isVisible()),
                Enter.theValue(datatable.get(0).get("country")).into(RegisterPage2.Input).thenHit(Keys.ENTER),
                Scroll.to(RegisterPage2.NextStep).andAlignToTop(),
                Click.on(RegisterPage2.NextStep)
        );
    }
    public static FillTheForm2 info(DataTable datatable){
        return instrumented(FillTheForm2.class, datatable);
    }
}
