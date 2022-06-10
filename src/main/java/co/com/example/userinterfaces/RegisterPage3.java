package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage3 extends PageObject {
    public static final Target ComputerButton = Target.the("S.O").locatedBy(".ui-select-box");
    public static final Target Computer = Target.the("S.O").locatedBy("//div[text()={0}]]");
    public static final Target VersionButton = Target.the("S.O Version Button").locatedBy(".ui-select-box");
    public static final Target Version = Target.the("S.O Version").locatedBy("//div[text()={0}]]");
}
