package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page loginPage = new tc_010Page(driver);

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        loginPage.navigateToLogin();
    }

    @When("Ingresa un comando SQL en el campo de {string} o {string}")
    public void ingresa_un_comando_sql_en_el_campo_de_usuario_o_contraseña(String user, String pass) {
        loginPage.enterCredentials(user, pass);
    }

    @When("Hace clic en 'Iniciar sesión'")
    public void hace_clic_en_iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("El sistema valida la entrada y evita la ejecución de códigos maliciosos")
    public void el_sistema_valida_la_entrada_y_evita_la_ejecución_de_códigos_maliciosos() {
        loginPage.validateInput();
    }

    @Then("El sistema muestra un mensaje de error sin exponer detalles internos")
    public void el_sistema_muestra_un_mensaje_de_error_sin_exponer_detalles_internos() {
        loginPage.verifyErrorMessage();
    }
}