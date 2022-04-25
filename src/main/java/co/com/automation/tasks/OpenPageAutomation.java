package co.com.automation.tasks;

import co.com.automation.userinterface.PageAutomation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageAutomation implements Task {
    private PageAutomation pageAutomation;

    public static OpenPageAutomation thepage(){
        return Tasks.instrumented(OpenPageAutomation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageAutomation),
                Click.on(PageAutomation.BUTTON_REGISTER));
    }



}
