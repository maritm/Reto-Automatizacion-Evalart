package co.com.evalart.certification.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/registro_usuario.feature",
        glue = "co.com.evalart.certification.stepdefinitions",
        tags = "@RegistroExitoso",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true

)

public class RegistroUsuario {
}
