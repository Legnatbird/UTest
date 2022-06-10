package co.com.example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static final Target RegisterButton = Target.the("Register Button").locatedBy(".unauthenticated-nav-bar__sign-up");
}
