package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage2 extends PageObject {
    public static final Target City = Target.the("City Label").located(By.name("city"));
    public static final Target CityList = Target.the("City List").located(By.xpath("(//div[@class='pac-container pac-logo'])[1]"));
    public static final Target Zip = Target.the("Zip Label").located(By.name("zip"));
    public static final Target Input = Target.the("Country Label").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target NextStep = Target.the("Next Step").located(By.xpath("//a[@role='button']"));
}
