package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {
    private final By txtUsuario = By.id("LoginPanel0_Username");
    private final By txtClave = By.id("LoginPanel0_Password");
    private final By btnInicioSesion = By.xpath("//button[@id='LoginPanel0_LoginButton']");

    /*@FindBy(xpath = "//*[@id='LoginPanel0_Username']")
    private WebElementFacade txtUsuario;

    @FindBy(xpath = "//*[@id='LoginPanel0_Password']")
    private WebElementFacade txtClave;

    @FindBy(xpath = "//*[@id='LoginPanel0_LoginButton']")
    private WebElementFacade btnInicioSesion;*/

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    /*public WebElementFacade getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(WebElementFacade txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public WebElementFacade getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(WebElementFacade txtClave) {
        this.txtClave = txtClave;
    }

    public WebElementFacade getBtnInicioSesion() {
        return btnInicioSesion;
    }

    public void setBtnInicioSesion(WebElementFacade btnInicioSesion) {
        this.btnInicioSesion = btnInicioSesion;
    }*/
}
