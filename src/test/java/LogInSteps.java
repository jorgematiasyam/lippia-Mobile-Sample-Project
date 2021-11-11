
import com.crowdar.examples.services.LogInClockifyService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {

    @Given("el usuario esta en la pagina de login")
    public void elUsuarioEstaEnLaPaginadelogin() {
        LogInClockifyService.isViewLoaded();
    }

    @When("el usuario completa su (.*) y (.*)")
    public void elUsuarioCompletaSuEmailYPassword(String email, String password) {
        LogInClockifyService.doLogin(email, password);
    }

    @And("el usuario presiona el boton Login")
    public void elUsuarioPresionaElBotonLogin() {
        LogInClockifyService.clickButton();
    }

    @Then("el usuario es redirigido a la pagina principal")
    public void elUsuarioEsRedirigidoALaPaginaPrincipal() {LogInClockifyService.isHomePageVisible(); }

    @Given("el usuario esta en la pagina principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {LogInClockifyService.isHomePageVisible(); }


    @When("el usuario entra al menu settings")
    public void elUsuarioEntraAlMenuSettings() {LogInClockifyService.pantallaSettings();
    }

    @And("el usuario desactiva la opcion show notifications")
    public void elUsuarioDesactivaLaOpcionShowNotifications() {LogInClockifyService.desactivarShowNotifications();
    }

    @Then("no se muestran las notificaciones")
    public void noSeMuestranLasNotificaciones() {LogInClockifyService.noMostrarNotificaciones();
    }
}
