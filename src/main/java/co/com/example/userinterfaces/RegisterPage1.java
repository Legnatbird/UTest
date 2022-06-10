package co.com.example.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage1 extends PageObject {
    public static final Target FirstName = Target.the("First Name Label").located(By.cssSelector("#firstName"));
    public static final Target LastName = Target.the("Last Name Label").located(By.cssSelector("#lastName"));
    public static final Target Email = Target.the("Email Label").located(By.cssSelector("#email"));
    public static final Target MonthButton = Target.the("Month Button").located(By.cssSelector("#birthMonth"));
    public static final Target Day = Target.the("Day Label").located(By.cssSelector("#birthDay"));
    public static final Target Year = Target.the("Year Label").located(By.cssSelector("#birthYear"));
    public static final Target Input = Target.the("Language Label").located(By.xpath("//input[@type='search']"));
    public static final Target NextStep = Target.the("Next Step").located(By.xpath("//a[@class='btn btn-blue']"));
}
