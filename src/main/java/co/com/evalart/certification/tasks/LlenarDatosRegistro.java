package co.com.evalart.certification.tasks;

import co.com.evalart.certification.models.ModeloDatosCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.evalart.certification.userinterfaces.DatosRegistro.*;
import static co.com.evalart.certification.utilities.ConstantesWeb.NUMERO_SEGUNDOS_ESPERA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LlenarDatosRegistro implements Task {


    private final List<ModeloDatosCliente> modeloDatosCliente;

    public LlenarDatosRegistro(List<ModeloDatosCliente> datosRegistro) {
        this.modeloDatosCliente = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(MNU_REGISTRO, isClickable()).forNoMoreThan(NUMERO_SEGUNDOS_ESPERA).seconds(),
                JavaScriptClick.on(MNU_REGISTRO),
                JavaScriptClick.on(TXT_FIRST_NAME),
                Enter.theValue(modeloDatosCliente.get(0).getFirstName()).into(TXT_FIRST_NAME),
                JavaScriptClick.on(TXT_LAST_NAME),
                Enter.keyValues(modeloDatosCliente.get(0).getLastName()).into(TXT_LAST_NAME),
                JavaScriptClick.on(TXT_PHONE),
                Enter.keyValues(modeloDatosCliente.get(0).getPhone()).into(TXT_PHONE),
                JavaScriptClick.on(TXT_EMAIL),
                Enter.keyValues(modeloDatosCliente.get(0).getEmail()).into(TXT_EMAIL),
                JavaScriptClick.on(TXT_ADDRESS),
                Enter.keyValues(modeloDatosCliente.get(0).getAddress()).into(TXT_ADDRESS),
                JavaScriptClick.on(TXT_CITY),
                Enter.keyValues(modeloDatosCliente.get(0).getCity()).into(TXT_CITY),
                JavaScriptClick.on(TXT_STATE),
                Enter.keyValues(modeloDatosCliente.get(0).getStateProvince()).into(TXT_STATE),
                JavaScriptClick.on(TXT_POSTAL_CODE),
                Enter.keyValues(modeloDatosCliente.get(0).getPostalCode()).into(TXT_POSTAL_CODE),
                WaitUntil.the(TXT_COUNTRY, isClickable()).forNoMoreThan(NUMERO_SEGUNDOS_ESPERA).seconds(),
                JavaScriptClick.on(TXT_COUNTRY),
                Click.on(TXT_COUNTRY_OPTION),
                JavaScriptClick.on(TXT_USER_NAME),
                Enter.keyValues(modeloDatosCliente.get(0).getUserName()).into(TXT_USER_NAME),
                JavaScriptClick.on(TXT_PASSWORD),
                Enter.keyValues(modeloDatosCliente.get(0).getPassword()).into(TXT_PASSWORD),
                JavaScriptClick.on(TXT_CONFIRM_PASSWORD),
                Enter.keyValues(modeloDatosCliente.get(0).getConfirmPassword()).into(TXT_CONFIRM_PASSWORD),
                WaitUntil.the(BTN_ENVIAR, isClickable()).forNoMoreThan(NUMERO_SEGUNDOS_ESPERA).seconds(),
                JavaScriptClick.on(BTN_ENVIAR),
                WaitUntil.the(LBL_CONFIRMACION_REGISTRO, isClickable()).forNoMoreThan(NUMERO_SEGUNDOS_ESPERA).seconds(),
                JavaScriptClick.on(LBL_CONFIRMACION_REGISTRO)
        );

    }

    public static LlenarDatosRegistro llenarDatosRegistro(List<ModeloDatosCliente> datosRegistro) {
        return new LlenarDatosRegistro(datosRegistro);
    }
}