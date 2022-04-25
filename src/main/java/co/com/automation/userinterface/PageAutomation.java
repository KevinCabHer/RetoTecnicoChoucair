package co.com.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



@DefaultUrl("http://demo.automationtesting.in/Index.html")
public class PageAutomation extends PageObject{

    public static final Target BUTTON_REGISTER = Target.the("Boton para ingresar al registro")
            .located(By.id("btn2"));
}