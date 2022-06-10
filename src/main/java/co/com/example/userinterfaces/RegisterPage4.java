package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage4 extends PageObject {
    public static final Target Password = Target.the("Password Label").located(By.id("password"));
    public static final Target ConfirmPassword = Target.the("Confirm Password Label").located(By.id("confirmPassword"));
    public static final Target CheckMark1 = Target.the("Check Mark 1").located(By.name("termOfUse"));
    public static final Target CheckMark2 = Target.the("Check Mark 2").located(By.name("privacySetting"));
    public static final Target FullyRegisterButton = Target.the("Register Button").located(By.id("laddaBtn"));

}
