package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage2 extends PageObject {
    public static final Target City = Target.the("City Label").locatedBy("#city");
    public static final Target Zip = Target.the("Zip Label").locatedBy("#zip");
    public static final Target Input = Target.the("Country Label").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target NextStep = Target.the("Next Step").located(By.xpath("//a[@role='button']"));
}
