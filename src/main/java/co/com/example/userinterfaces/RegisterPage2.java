package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage2 extends PageObject {
    public static final Target City = Target.the("City Label").locatedBy("#city");
    public static final Target Zip = Target.the("Zip Label").locatedBy("#zip");
    public static final Target CountryButton = Target.the("Country Label").locatedBy(".ui-select");
    public static final Target Country = Target.the("Country Label").locatedBy("//div[text()={0}]]");
}
