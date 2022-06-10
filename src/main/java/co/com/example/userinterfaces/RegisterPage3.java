package co.com.example.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage3 extends PageObject {
    public static final Target Computer = Target.the("Computer").located(By.name("osId"));
    public static final Target ComputerInput = Target.the("S.O").located(By.xpath("(//input[@placeholder='Select OS'])[1]"));
    public static final Target Version = Target.the("Version").located(By.name("osVersionId"));
    public static final Target VersionInput = Target.the("Version").located(By.xpath("(//input[@placeholder='Select a Version'])[1]"));
    public static final Target Language = Target.the("Language").located(By.name("osLanguageId"));
    public static final Target LanguageInput = Target.the("Language").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target NextStep = Target.the("Next").located(By.xpath("//a[@ng-click='validateDevices(userForm);']"));
}
