package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_008Page;
import static utils.DashboardData.expectedData;

public class tc_008Steps {

    tc_008Page dashboardPage = new tc_008Page();

    @Given("El usuario inicia sesión correctamente")
    public void iniciar_sesion_correctamente() {
        dashboardPage.login("usuario", "contrasena");
    }

    @When("El usuario navega al dashboard")
    public void navegar_al_dashboard() {
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }

    @Then("Se muestran los datos correspondientes")
    public void verificar_visualizacion_de_datos() {
        Assert.assertTrue(dashboardPage.isDataDisplayed());
    }

    @And("Los datos mostrados coinciden con los datos esperados")
    public void comparar_datos_con_datos_esperados() {
        Assert.assertEquals(expectedData, dashboardPage.getDashboardData());
    }
}