package co.com.choucair.certification.pruebatecnica.academy.tasks;

import co.com.choucair.certification.pruebatecnica.academy.userinterface.CompleteData;
import co.com.choucair.certification.pruebatecnica.academy.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;
import net.thucydides.core.annotations.Managed;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;


import java.sql.Time;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class Login implements Task {

    private List<Map<String,String>> data;

    public Login(List<Map<String,String>> data){
        this.data = data;
    }

    public static Login onThePage(List<Map<String,String>> data) {
        return Tasks.instrumented(Login.class,data );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(CompleteData.LOGIN_BUTTON),
                Enter.theValue(data.get(0).get("Nombre")).into(CompleteData.LABEL_FIRST_NAME),
                Enter.theValue(data.get(0).get("Apellido")).into(CompleteData.LABEL_LAST_NAME),
                Enter.theValue(data.get(0).get("Correo")).into(CompleteData.LABEL_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).get("Mes")).from(CompleteData.MONTH),
                SelectFromOptions.byVisibleText(data.get(0).get("Dia")).from(CompleteData.DAY),
                SelectFromOptions.byVisibleText(data.get(0).get("Annio")).from(CompleteData.YEAR),
                Click.on(CompleteData.BUTTON_NEXTL),
                JavaScriptClick.on(CompleteData.CITY),
                Enter.theValue(data.get(0).get("Ciudad")).into(CompleteData.CITY),
                Hit.the(Keys.ARROW_DOWN).into(CompleteData.CITY),
                JavaScriptClick.on(CompleteData.ZIP),
                JavaScriptClick.on(CompleteData.ZIP),
                Enter.theValue(data.get(0).get("ZIP")).into(CompleteData.ZIP),
                Enter.theValue(data.get(0).get("ZIP")).into(CompleteData.ZIP),

                Click.on(CompleteData.COUNTRY),
                Click.on(CompleteData.COUNTRY_ITEM),

                Click.on(CompleteData.BUTTON_NEXT_D),

                JavaScriptClick.on(CompleteData.OS),
                Click.on(CompleteData.OS_ITEM),
                JavaScriptClick.on(CompleteData.VERSION),
                //Click.on(CompleteData.VERSION),

                Click.on(CompleteData.VERSION_ITEM),
                JavaScriptClick.on(CompleteData.LENGUAGE),
                Click.on(CompleteData.LENGUAGE_ITEM),
                JavaScriptClick.on(CompleteData.MOBILE_DEVICE),
                JavaScriptClick.on(CompleteData.MOBILE_DEVICE),
                Click.on(CompleteData.MOBILE_DEVICE_ITEM),

                JavaScriptClick.on(CompleteData.MODEL),
                JavaScriptClick.on(CompleteData.MODEL),
                Click.on(CompleteData.MODEL_ITEM),

                JavaScriptClick.on(CompleteData.OPERATING_SYSTEM),
                JavaScriptClick.on(CompleteData.OPERATING_SYSTEM),
                Click.on(CompleteData.OPERATING_SYSTEM_ITEM),

                Click.on(CompleteData.BUTTON_NEXT_LASTSTEP),

                JavaScriptClick.on(CompleteData.PASSWORD),
                Enter.keyValues(data.get(0).get("Contrasena")).into(CompleteData.PASSWORD),

                JavaScriptClick.on(CompleteData.CONFIRM_PASSWORD),
                Enter.keyValues(data.get(0).get("Contrasena")).into(CompleteData.CONFIRM_PASSWORD),

                JavaScriptClick.on(CompleteData.STAY_INFORMED),
                JavaScriptClick.on(CompleteData.TERMS_OF_USE),
                JavaScriptClick.on(CompleteData.PRIVACY_SECURITY),

                Click.on(CompleteData.BUTTON_COMPLETE)

        );



    }




}
