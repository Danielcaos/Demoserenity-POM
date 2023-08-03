package is.demo.serenity.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TableroPage extends PageObject {
    @FindBy(xpath = "//span[@class='s-sidebar-band-title2']")
    public WebElementFacade LBLDashboard;

    public WebElementFacade getLBLDashboard() {
        return LBLDashboard;
    }

    public void setLBLDashboard(WebElementFacade LBLDashboard) {
        this.LBLDashboard = LBLDashboard;
    }
}
