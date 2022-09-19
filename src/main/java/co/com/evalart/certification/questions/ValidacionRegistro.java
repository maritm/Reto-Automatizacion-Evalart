package co.com.evalart.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.assertj.core.api.SoftAssertions;

import static co.com.evalart.certification.userinterfaces.DatosRegistro.LBL_CONFIRMACION;
import static co.com.evalart.certification.utilities.ConstantesWeb.REGISTRO_EXITOSO;

public class ValidacionRegistro implements Question<Boolean> {
    private final SoftAssertions validacion = new SoftAssertions();


    @Override
    public Boolean answeredBy(Actor actor) {
        validacion.assertThat(LBL_CONFIRMACION.resolveFor(actor).getText()).isEqualTo(REGISTRO_EXITOSO);
        return true;

    }

    public static Question<Boolean> valida() {
        return new ValidacionRegistro();
    }
}
