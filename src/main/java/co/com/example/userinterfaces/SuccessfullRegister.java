package co.com.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessfullRegister {
    public static final Target Welcome = Target.the("Welcome Message").located(By.className("welcome-page"));
}
