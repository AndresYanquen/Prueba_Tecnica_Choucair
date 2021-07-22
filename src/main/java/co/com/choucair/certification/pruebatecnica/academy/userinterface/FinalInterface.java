package co.com.choucair.certification.pruebatecnica.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalInterface {
    private FinalInterface(){}

    public static final Target LABEL_FINAL = Target.the("texto final de registro existoso")
            .located(By.xpath("//strong[contains(text(),'As a new tester, we recommend that you follow thes')]"));
}
