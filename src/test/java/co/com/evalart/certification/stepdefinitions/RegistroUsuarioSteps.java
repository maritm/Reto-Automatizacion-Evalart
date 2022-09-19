package co.com.evalart.certification.stepdefinitions;

import co.com.evalart.certification.models.ModeloDatosCliente;
import co.com.evalart.certification.questions.ValidacionRegistro;
import co.com.evalart.certification.tasks.AbrirLa;
import co.com.evalart.certification.tasks.LlenarDatosRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroUsuarioSteps {
    @DataTableType
    public ModeloDatosCliente modeloDatosCliente(Map<String, String> entry) {
        return new ModeloDatosCliente(entry.get("firstName"), entry.get("lastName"),
                entry.get("phone"), entry.get("email"), entry.get("address"),
                entry.get("city"), entry.get("stateProvince"), entry.get("postalCode"),
                entry.get("country"), entry.get("userName"), entry.get("password"),
                entry.get("confirmPassword"), entry.get("mensaje"));
    }

    @Before
    public void Configuration() {
        setTheStage(new OnlineCast());
    }


    @Dado("que el usuario {string} ingresa al portal web")
    public void queElUsuarioIngresaAlPortalWeb(String cliente) {
        theActorCalled(cliente).wasAbleTo(AbrirLa.pagina());
    }

    @Cuando("el cliente se registra en el portal web con los datos")
    public void elClienteSeRegistraEnElPortalWebConLosDatos(List<ModeloDatosCliente> listaModelo) {
        theActorInTheSpotlight().attemptsTo(LlenarDatosRegistro.llenarDatosRegistro(listaModelo));
    }

    @Entonces("el usuario podra confirmar el registro exitoso")
    public void elUsuarioPodraConfirmarElRegistroExitoso() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionRegistro.valida(), Matchers.is(true)));

    }

}
