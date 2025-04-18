package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By olvideContrasenaLink = By.linkText("Olvidé mi contraseña");
    By correoInput = By.id("correoElectronico");
    By enviarButton = By.id("enviar");
    By mensajeConfirmacion = By.id("mensajeConfirmacion");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOlvideContrasena() {
        driver.findElement(olvideContrasenaLink).click();
    }

    public void ingresarCorreoElectronico(String correo) {
        driver.findElement(correoInput).sendKeys(correo);
    }

    public String obtenerCorreoIngresado() {
        return driver.findElement(correoInput).getAttribute("value");
    }

    public void clickEnviar() {
        driver.findElement(enviarButton).click();
    }

    public String mostrarMensajeConfirmacion() {
        return driver.findElement(mensajeConfirmacion).getText();
    }
}