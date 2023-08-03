package is.demo.serenity.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import is.demo.serenity.steps.InicioSesionSteps;
import is.demo.serenity.steps.TableroSteps;
import net.thucydides.core.annotations.Steps;

public class InicioSesioStepDefinitions {
    @Steps
    InicioSesionSteps inicioSesion;

    @Steps
    TableroSteps tableroSteps;

    @Dado("que el usuario abre la pagina demo")
    public void queElUsuarioAbreLaPaginaDemo() {
        inicioSesion.abrirNavegador();
    }
    @Cuando("el usuario ingresa las credenciales")
    public void elUsuarioIngresaLasCredenciales(DataTable dataTable) {
        inicioSesion.enviarUsuario(dataTable);
        inicioSesion.enviarClave(dataTable);
    }
    @Cuando("de clic en ingresar")
    public void deClicEnIngresar() {
        inicioSesion.clicBtnInicio();
    }
    @Entonces("el usuario podra ver un mensaje de plataforma.")
    public void elUsuarioPodraVerUnMensajeDePlataforma() {
        tableroSteps.vldMensaje();
    }
}
