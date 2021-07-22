package co.com.choucair.certification.pruebatecnica.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class CompleteData extends PageObject {
    private List<Map<String,String>> form2;

    public CompleteData(List<Map<String,String>> form2){
        this.form2 = form2;
    }

    public static final Target LOGIN_BUTTON = Target.the("boton despliega el formulario de registro")
            .located(By.linkText("Join Today"));

    public static final Target LABEL_FIRST_NAME = Target.the("campo para primer nombre")
            .located(By.id("firstName"));

    public static final Target LABEL_LAST_NAME = Target.the("campo para segundo nombre")
            .located(By.id("lastName"));

    public static final Target LABEL_EMAIL = Target.the("campo para email")
            .located(By.id("email"));

    public static final Target MONTH =  Target.the("campo para email")
            .located(By.id("birthMonth"));

    public static final Target DAY =  Target.the("campo para email")
            .located(By.id("birthDay"));

    public static final Target YEAR =  Target.the("campo para email")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXTL =  Target.the("boton siguiente")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target CITY =  Target.the("campo para Ciudad")
            .located(By.id("city"));


    public static final Target ZIP =  Target.the("campo para Codigo Postal")
            .located(By.id("zip"));


    public static final Target COUNTRY =  Target.the("campo para País")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));

    public static final Target COUNTRY_ITEM =  Target.the("campo para Pais")
            .located(By.xpath("//div[contains(text(),'Colombia')]"));


    public static final Target BUTTON_NEXT_D =  Target.the("boton siguiente")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target OS =  Target.the("campo para Computador")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target OS_ITEM =  Target.the("campo para seleccionar Cmputador")
            .located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target VERSION =  Target.the("campo para Version de Sistema Operativo")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target VERSION_ITEM =  Target.the("Campo para seleccionar version de sistema operativo")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]/div[1]"));

    public static final Target LENGUAGE =  Target.the("campo para Lenguaje")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target LENGUAGE_ITEM =  Target.the("campo para item Lenguaje")
            .located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target MOBILE_DEVICE =  Target.the("campo para marca de Movil")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target MOBILE_DEVICE_CLICK =  Target.the("campo para marca de Movil")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target MOBILE_DEVICE_ITEM =  Target.the("campo para item Marca Movil")
            .located(By.xpath("//div[contains(text(),'Lenovo')]"));

    public static final Target MODEL =  Target.the("campo para modelo")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target MODEL_ITEM =  Target.the("campo para item modelo")
            .located(By.xpath("//div[contains(text(),'IdeaPad K1')]"));

    public static final Target OPERATING_SYSTEM =  Target.the("campo para OS")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target OPERATING_SYSTEM_ITEM =  Target.the("campo para item OS")
            .located(By.xpath("//div[contains(text(),'Android 4.1.1')]"));

    public static final Target BUTTON_NEXT_LASTSTEP =  Target.the("campo para boton siguiente ultima parte")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target PASSWORD =  Target.the("campo para contraseña")
            .located(By.xpath("//input[@id='password']"));

    public static final Target CONFIRM_PASSWORD =  Target.the("campo para confirmar contraseña")
            .located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target STAY_INFORMED =  Target.the("campo para mantenerse informado")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));

    public static final Target TERMS_OF_USE =  Target.the("campo para aceptar terminos de uso")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target PRIVACY_SECURITY =  Target.the("campo para aceptar politicas de privacidad y seguridad")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target BUTTON_COMPLETE =  Target.the("boton para completar")
            .located(By.xpath("//span[contains(text(),'Complete Setup')]"));






}
