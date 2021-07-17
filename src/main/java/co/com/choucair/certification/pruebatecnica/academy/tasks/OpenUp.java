package co.com.choucair.certification.pruebatecnica.academy.tasks;

import co.com.choucair.certification.pruebatecnica.academy.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UTestPage uTestPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));

    }

    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }
}
