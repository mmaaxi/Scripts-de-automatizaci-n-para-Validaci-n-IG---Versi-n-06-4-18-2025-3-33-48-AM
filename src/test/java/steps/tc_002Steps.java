package steps;

import pages.tc_002Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_002Steps {
    tc_002Page loginPage = new tc_002Page();

    @Given("estoy en la página de inicio de sesión")
    public void estoy_en_la_pagina_de_inicio_de_sesion() {
        loginPage.navigateToLoginPage();
    }

    @When("ingreso el nombre de usuario {string}")
    public void ingreso_el_nombre_de_usuario(String username) {
        loginPage.enterUsername(username);
    }

    @When("ingreso la contraseña {string}")
    public void ingreso_la_contraseña(String password) {
        loginPage.enterPassword(password);
    }

    @When("hago clic en el botón 'Iniciar sesión'")
    public void hago_clic_en_el_boton_iniciar_sesion() {
        loginPage.clickLoginButton();
    }

    @Then("el sistema muestra un mensaje de error indicando que las credenciales son incorrectas")
    public void el_sistema_muestra_un_mensaje_de_error() {
        assertTrue(loginPage.isErrorMessageDisplayed());
    }
}