package is.demo.serenity.steps;

import io.cucumber.datatable.DataTable;
import is.demo.serenity.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPage inicio;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        inicio.openUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
    }

    @Step("Enviar Campo usuario")
    public void enviarUsuario(DataTable dataTable){
        //Limpiar campo usuario
        inicio.getDriver().findElement(inicio.getTxtUsuario()).clear();

        //Enviar usuario
        inicio.getDriver().findElement(inicio.getTxtUsuario()).sendKeys(dataTable.asLists().get(1).get(0));
    }

    @Step("Enviar Campo usuario")
    public void enviarClave(DataTable dataTable){
        //Limpiar campo clave
        inicio.getDriver().findElement(inicio.getTxtClave()).clear();

        //Enviar clave
        inicio.getDriver().findElement(inicio.getTxtClave()).sendKeys(dataTable.asLists().get(1).get(1));
    }

    @Step("Clic iniciar sesion")
    public void clicBtnInicio(){
        inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();
    }
}
