package co.com.evalart.certification.tasks;


import co.com.evalart.certification.userinterfaces.AbrirLaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLa implements Task {

    private AbrirLaPagina abrirLaPagina;

    public static AbrirLa pagina() {
        return Tasks.instrumented(AbrirLa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirLaPagina));
    }
}
