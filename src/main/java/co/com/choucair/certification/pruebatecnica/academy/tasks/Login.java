package co.com.choucair.certification.pruebatecnica.academy.tasks;

import co.com.choucair.certification.pruebatecnica.academy.userinterface.CompleteData;
import co.com.choucair.certification.pruebatecnica.academy.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class Login implements Task {


    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CompleteData.LOGIN_BUTTON),
                Enter.theValue("Andres").into(CompleteData.LABEL_FIRST_NAME),
                Enter.theValue("Yanquen").into(CompleteData.LABEL_LAST_NAME),
                Enter.theValue("andres.yanquen@hotmail.com").into(CompleteData.LABEL_EMAIL),
                SelectFromOptions.byVisibleText("June").from(CompleteData.MONTH),
                SelectFromOptions.byVisibleText("23").from(CompleteData.DAY),
                SelectFromOptions.byVisibleText("1996").from(CompleteData.YEAR),
                Click.on(CompleteData.BUTTON_NEXTL),
                JavaScriptClick.on(CompleteData.CITY),
                Enter.theValue("Medellin").into(CompleteData.CITY),
                Hit.the(Keys.ARROW_DOWN).into(CompleteData.CITY),
                JavaScriptClick.on(CompleteData.ZIP),
                JavaScriptClick.on(CompleteData.ZIP),
                Enter.theValue("050015").into(CompleteData.ZIP),
                Enter.theValue("050015").into(CompleteData.ZIP),

                Click.on(CompleteData.COUNTRY),
                Click.on(CompleteData.COUNTRY_ITEM),




                //Hit.the(Keys.ARROW_DOWN).into(CompleteData.COUNTRY),
                Click.on(CompleteData.BUTTON_NEXT_D),

                JavaScriptClick.on(CompleteData.OS),
                Click.on(CompleteData.OS_ITEM),
                JavaScriptClick.on(CompleteData.VERSION),
                //Click.on(CompleteData.VERSION),

                Click.on(CompleteData.VERSION_ITEM),
                JavaScriptClick.on(CompleteData.LENGUAGE),
                Click.on(CompleteData.LENGUAGE_ITEM),

                JavaScriptClick.on(CompleteData.MOBILE_DEVICE),
                Click.on(CompleteData.MOBILE_DEVICE),

                Click.on(CompleteData.MOBILE_DEVICE_ITEM),



                JavaScriptClick.on(CompleteData.MODEL),
                Click.on(CompleteData.MODEL),
                Click.on(CompleteData.MODEL_ITEM),
                JavaScriptClick.on(CompleteData.OPERATING_SYSTEM),
                Click.on(CompleteData.OPERATING_SYSTEM),
                Click.on(CompleteData.OPERATING_SYSTEM_ITEM),

                Click.on(CompleteData.BUTTON_NEXT_LASTSTEP)







                //Check.whether(valueOf(CompleteData.VERSION_PC),isCurrentlyEnabled())
                //        .andIfSo(Click.on(CompleteData.SELECT_VERSION))



        );



    }




}
