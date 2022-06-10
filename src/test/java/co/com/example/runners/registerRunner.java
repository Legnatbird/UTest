package co.com.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Register.feature",
        glue = "co.com.example",
        snippets = SnippetType.CAMELCASE
)
public class registerRunner {
}
