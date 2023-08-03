package is.demo.serenity.steps;

import is.demo.serenity.pageObject.TableroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class TableroSteps {
    @Page
    TableroPage tableroPage;

    @Step("Validar mensaje en pantalla")
    public void vldMensaje(){

        Assert.assertTrue(
                tableroPage.LBLDashboard.isDisplayed()
        );
    }
}
