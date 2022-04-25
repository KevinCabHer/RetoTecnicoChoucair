package co.com.automation.tasks;

import co.com.automation.model.Date_Register;
import co.com.automation.userinterface.PageAutomation;
import co.com.automation.userinterface.PageRegister;
import com.gargoylesoftware.htmlunit.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.automation.userinterface.PageRegister.*;

public class PageRegisterDate implements Task {

    private List<Date_Register> date;

    public PageRegisterDate(List<Date_Register> date) {
        this.date = date;
    }

    public static PageRegisterDate thepage(List<Date_Register> date) {
        return Tasks.instrumented(PageRegisterDate.class,date);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(date.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(date.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(date.get(0).getStrDireccion()).into(DIRECCION),
                Enter.theValue(date.get(0).getStrCorreo()).into(CORREO),
                Enter.theValue(date.get(0).getStrTelefono()).into(TELEFONO),
                Click.on(CHECK_BOX_GENERO),
                Click.on(CHECK_BOX_AFICION),
                Click.on(CONTENEDOR_IDIOMA),
                Click.on(IDIOMA),
                SelectFromOptions.byVisibleText(date.get(0).getStrHabilidades()).from(HABILIDADES),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(date.get(0).getStrPais()).into(PAIS),
                Hit.the(Keys.ENTER).into(PAIS),
                SelectFromOptions.byVisibleText(date.get(0).getStrAno()).from(ANO),
                SelectFromOptions.byVisibleText(date.get(0).getStrMes()).from(MES),
                SelectFromOptions.byVisibleText(date.get(0).getStrDia()).from(DIA),
                Enter.theValue(date.get(0).getStrClave1()).into(CLAVE1),
                Enter.theValue(date.get(0).getStrClave2()).into(CLAVE2),
                Click.on(BUTTON_SUMIT)

        );

    }
}
