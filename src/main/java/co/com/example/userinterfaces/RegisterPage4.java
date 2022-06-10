package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage4 extends PageObject {
    public static final Target Password = Target.the("Password Label").locatedBy("#password");
    public static final Target ConfirmPassword = Target.the("Confirm Password Label").locatedBy("#confirmPassword");
    public static final Target FullyRegisterButton = Target.the("Register Button").locatedBy("#laddaBtn");
}
