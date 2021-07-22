package co.com.choucair.certification.pruebatecnica.academy.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.academy.tasks.Login;
import co.com.choucair.certification.pruebatecnica.academy.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnica.academy.userinterface.CompleteData;
import co.com.choucair.certification.pruebatecnica.academy.userinterface.UTestPage;
import cucumber.api.java.Before;
import co.com.choucair.certification.pruebatecnica.academy.questions.Answer;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;
import java.util.Map;

public class UTestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Andres desea registrarse en la pagina UTest$")
    public void queAndresDeseaRegistrarseEnLaPaginaUTest() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^realiza el registro en la pagina$")
    public void realizaElRegistroEnLaPagina(List<Map<String,String>> data) {
       OnStage.theActorInTheSpotlight().attemptsTo(((Login.onThePage(data))));
    }

    @Entonces("^el verifica que se realizo el registro con la pantalla (.*)$")
    public void elVerificaQueSeRealizoElRegistroConLaPantallaDeRegistroExitoso(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
