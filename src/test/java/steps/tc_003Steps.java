import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page loginPage = PageFactory.initElements(driver, tc_003Page.class);

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver.get("http://example.com/login");
    }

    @When("Intenta iniciar sesión dejando el campo de usuario vacío")
    public void intenta_iniciar_sesion_dejando_el_campo_de_usuario_vacio() {
        loginPage.clearUsernameField();
        loginPage.clickLoginButton();
    }

    @Then("Se muestra un mensaje solicitando el ingreso del usuario")
    public void se_muestra_un_mensaje_solicitando_el_ingreso_del_usuario() {
        Assert.assertEquals("El campo usuario es obligatorio.", loginPage.getUsernameErrorMessage());
    }

    @When("Intenta iniciar sesión dejando el campo de contraseña vacío")
    public void intenta_iniciar_sesion_dejando_el_campo_de_contraseña_vacio() {
        loginPage.clearPasswordField();
        loginPage.clickLoginButton();
    }

    @Then("Se muestra un mensaje solicitando el ingreso de la contraseña")
    public void se_muestra_un_mensaje_solicitando_el_ingreso_de_la_contraseña() {
        Assert.assertEquals("El campo contraseña es obligatorio.", loginPage.getPasswordErrorMessage());
    }
}