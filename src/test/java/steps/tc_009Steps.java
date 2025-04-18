package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page formPage;

    @Given("que el usuario está en la página del formulario")
    public void queElUsuarioEstaEnLaPaginaDelFormulario() {
        driver = new ChromeDriver();
        driver.get("http://example.com/form");
        formPage = new tc_009Page(driver);
    }

    @When("el usuario completa el formulario con información válida")
    public void elUsuarioCompletaElFormularioConInformacionValida() {
        formPage.fillForm("Nombre", "Apellido", "email@example.com");
    }

    @When("hace clic en el botón {string}")
    public void haceClicEnElBoton(String button) {
        formPage.clickSubmitButton();
    }

    @Then("el sistema muestra un mensaje de confirmación indicando que la información fue procesada correctamente")
    public void elSistemaMuestraUnMensajeDeConfirmacion() {
        formPage.verifyConfirmationMessage();
        driver.quit();
    }
}