package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver = new ChromeDriver();
    tc_004Page page = new tc_004Page(driver);

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuario_esta_en_pantalla_inicio_sesion() {
        driver.get("https://www.ejemplo.com/login");
    }

    @When("el usuario hace clic en el enlace 'Olvidé mi contraseña'")
    public void usuario_clic_enlace_olvide_contraseña() {
        page.clickOlvideContrasena();
    }

    @Then("el sistema redirige a la página de recuperación de contraseña")
    public void sistema_redirige_pagina_recuperacion_contraseña() {
        Assert.assertTrue(driver.getTitle().contains("Recuperación de contraseña"));
    }

    @When("el usuario ingresa un correo electrónico válido {string}")
    public void usuario_ingresa_correo_valido(String correo) {
        page.ingresarCorreoElectronico(correo);
    }

    @Then("el sistema acepta la entrada y muestra el correo ingresado")
    public void sistema_muestra_correo_ingresado() {
        Assert.assertEquals(page.obtenerCorreoIngresado(), "usuario@example.com");
    }

    @When("el usuario hace clic en el botón 'Enviar'")
    public void usuario_clic_boton_enviar() {
        page.clickEnviar();
    }

    @Then("el sistema muestra un mensaje confirmando el envío del correo de recuperación")
    public void sistema_muestra_mensaje_confirmacion_envio() {
        Assert.assertTrue(page.mostrarMensajeConfirmacion().contains("Correo de recuperación enviado"));
    }
}